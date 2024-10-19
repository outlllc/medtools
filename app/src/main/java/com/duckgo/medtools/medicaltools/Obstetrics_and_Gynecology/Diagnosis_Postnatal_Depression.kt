package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Diagnosis_Postnatal_Depression : AppCompatActivity() {
    lateinit var rv_content: RecyclerView
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
//    lateinit var dateArray: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diagnosis_postnatal_depression)
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initAdaptor() {
        rv_content.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content.adapter = MedCalListAdapter(dataSet ,"10")
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释", "该诊断标准中许多指标具有一定的主观性，可能影响正确诊断。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("(1)情绪抑郁")
        var subDataSet2 = arrayOf("(2)对全部或多数活动明显缺乏兴趣或愉悦")
        var subDataSet3 = arrayOf("(3)体重显著下降或增加")
        var subDataSet4 = arrayOf("(4)失眠或睡眠过度")
        var subDataSet5 = arrayOf("(5)精神运动性兴奋或阻滞")
        var subDataSet6 = arrayOf("(6)疲劳或乏力")
        var subDataSet7 = arrayOf("(7)遇事皆感毫无意义或自罪感")
        var subDataSet8 = arrayOf("(8)思维力减退或注意力涣散")
        var subDataSet9 = arrayOf("(9)反复出现死亡想法")
        dataSet = ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
        dataSet.add(subDataSet8)
        dataSet.add(subDataSet9)
    }

    private fun initView() {
        rv_content = findViewById(R.id.rv_content)
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
    }
}