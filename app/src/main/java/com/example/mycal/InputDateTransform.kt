package com.example.mycal

import android.util.Log
import java.util.Calendar

class InputDateTransform {
    fun firstInputDateTrans(dateInput:String){
        val dateInput=dateInput
        var instance = Calendar.getInstance()
//        var dateList = dateInput.split("/")
//        var year_ = dateList[0].toInt()
//        var month_ = dateList[1].toInt()
//        var day_ = dateList[2].toInt()
        var year=2020
        var month=1
        var day=1
        instance.set(year,month,day)
        Log.e("tag",instance.time.toString())
    }
}