package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SimpleAdapter
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.duckgo.medtools.R

class Creatinine_Clearance_Cockcroft_Gault : ComponentActivity() {

    lateinit var et_age :EditText
    lateinit var et_weight :EditText
    lateinit var et_cr :EditText
    lateinit var btn_cal :Button
    lateinit var rb_man :RadioButton
    lateinit var rb_woman :RadioButton
    lateinit var rb_common :RadioButton
    lateinit var rb_universal :RadioButton
    lateinit var tv_result : TextView
    lateinit var tv_universal : TextView
    lateinit var rg_display : RadioGroup
    lateinit var list_view : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_creatinine_clearance_cockcroft_gault)
        et_age = findViewById(R.id.et_age)
        et_weight = findViewById(R.id.et_body_weight)
        et_cr = findViewById(R.id.et_cr)
        btn_cal = findViewById(R.id.btn_cal)
        rb_man = findViewById(R.id.rb_man)
        rb_woman = findViewById(R.id.rb_woman)
        rb_common = findViewById(R.id.rb_common)
        rb_universal = findViewById(R.id.rb_universal)
        tv_result = findViewById(R.id.tv_result)
        tv_universal = findViewById(R.id.tv_universal)
        list_view = findViewById(R.id.list_view)
        rg_display = findViewById(R.id.rg_display)
        rg_display.setOnCheckedChangeListener { _, _ -> checkDisplay() }
        calculate()
        showList()
    }
    fun calculate() {
        btn_cal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
            tv_result.text= "CCrE = ${ String.format("%.2f",result) } ml/(min*1.73m2)"
            }else{
                tv_result.text = "请输入正确数据"
            }
        }
    }
    fun checkDisplay(){
        val dialysis = if (rb_common.isChecked) "common" else "universal"
        if (dialysis == "common"){
            tv_universal.text = "血肌酐浓度(mg/dL):"
        }else if (dialysis == "universal"){
            tv_universal.text = "血肌酐浓度(mmol/L):"
        }
    }
    fun getInput() :Double{
        val age = et_age.text.toString().toIntOrNull()
        val weight = et_weight.text.toString().toDoubleOrNull()
        val cr = et_cr.text.toString().toDoubleOrNull()
        val gender = if (rb_man.isChecked) "man" else "woman"
        var result = if( (gender == "man") and (age != null) and (weight != null) and (cr != null)){
            (140 - age!!) * weight!! * 1.23 / cr!!
        }else if ((gender == "woman") and (age != null) and (weight != null) and (cr != null)){
            0.85*(140 - age!!) * weight!! * 1.23 / cr!!
        } else{
            0.0
        }
        return result
    }
    var title_ = arrayOf("公式英文名称","计算公式","结果正常值","说明","参考文献")
    var content_ = arrayOf("Creatinine Clearance Estimate by Cockcroft-Gault Equation,CCrE","CCrE（女性*0.85）=(140-年龄)*体重*1.23/血肌酐浓度（国际单位,SI）","成人80～120 mL/(min*1.73m2)",
        "CCr常用来对肾功能进行分期以指导治疗，如慢性肾功能衰竭分级时结合CCr将病程分为四期，指导治疗。","1.Cockcroft DW, Gault MH. Prediction of creatinine clearance from serum creatinine. Nephron. 1976;16(1):31-42." +
                "2. Winter MA, et al. Impact of various body weights and serum creatinine concentrations on the bias and accuracy of the Cockcroft-Gault equation. Pharmacotherapy. 2012;32(7):604-12.")
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