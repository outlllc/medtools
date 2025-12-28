package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vaginal_Cancer_Tnm_Stage_fm : BaseMedListFragment() {
    override fun getTitle() = "阴道癌TNM分期"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(listOf(MedCalDataBean("原发灶"))),
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 1f, 4f)),
            MedCalAdapterDatabean(listOf(MedCalDataBean("区域淋巴结 (N)"))),
            MedCalAdapterDatabean(initData2(), floatArrayOf(1f, 2f, 2f)),
            MedCalAdapterDatabean(listOf(MedCalDataBean("远处转移 (M)"))),
            MedCalAdapterDatabean(initData3(), floatArrayOf(1f, 2f, 2f)),
            MedCalAdapterDatabean(listOf(MedCalDataBean("解剖分期/预后分组"))),
            MedCalAdapterDatabean(initData4(), floatArrayOf(1f, 2f, 2f, 2f)),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("TNM分期", "FIGO分期 ", "  "),
        MedCalDataBean("Tx", " ", "原发肿瘤无法评估"),
        MedCalDataBean("T0", " ", "无原发肿瘤的证据"),
        MedCalDataBean("Tis", " ", "原位癌"),
        MedCalDataBean("T1", "Ⅰ", "局限于阴道内"),
        MedCalDataBean("T2", "Ⅱ", "侵及阴道旁组织，但未及盆壁"),
        MedCalDataBean("T3", "Ⅲ", "到达盆壁"),
        MedCalDataBean("T4", "ⅣA", "侵及膀胱或直肠粘膜和/或超出真骨盆")
    )

    private fun initData2() = listOf(
        MedCalDataBean("Nx", " ", "区域淋巴结无法评估"),
        MedCalDataBean("N0", " ", "无区域淋巴结转移"),
        MedCalDataBean("N1", "Ⅲ", "盆腔或腹股沟淋巴结转移")
    )

    private fun initData3() = listOf(
        MedCalDataBean("M0", " ", "无远处转移"),
        MedCalDataBean("M1", "ⅣB", "远处转移")
    )

    private fun initData4() = listOf(
        MedCalDataBean("Stage", "T", "N", "M"),
        MedCalDataBean("0", "Tis", "N0", "M0"),
        MedCalDataBean("Ⅰ", "T1", "N0", "M0"),
        MedCalDataBean("Ⅱ", "T2", "N0", "M0"),
        MedCalDataBean("Ⅲ", "T1-T3", "N1", "M0"),
        MedCalDataBean("Ⅲ", "T3", "N0", "M0"),
        MedCalDataBean("ⅣA", "T4", "any N", "M0"),
        MedCalDataBean("ⅣB", "any T", "any N", "M1")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("参考来源", "第七版AJCC癌症分期手册 (2012).")
    )
}
