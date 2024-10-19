package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.widget.ListView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Manning_Score : AppCompatActivity() {
    lateinit var rb_cer_0 : RadioButton
    lateinit var rb_cer_12 : RadioButton
    lateinit var rb_cer_30 : RadioButton
    lateinit var rb_cer_50 : RadioButton
    lateinit var rb_cer_s3 : RadioButton
    lateinit var rb_cer_s2 : RadioButton
    lateinit var rb_cer_hard : RadioButton
    lateinit var rb_cer_medium : RadioButton
    lateinit var rb_cer_back : RadioButton
    lateinit var rb_cer_mid : RadioButton
    lateinit var rg_cer1 : RadioGroup
    lateinit var rg_cer2 : RadioGroup
    lateinit var rg_cer3 : RadioGroup
    lateinit var rg_cer4 : RadioGroup
    lateinit var rg_cer5 : RadioGroup
    lateinit var tv_total_score : TextView
    lateinit var list_view : ListView
    var uncheckedItem :Int = 5
    var totalScore :Int = 0

    lateinit var rv_content: RecyclerView
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_manning_score)
        rb_cer_0 = findViewById(R.id.rb_cer_0)
        rb_cer_12 = findViewById(R.id.rb_cer_12)
        rb_cer_30 = findViewById(R.id.rb_cer_30)
        rb_cer_50 = findViewById(R.id.rb_cer_50)
        rb_cer_s3 = findViewById(R.id.rb_cer_s3)
        rb_cer_s2 = findViewById(R.id.rb_cer_s2)
        rb_cer_hard = findViewById(R.id.rb_cer_hard)
        rb_cer_medium = findViewById(R.id.rb_cer_medium)
        rb_cer_back = findViewById(R.id.rb_cer_back)
        rb_cer_mid = findViewById(R.id.rb_cer_mid)
        tv_total_score = findViewById(R.id.tv_total_score)
        rg_cer1 = findViewById(R.id.rg_cer1)
        rg_cer2 = findViewById(R.id.rg_cer2)
        rg_cer3 = findViewById(R.id.rg_cer3)
        rg_cer4 = findViewById(R.id.rg_cer4)
        rg_cer5 = findViewById(R.id.rg_cer5)
        initView()
        initData()
        initData_appendix()
        initAdaptor()

        rg_cer1.setOnCheckedChangeListener { _, _ -> calculate() }
        rg_cer2.setOnCheckedChangeListener { _, _ -> calculate() }
        rg_cer3.setOnCheckedChangeListener { _, _ -> calculate() }
        rg_cer4.setOnCheckedChangeListener { _, _ -> calculate() }
        rg_cer5.setOnCheckedChangeListener { _, _ -> calculate() }
    }
    fun calculate() {
            totalScore = 0
        if (rb_cer_0.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(rb_cer_12.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        if (rb_cer_30.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(rb_cer_50.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        if (rb_cer_s3.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(rb_cer_s2.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        if (rb_cer_hard.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(rb_cer_medium.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        if (rb_cer_back.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(rb_cer_mid.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        tv_total_score.text = "${totalScore}分 , （您已选择${5-uncheckedItem}个必选项，还有${uncheckedItem}个必选项未选） "
        totalScore = 0
        uncheckedItem = 5
    }
    private fun initAdaptor() {
        rv_content.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content.adapter = MedCalListAdapter(dataSet, "32")
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释", "5项指标包括：无应激实验（NST）、胎儿呼吸样运动（FBM）、胎动（FM）、胎儿肌张力（FT）及羊水容量（AFV）。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("评分", "胎儿情况", "处理原则")
        var subDataSet2 = arrayOf("10分", "无急、慢性缺氧", "每周复查1次，高危妊娠每周复查2次")
        var subDataSet3 = arrayOf("8分", "急、慢性缺氧可能性小", "每周复查1次，高危妊娠每周复查2次，羊水过少可终止妊娠")
        var subDataSet4 = arrayOf("6分", " 可疑急、慢性缺氧", "24小时内复查，仍≤6或羊水过少，可终止妊娠")
        var subDataSet5 = arrayOf("4分", "可有急或慢性缺氧", "24小时内复查，仍≤6或羊水过少，可终止妊娠")
        var subDataSet6 = arrayOf("2分", "急性缺氧或伴慢性缺氧", "若胎肺成熟，终止妊娠；胎肺不成熟给予激素治疗48小时内终止妊娠")
        var subDataSet7 = arrayOf("0分", "急、慢性缺氧", "终止妊娠，胎肺不成熟，同时激素治疗")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
    }

    private fun initView() {
        rv_content = findViewById(R.id.rv_content)
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
    }
}