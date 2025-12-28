package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Tbs_classification_fm : BaseMedListFragment() {
    override fun getTitle() = "TBS分类（宫颈细胞学检查）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData()),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("异常上皮细胞"),
        MedCalDataBean("鳞状细胞    又分两类：意义未明的不典型鳞状细胞(ASC-US)与不能排除高度上皮内病变的不典型鳞状细胞(ASC-H)"),
        MedCalDataBean("轻度鳞状细胞上皮内病变(LSIL)，包括HPV感染/CIN 1"),
        MedCalDataBean("高度鳞状细胞上皮内病变(HSIL)，包括CIN 2及3"),
        MedCalDataBean("鳞状细胞癌(SCC)"),
        MedCalDataBean("腺细胞"),
        MedCalDataBean("不典型(AGC)，倾向于瘤变"),
        MedCalDataBean("原位腺癌(宫颈管)"),
        MedCalDataBean("腺癌(宫颈管，子宫内膜、子宫外)")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
