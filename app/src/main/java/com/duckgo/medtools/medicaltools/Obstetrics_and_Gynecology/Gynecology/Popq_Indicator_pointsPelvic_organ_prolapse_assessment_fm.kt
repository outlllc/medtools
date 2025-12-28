package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Popq_Indicator_pointsPelvic_organ_prolapse_assessment_fm : BaseMedListFragment() {
    override fun getTitle() = "盆腔器官脱垂评估指示点（POP-Q分期）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("Aa", "阴道前壁中线距处女膜3cm处", "-3～+3cm"),
        MedCalDataBean("Ba", "阴道顶端或前穹窿到Aa点之间阴道前壁上段中的最远点", "-3cm～+TVL"),
        MedCalDataBean("C", "宫颈或子宫切除后阴道顶端所处的最远端", "-TVL～+TVL"),
        MedCalDataBean("D", "有宫颈时的后穹窿的位置", "-TVL～+TVL或空缺"),
        MedCalDataBean("Ap", "阴道后壁中线距处女膜3cm处", "-3～+3cm"),
        MedCalDataBean("BP", "阴道顶端或后穹窿到Ap点之间阴道后壁上段中的最远点", "-3cm～+TVL")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "此分期系统是利用解剖指示点与处女膜的关系界定脱垂程度。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
