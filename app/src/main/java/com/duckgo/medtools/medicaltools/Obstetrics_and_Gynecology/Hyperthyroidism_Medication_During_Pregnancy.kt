package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Hyperthyroidism_Medication_During_Pregnancy : AppCompatActivity() {
    lateinit var rv_content: RecyclerView
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hyperthyroidism_medication_during_pregnancy)
        initView()
        initData()
        initData_appendix()
        initAdaptor()

    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释 ", "药物治疗首选丙硫氧嘧啶( prophylthiouracil，PTU )，此药通过胎盘量少，速度慢，能在甲状腺内阻断甲状腺激素的合成，并阻断T4转变为T3。积极治疗初次诊断的患者，丙硫氧嘧啶400mg/d，病情减轻或稳定后(一般4~6周)应逐渐减量至初始剂量的25%，不可骤然停药。一般治疗剂量参见表。用药期间密切观察病情变化，包括安静时脉率、脉压、食欲等和游离T3、游离T4等指标。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initAdaptor() {
        rv_content.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content.adapter = MedCalListAdapter(dataSet, "40")
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    fun initData() {
        var subDataSet1 = arrayOf("程度", "BMR(%)", "心率(/min)", "丙硫氧嘧啶(mg/d)")
        var subDataSet2 = arrayOf("轻", "＜+30", "＜100", "200~300")
        var subDataSet3 = arrayOf("中", "+30~+60", "100~120", "300~400")
        var subDataSet4 = arrayOf("重", "＞+60", "＞120", "400~500")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
    }

    private fun initView() {
        rv_content = findViewById(R.id.rv_content)
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
    }
}