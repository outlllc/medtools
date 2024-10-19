package com.duckgo.medtools.medicaltools.Internal_Medicine.Endocrinology

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R

class HbA1cValuesBloodGlucose : AppCompatActivity() {
    lateinit var et_hba1c : EditText
    lateinit var btn_cal : Button
    lateinit var tv_result : TextView
    lateinit var list_view : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hb_a1c_values_blood_glucose)
        et_hba1c = findViewById(R.id.et_hba1c)
        btn_cal = findViewById(R.id.btn_cal)
        tv_result = findViewById(R.id.tv_result)
        list_view = findViewById(R.id.list_view)
        calculate()
        showList()

    }
    fun getInput() :Double{
        val hba1c = et_hba1c.text.toString().toDoubleOrNull()
        var result = if(hba1c != null){
            (28.7 * hba1c!! - 46.7) / 18
        }else{
            0.0
        }
        return result
    }
    fun calculate() {
        btn_cal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                tv_result.text= "平均血糖水平 = ${ String.format("%.2f",result) } mmol/L)"
            }else{
                tv_result.text = "请输入正确数据"
            }
        }
    }
    var title_ = arrayOf("计算公式","结果正常值范围","说明","来源")
    var content_ = arrayOf("平均血糖=(28.7*HbA1c-46.7)/18",
        "空腹血糖正常值为3.9~6.1mmol/L",
        "糖化血红蛋白被视为血糖控制的金标准，与糖尿病的微血管及大血管病变相关，它反应了过去2~3个月的平均血糖水平。",
        "http://professional.diabetes.org/glucosecalculator.aspx")
    fun showList(title : Array<String> = title_, content : Array<String> = content_) {
        var listItem = arrayListOf<Map<String,Any>>()
        for (i in 0 until title_.size) {
            var map = HashMap<String,Any>()
            map["header"] = title_[i]
            map["second"] = content_[i]
            listItem.add(map)

            var adapter = SimpleAdapter(this,listItem,R.layout.cal_list, arrayOf("header","second"),intArrayOf(R.id.tvF,R.id.tvS))
            list_view.adapter = adapter
        }
    }
}