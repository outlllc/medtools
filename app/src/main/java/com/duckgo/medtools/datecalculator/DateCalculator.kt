package com.duckgo.medtools.datecalculator

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
import com.duckgo.medtools.databinding.FragmentDateCalculator3Binding
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup
import java.util.Calendar
import java.util.Locale

class DateCalculator : BaseFragmentDataBinding<FragmentDateCalculator3Binding>(), View.OnClickListener {

    override fun getFragmentViewBinding(): FragmentDateCalculator3Binding {
        return FragmentDateCalculator3Binding.inflate(layoutInflater)
    }

    private var firstNumber = ""
    private var secondNumber = ""
    private var operator = ""
    private var displayExpression = "" // 用于记录并显示在输入框的完整计算内容
    private var isResultShown = false  // 标记是否刚刚按下“=”
    private var modelSelect = "WEEK"
    private var isErrorShowing = false
    private val handler = Handler(Looper.getMainLooper())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 绑定所有按钮的点击事件
        val clickIds = listOf(
            R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4,
            R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9,
            R.id.localDate, R.id.buttonAdd, R.id.buttonSubtract, R.id.buttonClear,
            R.id.buttonDivide, R.id.buttonMultiply, R.id.buttonEqual, R.id.buttonDot,
            R.id.buttonPN, R.id.buttonDelete, R.id.buttonSplitDate
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
            else -> handleNumericInput(inputText)
        }
    }

    private fun handleNumericInput(input: String) {
        // 核心修正：如果刚按过“=”，且没有输入运算符，则新输入数字/符号时重置
        if (isResultShown && operator.isEmpty()) {
            clearAll()
        }
        handleInputChar(input)
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
        } else {
            showErrorFeedback(char)
        }
    }

    // 输入校验逻辑 (修复小数输入“/”的Bug)
    private fun validateChar(current: String, next: String): Boolean {
        val combined = current + next

        if (next == ".") {
            // 小数点校验：操作数不能已有小数点，且不能包含日期分隔符
            if (current.contains(".") || current.contains("/")) return false
            return true
        }

        if (next == "/") {
            // 日期分隔符校验
            if (current.count { it == '/' } >= 2) return false // 最多2个
            if (current.isEmpty() || !current.last().isDigit()) return false // 必须跟在数字后
            if (current.contains(".")) return false // 关键修复：如果当前部分是小数，不允许输入“/”
            if (operator == "*" || operator == "÷") return false // 日期模式下禁用乘除
            // 需求：日期加减法限制 (Requirement 3)
            if (operator == "+" && isInputIsDate(firstNumber)) return false
            return true
        }

        // 录入数字时的月份和日期范围验证
        if (next.all { it.isDigit() } && current.contains("/")) {
            val parts = combined.split("/")
            if (parts.size == 2 && parts[1].isNotEmpty()) { // 月份
                val m = parts[1].toIntOrNull() ?: 0
                if (m > 12) return false
            } else if (parts.size == 3 && parts[2].isNotEmpty()) { // 日期
                val d = parts[2].toIntOrNull() ?: 0
                if (d > 31) return false
            }
        }
        return true
    }

    private fun handleOperatorClick(id: Int, opText: String) {
        // 如果刚刚按下“=”，则将结果作为新的第一个操作数，并同步显示表达式
        if (isResultShown) {
            displayExpression = firstNumber
            isResultShown = false
        }

        if (firstNumber == "Error") {
            clearAll()
            return
        }

        val currentPart = if (operator.isEmpty()) firstNumber else secondNumber

        // 需求 4: 除法键在日期上下文中充当分隔符
        val isDateContext = currentPart.contains("/") || (operator.isNotEmpty() && isInputIsDate(firstNumber))
        if (id == R.id.buttonDivide && isDateContext) {
            handleInputChar("/")
            return
        }

        if (firstNumber.isEmpty()) {
            if (opText == "-") {
                firstNumber = "-"
                displayExpression = "-"
                updateInputDisplay()
            }
            return
        }

        // 规则：如果是日期，必须格式完整才能添加运算符
        if (currentPart.contains("/") && !isCompleteDatePattern(currentPart)) {
            showErrorFeedback(opText)
            return
        }

        // 规则：日期计算不支持乘除
        if ((isInputIsDate(firstNumber) || currentPart.contains("/")) && (opText == "*" || opText == "÷")) {
            showErrorFeedback(opText)
            return
        }

        if (operator.isNotEmpty() && secondNumber.isNotEmpty()) {
            // 需求 1: 连续加减计算处理
            val res = calculate().replace(Regex("\\.0$"), "")
            if (res == "Error") {
                showResultInDisplay(res)
                return
            }
            // 检查中间结果（日期）是否引发非法后续运算
            if (res.contains("/") && (opText == "*" || opText == "÷")) {
                showErrorFeedback(opText)
                return
            }
            
            firstNumber = res
            operator = opText
            secondNumber = ""
            displayExpression = res + opText
            isResultShown = false
            updateInputDisplay()
            showResultInDisplay(res)
        } else if (firstNumber != "-") {
            // 更改或设置运算符
            if (operator.isNotEmpty() && secondNumber.isEmpty()) {
                if (displayExpression.isNotEmpty()) displayExpression = displayExpression.dropLast(1)
            }
            operator = opText
            displayExpression += opText
            isResultShown = false
            updateInputDisplay()
        }
    }

    private fun handleEqual() {
        if (firstNumber.isEmpty() || operator.isEmpty() || secondNumber.isEmpty()) return
        
        // 校验输入完整性
        if (firstNumber.contains("/") && !isCompleteDatePattern(firstNumber)) return
        if (secondNumber.contains("/") && !isInputIsDate(secondNumber)) return

        val res = calculate().replace(Regex("\\.0$"), "")
        showResultInDisplay(res)
        if (res != "Error") {
            // 核心微调：按下“=”后不更新输入框 (displayExpression 不变)
            // 更新内部状态以支持后续基于此结果的连续计算
            firstNumber = res
            operator = ""
            secondNumber = ""
            isResultShown = true
        }
    }

    private fun showErrorFeedback(char: String) {
        if (isErrorShowing) return
        isErrorShowing = true
        val currentText = if (displayExpression.isEmpty()) "0" else displayExpression
        
        // 需求 3: 标红显示错误字符
        val spannable = SpannableString(currentText + char)
        spannable.setSpan(
            ForegroundColorSpan(Color.RED),
            currentText.length,
            spannable.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        binding.tvInput.text = spannable

        // 需求 3: 延迟1秒后删除该字符并恢复显示
        handler.postDelayed({
            isErrorShowing = false
            updateInputDisplay()
        }, 1000)
    }

    private fun calculate(): String {
        val isFDate = isInputIsDate(firstNumber)
        val isSDate = isInputIsDate(secondNumber)

        if (isFDate || isSDate) {
            // 情况 1: 两个日期相减
            if (isFDate && isSDate) {
                if (operator == "-") {
                    val d1 = parseDateString(firstNumber)
                    val d2 = parseDateString(secondNumber)
                    val cal1 = Calendar.getInstance().apply { set(d1.year, d1.month - 1, d1.day, 0, 0, 0); set(Calendar.MILLISECOND, 0) }
                    val cal2 = Calendar.getInstance().apply { set(d2.year, d2.month - 1, d2.day, 0, 0, 0); set(Calendar.MILLISECOND, 0) }
                    val diff = (cal1.timeInMillis - cal2.timeInMillis) / (24L * 60L * 60L * 1000L)
                    return formatDifference(diff.toInt())
                } else return "Error"
            }

            // 情况 2: 一个日期 +/- 一个整数
            val datePart = if (isFDate) firstNumber else secondNumber
            val intPart = if (isFDate) secondNumber else firstNumber
            val intVal = intPart.toIntOrNull() ?: return "Error"

            if (operator != "+" && operator != "-") return "Error"
            if (operator == "-" && !isFDate) return "Error"

            val d = parseDateString(datePart)
            val cal = Calendar.getInstance().apply { set(d.year, d.month - 1, d.day, 0, 0, 0); set(Calendar.MILLISECOND, 0) }
            val amount = if (operator == "-") -intVal else intVal

            when (modelSelect) {
                "YEAR" -> cal.add(Calendar.YEAR, amount)
                "MONTH" -> cal.add(Calendar.MONTH, amount)
                "DAY" -> cal.add(Calendar.DAY_OF_MONTH, amount)
                "WEEK" -> cal.add(Calendar.WEEK_OF_YEAR, amount)
                else -> cal.add(Calendar.DAY_OF_MONTH, amount)
            }
            return String.format(Locale.US, "%d/%d/%d", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH))
        }

        // 普通数学运算
        val v1 = firstNumber.toDoubleOrNull() ?: return "Error"
        val v2 = secondNumber.toDoubleOrNull() ?: return "Error"
        return when (operator) {
            "+" -> (v1 + v2).toString()
            "-" -> (v1 - v2).toString()
            "*" -> (v1 * v2).toString()
            "÷" -> if (v2 != 0.0) (v1 / v2).toString() else "Error"
            else -> "Error"
        }
    }

    private fun formatDifference(diff: Int): String {
        val sign = if (diff < 0) "-" else ""
        val abs = kotlin.math.abs(diff)
        return when (modelSelect) {
            "WEEK" -> if (abs % 7 == 0) "$sign${abs / 7}周" else "$sign${abs / 7}周${abs % 7}天"
            "DAY" -> "$sign${abs}天"
            "MONTH" -> String.format(Locale.US, "%s%.3f月", sign, abs / 30.0)
            "YEAR" -> String.format(Locale.US, "%s%.3f年", sign, abs / 365.0)
            else -> diff.toString()
        }
    }

    fun isInputIsDate(inp: String): Boolean = inp.contains("/")

    private fun isCompleteDatePattern(inp: String): Boolean {
        return Regex("\\d{1,4}/\\d{1,2}/\\d{1,2}").matches(inp)
    }

    private fun parseDateString(s: String): MyDateData {
        val parts = s.split("/")
        return MyDateData(parts[0].toInt(), parts[1].toInt(), parts[2].toInt())
    }

    private fun handlePlusMinus() {
        if (operator.isEmpty()) {
            if (firstNumber.isNotEmpty() && !firstNumber.contains("/")) {
                val oldLen = firstNumber.length
                firstNumber = if (firstNumber.startsWith("-")) firstNumber.substring(1) else "-$firstNumber"
                if (displayExpression.length >= oldLen) displayExpression = displayExpression.dropLast(oldLen) + firstNumber
            }
        } else {
            if (secondNumber.isNotEmpty() && !secondNumber.contains("/")) {
                val oldLen = secondNumber.length
                secondNumber = if (secondNumber.startsWith("-")) secondNumber.substring(1) else "-$secondNumber"
                if (displayExpression.length >= oldLen) displayExpression = displayExpression.dropLast(oldLen) + secondNumber
            }
        }
        updateInputDisplay()
    }

    private fun handleLocalDateClick() {
        if (isResultShown && operator.isEmpty()) clearAll()
        val c = Calendar.getInstance()
        val ds = String.format(Locale.US, "%d/%d/%d", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH))
        if (operator.isEmpty()) {
            firstNumber = ds
            displayExpression = ds
        } else if (operator == "-" || (operator == "+" && !isInputIsDate(firstNumber))) {
            secondNumber = ds
            displayExpression += ds
        } else {
            showErrorFeedback("Date")
            return
        }
        updateInputDisplay()
    }

    private fun updateInputDisplay() {
        binding.tvInput.setTextColor(Color.parseColor("#3C4043"))
        binding.tvInput.text = if (displayExpression.isEmpty()) "0" else displayExpression
    }

    private fun showResultInDisplay(res: String) {
        binding.tvResult.text = res
    }

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
    }

    private fun updateLocalDateOnButton() {
        val c = Calendar.getInstance()
        binding.localDate.text = String.format(Locale.US, "%d/%d/%d", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH))
    }

    fun setupModelSelector() {
        binding.selecToggleGroup.addOnButtonCheckedListener { group, checkedId, isChecked ->
            if (!isChecked) return@addOnButtonCheckedListener
            val childCount = group?.childCount ?: 0
            for (index in 0 until childCount) {
                val child = group.getChildAt(index) as? MaterialButton ?: continue
                if (child.id == checkedId) {
                    child.setTextColor(Color.WHITE)
                    child.setBackgroundColor(Color.parseColor("#109D58"))
                    when (checkedId) {
                        R.id.modelSelect_year -> { modelSelect = "YEAR"; binding.hintTextView.text = "年" }
                        R.id.modelSelect_month -> { modelSelect = "MONTH"; binding.hintTextView.text = "月" }
                        R.id.modelSelect_day -> { modelSelect = "DAY"; binding.hintTextView.text = "日" }
                        R.id.modelSelect_week -> { modelSelect = "WEEK"; binding.hintTextView.text = "周" }
                        R.id.modelSelect_date -> { modelSelect = "MATH"; binding.hintTextView.text = "MATH" }
                    }
                } else {
                    child.setTextColor(Color.parseColor("#3C4043"))
                    child.setBackgroundColor(Color.WHITE)
                }
            }
        }
    }
}

data class MyDateData(var year: Int, var month: Int, var day: Int)
