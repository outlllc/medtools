package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.ActivityChronicKidneyDiseaseStagingBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Chronic_Kidney_Disease_Staging : AppCompatActivity() {
    private lateinit var binding: ActivityChronicKidneyDiseaseStagingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityChronicKidneyDiseaseStagingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        initAdaptor()
    }

    private fun initAdaptor() {
        val dataSet = mutableListOf(
            arrayOf("分期", "特征", "GFR水平(ml/min)"),
            arrayOf("1期", "已有肾病", "GFR正常 >90"),
            arrayOf("2期", "GFR轻度降低", "60～89"),
            arrayOf("3期", " GFR中度降低 ", "30～59"),
            arrayOf("4期", "GFR重度降低", "15～29"),
            arrayOf("5期", "肾衰竭（ESRD）", "<15")
        )

        val dataSetAppendix = mutableListOf(
            arrayOf("结果解读", "3-5期为慢性肾衰竭，5期为终末期肾病。治疗推荐如下：\n1期：病因的诊断和治疗；治疗并发症；延缓疾病进展； 减少心血管疾患的危险\n2期：估计疾病是否会进展或进展速度\n3期：评价和治疗并发症\n4期：准备肾脏替代治疗\n5期：肾脏替代治疗"),
            arrayOf("相关解释", "危险因素：高血压、糖尿病、自身免疫病、老年、非洲祖先、有肾脏病的家族史，之前发生过急性肾衰竭，有蛋白尿，尿沉渣异常，尿路结构异常等。"),
            arrayOf("参考来源", "National Kidney Foundation (2002). \"K/DOQI clinical practice guidelines for chronic kidney disease\". Retrieved 2008-06-29.")
        )

        binding.rvContent.apply {
            layoutManager = LinearLayoutManager(this@Chronic_Kidney_Disease_Staging)
            adapter = MedCalListAdapter(dataSet, "30")
            overScrollMode = View.OVER_SCROLL_NEVER
        }

        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(this@Chronic_Kidney_Disease_Staging)
            adapter = MedCalListAdapter(dataSetAppendix, "20")
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }
}
