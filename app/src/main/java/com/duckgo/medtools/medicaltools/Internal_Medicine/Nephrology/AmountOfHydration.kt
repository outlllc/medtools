package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R

class AmountOfHydration : AppCompatActivity() {

    lateinit var et_sodium : EditText
    lateinit var et_weight : EditText
    lateinit var btn_cal : Button
    lateinit var tv_result : TextView
    lateinit var list_view : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_amount_of_hydration)
        et_sodium = findViewById(R.id.et_sodium)
        et_weight = findViewById(R.id.et_body_weight)
        btn_cal = findViewById(R.id.btn_cal)
        tv_result = findViewById(R.id.tv_result)
        list_view = findViewById(R.id.list_view)
        calculate()
        showList()

    }
    fun getInput() :Double{
        val sodium = et_sodium.text.toString().toDoubleOrNull()
        val weight = et_weight.text.toString().toDoubleOrNull()
        var result = if((weight != null) and (sodium != null)){
            ( sodium!! - 142 ) * weight!! * 4
        }else{
            0.0
        }
        return result
    }
    fun calculate() {
        btn_cal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                tv_result.text= "补液量 = ${ String.format("%.2f",result) } ml)"
            }else{
                tv_result.text = "请输入正确数据"
            }
        }
    }
    var title_ = arrayOf("公式英文名称","计算公式","说明","参考文献")
    var content_ = arrayOf("BWater Deficit",
        "补水量=（血清钠浓度-142）*体重*4，补液时还应加上每日正常需要量2000ml",
        "为避免输入过量而导致血容量过分扩张及水中毒，计算所得的补水量不宜一次性输入，一般分2天补给。",
        "陈孝平主编. 外科学（八年制）（第2版）. 人民卫生出版社. 2010年")
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