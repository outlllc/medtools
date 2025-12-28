package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Uterine_TumorsTnmStage_fm : BaseMedListFragment() {
    override fun getTitle() = "子宫肿瘤TNM分期"

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
        MedCalDataBean("TNM分期", "FIGO分期", " "),
        MedCalDataBean("Tx", " ", "原发肿瘤无法评估"),
        MedCalDataBean("T0", " ", "无原发肿瘤的证据"),
        MedCalDataBean("Tis", " ", "原位癌"),
        MedCalDataBean("T1", "Ⅰ", "局限于子宫体"),
        MedCalDataBean("T1a", "ⅠA", "局限于子宫内膜或不到子宫肌层的1/2"),
        MedCalDataBean("T1b", "ⅠB", "达到或超过子宫肌层的1/2"),
        MedCalDataBean("T2", "Ⅱ", "侵及宫颈间质结缔组织，但未超出子宫"),
        MedCalDataBean("T3a", "ⅢA", "侵及浆膜和/或附件（直接浸润或转移）"),
        MedCalDataBean("T3b", "ⅢB", "迁及阴道（直接浸润或转移）"),
        MedCalDataBean("T4", "ⅣA", "侵及膀胱和/或肠粘膜")
    )

    private fun initData2() = listOf(
        MedCalDataBean("Nx", " ", "区域淋巴结无法评估"),
        MedCalDataBean("N0", " ", "无区域淋巴结转移"),
        MedCalDataBean("N1", "ⅢC1", "转移至盆腔淋巴结"),
        MedCalDataBean("N2", "ⅢC2", "转移至主动脉旁淋巴结，有或无盆腔淋巴结转移")
    )

    private fun initData3() = listOf(
        MedCalDataBean("M0", " ", "无远处转移"),
        MedCalDataBean("M1", "ⅣB", "远处转移")
    )

    private fun initData4() = listOf(
        MedCalDataBean("Stage", "T", "N", "M"),
        MedCalDataBean("0", "Tis", "N0", "M0"),
        MedCalDataBean("Ⅰ", "T1", "N0", "M0"),
        MedCalDataBean("ⅠA", "T1a", "N0", "M0"),
        MedCalDataBean("ⅠB", "T1b", "N0", "M0"),
        MedCalDataBean("Ⅱ", "T2", "N0", "M0"),
        MedCalDataBean("Ⅲ", "T3", "N0", "M0"),
        MedCalDataBean("ⅢA", "T3a", "N0", "M0"),
        MedCalDataBean("ⅢB", "T3b", "N0", "M0"),
        MedCalDataBean("ⅢC1", "T1-T3", "N1", "M0"),
        MedCalDataBean("ⅢC2", "T1-T3", "N2", "M0"),
        MedCalDataBean("ⅣA", "T4", "any N", "M0"),
        MedCalDataBean("ⅣB", "any T", "any N", "M1")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("参考来源", "第七版AJCC癌症分期手册 (2012).")
    )
}
