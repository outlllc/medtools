package com.example.recycle

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AddValue : AppCompatActivity() {
    var dataBaseHelper:DataBaseHelper?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_addvalue)

    }

    fun addValue(view: View) {
        var tv1=findViewById<TextView>(R.id.textView)
        var tv2=findViewById<TextView>(R.id.textView2)
        var tv3=findViewById<TextView>(R.id.textView3)
        var value1=tv1.text.toString().trim()
        var value2=tv2.text.toString().trim()
        var value3=tv3.text.toString().trim()
        var arr=mutableListOf(value1,value2,value3)
        dataBaseHelper=DataBaseHelper(this)
        dataBaseHelper!!.addValue(arr)
    }
}