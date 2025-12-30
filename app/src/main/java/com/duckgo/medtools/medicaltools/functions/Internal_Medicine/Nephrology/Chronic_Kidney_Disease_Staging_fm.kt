package com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Nephrology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Chronic_Kidney_Disease_Staging_fm : BaseMedListFragment() {

    override fun getTitle(): String = "慢性肾脏病 (CKD) 分期"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        val dataSet = listOf(
            arrayOf("分期", "特征", "GFR水平(ml/min)"),
            arrayOf("1期", "已有肾病", "GFR正常 >90"),
            arrayOf("2期", "GFR轻度降低", "60～89"),
            arrayOf("3期", " GFR中度降低 ", "30～59"),
            arrayOf("4期", "GFR重度降低", "15～29"),
            arrayOf("5期", "肾衰竭（ESRD）", "<15")
        )

        val dataSetAppendix = listOf(
            arrayOf("结果解读", "3-5期为慢性肾衰竭，5期为终末期肾病。治疗推荐如下：\n1期：病因的诊断和治疗；治疗并发症；延缓疾病进展； 减少心血管疾患的危险\n2期：估计疾病是否会进展或进展速度\n3期：评价和治疗并发症\n4期：准备肾脏替代治疗\n5期：肾脏替代治疗"),
            arrayOf("相关解释", "危险因素：高血压、糖尿病、自身免疫病、老年、非洲祖先、有肾脏病的家族史，之前发生过急性肾衰竭，有蛋白尿，尿沉渣异常，尿路结构异常等。"),
            arrayOf("参考来源", "National Kidney Foundation (2002). \"K/DOQI clinical practice guidelines for chronic kidney disease\". Retrieved 2008-06-29.")
        )

        return listOf(
            MedCalAdapterDatabean(
                dataSet.map { MedCalDataBean(*it) },
                columnWeights = floatArrayOf(1f, 2f, 2f)
            ),
            GapAdapter(20), // 添加间距
            MedCalAdapterDatabean(
                dataSetAppendix.map { MedCalDataBean(*it) },
                columnWeights = floatArrayOf(1f, 3f)
            )
        )
    }
}
