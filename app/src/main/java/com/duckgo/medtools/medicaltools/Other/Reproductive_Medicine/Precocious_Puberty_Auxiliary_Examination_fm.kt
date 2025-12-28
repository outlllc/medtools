package com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Precocious_Puberty_Auxiliary_Examination_fm : BaseMedListFragment() {
    override fun getTitle() = "性早熟疾病的辅助检查结果"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData()),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), columnWeights = floatArrayOf(1f, 3f))
        )
    }

    private fun provideData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("", "性腺大小", "基础FSH/LH", "E2", "DHAS", "睾酮T", "GnRH反应"),
        MedCalDataBean("特发性", "增大", "升高", "升高", "升高", "升高", "增强"),
        MedCalDataBean("中枢性", "增大", "升高", "升高", "升高", "升高", "增强"),
        MedCalDataBean("性腺性", "增大", "不高", "升高", "不高", "可高", "无反应"),
        MedCalDataBean("Albright", "增大", "不高", "升高", "可高", "可高", "无反应"),
        MedCalDataBean("肾上腺性", "小", "不高", "升高", "升高", "可高", "无反应")
    )

    private fun provideAppendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
