package com.example.mycal

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<EditText>(R.id.hintEditText).setText(modelSel)
    }
    var isFirstInput = true
    var blank =""
    var oprator="+"
    var oldnumber=""
    var year:Int=0
    var month:Int=0
    var day:Int=0
    var firstDateInput0=""
    var modelSel="WEEK"
    var format="yyyy/MM/dd"
    var lineCount=0
    @SuppressLint("SimpleDateFormat")
    var simpleDateFormat=SimpleDateFormat(format)

    fun numberEvent(view: View) {
        val edittext: EditText = findViewById(R.id.edittext)
        if (isFirstInput){
            var append=edittext.text.toString()
//            edittext.setText(blank)
            edittext.setText("${append}\n")
            isFirstInput=false
        }

        var numButtonClicked=edittext.text.toString()
        var buselect=view as Button
        when(buselect.id){
            R.id.button1 -> {numButtonClicked +="1"}
            R.id.button2 -> {numButtonClicked +="2"}
            R.id.button3 -> {numButtonClicked +="3"}
            R.id.button4 -> {numButtonClicked +="4"}
            R.id.button5 -> {numButtonClicked +="5"}
            R.id.button6 -> {numButtonClicked +="6"}
            R.id.button7 -> {numButtonClicked +="7"}
            R.id.button8 -> {numButtonClicked +="8"}
            R.id.button9 -> {numButtonClicked +="9"}
            R.id.buttonzero ->{numButtonClicked+="0"}
            R.id.buttondivide ->{numButtonClicked +="/"}
            R.id.buttondot -> {numButtonClicked +="."}
        }

        edittext.setText(numButtonClicked)
    }
//test
    fun operatorEvent(view: View) {
        isFirstInput=true
        val editT: EditText = findViewById(R.id.edittext)
        firstDateInput0=editT.text.toString()
        lineCount=editT.lineCount
        val operatorSelected=view as Button
        when(operatorSelected.id){
            R.id.buttondivide -> oprator="/"
            R.id.buttonmutiplay -> oprator="*"
            R.id.buttonplus -> oprator = "+"
            R.id.buttonde -> oprator="-"
        }
    }

    @SuppressLint("SetTextI18n")
    fun equalEvent(view: View) {
        if (firstDateInput0 != "") {
            var firstDateInput=""
            val editT: EditText = findViewById(R.id.edittext)
            var AA=editT.text.toString()
            var secondInputDate=""
            if(firstDateInput0.contains("\n")){
                var BB=firstDateInput0.split("\n")
                firstDateInput=BB[lineCount-1].trim()
            }else{
                firstDateInput=firstDateInput0
            }
            if(AA.contains("\n")){
                var i=editT.lineCount
                var BB=AA.split("\n")
                secondInputDate=BB[i-1].trim()
                Log.e("tag",secondInputDate.toString())
            }else{
                secondInputDate=editT.text.toString()
            }

//            val secondInputDate: String = editT.text.toString()
            var answerDAYs: Long = 0
            when (modelSel) {
                "DATE" -> {
                    var calendar: Calendar = Calendar.getInstance()
                    if((firstDateInput.count{it=='/'}>=2) or (secondInputDate.count { it=='/' }>=2)) {
                        if (firstDateInput.contains("/") and secondInputDate.contains("/")) {
                            val date =
                                (simpleDateFormat.parse(firstDateInput)).getTime() + (8 * 60 * 60 * 1000)
                            val new =
                                (simpleDateFormat.parse(secondInputDate)
                                    .getTime()) + (8 * 60 * 60 * 1000)
                            when (oprator) {
                                "+" -> answerDAYs = (date + new) / (60 * 60 * 24 * 1000)

                                "-" -> answerDAYs = (date - new) / (60 * 60 * 24 * 1000)
                            }
                            var append = editT.text.toString()
                            editT.setText("${append}\n${answerDAYs.toString()}")
                        } else if (firstDateInput.contains("/") and !secondInputDate.contains("/")) {
                            val fDate = simpleDateFormat.parse(firstDateInput)
                            calendar.setTime(fDate)
                            val sDate = secondInputDate.toInt()
                            var year1 = 0;
                            var month1 = 0;
                            var day1 = 0
                            when (oprator) {
                                "+" -> {
                                    calendar.add(Calendar.DAY_OF_MONTH, sDate)
                                    year1 = calendar.get(Calendar.YEAR)
                                    month1 = calendar.get(Calendar.MONTH) + 1
                                    day1 = calendar.get(Calendar.DAY_OF_MONTH)
                                }

                                "-" -> {
                                    var date2 = calendar.add(Calendar.DAY_OF_MONTH, -sDate)
                                    year1 = calendar.get(Calendar.YEAR)
                                    month1 = calendar.get(Calendar.MONTH) + 1
                                    day1 = calendar.get(Calendar.DAY_OF_MONTH)
                                }
                            }
                            editT.setText("${year1}-${month1}-${day1}")
                        } else if (!firstDateInput.contains("/") and secondInputDate.contains("/")) {
                            val sDate = simpleDateFormat.parse(secondInputDate)
                            val fDate = firstDateInput.toInt()
                            calendar.setTime(sDate)
                            var year1 = 0;
                            var month1 = 0;
                            var day1 = 0
                            when (oprator) {
                                "+" -> {
                                    calendar.add(Calendar.DAY_OF_MONTH, fDate)
                                    year1 = calendar.get(Calendar.YEAR)
                                    month1 = calendar.get(Calendar.MONTH) + 1
                                    day1 = calendar.get(Calendar.DAY_OF_MONTH)
                                }

                                "-" -> {
                                    var date2 = calendar.add(Calendar.DAY_OF_MONTH, -fDate)
                                    year1 = calendar.get(Calendar.YEAR)
                                    month1 = calendar.get(Calendar.MONTH) + 1
                                    day1 = calendar.get(Calendar.DAY_OF_MONTH)
                                }
                            }
                            val append = editT.text.toString()
                            editT.setText("${append}\n${year1}-${month1}-${day1}")
                        }
                    } else if (!firstDateInput.contains("/") and !secondInputDate.contains("/")){
                        val firstNumber=firstDateInput.toDouble()
                        val secondNumber=secondInputDate.toDouble()
                        var tNum:Double=0.0
                        when(oprator){
                            "+" ->tNum=firstNumber+secondNumber
                            "-" ->tNum=firstNumber-secondNumber
                            "*" ->tNum=firstNumber*secondNumber
                            "/" -> {
                                if (secondNumber.toInt() == 0) {
                                    Toast.makeText(this, "除数不能为0", Toast.LENGTH_LONG)
                                    tNum=0.000
                                } else {
                                    tNum = firstNumber / secondNumber
                                }
                            }
                        }
                        editT.setText(tNum.toString().replace(Regex("\\.0$"),""))
//                        editT.setText(tNum.toString().dropLastWhile { it=='0' }.dropLastWhile { it=='.' })
                    }
                }

                "WEEK" -> {
                    var calendar = Calendar.getInstance()
                    if (firstDateInput.contains("/")) {
                        val date: Date = simpleDateFormat.parse(firstDateInput)
                        calendar.setTime(date)
                        var newWeek = secondInputDate.toInt()
                        var year1 = 0;
                        var month1 = 0;
                        var day1 = 0
                        when (oprator) {
                            "+" -> {
                                var date1 = calendar.add(Calendar.WEDNESDAY, newWeek)
                                year1 = calendar.get(Calendar.YEAR)
                                month1 = calendar.get(Calendar.MONTH) + 1
                                day1 = calendar.get(Calendar.DAY_OF_MONTH)
                            }

                            "-" -> {
                                var date2 = calendar.add(Calendar.WEDNESDAY, -newWeek)
                                year1 = calendar.get(Calendar.YEAR)
                                month1 = calendar.get(Calendar.MONTH) + 1
                                day1 = calendar.get(Calendar.DAY_OF_MONTH)
                            }
                        }
                        editT.setText("${year1}-${month1}-${day1}")
                    } else {
                        var old_ = firstDateInput.toInt()
                        var newWeek = secondInputDate.toInt()
                        var result_ = 0
                        when (oprator) {
                            "+" -> result_ = old_ + newWeek
                            "-" -> result_ = old_ - newWeek
                        }
                        editT.setText("$result_ WEEKs")
                    }
                }

                "YEAR" -> {
                    val calendar = Calendar.getInstance()
                    if (firstDateInput.contains("/")) {
                        val date: Date = simpleDateFormat.parse(firstDateInput)
                        calendar.setTime(date)
                        var newYEAR = secondInputDate.toInt()
                        var year1 = 0;
                        var month1 = 0;
                        var day1 = 0
                        when (oprator) {
                            "+" -> {
                                var date1 = calendar.add(Calendar.YEAR, newYEAR)
                                year1 = calendar.get(Calendar.YEAR)
                                month1 = calendar.get(Calendar.MONTH) + 1
                                day1 = calendar.get(Calendar.DAY_OF_MONTH)
                            }

                            "-" -> {
                                var date2 = calendar.add(Calendar.YEAR, -newYEAR)
                                year1 = calendar.get(Calendar.YEAR)
                                month1 = calendar.get(Calendar.MONTH) + 1
                                day1 = calendar.get(Calendar.DAY_OF_MONTH)
                            }
                        }
                        editT.setText("${year1}-${month1}-${day1}")
                    } else {
                        var oldYEAR = firstDateInput.toInt()
                        var newYEAR = secondInputDate.toInt()
                        var result_ = 0
                        when (oprator) {
                            "+" -> result_ = oldYEAR + newYEAR
                            "-" -> result_ = oldYEAR - newYEAR
                        }
                        editT.setText("${result_} YEARs")
                    }
                }

                "MONTH" -> {
                    var calendar = Calendar.getInstance()
                    if (firstDateInput.contains("/")) {
                        val date: Date = simpleDateFormat.parse(firstDateInput)
                        calendar.setTime(date)
                        var newMONTH = secondInputDate.toInt()
                        var year1 = 0;
                        var month1 = 0;
                        var day1 = 0
                        when (oprator) {
                            "+" -> {
                                var date1 = calendar.add(Calendar.MONTH, newMONTH)
                                year1 = calendar.get(Calendar.YEAR)
                                month1 = calendar.get(Calendar.MONTH) + 1
                                day1 = calendar.get(Calendar.DAY_OF_MONTH)
                            }

                            "-" -> {
                                var date2 = calendar.add(Calendar.MONTH, -newMONTH)
                                year1 = calendar.get(Calendar.YEAR)
                                month1 = calendar.get(Calendar.MONTH) + 1
                                day1 = calendar.get(Calendar.DAY_OF_MONTH)
                            }
                        }
                        editT.setText("${year1}-${month1}-${day1}")
                    } else {
                        var oldMONTH = firstDateInput.toInt()
                        var newMONTH = secondInputDate.toInt()
                        var result_ = 0
                        when (oprator) {
                            "+" -> result_ = oldMONTH + newMONTH
                            "-" -> result_ = oldMONTH - newMONTH
                        }
                        editT.setText("${result_} MONTHs")
                    }
                }

                "DAY" -> {
                    var calendar = Calendar.getInstance()
                    if (firstDateInput.contains("/")) {
                        val date: Date = simpleDateFormat.parse(firstDateInput)
                        calendar.setTime(date)
                        var newDAY = secondInputDate.toInt()
                        var year1 = 0;
                        var month1 = 0;
                        var day1 = 0
                        when (oprator) {
                            "+" -> {
                                var date1 = calendar.add(Calendar.DAY_OF_MONTH, newDAY)
                                year1 = calendar.get(Calendar.YEAR)
                                month1 = calendar.get(Calendar.MONTH) + 1
                                day1 = calendar.get(Calendar.DAY_OF_MONTH)
                            }

                            "-" -> {
                                var date2 = calendar.add(Calendar.DAY_OF_MONTH, -newDAY)
                                year1 = calendar.get(Calendar.YEAR)
                                month1 = calendar.get(Calendar.MONTH) + 1
                                day1 = calendar.get(Calendar.DAY_OF_MONTH)
                            }
                        }
                        editT.setText("${year1}-${month1}-${day1}")
                    } else {
                        var oldDAY = firstDateInput.toInt()
                        var newDAY = secondInputDate.toInt()
                        var result_ = 0
                        when (oprator) {
                            "+" -> result_ = oldDAY + newDAY
                            "-" -> result_ = oldDAY - newDAY
                        }
                        editT.setText("${result_} DAYs")
                    }
                }
            }
        }
    }

    fun clearEvent(view: View) {
        var editT=findViewById(R.id.edittext) as EditText
        editT.setText("")
    }

    fun percentEvent(view: View) {
        var editT=findViewById(R.id.edittext) as EditText
        var inputnumber=editT.text.toString()
        var out=inputnumber.toDouble()/100
        editT.setText(out.toString())
    }

    @SuppressLint("SetTextI18n")
    fun postiveNagtiveEvent(view: View) {
        var editT=findViewById(R.id.edittext) as EditText
        var posinumber=editT.text.toString()
        editT.setText("-${posinumber}")
    }




    fun modelEvent(view: View) {
        var model=view as Button
        var HintEditText=findViewById(R.id.hintEditText) as EditText
        when(model.id){
            R.id.buttonyear -> {
                modelSel = "YEAR"
                HintEditText.setText(modelSel)
            }
            R.id.buttonmonth -> {
                modelSel = "MONTH"
                HintEditText.setText(modelSel)
            }
            R.id.buttonday -> {
                modelSel = "DAY"
                HintEditText.setText(modelSel)
            }
            R.id.buttonweek -> {
                modelSel = "WEEK"
                HintEditText.setText(modelSel)
            }
            R.id.buttonDate -> {
                modelSel = "DATE"
                HintEditText.setText(modelSel)
            }
        }
    }
    
}