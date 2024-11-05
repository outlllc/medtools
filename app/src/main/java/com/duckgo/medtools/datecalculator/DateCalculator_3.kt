package com.duckgo.medtools.datecalculator

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentDateCalculator3Binding
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup
import java.util.Calendar
import kotlin.text.toInt

class DateCalculator_3 : BaseFragmentDataBinding<FragmentDateCalculator3Binding>(), View.OnClickListener {

    override fun getFragmentViewBinding(): FragmentDateCalculator3Binding {
        return FragmentDateCalculator3Binding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button0.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button7.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button9.setOnClickListener(this)
        binding.localDate.setOnClickListener(this)
        binding.buttonAdd.setOnClickListener(this)
        binding.buttonSubtract.setOnClickListener(this)
        binding.buttonClear.setOnClickListener(this)
        binding.buttonDivide.setOnClickListener(this)
        binding.buttonMultiply.setOnClickListener(this)
        binding.buttonEqual.setOnClickListener(this)
        binding.buttonDot.setOnClickListener(this)
        binding.buttonPN.setOnClickListener(this)
        binding.buttonDelete.setOnClickListener(this)
        binding.buttonSplitDate.setOnClickListener(this)
        modelSelcter()
        getLocalDate()

    }

    private var firstNumber = ""
    private var secondNumber = ""
    private var operator = ""
    private var result = ""
//    private var isOperatorClicked = false
    private var isSecondNumber = false
    private var isDotClicked = false
    private var isNegative = false
    private var isSplitDate = false
    private var isDate = false
    private var showText = ""
    private var first_date: Date = Date(0,0, 0)
    private var second_date: Date = Date(0,0, 0)
    private var modelSelect = "WEEK"
    
    override fun onClick(v: View?) {
        var inpuntText = (v as TextView).text.toString()
        when(v?.id){
            R.id.buttonAdd -> {
                operator = inpuntText
                if (showText.endsWith("+") or showText.endsWith("-") or showText.endsWith("*") or showText.endsWith("÷")) {
                    showText = showText.substring(0, showText.length - 1)
                    showInputText(showText + operator)
                }else{
                    showInputText(showText + operator)
                }
            }
            R.id.buttonSubtract -> {
                operator = inpuntText
                if (showText.endsWith("+") or showText.endsWith("-") or showText.endsWith("*") or showText.endsWith("÷")) {
                    showText = showText.substring(0, showText.length - 1)
                    showInputText(showText + operator)
                }else{
                    showInputText(showText + operator)
                }
            }
            R.id.buttonDivide -> {
                operator = inpuntText
                if (showText.endsWith("+") or showText.endsWith("-") or showText.endsWith("*") or showText.endsWith("÷")) {
                    showText = showText.substring(0, showText.length - 1)
                    showInputText(showText + operator)
                }else{
                    showInputText(showText + operator)
                }
            }
            R.id.buttonMultiply -> {
                operator = inpuntText
                if (showText.endsWith("+") or showText.endsWith("-") or showText.endsWith("*") or showText.endsWith("÷")) {
                    showText = showText.substring(0, showText.length - 1)
                    showInputText(showText + operator)
                }else{
                    showInputText(showText + operator)
                }
            }
            R.id.buttonEqual -> {
                var new_result = calculate().replace(Regex("\\.0$"), "")
                refreshOperator(new_result)
                showResult(new_result)
            }
//            R.id.buttonDot -> {
//
//            }
            R.id.buttonPN -> {

            }
            R.id.buttonClear -> {
                showInputText("0")
                refreshOperator("")
                clear()
            }
            R.id.buttonDelete -> {
                delete()
            }
//            R.id.buttonSplitDate -> {
//
//            }
            R.id.localDate -> {
                var local_date = getLocalDate()
                binding.tvInput.setText("${local_date.year}/${local_date.month}/${local_date.day}")
                firstNumber = "${local_date.year}/${local_date.month}/${local_date.day}"
                showText = firstNumber
            }
            else -> {
                if (result.length > 0 && operator == ""){
                    clear()
                }

                if (operator == ""){
                    firstNumber += inpuntText
                }else{
                    secondNumber += inpuntText
                }

                if (showText == "0" && inpuntText != "."){
                    showInputText(inpuntText)
                }else{
                    showInputText(showText + inpuntText)
                }
            }
        }
    }

    private fun clear() {
        refreshOperator("")
        showInputText("0")
        showResult("")
    }

    private fun refreshOperator(new_result: String) {
        if (new_result == "Error") {
//            result = new_result
            firstNumber = ""
            operator = ""
            secondNumber = ""
        }else{
            result = new_result
            firstNumber = new_result
            operator = ""
            secondNumber = ""
        }

    }

    private fun calculate() : String{
        var in_result = ""
        when(operator){
            "+" -> {
                var caltime = cal_time()
                if (caltime == Date(-1,-1,-1)){
                    if (firstNumber.toDoubleOrNull() != null && secondNumber.toDoubleOrNull() != null){
                        in_result = (firstNumber.toDouble() + secondNumber.toDouble()).toString()
                    }else{
                        in_result = "Error"
                    }
                }else{
                    in_result = caltime.year.toString() + "/" + caltime.month + "/" + caltime.day
                }
            }
            "-" -> {
                var caltime = cal_time()
                if (caltime == Date(-1,-1,-1)) {
                    if (firstNumber.toDoubleOrNull() != null && secondNumber.toDoubleOrNull() != null) {
                        in_result = (firstNumber.toDouble() - secondNumber.toDouble()).toString()
                    }else {
                        in_result = "Error"
                    }
                }else{
                    in_result = caltime.year.toString() + "/" + caltime.month + "/" + caltime.day
                }
            }
            "÷" -> {
                if (firstNumber.toDoubleOrNull() != null && secondNumber.toDoubleOrNull() != null) {
                    in_result = (firstNumber.toDouble() / secondNumber.toDouble()).toString()
                }else{
                    in_result = "Error"
                }
            }
            "*" -> {
                if (firstNumber.toDoubleOrNull() != null && secondNumber.toDoubleOrNull() != null) {
                    in_result = (firstNumber.toDouble() * secondNumber.toDouble()).toString()
                }else{
                    in_result = "Error"
                }
            }
        }
        return in_result
    }

    private fun showInputText(input: String) {
        showText = input
        binding.tvInput.text = input
    }
    private fun showResult(result: String) {
        binding.tvResult.text = result
    }
    private fun cal_time(): Date {
        val time1 = Calendar.getInstance()
        val time2 = Calendar.getInstance()
        var result_date = Date(-1, -1, -1)
        var date1 = listOf<String>()
        var date2 = listOf<String>()
        if (isInputIsDate(firstNumber)) {
            date1 = firstNumber.split("/")
            first_date.year = date1[0].toInt()
            first_date.month = date1[1].toInt() - 1
            first_date.day = date1[2].toInt()
            time1.set(first_date.year, first_date.month, first_date.day)
        }
        if (isInputIsDate(secondNumber)) {
            date2 = secondNumber.split("/")
            second_date.year = date2[0].toInt()
            second_date.month = date2[1].toInt() - 1
            second_date.day = date2[2].toInt()
            time2.set(second_date.year, second_date.month, second_date.day)
        }
        if (isInputIsDate(firstNumber) and isInputIsDate(secondNumber)) {
            if (operator == "-") {
                time1.add(Calendar.YEAR, -second_date.year)
                time1.add(Calendar.MONTH, -second_date.month)
                time1.add(Calendar.DAY_OF_MONTH, -second_date.day)
                result_date.year = time1.get(Calendar.YEAR)
                result_date.month = time1.get(Calendar.MONTH) + 1
                result_date.day = time1.get(Calendar.DAY_OF_MONTH)
                return result_date
            }else if (operator == "+") {
                time1.add(Calendar.YEAR, second_date.year)
                time1.add(Calendar.MONTH, second_date.month)
                time1.add(Calendar.DAY_OF_MONTH, second_date.day)
                result_date.year = time1.get(Calendar.YEAR)
                result_date.month = time1.get(Calendar.MONTH) + 1
                result_date.day = time1.get(Calendar.DAY_OF_MONTH)
                return result_date
            }else{
                binding.tvResult.text = "日期仅支持+或-运算符"
                return result_date
            }
        }else if (isInputIsDate(firstNumber) and (secondNumber.toIntOrNull() != null)){
            if (operator == "+") {
                return model_select(modelSelect, secondNumber, time1,"+")
            }else if (operator == "-"){
                return model_select(modelSelect, secondNumber, time1,"-")
            }else{
                binding.tvResult.text = "日期仅支持+或-运算符"
                return result_date
            }

        }else if (isInputIsDate(secondNumber) and (firstNumber.toIntOrNull() != null)){
            if (operator == "+") {
                return model_select(modelSelect, firstNumber, time2, "+")
            }else if (operator == "-"){
                return model_select(modelSelect, firstNumber, time2, "-")
            }else{
                binding.tvResult.text = "日期仅支持+或-运算符"
                return result_date
            }
        }else{
            return result_date
        }
    }
    fun model_select(model : String, intNumber : String, time: Calendar, operater: String):Date{
        var date = Date(-1, -1, -1)
        if (operater == "+") {
            when (model) {
                "YEAR" -> {
                    time.add(Calendar.YEAR, intNumber.toInt())
                    date.year = time.get(Calendar.YEAR)
                    date.month = time.get(Calendar.MONTH) + 1
                    date.day = time.get(Calendar.DAY_OF_MONTH)
                    return date
                }

                "MONTH" -> {
                    time.add(Calendar.MONTH, intNumber.toInt())
                    date.year = time.get(Calendar.YEAR)
                    date.month = time.get(Calendar.MONTH) + 1
                    date.day = time.get(Calendar.DAY_OF_MONTH)
                    return date
                }

                "DAY" -> {
                    time.add(Calendar.DAY_OF_MONTH, intNumber.toInt())
                    date.year = time.get(Calendar.YEAR)
                    date.month = time.get(Calendar.MONTH) + 1
                    date.day = time.get(Calendar.DAY_OF_MONTH)
                    return date
                }

                "WEEK" -> {
                    time.add(Calendar.WEDNESDAY, intNumber.toInt())
                    date.year = time.get(Calendar.YEAR)
                    date.month = time.get(Calendar.MONTH) + 1
                    date.day = time.get(Calendar.DAY_OF_MONTH)
                    return date
                }

                else -> return date
            }
        }else{
            when (model) {
                "YEAR" -> {
                    time.add(Calendar.YEAR, intNumber.toInt())
                    date.year = time.get(Calendar.YEAR)
                    date.month = time.get(Calendar.MONTH) - 1
                    date.day = time.get(Calendar.DAY_OF_MONTH)
                    return date
                }

                "MONTH" -> {
                    time.add(Calendar.MONTH, intNumber.toInt())
                    date.year = time.get(Calendar.YEAR)
                    date.month = time.get(Calendar.MONTH) - 1
                    date.day = time.get(Calendar.DAY_OF_MONTH)
                    return date
                }

                "DAY" -> {
                    time.add(Calendar.DAY_OF_MONTH, intNumber.toInt())
                    date.year = time.get(Calendar.YEAR)
                    date.month = time.get(Calendar.MONTH) - 1
                    date.day = time.get(Calendar.DAY_OF_MONTH)
                    return date
                }

                "WEEK" -> {
                    time.add(Calendar.WEDNESDAY, intNumber.toInt())
                    date.year = time.get(Calendar.YEAR)
                    date.month = time.get(Calendar.MONTH) - 1
                    date.day = time.get(Calendar.DAY_OF_MONTH)
                    return date
                }

                else -> return date
            }
        }
    }
    fun isInputIsDate(inp : String):Boolean{
//      判断第一个数据输入是否错误，（比如错误提示后之间按运算符进行计算）错误返回true。
        val regx=Regex("\\d+/\\d+/\\d+")
        if((inp.count { it == '/' } == 2) and (inp.split('/').size >=2) and  (regx.matches(inp))){
//            year = inp.split('/')[0].toInt()
//            month = inp.split('/')[1].toInt()
//            day = inp.split('/')[2].toInt()
            return true
        }
        else if(!inp.contains("/")){
            return  false
        }
        else{
//            answerTextView.text="输入日期有误"
            return false
        }
    }
    fun modelSelcter() {
        binding.selecToggleGroup.addOnButtonCheckedListener { group: MaterialButtonToggleGroup?, checkedId, isChecked ->
            val childCount = group?.childCount
            var selctIndex = 0
            for (index in 0 until childCount!!) {
                val child = group.getChildAt(index) as MaterialButton
                if (child.id == checkedId) {
                    selctIndex = index
                    child.setTextColor(Color.parseColor("#FFFFFF"))
                    child.setBackgroundColor(Color.parseColor("#03A9F4"))
                } else {
                    child.setTextColor(Color.parseColor("#000000"))
                    child.setBackgroundColor(Color.parseColor("#87C4FF"))
                }
            }
            when (selctIndex) {
                0 -> {
                    modelSelect = "YEAR"
                    binding.hintTextView.setText("年")
                }

                1 -> {
                    modelSelect = "MONTH"
                    binding.hintTextView.setText("月")
                }

                2 -> {
                    modelSelect = "DAY"
                    binding.hintTextView.setText("日")
                }

                3 -> {
                    modelSelect = "WEEK"
                    binding.hintTextView.setText("周")
                }

                4 -> {
                    modelSelect = "MATH"
                    binding.hintTextView.setText(modelSelect)
                }
            }
        }
    }

    private fun delete(){
        //逻辑有问题，待修改
        if (showText.isNotEmpty()){
            if (showText.length>=2) {
                binding.tvInput.setText(showText.substring(0, showText.length - 1))
                if (operator != "") {
                    showText = showText.substring(0, showText.length - 1)
                    if (secondNumber == "") {
//                        showText = showText.substring(0, showText.length - 1)
                        operator = ""
                    }else{
                        secondNumber = secondNumber.substring(0, secondNumber.length - 1)
                    }
                }else{
                    showText = showText.substring(0, showText.length - 1)
                    firstNumber = firstNumber.substring(0, firstNumber.length - 1)
                }
            }else{
                if (operator != "") {
                    showText = showText.substring(0, showText.length - 1)
                    binding.tvInput.setText("")
                    secondNumber= ""
                }else{
                    showText = showText.substring(0, showText.length - 1)
                    binding.tvInput.setText("")
                    firstNumber = ""
                }
            }
        }
    }
    private fun getLocalDate(): Date{
        var calendar = Calendar.getInstance()
        var year = calendar.get(Calendar.YEAR)
        var month = calendar.get(Calendar.MONTH) + 1
        var day = calendar.get(Calendar.DAY_OF_MONTH)
        binding.localDate.setText("${year}/${month}/${day}")
        return Date(year, month, day)
    }
}

data class Date(var year: Int, var month: Int, var day: Int)