package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Edinburgh_Postnatal_Depression_Scale : AppCompatActivity() {

    lateinit var rg_1: RadioGroup
    lateinit var rg_2: RadioGroup
    lateinit var rg_3: RadioGroup
    lateinit var rg_4: RadioGroup
    lateinit var rg_5: RadioGroup
    lateinit var rg_6: RadioGroup
    lateinit var rg_7: RadioGroup
    lateinit var rg_8: RadioGroup
    lateinit var rg_9: RadioGroup
    lateinit var rg_10: RadioGroup
    lateinit var rb_1_0: RadioButton
    lateinit var rb_1_1: RadioButton
    lateinit var rb_1_2: RadioButton
    lateinit var rb_1_3: RadioButton
    lateinit var rb_2_0: RadioButton
    lateinit var rb_2_1: RadioButton
    lateinit var rb_2_2: RadioButton
    lateinit var rb_2_3: RadioButton
    lateinit var rb_3_0: RadioButton
    lateinit var rb_3_1: RadioButton
    lateinit var rb_3_2: RadioButton
    lateinit var rb_3_3: RadioButton
    lateinit var rb_4_0: RadioButton
    lateinit var rb_4_1: RadioButton
    lateinit var rb_4_2: RadioButton
    lateinit var rb_4_3: RadioButton
    lateinit var rb_5_0: RadioButton
    lateinit var rb_5_1: RadioButton
    lateinit var rb_5_2: RadioButton
    lateinit var rb_5_3: RadioButton
    lateinit var rb_6_0: RadioButton
    lateinit var rb_6_1: RadioButton
    lateinit var rb_6_2: RadioButton
    lateinit var rb_6_3: RadioButton
    lateinit var rb_7_0: RadioButton
    lateinit var rb_7_1: RadioButton
    lateinit var rb_7_2: RadioButton
    lateinit var rb_7_3: RadioButton
    lateinit var rb_8_0: RadioButton
    lateinit var rb_8_1: RadioButton
    lateinit var rb_8_2: RadioButton
    lateinit var rb_8_3: RadioButton
    lateinit var rb_9_0: RadioButton
    lateinit var rb_9_1: RadioButton
    lateinit var rb_9_2: RadioButton
    lateinit var rb_9_3: RadioButton
    lateinit var rb_10_0: RadioButton
    lateinit var rb_10_1: RadioButton
    lateinit var rb_10_2: RadioButton
    lateinit var rb_10_3: RadioButton
    lateinit var tv_total_score: TextView
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>

    var uncheckedItem :Int = 10
    var totalScore :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edinburgh_postnatal_depression_scale)
        initView()
        initData_appendix()
        initAdaptor()
        rg_1.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_2.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_3.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_4.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_5.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_6.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_7.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_8.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_9.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        rg_10.setOnCheckedChangeListener { group, checkedId ->  calculate()}
    }
    fun calculate() {
        var score = 0
        if (rb_1_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_1_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_1_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_1_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_2_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_2_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_2_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_2_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_3_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_3_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_3_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_3_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_4_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_4_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_4_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_4_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_5_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_5_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_5_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_5_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_6_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_6_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_6_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_6_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_7_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_7_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_7_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_7_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_8_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_8_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_8_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_8_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_9_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_9_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_9_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_9_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (rb_10_0.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (rb_10_1.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (rb_10_2.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (rb_10_3.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        totalScore = score
        tv_total_score.text = "${totalScore}分 , （您已选择${10-uncheckedItem}个必选项，还有${uncheckedItem}个必选项未选） "
        totalScore = 0
        uncheckedItem = 10
    }

    private fun initView() {
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
        rg_1 = findViewById(R.id.rg_1)
        rg_2 = findViewById(R.id.rg_2)
        rg_3 = findViewById(R.id.rg_3)
        rg_4 = findViewById(R.id.rg_4)
        rg_5 = findViewById(R.id.rg_5)
        rg_6 = findViewById(R.id.rg_6)
        rg_7 = findViewById(R.id.rg_7)
        rg_8 = findViewById(R.id.rg_8)
        rg_9 = findViewById(R.id.rg_9)
        rg_10 = findViewById(R.id.rg_10)
        rb_1_0 = findViewById(R.id.rb_1_0)
        rb_1_1 = findViewById(R.id.rb_1_1)
        rb_1_2 = findViewById(R.id.rb_1_2)
        rb_1_3 = findViewById(R.id.rb_1_3)
        rb_2_0 = findViewById(R.id.rb_2_0)
        rb_2_1 = findViewById(R.id.rb_2_1)
        rb_2_2 = findViewById(R.id.rb_2_2)
        rb_2_3 = findViewById(R.id.rb_2_3)
        rb_3_0 = findViewById(R.id.rb_3_0)
        rb_3_1 = findViewById(R.id.rb_3_1)
        rb_3_2 = findViewById(R.id.rb_3_2)
        rb_3_3 = findViewById(R.id.rb_3_3)
        rb_4_0 = findViewById(R.id.rb_4_0)
        rb_4_1 = findViewById(R.id.rb_4_1)
        rb_4_2 = findViewById(R.id.rb_4_2)
        rb_4_3 = findViewById(R.id.rb_4_3)
        rb_5_0 = findViewById(R.id.rb_5_0)
        rb_5_1 = findViewById(R.id.rb_5_1)
        rb_5_2 = findViewById(R.id.rb_5_2)
        rb_5_3 = findViewById(R.id.rb_5_3)
        rb_6_0 = findViewById(R.id.rb_6_0)
        rb_6_1 = findViewById(R.id.rb_6_1)
        rb_6_2 = findViewById(R.id.rb_6_2)
        rb_6_3 = findViewById(R.id.rb_6_3)
        rb_7_0 = findViewById(R.id.rb_7_0)
        rb_7_1 = findViewById(R.id.rb_7_1)
        rb_7_2 = findViewById(R.id.rb_7_2)
        rb_7_3 = findViewById(R.id.rb_7_3)
        rb_8_0 = findViewById(R.id.rb_8_0)
        rb_8_1 = findViewById(R.id.rb_8_1)
        rb_8_2 = findViewById(R.id.rb_8_2)
        rb_8_3 = findViewById(R.id.rb_8_3)
        rb_9_0 = findViewById(R.id.rb_9_0)
        rb_9_1 = findViewById(R.id.rb_9_1)
        rb_9_2 = findViewById(R.id.rb_9_2)
        rb_9_3 = findViewById(R.id.rb_9_3)
        rb_10_0 = findViewById(R.id.rb_10_0)
        rb_10_1 = findViewById(R.id.rb_10_1)
        rb_10_2 = findViewById(R.id.rb_10_2)
        rb_10_3 = findViewById(R.id.rb_10_3)
        tv_total_score = findViewById(R.id.tv_total_score)

    }
    private fun initAdaptor() {
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释", "爱丁堡产后抑郁量表(Edinburgh postnatal depression scale, EPDS )。目前多采用的诊断标准。该表包括10项内容，于产后6周进行调查。每项内容分4级评分(0～3分)，总分相加≥13分者可诊断为产褥期抑郁症。")
        var subDataSet2 = arrayOf("参考来源", "1、JL Cox, et al. Detection of Postnatal Depression: Development of the 10-item Edinburgh Postnatal Depression Scale. Br J Psychiatry. 1987;150:782-6.\n" +
                "2、KL Wisner, et al. Clinical practice. Postpartum depression. N Engl J Med. 2002;347(3):194-9.")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }
}