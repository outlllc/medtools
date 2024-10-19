package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.RadioButton
import android.widget.SimpleAdapter
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R

class SodiumDeficitInHyponatremia : AppCompatActivity() {
    lateinit var et_sodium : EditText
    lateinit var et_weight : EditText
    lateinit var btn_cal : Button
    lateinit var tv_result : TextView
    lateinit var list_view : ListView
    lateinit var rb_man : RadioButton
    lateinit var rb_woman : RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sodium_deficit_in_hyponatremia)
        et_sodium = findViewById(R.id.et_sodium)
        et_weight = findViewById(R.id.et_body_weight)
        btn_cal = findViewById(R.id.btn_cal)
        tv_result = findViewById(R.id.tv_result)
        list_view = findViewById(R.id.list_view)
        rb_man = findViewById(R.id.rb_man)
        rb_woman = findViewById(R.id.rb_woman)
        calculate()
        showList()

    }
    fun getInput() :Double{
        val sodium = et_sodium.text.toString().toDoubleOrNull()
        val weight = et_weight.text.toString().toDoubleOrNull()
        val gender = if (rb_man.isChecked) "man" else "woman"
        var result = 0.0
        if((weight != null) and (sodium != null)) {
            when(gender){
                "man" ->
                    result = (142 - sodium!!) * weight!! * 0.035
                "woman" ->
                    result = (142 - sodium!!) * weight!! * 0.03
                else -> 0.0
            }
        }else{
            result = 0.0
        }
        return result
    }
    fun calculate() {
        btn_cal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                tv_result.text= "补氯化钠值 = ${ String.format("%.2f",result) } g)"
            }else{
                tv_result.text = "请输入正确数据"
            }
        }
    }
    var title_ = arrayOf("公式英文名称","计算公式","说明","参考文献")
    var content_ = arrayOf("Sodium Deficit in Hyponatremia",
        "男性：补氯化钠值=（142-血清钠浓度）*体重*0.035\n" +
                "女性：补氯化钠值=（142-血清钠浓度）*体重*0.03",
        "公式以17mmolNa+相当于1g钠盐计算，当天先补1/2量，还需要加每日需要量4.5g，此为第一日补充量；其余一半钠可以在第2天补给。\n" +
                "临床上应该注意，绝对依靠任何公式决定补钠量是不可取的，公式仅作为补钠安全剂量的估计。一般总是先补充缺钠量的一部分以解除急性症状，使血容量有所纠正。并且补液过程中要提防血容量过高，对心功能不全者将非常危险。\n" +
                "纠正低钠血症的最大纠正速度：8-10mmol/L/d；如果有症状，按照1-2mmol/L/h纠正直到症状消失，24小时纠正速度不超过12mmol/L。1升3%NaCl含513mmol Na+，1升0.9%NaCl（NS）含154mmol Na+。",
        "陈孝平主编. 外科学（八年制）（第2版）. 人民卫生出版社. 2010年. p40.")
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