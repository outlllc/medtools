package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Glomerular_Filtration_Rate_CKD_EPI : AppCompatActivity() {

    lateinit var et_age : EditText
    lateinit var et_cr : EditText
    lateinit var btn_cal : Button
    lateinit var rb_man : RadioButton
    lateinit var rb_woman : RadioButton
    lateinit var rb_common : RadioButton
    lateinit var rb_universal : RadioButton
    lateinit var tv_result : TextView
    lateinit var tv_universal : TextView
    lateinit var rg_display : RadioGroup
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>

    lateinit var rg_race: RadioGroup
    lateinit var rb_other: RadioButton
    lateinit var rb_black: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_glomerular_filtration_rate_ckd_epi)
        initView()
        initData_appendix()
        initAdaptor()
        calculate()
        rg_display.setOnCheckedChangeListener { _, _ -> checkDisplay() }
    }

    private fun initView() {
        et_age = findViewById(R.id.et_age)
        et_cr = findViewById(R.id.et_cr)
        btn_cal = findViewById(R.id.btn_cal)
        rb_man = findViewById(R.id.rb_man)
        rb_woman = findViewById(R.id.rb_woman)
        rb_common = findViewById(R.id.rb_common)
        rb_universal = findViewById(R.id.rb_universal)
        tv_result = findViewById(R.id.tv_result)
        tv_universal = findViewById(R.id.tv_universal)
        rg_display = findViewById(R.id.rg_display)
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
        rg_race = findViewById(R.id.rg_race)
        rb_other = findViewById(R.id.rb_other)
        rb_black = findViewById(R.id.rb_black)
    }
    fun getInput() :Double{
        val age = et_age.text.toString().toIntOrNull()
        val cr = et_cr.text.toString().toDoubleOrNull()
        val gender = if (rb_man.isChecked) "man" else "woman"
        var race = if (rb_black.isChecked) "black" else "other"
        var index_A = 0
        var index_B = 0.0
        var index_C = 0.0


        if((age != null) and (cr != null)){
            index_C = if(gender == "man"){
                if (cr!! <= 0.7) -0.411 else -1.209
            }else if (gender == "woman"){
                if (cr!! <= 0.7) -0.329 else -1.209
            }else{
                0.0
            }
            if (race == "black"){
                when(gender){
                    "man" -> {
                        index_A = 163
                        index_B = 0.9
                    }
                    "woman" -> {
                        index_A = 166
                        index_B = 0.7
                    }
                    else -> { 0.0 }
                }
            }else if (race == "other"){
                when(gender) {
                    "man" -> {
                        index_A = 141
                        index_B = 0.9
                    }
                    "woman" -> {
                        index_A = 144
                        index_B = 0.7
                    }
                    else -> { 0.0 }
                }
            } else(
                0.0
            )
        }else{
            return 0.0
        }
        var result = index_A * Math.pow((cr!!/index_B), index_C) * Math.pow(0.993, age!!.toDouble())
        return result
    }

    fun calculate() {
        btn_cal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                tv_result.text= "肾小球滤过率 = ${ String.format("%.2f",result) } ml/(min*1.73m2)"
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

    private fun initAdaptor() {
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("计算公式", "GFR＝a×(血肌酐浓度/b)c×(0.993)年龄\n" +
                "a值根据性别与人种分别采用如下数值：\n" +
                "①黑人：女性 = 166； 男性 = 163\n" +
                "②其他人种：女性 = 144； 男性 = 141\n" +
                "\n" +
                "b值根据性别不同分别采用如下数值：\n" +
                "女性 = 0.7； 男性 = 0.9\n" +
                "\n" +
                "c值根据年龄与血清肌酐值的大小分别采用如下数值：\n" +
                "①女性：血清肌酐 ≤ 0.7 mg/dL = -0.329； 血清肌酐 ＞ 0.7 mg/dL = -1.209\n" +
                "②男性：血清肌酐 ≤ 0.7 mg/dL = -0.411； 血清肌酐 ＞ 0.7 mg/dL = -1.209")
        var subDataSet2 = arrayOf("结果正常值范围", "120~138mL/(min*1.73m2)")
        var subDataSet3 = arrayOf("说明", "2009年刚发表的慢性肾脏病流行病学合作研究(CKD-EPI)公式，较目前普遍应用的MDRD公式评估肾小球滤过率更为精确，尤其是当GFR大于60mL/(min*1.73m2)时。")
        var subDataSet4 = arrayOf("参考文献", "Levey AS, et al. A new equation to estimate glomerular filtration rate. Ann Intern Med. 2009 May 5;150(9):604-12.")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
        dataSet_appendix.add(subDataSet4)
    }
}