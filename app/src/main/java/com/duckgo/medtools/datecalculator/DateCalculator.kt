package com.duckgo.medtools.datecalculator

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import com.duckgo.medtools.medicaltools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentDateCalculatorBinding
import com.google.android.material.button.MaterialButton
import java.util.Calendar
import java.util.Locale

class DateCalculator : BaseFragmentDataBinding<FragmentDateCalculatorBinding>(), View.OnClickListener {

    override fun getFragmentViewBinding(): FragmentDateCalculatorBinding {
        return FragmentDateCalculatorBinding.inflate(layoutInflater)
    }

    private var firstNumber = ""
    private var secondNumber = ""
    private var operator = ""
    private var displayExpression = ""
    private var isResultShown = false
    private var modelSelect = "WEEK"
    private var isErrorShowing = false
    private val handler = Handler(Looper.getMainLooper())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val clickIds = listOf(
            R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4,
            R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9,
            R.id.localDate, R.id.buttonAdd, R.id.buttonSubtract, R.id.buttonClear,
            R.id.buttonDivide, R.id.buttonMultiply, R.id.buttonEqual, R.id.buttonDot,
            R.id.buttonPN, R.id.buttonDelete, R.id.buttonSplitDate, R.id.btn_bracket
        )
        clickIds.forEach { id ->
            binding.root.findViewById<View>(id)?.setOnClickListener(this)
        }

        setupModelSelector()
        updateLocalDateOnButton()
    }

    override fun onClick(v: View?) {
        if (isErrorShowing) return
        val inputText = (v as? TextView)?.text?.toString() ?: ""

        when (v?.id) {
            R.id.buttonClear -> clearAll()
            R.id.buttonDelete -> deleteOneChar()
            R.id.buttonEqual -> handleEqual()
            R.id.buttonAdd, R.id.buttonSubtract, R.id.buttonMultiply, R.id.buttonDivide -> {
                handleOperatorClick(v.id, inputText)
            }
            R.id.buttonSplitDate -> handleInputChar("/")
            R.id.localDate -> handleLocalDateClick()
            R.id.buttonPN -> handlePlusMinus()
            R.id.buttonDot -> handleNumericInput(".")
            R.id.btn_bracket -> handleBracketClick()
            else -> handleNumericInput(inputText)
        }
    }

    private fun handleNumericInput(input: String) {
        if (isResultShown && operator.isEmpty()) {
            clearAll()
        }
        handleInputChar(input)
    }

    private fun handleBracketClick() {
        if (modelSelect != "WEEK") {
            showErrorFeedback("( )")
            return
        }
        if (isResultShown && operator.isEmpty()) clearAll()

        val hasLeft = displayExpression.contains("(")
        val hasRight = displayExpression.contains(")")

        if (!hasLeft || (hasLeft && hasRight)) {
            val isAtStart = displayExpression.isEmpty()
            val isAfterOp = operator.isNotEmpty() && secondNumber.isEmpty()
            if (isAtStart || isAfterOp) {
                insertBracket("(")
            } else {
                showErrorFeedback("(")
            }
        } else if (!hasRight) {
            if (displayExpression.isNotEmpty() && (displayExpression.last().isDigit() || displayExpression.last() == ')')) {
                insertBracket(")")
            } else {
                showErrorFeedback(")")
            }
        } else {
            showErrorFeedback("( )")
        }
    }

    private fun insertBracket(b: String) {
        if (operator.isEmpty()) firstNumber += b else secondNumber += b
        displayExpression += b
        isResultShown = false
        updateInputDisplay()
        tryAutoCalculate()
    }

    private fun handleInputChar(char: String) {
        val currentPart = if (operator.isEmpty()) firstNumber else secondNumber
        if (validateChar(currentPart, char)) {
            if (operator.isEmpty()) {
                firstNumber += char
            } else {
                secondNumber += char
            }
            displayExpression += char
            isResultShown = false
            updateInputDisplay()
            tryAutoCalculate()
        } else {
            showErrorFeedback(char)
        }
    }

    private fun validateChar(current: String, next: String): Boolean {
        val combined = current + next
        if (next == ".") {
            if (current.contains(".") || current.contains("/") || current.contains("(")) return false
            return true
        }
        if (next == "/") {
            if (current.contains("(")) return false
            if (current.count { it == '/' } >= 2) return false
            if (current.isEmpty() || !current.last().isDigit()) return false
            if (current.contains(".")) return false
            if (operator == "*" || operator == "÷") return false
            if (operator == "+" && isInputIsDate(firstNumber)) return false
            return true
        }

        if (current.contains("(")) {
            if (next == "+" && current.contains("+")) return false
            if (current.endsWith("(") && !next.all { it.isDigit() }) return false
            if (next.all { it.isDigit() } && current.contains("+")) {
                val daysStr = combined.substringAfter("+").replace(")", "")
                if (daysStr.isNotEmpty() && (daysStr.toIntOrNull() ?: 0) >= 7) return false
            }
            if (!next.all { it.isDigit() } && next != "+") return false
        }

        if (next.all { it.isDigit() } && current.contains("/")) {
            val parts = combined.split("/")
            if (parts.size == 2 && parts[1].isNotEmpty() && (parts[1].toIntOrNull() ?: 0) > 12) return false
            if (parts.size == 3 && parts[2].isNotEmpty() && (parts[2].toIntOrNull() ?: 0) > 31) return false
        }
        return true
    }

    private fun handleOperatorClick(id: Int, opText: String) {
        val currentPart = if (operator.isEmpty()) firstNumber else secondNumber

        if (currentPart.contains("(") && !currentPart.contains(")") && opText == "+") {
            if (currentPart.last().isDigit() && !currentPart.contains("+")) {
                handleInputChar("+")
                return
            }
        }

        if (currentPart.contains("(") && !currentPart.contains(")")) {
            showErrorFeedback(opText)
            return
        }

        if (isResultShown) {
            isResultShown = false
            displayExpression = firstNumber
        }

        if (firstNumber == "Error") { clearAll(); return }

        val isDateContext = currentPart.contains("/") || (operator.isNotEmpty() && isInputIsDate(firstNumber))
        if (id == R.id.buttonDivide && isDateContext) {
            handleInputChar("/")
            return
        }

        if (firstNumber.isEmpty()) {
            if (opText == "-") {
                firstNumber = "-"; displayExpression = "-"; updateInputDisplay()
            }
            return
        }

        if (currentPart.contains("/") && !isCompleteDatePattern(currentPart)) {
            showErrorFeedback(opText); return
        }

        if ((isInputIsDate(firstNumber) || currentPart.contains("/")) && (opText == "*" || opText == "÷")) {
            showErrorFeedback(opText); return
        }

        if (operator.isNotEmpty() && secondNumber.isNotEmpty()) {
            val res = calculate().replace(Regex("\\.0$"), "")
            if (res == "Error") { showResultInDisplay(res); return }

            firstNumber = res; operator = opText; secondNumber = ""
            displayExpression = res + opText
            updateInputDisplay(); showResultInDisplay(res)
        } else if (firstNumber != "-") {
            if (operator.isNotEmpty() && secondNumber.isEmpty()) {
                if (displayExpression.isNotEmpty()) displayExpression = displayExpression.dropLast(1)
            }
            operator = opText; displayExpression += opText; updateInputDisplay()
        }
    }

    private fun handleEqual() {
        if (firstNumber.isEmpty() || operator.isEmpty() || secondNumber.isEmpty()) return
        val res = calculate().replace(Regex("\\.0$"), "")
        showResultInDisplay(res)
        if (res != "Error") {
            firstNumber = res; operator = ""; secondNumber = ""; isResultShown = true
        }
    }

    private fun tryAutoCalculate() {
        if (firstNumber.isEmpty() || operator.isEmpty() || secondNumber.isEmpty()) {
            showResultInDisplay("")
            return
        }

        if (firstNumber.contains("/") && !isCompleteDatePattern(firstNumber)) {
            showResultInDisplay("")
            return
        }
        if (secondNumber.contains("/") && !isCompleteDatePattern(secondNumber)) {
            showResultInDisplay("")
            return
        }

        val res = calculate().replace(Regex("\\.0$"), "")
        if (res != "Error") {
            showResultInDisplay(res)
        } else {
            showResultInDisplay("")
        }
    }

    private fun showErrorFeedback(char: String) {
        if (isErrorShowing) return
        isErrorShowing = true
        val currentText = if (displayExpression.isEmpty()) "0" else displayExpression
        val spannable = SpannableString(currentText + char)
        spannable.setSpan(ForegroundColorSpan(Color.RED), currentText.length, spannable.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvInput.text = spannable
        handler.postDelayed({ isErrorShowing = false; updateInputDisplay() }, 1000)
    }

    private fun calculate(): String {
        val isFDate = isInputIsDate(firstNumber)
        val isSDate = isInputIsDate(secondNumber)

        if (isFDate || isSDate) {
            if (isFDate && isSDate) {
                if (operator == "-") {
                    val d1 = parseDateString(firstNumber); val d2 = parseDateString(secondNumber)
                    val cal1 = Calendar.getInstance().apply { set(d1.year, d1.month - 1, d1.day, 0, 0, 0); set(Calendar.MILLISECOND, 0) }
                    val cal2 = Calendar.getInstance().apply { set(d2.year, d2.month - 1, d2.day, 0, 0, 0); set(Calendar.MILLISECOND, 0) }
                    val diff = (cal1.timeInMillis - cal2.timeInMillis) / (24L * 60L * 60L * 1000L)
                    return formatDifference(diff.toInt())
                } else return "Error"
            }

            val datePart = if (isFDate) firstNumber else secondNumber
            val otherPart = if (isFDate) secondNumber else firstNumber
            val numericVal = parseToNumericValue(otherPart) ?: return "Error"

            val daysOffset = if (otherPart.contains("(")) {
                numericVal.toInt()
            } else {
                val factor = when (modelSelect) {
                    "YEAR" -> 365.0
                    "MONTH" -> 30.0
                    "WEEK" -> 7.0
                    else -> 1.0
                }
                (numericVal * factor).toInt()
            }

            val d = parseDateString(datePart)
            val cal = Calendar.getInstance().apply { set(d.year, d.month - 1, d.day, 0, 0, 0); set(Calendar.MILLISECOND, 0) }
            val amount = if (operator == "-") { if (isFDate) -daysOffset else return "Error" } else daysOffset
            cal.add(Calendar.DAY_OF_MONTH, amount)
            return String.format(Locale.US, "%d/%d/%d", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH))
        }

        val v1 = if (firstNumber.contains("(")) parseBracketToDays(firstNumber)?.toDouble() else firstNumber.toDoubleOrNull()
        val v2 = if (secondNumber.contains("(")) parseBracketToDays(secondNumber)?.toDouble() else secondNumber.toDoubleOrNull()

        if (v1 == null || v2 == null) return "Error"

        val mathRes = when (operator) {
            "+" -> v1 + v2; "-" -> v1 - v2; "*" -> v1 * v2; "÷" -> if (v2 != 0.0) v1 / v2 else return "Error"; else -> return "Error"
        }
        return if (mathRes % 1.0 == 0.0) mathRes.toLong().toString() else String.format(Locale.US, "%.3f", mathRes).trimEnd('0').trimEnd('.')
    }

    private fun parseBracketToDays(input: String): Int? {
        val content = input.replace("(", "").replace(")", "")
        return if (content.contains("+")) {
            val parts = content.split("+")
            val w = parts[0].toIntOrNull() ?: 0
            val d = parts.getOrNull(1)?.toIntOrNull() ?: 0
            w * 7 + d
        } else {
            (content.toIntOrNull() ?: 0) * 7
        }
    }

    private fun parseToNumericValue(input: String): Double? {
        if (input.isEmpty() || input.contains("/")) return null
        if (input.contains("(")) {
            val content = input.replace("(", "").replace(")", "")
            return if (content.contains("+")) {
                val parts = content.split("+")
                val w = parts[0].toDoubleOrNull() ?: 0.0
                val d = parts.getOrNull(1)?.toDoubleOrNull() ?: 0.0
                w * 7.0 + d
            } else {
                (content.toDoubleOrNull() ?: 0.0) * 7.0
            }
        }
        return input.toDoubleOrNull()
    }

    private fun formatDifference(diff: Int): String {
        val sign = if (diff < 0) "-" else ""; val abs = kotlin.math.abs(diff)
        return when (modelSelect) {
            "WEEK" -> if (abs % 7 == 0) "$sign${abs / 7}周" else "$sign${abs / 7}周${abs % 7}天"
            "DAY" -> "$sign${abs}天"; "MONTH" -> String.format(Locale.US, "%s%.3f月", sign, abs / 30.0)
            "YEAR" -> String.format(Locale.US, "%s%.3f年", sign, abs / 365.0)
            else -> diff.toString()
        }
    }

    fun isInputIsDate(inp: String): Boolean = inp.contains("/")
    private fun isCompleteDatePattern(inp: String): Boolean = Regex("\\d{1,4}/\\d{1,2}/\\d{1,2}").matches(inp)
    private fun parseDateString(s: String): MyDateData {
        val parts = s.split("/"); return MyDateData(parts[0].toInt(), parts[1].toInt(), parts[2].toInt())
    }

    private fun handlePlusMinus() {
        val currentPart = if (operator.isEmpty()) firstNumber else secondNumber
        if (currentPart.isNotEmpty() && !currentPart.contains("/") && !currentPart.contains("(")) {
            val oldLen = currentPart.length
            val newPart = if (currentPart.startsWith("-")) currentPart.substring(1) else "-$currentPart"
            if (operator.isEmpty()) firstNumber = newPart else secondNumber = newPart
            displayExpression = displayExpression.dropLast(oldLen) + newPart
        }
        updateInputDisplay()
        tryAutoCalculate()
    }

    private fun handleLocalDateClick() {
        if (isResultShown && operator.isEmpty()) clearAll()
        val c = Calendar.getInstance()
        val ds = String.format(Locale.US, "%d/%d/%d", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH))
        if (operator.isEmpty()) { firstNumber = ds; displayExpression = ds }
        else if (operator == "-" || (operator == "+" && !isInputIsDate(firstNumber))) {
            secondNumber = ds; displayExpression += ds
        } else { showErrorFeedback("Date"); return }
        updateInputDisplay()
        tryAutoCalculate()
    }

    private fun updateInputDisplay() {
        binding.tvInput.setTextColor(Color.parseColor("#3C4043"))
        binding.tvInput.text = if (displayExpression.isEmpty()) "0" else displayExpression
    }

    private fun showResultInDisplay(res: String) { binding.tvResult.text = res }

    private fun clearAll() {
        firstNumber = ""; secondNumber = ""; operator = ""; displayExpression = ""; isResultShown = false
        updateInputDisplay(); showResultInDisplay("")
    }

    private fun deleteOneChar() {
        if (displayExpression.isEmpty()) return
        displayExpression = displayExpression.dropLast(1)
        if (secondNumber.isNotEmpty()) secondNumber = secondNumber.dropLast(1)
        else if (operator.isNotEmpty()) operator = ""
        else if (firstNumber.isNotEmpty()) firstNumber = firstNumber.dropLast(1)
        updateInputDisplay()
        tryAutoCalculate()
    }

    private fun updateLocalDateOnButton() {
        val c = Calendar.getInstance()
        binding.localDate.text = String.format(Locale.US, "%d/%d/%d", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH))
    }

    fun setupModelSelector() {
        updateToggleButtonsUI(binding.selecToggleGroup.checkedButtonId)
        binding.selecToggleGroup.addOnButtonCheckedListener { _, checkedId, isChecked ->
            if (isChecked) {
                updateToggleButtonsUI(checkedId)
                when (checkedId) {
                    R.id.modelSelect_year -> { modelSelect = "YEAR"; binding.hintTextView.text = "年" }
                    R.id.modelSelect_month -> { modelSelect = "MONTH"; binding.hintTextView.text = "月" }
                    R.id.modelSelect_day -> { modelSelect = "DAY"; binding.hintTextView.text = "日" }
                    R.id.modelSelect_week -> { modelSelect = "WEEK"; binding.hintTextView.text = "周" }
                }
                tryAutoCalculate()
            }
        }
    }

    private fun updateToggleButtonsUI(checkedId: Int) {
        val group = binding.selecToggleGroup
        for (index in 0 until group.childCount) {
            val child = group.getChildAt(index) as? MaterialButton ?: continue
            if (child.id == checkedId) {
                child.setTextColor(Color.WHITE)
                child.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#109D58"))
            } else {
                child.setTextColor(Color.parseColor("#3C4043"))
                child.backgroundTintList = ColorStateList.valueOf(Color.WHITE)
            }
        }
    }
}

data class MyDateData(var year: Int, var month: Int, var day: Int)