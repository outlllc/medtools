package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class CervicalCancerTNMStage_fm : BaseMedListFragment() {

    override fun getTitle() = "宫颈癌TNM分期"

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
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("TNM分期", "FIGO分期 ", "  "),
            MedCalDataBean("Tx", " ", "原发肿瘤无法评估"),
            MedCalDataBean("T0", " ", "无原发肿瘤的证据"),
            MedCalDataBean("Tis", " ", "原位癌"),
            MedCalDataBean("T1", "Ⅰ", "宫颈癌局限于子宫颈"),
            MedCalDataBean("T1a", "ⅠA", "仅镜下诊断为浸润癌，间质浸润深度不超过5mm，宽度不超过7mm"),
            MedCalDataBean("T1a1", "ⅠA1", "间质浸润深度不超过3mm，宽度不超过7mm"),
            MedCalDataBean("T1a2", "ⅠA2", "间质浸润深度超过3mm，但不超过5mm，宽度不超过7mm"),
            MedCalDataBean("T1b", "ⅠB", "临床可见的病灶局限于子宫颈或镜下病变超过T1a"),
            MedCalDataBean("T1b1", "ⅠB1", "临床可见的病灶小于或等于4cm"),
            MedCalDataBean("T1b2", "ⅠB2", "临床可见的病灶大于4cm"),
            MedCalDataBean("T2", "Ⅱ", "浸润范围超过子宫颈，但未及盆壁或阴道下1/3"),
            MedCalDataBean("T2a", "ⅡA", "无宫旁浸润"),
            MedCalDataBean("T2a1", "ⅡA1", "临床可见的病灶小于或等于4cm"),
            MedCalDataBean("T2a2", "ⅡA2", "临床可见的病灶大于4cm"),
            MedCalDataBean("T2b", "ⅡB", "有宫旁浸润"),
            MedCalDataBean("T3", "Ⅲ", "侵及盆壁和/或下1/3阴道，和/或导致肾积水或无功能肾"),
            MedCalDataBean("T3a", "ⅢA", "侵及下1/3阴道，未到达盆壁"),
            MedCalDataBean("T3b", "ⅢB", "到达盆壁或引起肾积水或无功能肾"),
            MedCalDataBean("T4", "ⅣA", "侵及膀胱或直肠粘膜，和/或超出真骨盆")
        )
    }

    private fun initData2(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("TNM分期", "FIGO分期", " "),
            MedCalDataBean("Nx", " ", "区域淋巴结无法评估"),
            MedCalDataBean("N0", " ", "无区域淋巴结转移"),
            MedCalDataBean("N1", "ⅢB", "区域淋巴结转移")
        )
    }

    private fun initData3(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("TNM分期", "FIGO分期", " "),
            MedCalDataBean("M0", " ", "无远处转移"),
            MedCalDataBean("M1", "ⅣB", "远处转移")
        )
    }

    private fun initData4(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("Stage", "T", "N", "M"),
            MedCalDataBean("0", "Tis", "N0", "M0"),
            MedCalDataBean("Ⅰ", "T1", "N0", "M0"),
            MedCalDataBean("ⅠA", "T1a", "N0", "M0"),
            MedCalDataBean("ⅠA1", "T1a1", "N0", "M0"),
            MedCalDataBean("ⅠA2", "T1a2", "N0", "M0"),
            MedCalDataBean("ⅠB", "T1b", "N0", "M0"),
            MedCalDataBean("ⅠB1", "T1b1", "N0", "M0"),
            MedCalDataBean("ⅠB2", "T1b2", "N0", "M0"),
            MedCalDataBean("Ⅱ", "T2", "N0", "M0"),
            MedCalDataBean("ⅡA", "T2a", "N0", "M0"),
            MedCalDataBean("ⅡA1", "T2a1", "N0", "M0"),
            MedCalDataBean("ⅡA2", "T2a2", "N0", "M0"),
            MedCalDataBean("ⅡB", "T2b", "N0", "M0"),
            MedCalDataBean("Ⅲ", "T3", "N0", "M0"),
            MedCalDataBean("ⅢA", "T3a", "N0", "M0"),
            MedCalDataBean("ⅢB", "T3b", "any N", "M0"),
            MedCalDataBean("ⅢB", "T1-3", "N1", "M0"),
            MedCalDataBean("ⅣA", "T4", "any N", "M0"),
            MedCalDataBean("ⅣB", "any T", "any N", "M1")
        )
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        return listOf(MedCalDataBean("参考来源", "第七版AJCC癌症分期手册 (2012)."))
    }
}
