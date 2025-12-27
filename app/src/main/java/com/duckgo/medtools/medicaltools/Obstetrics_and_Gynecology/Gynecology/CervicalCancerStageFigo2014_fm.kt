package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class CervicalCancerStageFigo2014_fm : BaseMedListFragment() {
    override fun getTitle() = "宫颈癌分期（FIGO，2014）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 22),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("FIGO分期", "肿瘤表现"),
        MedCalDataBean("", "原发肿瘤无法评估"),
        MedCalDataBean("Ⅰ期", "宫颈癌局限在宫颈"),
        MedCalDataBean(" ⅠA", "肉眼未见癌灶，仅在显微镜下可见浸润癌"),
        MedCalDataBean("  ⅠA1", "间质浸润深度≤3 mm，水平扩散≤7mm"),
        MedCalDataBean("  ⅠA2", "间质浸润深度3～5mm，水平扩散≤7mm"),
        MedCalDataBean("ⅠB", "肉眼可见癌灶局限于宫颈，或者镜下病灶>ⅠA期"),
        MedCalDataBean("  ⅠB1", "肉眼可见癌灶最大径线≤4cm"),
        MedCalDataBean("  ⅠB2", "肉眼可见癌灶最大径线>4cm"),
        MedCalDataBean("Ⅱ期", "肿瘤超越宫颈，但未达骨盆壁或未达阴道下1/3"),
        MedCalDataBean("  ⅡA", "癌灶累及阴道上2/3，无明显宫旁浸润"),
        MedCalDataBean("   ⅡA1", "肉眼可见病灶最大径线≤4cm"),
        MedCalDataBean("   ⅡA2", "肉眼可见病灶最大径线>4cm"),
        MedCalDataBean("  ⅡB", "有明显宫旁浸润，但未达盆壁"),
        MedCalDataBean("Ⅲ期", "癌灶扩展到骨盆壁/累及阴道下1/3/引起肾盂积水或无功能"),
        MedCalDataBean("  ⅢA", "癌灶累及阴道下1/3，没有扩展到骨盆壁"),
        MedCalDataBean("  ⅢB", "癌灶扩展到骨盆壁和（或）引起肾盂积水或无功能"),
        MedCalDataBean("Ⅳ期", "癌灶扩散超出真骨盆或癌浸润膀胱/直肠黏膜"),
        MedCalDataBean("  ⅣA", "癌灶扩散至邻近盆腔脏器"),
        MedCalDataBean("  ⅣB", "远处转移")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "a: 浸润深度测量不应大于5mm。脉管受累不影响分期。"),
        MedCalDataBean("参考来源", "FIGO staging for carcinoma of the vulva, cervix, and corpus uteri. 2014.")
    )
}
