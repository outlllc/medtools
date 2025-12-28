package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Gestational_Trophoblastic_Tumor_Tnm_stage_fm : BaseMedListFragment() {
    override fun getTitle() = "妊娠滋养细胞肿瘤TNM分期"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(listOf(MedCalDataBean("原发灶"))),
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 1f, 4f)),
            MedCalAdapterDatabean(listOf(MedCalDataBean("区域淋巴结 (N)"))),
            MedCalAdapterDatabean(initData2()),
            MedCalAdapterDatabean(listOf(MedCalDataBean("远处转移 (M)"))),
            MedCalAdapterDatabean(initData3(), floatArrayOf(1f, 2f, 2f)),
            MedCalAdapterDatabean(listOf(MedCalDataBean("解剖分期/预后分组"))),
            MedCalAdapterDatabean(initData4(), floatArrayOf(1f, 2f, 2f, 2f)),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("TNM分期", "FIGO分期 ", "  "),
            MedCalDataBean("Tx", " ", "原发肿瘤无法评估"),
            MedCalDataBean("T0", " ", "无原发肿瘤的证据"),
            MedCalDataBean("T1", "Ⅰ", "局限于子宫"),
            MedCalDataBean("T2", "Ⅱ", "直接浸润或转移至其它生殖结构（卵巢、输卵管、阴道、阔韧带）")
        )
    }

    private fun initData2(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("无指定的区域淋巴结，淋巴结转移一律分为M1")
        )
    }

    private fun initData3(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("TNM分期", "FIGO分期", " "),
            MedCalDataBean("M0", " ", "无远处转移"),
            MedCalDataBean("M1", " ", "远处转移"),
            MedCalDataBean("M1a", "Ⅲ", "转移至肺"),
            MedCalDataBean("M1b", "Ⅳ", "其它远处转移")
        )
    }

    private fun initData4(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("Stage", "T", "M", "危险因素"),
            MedCalDataBean("Ⅰ", "T1", "M0", "不详"),
            MedCalDataBean("ⅠA", "T1", "M0", "低危"),
            MedCalDataBean("ⅠB", "T1", "M0", "高危"),
            MedCalDataBean("Ⅱ", "T2", "M0", "不详"),
            MedCalDataBean("ⅡA", "T2", "M0", "低危"),
            MedCalDataBean("ⅡB", "T2", "M0", "高危"),
            MedCalDataBean("Ⅲ", "any T", "M1a", "不详"),
            MedCalDataBean("ⅢA", "any T", "M1a", "低危"),
            MedCalDataBean("ⅢB", "any T", "M1a", "高危"),
            MedCalDataBean("Ⅳ", "any T", "M1b", "不详"),
            MedCalDataBean("ⅣA", "any T", "M1b", "低危"),
            MedCalDataBean("ⅣB", "any T", "M1b", "高危")
        )
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("参考来源", "第七版AJCC癌症分期手册 (2012).")
        )
    }
}
