package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Chronic_Kidney_Disease_Staging : AppCompatActivity() {
    lateinit var rv_content: RecyclerView
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chronic_kidney_disease_staging)
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initAdaptor() {
        rv_content.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content.adapter = MedCalListAdapter(dataSet, "30")
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "3-5期为慢性肾衰竭，5期为终末期肾病。治疗推荐如下：\n" +
                "1期：病因的诊断和治疗；治疗并发症；延缓疾病进展； 减少心血管疾患的危险\n" +
                "2期：估计疾病是否会进展或进展速度\n" +
                "3期：评价和治疗并发症\n" +
                "4期：准备肾脏替代治疗\n" +
                "5期：肾脏替代治疗")
        var subDataSet2 = arrayOf("相关解释", "危险因素：高血压、糖尿病、自身免疫病、老年、非洲祖先、有肾脏病的家族史，之前发生过急性肾衰竭，有蛋白尿，尿沉渣异常，尿路结构异常等。")
        var subDataSet3 = arrayOf("参考来源", "National Kidney Foundation (2002). \"K/DOQI clinical practice guidelines for chronic kidney disease\". Retrieved 2008-06-29.")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("分期", "特征", "GFR水平(ml/min)")
        var subDataSet2 = arrayOf("1期", "已有肾病", "GFR正常 >90")
        var subDataSet3 = arrayOf("2期", "GFR轻度降低", "60～89")
        var subDataSet4 = arrayOf("3期", " GFR中度降低 ", "30～59")
        var subDataSet5 = arrayOf("4期", "GFR重度降低", "15～29")
        var subDataSet6 = arrayOf("5期", "肾衰竭（ESRD）", "<15")
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