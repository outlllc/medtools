package com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Precocious_Puberty_Auxiliary_Examination_fm : BaseMedListFragment() {
    override fun getTitle() = "性早熟疾病的辅助检查结果"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "70"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("", "性腺大小", "基础FSH/LH", "E2", "DHAS", "睾酮T", "GnRH反应"),
        arrayOf("特发性", "增大", "升高", "升高", "升高", "升高", "增强"),
        arrayOf("中枢性", "增大", "升高", "升高", "升高", "升高", "增强"),
        arrayOf("性腺性", "增大", "不高", "升高", "不高", "可高", "无反应"),
        arrayOf("Albright", "增大", "不高", "升高", "可高", "可高", "无反应"),
        arrayOf("肾上腺性", "小", "不高", "升高", "升高", "可高", "无反应")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
