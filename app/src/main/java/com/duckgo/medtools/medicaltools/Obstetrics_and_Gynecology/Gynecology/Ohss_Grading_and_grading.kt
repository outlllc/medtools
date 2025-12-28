package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Ohss_Grading_and_grading : BaseMedListFragment() {
    override fun getTitle() = "卵巢过度刺激综合征 OHSS 的分度与分级（Golan分类）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 1f, 4f)),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("OHSS分度", "OHSS分级", "描述"),
        MedCalDataBean("轻度", "Ⅰ", "腹胀和不适"),
        MedCalDataBean("轻度", "Ⅱ", "Ⅰ级症状加恶心、呕吐和/或腹泻卵巢不同程度增大，直径不超过5cm"),
        MedCalDataBean("中度", "Ⅲ", "轻度OHSS症状加重，腹水的超声证据，卵巢直径5~10cm之间"),
        MedCalDataBean("重度", "Ⅳ", "中度OHSS特征，腹水的临床证据"),
        MedCalDataBean("重度", "Ⅴ", "血球压积>45%(比基线升高>30%) WBC>15000/mL，少尿，血肌酐1.0~1.5mg/dl(88.4~132.6mmol/l)，肌酐清除率≥50mL/min"),
        MedCalDataBean("危重", "Ⅵ", "张力性腹水(伴或无胸水)，血球压积>55%，WBC>25000/mL，血肌酐>1.6mg/dl，肌酐清除率>50mL/min，血栓栓塞，急性呼吸窘迫综合征(ARDS)")
    )

    override fun initData_appendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("参考来源", "Golan A, et al. Ovarian hyperstimulation syndrome: An update review. Obstet Gynecol Surv. 1989;44:430–40.")
    )
}
