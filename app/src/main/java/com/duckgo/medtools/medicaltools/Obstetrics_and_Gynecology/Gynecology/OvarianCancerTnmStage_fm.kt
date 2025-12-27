package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class OvarianCancerTnmStage_fm : BaseMedListFragment() {

    override fun getTitle() = "卵巢癌TNM分期"

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

    override fun initData(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("TNM分期", "FIGO分期", " "),
            MedCalDataBean("Tx", " ", "原发肿瘤无法评估"),
            MedCalDataBean("T0", " ", "无原发肿瘤的证据"),
            MedCalDataBean("T1", "Ⅰ", "局限于卵巢（单侧或双侧）"),
            MedCalDataBean("T1a", "ⅠA", "局限于一侧卵巢，包膜完整，卵巢表面无肿瘤，腹水或腹腔冲洗液中无恶性细胞"),
            MedCalDataBean("T1b", "ⅠB", "局限于两侧卵巢，包膜完整，卵巢表面无肿瘤，腹水或腹腔冲洗液中无恶性细胞"),
            MedCalDataBean("T1c", "ⅠC", "肿瘤局限于一侧或两侧卵巢，有下列特征之一：包膜破裂；卵巢表面有肿瘤；腹水或腹腔冲洗液中有恶性细胞"),
            MedCalDataBean("T2", "Ⅱ", "一侧或两侧卵巢，有盆腔浸润和/或种植"),
            MedCalDataBean("T2a", "ⅡA", "直接浸润和/或种植到子宫 and/or 输卵管，腹水或腹腔冲洗液中无恶性细胞"),
            MedCalDataBean("T2b", "ⅡB", "直接浸润和/或种植到盆腔其它组织，腹水或腹腔冲洗液中无恶性细胞"),
            MedCalDataBean("T2c", "ⅡC", "T2a或T2b，腹水或腹腔冲洗液中有恶性细胞"),
            MedCalDataBean("T3", "Ⅲ", "一侧或两侧卵巢，伴镜下证实的盆腔以外的腹腔转移"),
            MedCalDataBean("T3a", "ⅢA", "镜下可见的盆腔外腹腔转移"),
            MedCalDataBean("T3b", "ⅢB", "肉眼可见的盆腔外腹腔转移，最大径小于或等于2cm"),
            MedCalDataBean("T3c", "ⅢC", "盆腔外腹腔转移，最大径大于2cm，和/或区域淋巴结转移")
        )
    }

    private fun initData2(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("Nx", " ", "区域淋巴结无法评估"),
            MedCalDataBean("N0", " ", "无区域淋巴结转移"),
            MedCalDataBean("N1", "ⅢC", "区域淋巴结转移")
        )
    }

    private fun initData3(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("M0", " ", "无远处转移"),
            MedCalDataBean("M1", "Ⅳ", "远处转移")
        )
    }

    private fun initData4(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("Stage", "T", "N", "M"),
            MedCalDataBean("Ⅰ", "T1", "N0", "M0"),
            MedCalDataBean("ⅠA", "T1a", "N0", "M0"),
            MedCalDataBean("ⅠB", "Tb", "N0", "M0"),
            MedCalDataBean("ⅠC", "Tc", "N0", "M0"),
            MedCalDataBean("Ⅱ", "T2", "N0", "M0"),
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
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        return listOf(MedCalDataBean("参考来源", "第七版AJCC癌症分期手册 (2012)"))
    }
}
