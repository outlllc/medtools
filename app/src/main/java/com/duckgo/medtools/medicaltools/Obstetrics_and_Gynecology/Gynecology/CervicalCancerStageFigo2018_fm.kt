package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class CervicalCancerStageFigo2018_fm : BaseMedListFragment() {
    override fun getTitle() = "宫颈癌分期（FIGO，2018）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 22),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("分期", "描述"),
        MedCalDataBean("Ⅰ期", "癌灶局限在宫颈"),
        MedCalDataBean(" ⅠA", "仅镜下可见浸润癌最大深度<5 mm"),
        MedCalDataBean("  ⅠA1", "间质浸润深度<3 mm"),
        MedCalDataBean("  ⅠA2", "间质浸润深度3~5 mm"),
        MedCalDataBean("ⅠB", "浸润癌深度>5mm，癌仍局限在子宫颈"),
        MedCalDataBean("  ⅠB1", "间质浸润深度>5 mm，病灶最大径线<2 cm"),
        MedCalDataBean("  ⅠB2", "癌灶最大径线2~4 cm"),
        MedCalDataBean("  ⅠB3", "癌灶最大径线>4 cm"),
        MedCalDataBean("Ⅱ期", "癌灶超越子宫，但未达阴道下1/3或骨盆壁"),
        MedCalDataBean("  ⅡA", "侵犯上2/3阴道，无宫旁浸润"),
        MedCalDataBean("   ⅡA1", "癌灶最大径线≤4 cm"),
        MedCalDataBean("   ⅡA2", "癌灶最大径线>4 cm"),
        MedCalDataBean("  ⅡB", "有宫旁浸润，未达盆壁"),
        MedCalDataBean("Ⅲ期", "累及阴道下1/3和/或扩展到骨盆壁和/或引起肾盂积水/无功能肾和/或累及淋巴结"),
        MedCalDataBean("  ⅢA", "累及阴道下1/3，未达骨盆壁"),
        MedCalDataBean("  ⅢB", "扩展到骨盆壁和/或引起肾盂积水或无功能肾"),
        MedCalDataBean("  ⅢC", "不论大小，累及盆腔(ⅢC1)和/或主动脉旁(ⅢC2)淋巴结"),
        MedCalDataBean("Ⅳ期", "侵犯膀胱/直肠黏膜和/或超出真骨盆"),
        MedCalDataBean("  ⅣA", "转移至邻近器官"),
        MedCalDataBean("  ⅣB", "转移到远处器官")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "需注明ⅢC期的影像(r)或病理(p)证据。"),
        MedCalDataBean("参考来源", "2018年FIGO癌症分期指南")
    )
}
