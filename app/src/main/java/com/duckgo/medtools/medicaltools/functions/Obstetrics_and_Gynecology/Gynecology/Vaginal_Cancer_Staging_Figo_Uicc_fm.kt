package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vaginal_Cancer_Staging_Figo_Uicc_fm : BaseMedListFragment() {

    override fun getTitle() = "阴道癌分期（FIGO/UICC）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData() = listOf(
        MedCalDataBean(" ", "FIGO分期", "UICC分期（TNM）"),
        MedCalDataBean("0", "原位癌（浸润前癌)", "TisN0M0"),
        MedCalDataBean("Ⅰ", "癌瘤局限于阴道", "T1N0M0"),
        MedCalDataBean("Ⅱ", "癌瘤侵及阴道旁组织但未达盆侧壁", "T2N0M0"),
        MedCalDataBean("Ⅲ", "癌瘤扩散达盆侧壁", "T3N0M0\nT3N1M0\nT1N1M0\nT2N1M0"),
        MedCalDataBean("ⅣA", "癌瘤侵入膀胱及直肠黏膜，和（或）扩散超出真骨盆", "T4任何NM0"),
        MedCalDataBean("ⅣB", "远处转移", "任何T，任何N，M1")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "阴道癌FIGO分期是基于临床发现，包括体格检查，膀胱镜，直肠镜和胸部X线。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
