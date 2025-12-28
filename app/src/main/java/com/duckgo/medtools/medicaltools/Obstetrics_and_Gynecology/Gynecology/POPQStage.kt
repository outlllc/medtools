package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class POPQStage : BaseMedListFragment() {
    override fun getTitle() = "盆腔器官脱垂分期（POP-Q分期法）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData(), floatArrayOf(1f, 3f)),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), floatArrayOf(1f, 3f))
        )
    }

    private fun provideData() = listOf(
        MedCalDataBean("分度", "内容"),
        MedCalDataBean("0", "无脱垂，Aa、Ap、Ba、Bp均在-3cm处，C、D两点在阴道总长度和阴道总长度-2cm之间，即C或D点量化值<[TVL-2]cm"),
        MedCalDataBean("Ⅰ", "脱垂最远端在处女膜平面上>1cm，即量化值<-1cm"),
        MedCalDataBean("Ⅱ", "脱垂最远端在处女膜平面上<1cm，即量化值>-1cm，但<+1cm"),
        MedCalDataBean("Ⅲ", "脱垂最远端超过处女膜平面>1cm，但<阴道总长度-2cm，即量化值>+1 cm，但<[TVL-2]cm"),
        MedCalDataBean("Ⅳ", "下生殖道呈全长外翻，脱垂最远端超过阴道总长度-2cm，即量化值>[TVL-2]cm")
    )

    private fun provideAppendix() = listOf(
        MedCalDataBean("相关解释", "POP-Q分期应在向下用力屏气时，以脱垂完全呈现出来时的最远端部位计算。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
