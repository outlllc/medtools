package com.duckgo.medtools.datecalculator

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.duckgo.medtools.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date


class DateCalculator_ : Fragment() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var button0: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonEqual: Button
    private lateinit var buttonAdd: Button
    private lateinit var buttonSplitDate: Button
    private lateinit var buttonSubtract: Button
    private lateinit var buttonMultiply: Button
    private lateinit var buttonDivide: Button
    private lateinit var buttonDelete: Button
    private lateinit var buttonDot: Button
    private lateinit var modelSelect_year: Button
    private lateinit var modelSelect_month: Button
    private lateinit var modelSelect_day: Button
    private lateinit var modelSelect_week: Button
    private lateinit var modelSelect_date: Button
    private lateinit var localDate: Button
    private lateinit var buttonPN: Button
    private lateinit var answerTextView: TextView
    private lateinit var hintTextView: TextView
    lateinit var selecToggleGroup:MaterialButtonToggleGroup

    private var operator = ""
    private var firstInput = ""
    private var secondInput = ""

    private var year = 0
    private var month = 0
    private var day = 0
    private var week = 0
    private var timeFormat = "yyyy/MM/dd"
    private  var simpleDateFormat= SimpleDateFormat(timeFormat)
    private var modelSelect = "WEEK"
    private var showText = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_date_calculator_, container, false)
        initView(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        localDate.setOnClickListener {
            answerTextView.setText("${getLocalDate()[0]}/${getLocalDate()[1]}/${getLocalDate()[2]}")
            firstInput = answerTextView.text.toString()
        }
        input()
        clearInput()
        operator()
        calculateDate()
        modelSelcter()
        getLocalDate()
    }

    private fun initView(view: View) {
        button1 = view.findViewById<Button>(R.id.button1)
        button2 = view.findViewById<Button>(R.id.button2)
        button3 = view.findViewById<Button>(R.id.button3)
        button4 = view.findViewById<Button>(R.id.button4)
        button5 = view.findViewById<Button>(R.id.button5)
        button6 = view.findViewById<Button>(R.id.button6)
        button7 = view.findViewById<Button>(R.id.button7)
        button8 = view.findViewById<Button>(R.id.button8)
        button9 = view.findViewById<Button>(R.id.button9)
        button0 = view.findViewById<Button>(R.id.button0)
        buttonClear = view.findViewById<Button>(R.id.buttonClear)
        buttonEqual = view.findViewById<Button>(R.id.buttonEqual)
        buttonAdd = view.findViewById<Button>(R.id.buttonAdd)
        buttonSplitDate = view.findViewById<Button>(R.id.buttonSplitDate)
        buttonSubtract = view.findViewById<Button>(R.id.buttonSubtract)
        buttonMultiply = view.findViewById<Button>(R.id.buttonMultiply)
        buttonDivide = view.findViewById<Button>(R.id.buttonDivide)
        buttonDelete = view.findViewById<Button>(R.id.buttonDelete)
        buttonDot = view.findViewById<Button>(R.id.buttonDot)
        modelSelect_year = view.findViewById<Button>(R.id.modelSelect_year)
        modelSelect_month = view.findViewById<Button>(R.id.modelSelect_month)
        modelSelect_day = view.findViewById<Button>(R.id.modelSelect_day)
        modelSelect_week = view.findViewById<Button>(R.id.modelSelect_week)
        modelSelect_date = view.findViewById<Button>(R.id.modelSelect_date)
        buttonPN = view.findViewById<Button>(R.id.buttonPN)
        localDate = view.findViewById<Button>(R.id.localDate)
        answerTextView = view.findViewById<TextView>(R.id.answerEditText)
        hintTextView = view.findViewById<TextView>(R.id.hintTextView)
        selecToggleGroup = view.findViewById(R.id.selecToggleGroup)
    }

    fun input(){
        button1.setOnClickListener { inputNum("1") }
        button2.setOnClickListener { inputNum("2") }
        button3.setOnClickListener { inputNum("3") }
        button4.setOnClickListener { inputNum("4") }
        button5.setOnClickListener { inputNum("5") }
        button6.setOnClickListener { inputNum("6") }
        button7.setOnClickListener { inputNum("7") }
        button8.setOnClickListener { inputNum("8") }
        button9.setOnClickListener { inputNum("9") }
        button0.setOnClickListener {
            if (answerTextView.text.toString() != "0") {
                inputNum("0")
            }
        }
        buttonSplitDate.setOnClickListener{ splitDate() }
        buttonDot.setOnClickListener { if (answerTextView.text.toString().endsWith(".")) {
        }else if (answerTextView.text.toString() == "0") {
            firstInput = "0."
            if (showText == "0") {
                showText(showText + ".")
            }else{
                showText(showText + "0.")
            }
//            showText(showText + "0.")
//            answerTextView.text = answerTextView.text.toString() + "."
        }else if (answerTextView.text.toString() == ""){
            firstInput = "0."
            showText(showText + "0.")
//            answerTextView.text= "0."
        }else if ((operator != "") and (secondInput == "")) {
            secondInput = "0."
            showText(showText + "0.")
        }else if ((operator != "") and (secondInput == "0")) {
            secondInput = "0."
            showText(showText + ".")
        }else{
            inputNum(".")
            }
        }

    }
    fun showText(text: String){
        showText = text
        answerTextView.text = showText
    }
    fun inputNum(num : String) {
        if (operator == "") {
//            firstInput = answerTextView.text.toString()
            if (firstInput == "0") { // if the first input is 0, replace it with the new input
                firstInput = num
                showText(showText + num)
//                answerTextView.text = firstInput
            } else if (num != operator) { // if the first input is not 0, append the new input
                firstInput = firstInput + num
                showText(showText + num)
//                firstInput = answerTextView.text.toString() + num
//                answerTextView.text = firstInput
            }
        } else {
            if((!isInputLegal(firstInput)) and !answerTextView.text.toString().contains("/")){
//                secondInput = (answerTextView.text.toString() + operator).split(operator)[1]
                if (secondInput == "0") { // if the first input is 0, replace it with the new input
                    secondInput = num
                    showText(showText + num)
//                    answerTextView.text = firstInput + operator + secondInput
                } else if (num != operator) { // if the first input is not 0, append the new input
                    secondInput = secondInput + num
                    showText(showText + num)
//                    answerTextView.text = firstInput + operator + secondInput
                } else if (num == operator) {
                    showText(showText + operator)
//                    answerTextView.text = firstInput + operator
                }
            }else if (isInputLegal(firstInput)){
//                secondInput = (answerTextView.text.toString() + operator).split(operator)[1]
                if (secondInput == "0") { // if the first input is 0, replace it with the new input
                    secondInput = num
                    showText(showText + num)
//                    answerTextView.text = firstInput + operator + secondInput
                } else if (num != operator) { // if the first input is not 0, append the new input
                    secondInput = secondInput + num
                    showText(showText + num)
//                    answerTextView.text = firstInput + operator + secondInput
                } else if (num == operator) {
                    showText = firstInput
                    showText(showText + operator)
//                    answerTextView.text = firstInput + operator
                }
            }
        }
    }
    fun operator(){
        buttonAdd.setOnClickListener {
            operator = "+"
            inputNum("+")
        }
        buttonSubtract.setOnClickListener {
            operator = "-"
            inputNum("-")
        }
        buttonMultiply.setOnClickListener {
            this.operator = "*"
            inputNum("*")
        }
        buttonDivide.setOnClickListener {
            this.operator = "÷"
            inputNum("÷")
        }
    }
    fun mathResult(){
        var result = ""
        if (firstInput.toDoubleOrNull() != null && secondInput.toDoubleOrNull() != null){
            if (operator == "+") {
                result =
                    (firstInput.toDouble() + secondInput.toDouble()).toString().replace(Regex("\\.0$"), "")
                showResult(result)
            }
            else if (operator == "-") {
                result =
                    (firstInput.toDouble() - secondInput.toDouble()).toString().replace(Regex("\\.0$"), "")
                showResult(result)
            }
            else if (operator == "*") {
                result =
                    (firstInput.toDouble() * secondInput.toDouble()).toString().replace(Regex("\\.0$"), "")
                showResult(result)
            }
            else if (operator == "÷") {
                if (secondInput.toDouble() != 0.0) {
                    result =
                        (firstInput.toDouble() / secondInput.toDouble()).toString().replace(Regex("\\.0$"), "")
                    showResult(result)
                } else {
                    answerTextView.text = "Cannot divide by zero"
                }
            }
        }
        operator = ""
        firstInput = result
        secondInput = ""
        showText = result

    }
    fun clearInput(){
        buttonClear.setOnClickListener{
            answerTextView.text = ""
            firstInput = ""
            secondInput = ""
            operator = ""
            showText = ""
        }
    }

    fun calculateDate(){
        buttonEqual.setOnClickListener{
            if (modelSelect != "MATH") {
                if ((isInputLegal(firstInput)) and (isInputLegal(secondInput))) {
                    var result = yearAddYear(firstInput, secondInput)
                    showResult(result)
//                answerTextView.text="两个日期的计算"
                } else if ((isInputLegal(firstInput)) and (secondInput.toIntOrNull() != null)) { //如果只有第一个输入合法，则进行日期计算
                    when (modelSelect) {
                        "YEAR" -> {
                            dateCalInt(firstInput, yearForCal = secondInput)
                        }

                        "WEEK" -> {
                            dateCalInt(firstInput, weekForCal = secondInput)
                        }

                        "MONTH" -> {
                            dateCalInt(firstInput, monthForCal = secondInput)
                        }

                        "DAY" -> {
                            dateCalInt(firstInput, dayForCal = secondInput)
                        }
                    }
//                answerTextView.text="第一个是日期的计算"
                } else if ((isInputLegal(secondInput)) and (firstInput.toIntOrNull() != null)) {
                    when (modelSelect) {
                        "YEAR" -> {
                            dateCalInt(secondInput, yearForCal = firstInput)
                        }

                        "WEEK" -> {
                            dateCalInt(secondInput, weekForCal = firstInput)
                        }

                        "MONTH" -> {
                            dateCalInt(secondInput, monthForCal = firstInput)
                        }

                        "DAY" -> {
                            dateCalInt(secondInput, dayForCal = firstInput)
                        }
                    }
//                answerTextView.text="第二个是日期的计算"
                } else {
                    mathResult()
                }
            } else{
                mathResult()
            }
        }
    }
    fun isInputLegal(inp : String):Boolean{
//      判断第一个数据输入是否错误，（比如错误提示后之间按运算符进行计算）错误返回true。
        val regx=Regex("\\d+/\\d+/\\d+")
        var regex=Regex("-?\\d+(\\.\\d+)?")
        if((inp.count { it == '/' } == 2) and (inp.split('/').size >=2) and  (regx.matches(inp))){
            year = inp.split('/')[0].toInt()
            month = inp.split('/')[1].toInt()
            day = inp.split('/')[2].toInt()
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
    fun splitDate() {
        val regex = Regex("\\D")
        if (operator.isNotEmpty()) {
            if (isInputLegal(firstInput)) {
                if (secondInput.count { it == '/' } < 2) {
                    if (!answerTextView.text.toString().endsWith("/")) {
                        inputNum("/")
                    }
                } else {

                }
            }
        }else if ((!(answerTextView.text.toString()
                .contains("+"))) and (!(answerTextView.text.toString().contains("-"))) and
            (!(answerTextView.text.toString().contains("*"))) and (!(answerTextView.text.toString()
                .contains("÷")))
            and (answerTextView.text.toString() != "0") and (answerTextView.text.toString() != "0.")
        ) {
            if (firstInput.count { it == '/' } < 2) {
                if (!answerTextView.text.toString().endsWith("/")) {
                    inputNum("/")
                }
            } else {

            }
        } else {
            answerTextView.text = "清空后输入"
        }
    }

    fun yearAddYear(first: String, second: String): String {
        var result = ""
        val F1 =
            (simpleDateFormat.parse(first)).getTime() + (8 * 60 * 60 * 1000)
        val S2 =
            (simpleDateFormat.parse(second).getTime()) + (8 * 60 * 60 * 1000)
        when (operator) {
            "+" -> result = ((F1 + S2) / (60 * 60 * 24 * 1000)).toString()

            "-" -> result = ((F1 - S2) / (60 * 60 * 24 * 1000)).toString()
        }
        afterCalculate()
        return result
    }
    fun dateCalInt(date:String,yearForCal:String="0",monthForCal:String="0",weekForCal:String="0",dayForCal:String="0"){
        var calendar= Calendar.getInstance()
        val sdate: Date = simpleDateFormat.parse(date)
        calendar.setTime(sdate)
        var yy = yearForCal.toIntOrNull()
        var mm = monthForCal.toIntOrNull()
        var ww= weekForCal.toIntOrNull()
        var dd = dayForCal.toIntOrNull()
        var year1 = 0;
        var month1 = 0;
        var day1 = 0
        when (operator) {
            "+" -> {
                yy?.let { calendar.add(Calendar.YEAR, it) }
                mm?.let { calendar.add(Calendar.MONTH, it) }
                ww?.let { calendar.add(Calendar.WEDNESDAY, it) }
                dd?.let { calendar.add(Calendar.DAY_OF_MONTH, it) }
                year1 = calendar.get(Calendar.YEAR)
                month1 = calendar.get(Calendar.MONTH) + 1
                day1 = calendar.get(Calendar.DAY_OF_MONTH)
            }

            "-" -> {
                yy?.let { calendar.add(Calendar.YEAR, -it) }
                mm?.let { calendar.add(Calendar.MONTH, -it) }
                ww?.let { calendar.add(Calendar.WEDNESDAY, -it) }
                dd?.let { calendar.add(Calendar.DAY_OF_MONTH, -it) }
                year1 = calendar.get(Calendar.YEAR)
                month1 = calendar.get(Calendar.MONTH) + 1
                day1 = calendar.get(Calendar.DAY_OF_MONTH)
            }
        }
        afterCalculate()
        showResult(("${year1}/${month1}/${day1}"))
    }
    fun afterCalculate(){
        operator = ""
        firstInput = ""
        secondInput = ""
        showText = ""
    }
    fun showResult(result: String){
        answerTextView.text = result
    }
    fun modelSelcter() {
        selecToggleGroup.addOnButtonCheckedListener { group: MaterialButtonToggleGroup?, checkedId, isChecked ->
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
                    hintTextView.setText("年")
                }

                1 -> {
                    modelSelect = "MONTH"
                    hintTextView.setText("月")
                }

                2 -> {
                    modelSelect = "DAY"
                    hintTextView.setText("日")
                }

                3 -> {
                    modelSelect = "WEEK"
                    hintTextView.setText("周")
                }

                4 -> {
                    modelSelect = "MATH"
                    hintTextView.setText(modelSelect)
                }
            }
        }
    }
    fun getLocalDate():List<String>{
        var calendar = Calendar.getInstance()
        var year = calendar.get(Calendar.YEAR)
        var month = calendar.get(Calendar.MONTH) + 1
        var day = calendar.get(Calendar.DAY_OF_MONTH)
        localDate.setText("${year}/${month}/${day}")
        var list = listOf(year.toString(), month.toString(), day.toString())
        return list

    }
}