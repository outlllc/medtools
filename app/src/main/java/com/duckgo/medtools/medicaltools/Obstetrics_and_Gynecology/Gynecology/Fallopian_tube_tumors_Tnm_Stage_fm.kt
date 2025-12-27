package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Fallopian_tube_tumors_Tnm_Stage_fm : BaseMedListFragment() {
    override fun getTitle() = "输卵管肿瘤TNM分期"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(listOf(MedCalDataBean("原发灶")), 10),
            MedCalAdapterDatabean(initData(), 33),
            MedCalAdapterDatabean(listOf(MedCalDataBean("区域淋巴结 (N)")), 10),
            MedCalAdapterDatabean(initData2(), 30),
            MedCalAdapterDatabean(listOf(MedCalDataBean("远处转移 (M)")), 10),
            MedCalAdapterDatabean(initData3(), 30),
            MedCalAdapterDatabean(listOf(MedCalDataBean("解剖分期/预后分组")), 10),
            MedCalAdapterDatabean(initData4(), 40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("TNM分期", "FIGO分期 ", "  "),
        MedCalDataBean("Tx", " ", "原发肿瘤无法评估"),
        MedCalDataBean("T0", " ", "无原发肿瘤的证据"),
        MedCalDataBean("Tis", " ", "原位癌"),
        MedCalDataBean("T1", "Ⅰ", "局限于输卵管"),
        MedCalDataBean("  T1a", "ⅠA", "局限于一侧输卵管，未穿透浆膜，无腹水"),
        MedCalDataBean("  T1b", "ⅠB", "局限于两侧输卵管，未穿透浆膜，无腹水"),
        MedCalDataBean("  T1c", "ⅠC", "穿透浆膜，或腹水/冲洗液中有恶性细胞"),
        MedCalDataBean("T2", "Ⅱ", "有盆腔扩散"),
        MedCalDataBean("  T2a", "ⅡA", "浸润或转移至子宫和/或卵巢"),
        MedCalDataBean("  T2b", "ⅡB", "侵及其它盆腔结构"),
        MedCalDataBean("  T2c", "ⅡC", "盆腔扩散伴恶性腹水/冲洗液"),
        MedCalDataBean("T3", "Ⅲ", "伴盆腔外的腹腔种植"),
        MedCalDataBean("T3a", "ⅢA", "镜下可见的盆腔外腹腔转移"),
        MedCalDataBean("T3b", "ⅢB", "肉眼可见转移，最大径≤2cm"),
        MedCalDataBean("T3c", "ⅢC", "盆腔外腹腔转移 >2cm")
    )

    private fun initData2() = listOf(
        MedCalDataBean("TNM分期", "FIGO分期", " "),
        MedCalDataBean("Nx", " ", "区域淋巴结无法评估"),
        MedCalDataBean("N0", " ", "无区域淋巴结转移"),
        MedCalDataBean("N1", "ⅢC", "区域淋巴结转移")
    )

    private fun initData3() = listOf(
        MedCalDataBean("TNM分期", "FIGO分期", " "),
        MedCalDataBean("M0", "", "无远处转移"),
        MedCalDataBean("M1", "Ⅳ", "远处转移")
    )

    private fun initData4() = listOf(
        MedCalDataBean("Stage", "T", "N", "M"),
        MedCalDataBean("0", "Tis", "N0", "M0"),
        MedCalDataBean("Ⅰ", "T1", "N0", "M0"),
        MedCalDataBean("ⅠA", "T1a", "N0", "M0"),
        MedCalDataBean("ⅠB", "T1b", "N0", "M0"),
        MedCalDataBean("ⅠC", "T1c", "N0", "M0"),
        MedCalDataBean("Ⅱ ", "T2", "N0", "M0"),
        MedCalDataBean("ⅡA", "T2a", "N0", "M0"),
        MedCalDataBean("ⅡB", "T2b", "N0", "M0"),
        MedCalDataBean("ⅡC", "T2c", "N0", "M0"),
        MedCalDataBean("Ⅲ", "T3", "N0", "M0"),
        MedCalDataBean("ⅢA", "T3a", "N0", "M0"),
        MedCalDataBean("ⅢB", "T3b", "N0", "M0"),
        MedCalDataBean("ⅢC", "T3c", "N0", "M0"),
        MedCalDataBean("ⅢC", "any T", "N1", "M0"),
        MedCalDataBean("Ⅳ", "any T", "any N", "M1")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("参考来源", "第七版AJCC癌症分期手册 (2012).")
    )
}
