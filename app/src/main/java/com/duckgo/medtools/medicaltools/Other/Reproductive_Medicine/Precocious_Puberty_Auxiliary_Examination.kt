package com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Precocious_Puberty_Auxiliary_Examination : AppCompatActivity() {
    lateinit var rv_content: RecyclerView
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_precocious_puberty_auxiliary_examination)
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initAdaptor() {
        rv_content.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content.adapter = MedCalListAdapter(dataSet, "70")
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("","性腺大小", "基础FSH/LH", "E2", "DHAS", "睾酮T", "GnRH反应")
        var subDataSet2 = arrayOf("特发性", "增大", "升高", "升高", "升高", "升高", "增强")
        var subDataSet3 = arrayOf("中枢性", "增大", "升高","升高", "升高", "升高", "增强")
        var subDataSet4 = arrayOf("性腺性", " 增大", "不高", "升高", "不高", "可高", "无反应")
        var subDataSet5 = arrayOf("Albright", "增大", "不高", "升高", "可高", "可高", "无反应")
        var subDataSet6 = arrayOf("肾上腺性 ", "小", "不高", "升高", "升高", "可高", "无反应")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
    }

    private fun initView() {
        rv_content = findViewById(R.id.rv_content)
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
    }
}