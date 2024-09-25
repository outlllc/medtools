package com.duckgo.medtools

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

class Datecalculator : Fragment(), View.OnClickListener {


    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    lateinit var button0: Button
    lateinit var buttonPlus: Button
    lateinit var buttonDeduct: Button
    lateinit var buttonSplitDate: Button
    lateinit var buttonMultyply: Button
    lateinit var answerEditText: EditText
    lateinit var buttonClear: Button
    lateinit var modelSelect_year: Button
    lateinit var modelSelect_month: Button
    lateinit var modelSelect_day: Button
    lateinit var modelSelect_week: Button
    lateinit var modelSelect_date: Button
    lateinit var hintTextView: TextView
    lateinit var buttonEqual:Button
    lateinit var buttonDivide:Button
    lateinit var buttonDelete:Button
    var localDate: Button? =null
    var buttonPosNeg:Button? =null
    lateinit var selecToggleGroup:MaterialButtonToggleGroup
    lateinit var buttonDot:Button

    var operator = ""
    var first = ""
    var isFirstInput = true
    var second = ""
    var secondMediate=""
    var firstMediate = ""
    var modelSelect = "WEEK"
    var timeFormat = "yyyy/MM/dd"
    var lineCount = 0
    val dateRegex=Regex("\\d+/\\d+/\\d+")
    var simpleDateFormat= SimpleDateFormat(timeFormat)

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var view = inflater.inflate(R.layout.grid_layout, container, false)
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
        buttonPlus = view.findViewById<Button>(R.id.buttonPlus)
        buttonDeduct = view.findViewById<Button>(R.id.buttonDeduct)
        buttonSplitDate = view.findViewById<Button>(R.id.buttonSplitDate)
        buttonMultyply = view.findViewById<Button>(R.id.buttonMutiply)
        buttonDivide = view.findViewById<Button>(R.id.buttonDivide)
        answerEditText = view.findViewById<EditText>(R.id.answerEditText)
        buttonClear = view.findViewById(R.id.buttonClear)

        modelSelect_year = view.findViewById(R.id.modelSelect_year)
        modelSelect_month = view.findViewById(R.id.modelSelect_month)
        modelSelect_week = view.findViewById(R.id.modelSelect_week)
        modelSelect_day = view.findViewById(R.id.modelSelect_day)
        modelSelect_date = view.findViewById(R.id.modelSelect_date)

        hintTextView = view.findViewById(R.id.hintEditText)

        buttonEqual=view.findViewById(R.id.buttonEqual)
        buttonPosNeg=view.findViewById(R.id.buttonPosNeg)
        buttonDelete=view.findViewById(R.id.buttonDelete)
        localDate=view.findViewById(R.id.localDate)
        selecToggleGroup=view.findViewById(R.id.selecToggleGroup)
        buttonDot=view.findViewById(R.id.buttonDot)

        button1.setOnClickListener { constructNum("1") }
        button2.setOnClickListener { constructNum("2") }
        button3.setOnClickListener { constructNum("3") }
        button4.setOnClickListener { constructNum("4") }
        button5.setOnClickListener { constructNum("5") }
        button6.setOnClickListener { constructNum("6") }
        button7.setOnClickListener { constructNum("7") }
        button8.setOnClickListener { constructNum("8") }
        button9.setOnClickListener { constructNum("9") }
        button0.setOnClickListener {
            if (answerEditText.text.toString().startsWith('0')){
//                不能以0开头输入多个0
            }else { constructNum("0") }
        }
        buttonSplitDate.setOnClickListener {
            if (!answerEditText.text.toString().startsWith('-')){
                constructNum("/")
            }else{ }
        }
        buttonDot.setOnClickListener { if(!answerEditText.text.toString().contains(".")
        ){
            constructNum(".")
        } else{}}


        buttonPlus.setOnClickListener { if(operator!="+") {
            onClickOperator("+")
        } }
        buttonDeduct.setOnClickListener {
            if (operator!="-"){ onClickOperator("-") }
//            if (answerEditText.text.toString().isBlank()){
//            }else{
//                onClickOperator("-")
//            }
        }
        buttonMultyply.setOnClickListener { if (operator!="*"){ onClickOperator("*") }}
        buttonDivide.setOnClickListener{ if (operator!="÷"){ onClickOperator("÷") }}

        buttonDelete.setOnClickListener {delete()}
        localDate?.setOnClickListener { answerEditText.setText("${getLocalDate()[0]}/${getLocalDate()[1]}/${getLocalDate()[2]}") }

        buttonPosNeg!!.setOnClickListener { setNegtive() }




        hintTextView.text = this.modelSelect
        buttonEqual.setOnClickListener{ timeCaculate() }
//        modelEvent()
        clear()
        getLocalDate()
        selectModle()

        return view

    }
//    oncreate view的括号

    fun selectModle() {
        selecToggleGroup.addOnButtonCheckedListener { group: MaterialButtonToggleGroup?, checkedId, isChecked ->
            val childCount = group?.childCount
            var selctIndex = 0
            for (index in 0 until childCount!!) {
                val child = group.getChildAt(index) as MaterialButton
                if (child.id == checkedId) {
                    selctIndex = index
                    child.setTextColor(Color.parseColor("#FFFFFFFF"))
                    child.setBackgroundColor(Color.parseColor("#FF03A9F4"))
                } else {
                    child.setTextColor(Color.parseColor("#FF000000"))
                    child.setBackgroundColor(Color.parseColor("#FF87C4FF"))
                }
            }
            when (selctIndex) {
                0 -> {
                    modelSelect = "YEAR"
                    hintTextView.setText(modelSelect)
                }

                1 -> {
                    modelSelect = "MONTH"
                    hintTextView.setText(modelSelect)
                }

                2 -> {
                    modelSelect = "DAY"
                    hintTextView.setText(modelSelect)
                }

                3 -> {
                    modelSelect = "WEEK"
                    hintTextView.setText(modelSelect)
                }

                4 -> {
                    modelSelect = "DATE"
                    hintTextView.setText(modelSelect)
                }
            }
        }
    }






    fun onClickOperator(operat:String){
        answerEditText.setTypeface(Typeface.MONOSPACE,Typeface.NORMAL)
        var input=answerEditText.text.toString()
        if (first.isBlank()){
            firstMediate=answerEditText.text.toString()
        }

        if (input.contains(Regex("[+*÷]"))){
            answerEditText.setText(input.replace(Regex("[+*÷]"),"${operat}"))
            operator=operat
        }else if (((input.count { it=='-' }>=2) and input.startsWith('-'))){
            answerEditText.setText(input.replace(Regex("-$"),"${operat}"))
            operator=operat
        }else if(input.contains(Regex("-$"))){
            answerEditText.setText(input.replace("-","${operat}"))
            operator=operat
        }
        else{
            var append = answerEditText.text.toString()
            answerEditText.setText("${append}\n${operat}")
            operator=operat
            first = ""
        }

    }

    fun clear() {
        buttonClear.setOnClickListener {
            answerEditText.setText("")
            first=""
            firstMediate=""
            secondMediate=""
            second=""
            operator=""
        }
    }

    fun delete(){
        if (answerEditText.text.isNotEmpty()){
            if (answerEditText.text.toString().length>=2) {
                answerEditText.setText(answerEditText.text.toString().substring(0, answerEditText.text.toString().length - 1))
                first= answerEditText.text.toString()
            }else{
                answerEditText.setText("0")
            }
        }
    }

    fun setNegtive(){
        if (answerEditText.text.startsWith('-')){
            answerEditText.setText(answerEditText.text.toString().replace("-",""))
        }else if (!answerEditText.text.contains('/') and !answerEditText.text.contains('-')
            and !answerEditText.text.toString().startsWith('0')){
            answerEditText.setText("-${answerEditText.text}")
        }else{
            answerEditText.setText("-")
        }
    }

    fun getLocalDate():List<String>{
        var calendar=Calendar.getInstance()
        var year=calendar.get(Calendar.YEAR)
        var month=calendar.get(Calendar.MONTH)+1
        var day=calendar.get(Calendar.DAY_OF_MONTH)
        localDate?.setText("${year}/${month}/${day}")
        var list= listOf(year.toString(),month.toString(),day.toString())
        return list
    }

    fun constructNum(s: String) {
        var text=answerEditText.text.toString()
        if (operator.isBlank()){
            if (text.startsWith('0')){
                first=""
            }else{
                first = answerEditText.text.toString()
            }
            first += s
            answerEditText.setTypeface(Typeface.MONOSPACE, Typeface.NORMAL)
            answerEditText.setText(first)
            firstMediate = first
        }else{
            second += s
            answerEditText.setTypeface(Typeface.MONOSPACE, Typeface.NORMAL)
            answerEditText.setText(second)
            secondMediate = second

//            if (text.contains(Regex("[+*÷]")) or (text.contains(Regex("-$")) and (text.split("-").size >= 3))) {
//                second += s
//                answerEditText.setTypeface(Typeface.MONOSPACE, Typeface.NORMAL)
//                answerEditText.setText(second)
//                secondMediate = second
//            } else if (text.contains(Regex("-$")) and (text.split("-").size == 2) and !text.startsWith("-")) {
//                second += s
//                answerEditText.setTypeface(Typeface.MONOSPACE, Typeface.NORMAL)
//                answerEditText.setText(second)
//                secondMediate = second
//            }
        }
    }

//    fun modelEvent() {
//        modelSelect_year.setOnClickListener {
//            modelSelect = "YEAR"
//            hintTextView.setText(modelSelect)
//        }
//        modelSelect_month.setOnClickListener {
//            modelSelect = "MONTH"
//            hintTextView.setText(modelSelect)
//        }
//        modelSelect_week.setOnClickListener {
//            modelSelect = "WEEK"
//            hintTextView.setText(modelSelect)
//        }
//        modelSelect_day.setOnClickListener {
//            modelSelect = "DAY"
//            hintTextView.setText(modelSelect)
//        }
//        modelSelect_date.setOnClickListener {
//            modelSelect = "DATE"
//            hintTextView.setText(modelSelect)
//        }
//    }

    fun yearToyear(s1: String, s2: String): String {
        var result = ""
        val F1 =
            (simpleDateFormat.parse(s1)).getTime() + (8 * 60 * 60 * 1000)
        val S2 =
            (simpleDateFormat.parse(s2).getTime()) + (8 * 60 * 60 * 1000)
        when (operator) {
            "+" -> result = ((F1 + S2) / (60 * 60 * 24 * 1000)).toString()

            "-" -> result = ((F1 - S2) / (60 * 60 * 24 * 1000)).toString()
        }
        operator=""
        return result
    }

    fun intToint(s1: String, s2: String) {
        val firstNumber = s1.toDouble()
        val secondNumber = s2.toDouble()
        var tNum: Double = 0.0
        when (operator) {
            "+" -> tNum = firstNumber + secondNumber
            "-" -> tNum = firstNumber - secondNumber
            "*" -> tNum = firstNumber * secondNumber
            "÷" -> {
                if (s2.toInt() == 0) {
                    Toast.makeText(activity, "除数不能为0", Toast.LENGTH_LONG).show()
                    tNum = 0.000
                } else {
                    tNum = firstNumber / secondNumber
                }
            }
        }
        operator=""
        changeResultFont(tNum.toString().replace(Regex("\\.0$"), ""))
    }
    fun isInputIllegal(s:String):Boolean{
//                判断第一个数据输入是否错误，（比如错误提示后之间按运算符进行计算）错误返回true。
        val regx=Regex("\\d+/\\d+/\\d+")
        var regex=Regex("-?\\d+(\\.\\d+)?")
        if((s.count { it == '/' } >= 2) and (s.split('/').size >=2) and  (regx.matches(s))){
            return false
        }else if(regex.containsMatchIn(s)){
            return  false
        }else{
            return true
        }
    }

    fun changeResultFont(result:String){
        answerEditText.setTypeface(Typeface.MONOSPACE,Typeface.BOLD)
        answerEditText.setText(result)

    }

    fun timeCaculate() {
//        secondMediate = answerEditText.text.toString()
        if(first.isBlank() and second.isBlank()){
            firstMediate=answerEditText.text.toString()
        }
        first=""
        second=""
        if (firstMediate.isBlank() and secondMediate.isBlank()) {
            answerEditText.setText("请正确输入数据-1")
            firstMediate="0"
        } else if (firstMediate.isBlank() or secondMediate.isBlank()) {
            answerEditText.setText("请正确输入数据-2")
            firstMediate="0"
        }else if(secondMediate.split("\n").size>=2){
            answerEditText.setText("请输入第二个数据-3")
            firstMediate="0"
        }else if (isInputIllegal(firstMediate) or isInputIllegal(secondMediate)){
            answerEditText.setText("请正确输入数据-4")
            firstMediate="0"
        }
        else if (firstMediate.isNotBlank() and secondMediate.isNotBlank()) {
            var first1 = ""
            var result = ""
            var calendar: Calendar = Calendar.getInstance()
            if (firstMediate.contains("\n")) {
                var firstList = firstMediate.split("\n")
                first1 = firstList[0].trim()
                firstMediate="0"
            } else {
                first1 = firstMediate
                firstMediate="0"
            }
            var second1 = ""
            if (secondMediate.contains("\n")) {
                var countLine = answerEditText.lineCount
                var BB = secondMediate.split("\n")
                second1 = BB[countLine - 1].trim()
            } else {
                second1 = secondMediate
            }
            when (modelSelect) {
                "DATE" -> {
                    if (dateRegex.matches(first1) and dateRegex.matches(second1)){
//                    if ((first1.count { it == '/' } >= 2) and (second1.count { it == '/' } >= 2)) {
                        val F1 =
                            (simpleDateFormat.parse(first1)).getTime() + (8 * 60 * 60 * 1000)
                        val S2 =
                            (simpleDateFormat.parse(second1)
                                .getTime()) + (8 * 60 * 60 * 1000)
                        when (operator) {
                            "+" -> result = ((F1 + S2) / (60 * 60 * 24 * 1000)).toString()

                            "-" -> result = ((F1 - S2) / (60 * 60 * 24 * 1000)).toString()
                        }
                        changeResultFont(result)
                        operator=""
                    } else if ((dateRegex.matches(first1)) and !dateRegex.matches(second1)) {
                        dateCalInt(first1,dd=second1)
                    } else if (!(dateRegex.matches(first1)) and dateRegex.matches(second1)) {
                        dateCalInt(second1,dd=first1)
                    } else if (!first1.contains("/") and !second1.contains("/")) {
                        intToint(first1,second1)
                    } else {
                        answerEditText.setText("-1")
                        firstMediate="0"
                        operator=""
                    }
                }

                "YEAR" -> {
                    if ((dateRegex.matches(first1)) and dateRegex.matches(second1)) {
                        result = yearToyear(first1, second1)
                        changeResultFont(result)
                    } else if ((first1.count { it == '/' } >= 2) and !second1.contains("/")) {
                        dateCalInt(first1,yy=second1)
                    } else if ((second1.count { it == '/' } >= 2) and !first1.contains("/")) {
                        dateCalInt(second1,yy=first1)
                    } else if (!first1.contains("/") and !second1.contains("/")) {
                        intToint(first1, second1)
                    } else {
                        answerEditText.setText("请正确输入-2")
                        firstMediate="0"
                        operator=""
                    }
                }

                "MONTH" -> {
                    if ((dateRegex.matches(first1)) and dateRegex.matches(second1)) {
                        result = yearToyear(first1, second1)
                        changeResultFont(result)
                    } else if ((first1.count { it == '/' } >= 2) and !second1.contains("/")) {
                        dateCalInt(first1,mm=second1)
                    } else if ((second1.count { it == '/' } >= 2) and !first1.contains("/")) {
                        dateCalInt(second1,mm=first1)
                    } else if (!first1.contains("/") and !second1.contains("/")) {
                        intToint(first1, second1)
                    } else {
                        answerEditText.setText("请正确输入-3")
                        firstMediate="0"
                        operator=""
                    }
                }

                "WEEK" -> {
                    if ((dateRegex.matches(first1)) and dateRegex.matches(second1)) {
                        result = yearToyear(first1, second1)
                        changeResultFont(result)
                    } else if ((first1.count { it == '/' } >= 2) and !second1.contains("/")) {
                        dateCalInt(first1,ww=second1)
                    } else if ((second1.count { it == '/' } >= 2) and !first1.contains("/")) {
                        dateCalInt(second1,ww=first1)
                    } else if (!first1.contains("/") and !second1.contains("/")) {
                        intToint(first1, second1)
                    } else {
                        answerEditText.setText("请正确输入-4")
                        firstMediate="0"
                        operator=""
                    }
                }

                "DAY" -> {
                    if ((dateRegex.matches(first1)) and dateRegex.matches(second1)) {
                        result = yearToyear(first1, second1)
                        changeResultFont(result)
                    } else if ((first1.count { it == '/' } >= 2) and !second1.contains("/")) {
                        dateCalInt(first1,dd=second1)
                    } else if ((second1.count { it == '/' } >= 2) and !first1.contains("/")) {
                        dateCalInt(second1,dd=first1)
                    } else if (!first1.contains("/") and !second1.contains("/")) {
                        intToint(first1, second1)
                    } else {
                        answerEditText.setText("请正确输入-5")
                        firstMediate="0"
                        operator=""
                    }
                }
            }
        }
    }

    fun dateCalInt(f:String,yy:String="0",mm:String="0",ww:String="0",dd:String="0"){
        var calendar= Calendar.getInstance()
        val sdate: Date = simpleDateFormat.parse(f)
        calendar.setTime(sdate)
        var fyy = yy.toInt()
        var fmm = mm.toInt()
        var fww=ww.toInt()
        var fdd = dd.toInt()
        var year1 = 0;
        var month1 = 0;
        var day1 = 0
        when (operator) {
            "+" -> {
                calendar.add(Calendar.YEAR, fyy)
                calendar.add(Calendar.WEDNESDAY, fww)
                calendar.add(Calendar.MONTH, fmm)
                calendar.add(Calendar.DAY_OF_MONTH, fdd)
                year1 = calendar.get(Calendar.YEAR)
                month1 = calendar.get(Calendar.MONTH) + 1
                day1 = calendar.get(Calendar.DAY_OF_MONTH)
            }

            "-" -> {
                calendar.add(Calendar.YEAR, -fyy)
                calendar.add(Calendar.MONTH, -fmm)
                calendar.add(Calendar.DAY_OF_MONTH, -fdd)
                year1 = calendar.get(Calendar.YEAR)
                month1 = calendar.get(Calendar.MONTH) + 1
                day1 = calendar.get(Calendar.DAY_OF_MONTH)
            }
        }
        operator=""
        changeResultFont("${year1}/${month1}/${day1}")
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

}