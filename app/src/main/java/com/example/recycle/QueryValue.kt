package com.example.recycle

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt


class QueryValue : AppCompatActivity() {

    var dbHelper:DataBaseHelper?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_query_value)
//        dbHelper=DataBaseHelper(this)
//        dbHelper!!.onUpgrade(dbHelper!!.writableDatabase,1,2)


    }


    fun queryFlAc(x:String,y:String):String{
        if (x.isNotBlank() and y.isNotBlank()) {
            if ((x.toDouble() >= 200.0) and (x.toDouble() <= 400.0) and (y.toDouble() >= 40.0) and (y.toDouble() <= 83.0)) {
                dbHelper = DataBaseHelper(this)
                var y1: String = ""
                if ("%.1f".format(y.toDouble() % 1).toDouble() >= 0.9) {
                    y1 = y.toDouble().roundToInt().toString()
                } else {
                    y1 = y.toDouble().toInt().toString()
                }
                if (x.toDouble().toInt() % 5 != 0) {
                    var left = x.toDouble().toInt() % 5
                    var newX = x.toDouble().toInt() - left
                    var newx2 = newX + 5
                    var list1: MutableList<String> = mutableListOf("tw${newX}", y1)
                    var result1 = dbHelper!!.queryAcFl(list1)
                    var res1: String = ""
                    var res2: String = ""
                    result1.forEach { res1 += it }
                    var list2: MutableList<String> = mutableListOf("tw${newx2}", y1)
                    var result2 = dbHelper!!.queryAcFl(list2)
                    result2.forEach { res2 += it }
                    var result = (res1.toInt() + res2.toInt()) / 2
                    return "${result}}"
                } else if (x.toDouble().toInt() % 5 == 0) {
                    var x1 = x.toDouble().toInt().toString()
                    var list = mutableListOf("tw${x1}", y1)
                    var result_ = dbHelper!!.queryAcFl(list)
                    var result = ""
                    result_.forEach { result += it }
                    return result
                }else{
                    return "-6"
                }
            }else{
                return "-5"
            }
        }else {
            return "-4"
        }
    }

    fun queryBpdAc(x:String, y:String):String{
        if (x.isNotBlank() and y.isNotBlank()) {
            if ((x.toDouble() >= 155.0) and (x.toDouble() <= 400.0) and (y.toDouble() >= 31.0) and (y.toDouble() <= 100.0)) {
                dbHelper = DataBaseHelper(this)
                var y1: String = ""
                if ("%.1f".format(y.toDouble() % 1).toDouble() >= 0.9) {
                    y1 = y.toDouble().roundToInt().toString()
                } else {
                    y1 = y.toDouble().toInt().toString()
                }
                if (x.toDouble().toInt() % 5 != 0) {
                    var left = x.toDouble().toInt() % 5
                    var newX = x.toDouble().toInt() - left
                    var newx2 = newX + 5
                    var list1: MutableList<String> = mutableListOf("ac${newX}", y1)
                    var result1 = dbHelper!!.queryAcBpd(list1)
                    var list2: MutableList<String> = mutableListOf("ac${newx2}", y1)
                    var result2 = dbHelper!!.queryAcBpd(list2)
                    var result = (result1.toInt() + result2.toInt()) / 2
                    return "${result}"
                } else if (x.toDouble().toInt() % 5 == 0) {
                    var x1 = x.toDouble().toInt().toString()
                    var list = mutableListOf("ac${x1}", y1)
                    var result = dbHelper!!.queryAcBpd(list)
                    return result
                }else{
                    return "-3"
                }
            }else{
                return "-2"
            }
        } else {
            return "-1"
        }
    }

    fun QueryConpre(view: View) {
        val editText1 = findViewById<EditText>(R.id.QueryAc)
        val editText2 = findViewById<EditText>(R.id.QueryFl)
        val editText3 = findViewById<EditText>(R.id.QueryYBpd)
        val queryResult: TextView = findViewById<TextView>(R.id.QueryResultConpre)
        var x = editText1.text.toString().trim()
        var y = editText2.text.toString().trim()
        val z= editText3.text.toString().trim()
        if(x.isBlank() and  y.isBlank() and z.isBlank()){
            queryResult.setText("正确的股骨数值（40-83mm）\n双顶径（31-100mm）\n腹围（200-400mm）")
        }else if (x.isBlank()) {
            queryResult.setText("必须输入腹围值和（或）双顶径、股骨长度")
        }else if(x.isNotBlank() and y.isNotBlank() and z.isBlank()){
            if((x.toDouble() >= 200.0) and (x.toDouble() <= 400.0) and (y.toDouble() >= 40.0) and (y.toDouble() <= 83.0)){
                queryResult.setText("股骨腹围预测:${queryFlAc(x, y)}")
            }else{
                queryResult.setText("请正确输入股骨和腹围值")
            }
        } else if (x.isNotBlank() and z.isNotBlank() and y.isBlank()){
            if ((x.toDouble() >= 155.0) and (x.toDouble() <= 400.0) and (z.toDouble() >= 31.0) and (z.toDouble() <= 100.0)){
                queryResult.setText("双顶径腹围预测:${queryBpdAc(x, z)}")
            }else{
                queryResult.setText("请正确输入双顶径和腹围值")
            }
        } else if (x.isNotBlank() and y.isBlank() and z.isBlank()){
            queryResult.setText("请再输入双顶径值和（或）股骨长度")
        } else{
            if ((x.toDouble() >= 200.0) and (x.toDouble() <= 400.0) and (y.toDouble() >= 40.0) and (y.toDouble() <= 83.0)
                and (z.toDouble() >= 31.0) and (z.toDouble() <= 100.0)) {
                var result1 = queryFlAc(x, y)
                var result2 = queryBpdAc(x, z)
                var avgResult = (result1.toDouble() + result2.toDouble()) / 2
                queryResult.setText("股骨腹围预测：${result1}\n双顶径腹围预测：${result2}\n平均体重：${avgResult}")
            } else if ((x.toDouble() < 200.0) and (x.toDouble() >= 155.0) and (z.toDouble() >= 31.0) and (z.toDouble() <= 100.0)) {
                var result = queryBpdAc(x, z)
                queryResult.setText("双顶径腹围预测：${result}\n腹围过小，不支持股骨预测体重")
            } else {
                queryResult.setText("正确的股骨数值（40-83mm）\n双顶径（31-100mm）\n腹围（200-400mm）")
            }
        }
    }
}

