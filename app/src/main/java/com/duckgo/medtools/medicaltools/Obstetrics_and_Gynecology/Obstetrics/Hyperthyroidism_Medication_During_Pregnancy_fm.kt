package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Hyperthyroidism_Medication_During_Pregnancy_fm : BaseMedListFragment() {
    override fun getTitle() = "妊娠期甲亢程度和用药剂量间的关系"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "40"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("程度", "BMR(%)", "心率(/min)", "丙硫氧嘧啶(mg/d)"),
        arrayOf("轻", "＜+30", "＜100", "200~300"),
        arrayOf("中", "+30~+60", "100~120", "300~400"),
        arrayOf("重", "＞+60", "＞120", "400~500")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("相关解释", "药物治疗首选丙硫氧嘧啶(PTU)，此药通过胎盘量少，速度慢。"),
        arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
