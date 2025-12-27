package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vulvar_skin_diseases_Classification_fm : BaseMedListFragment() {
    override fun getTitle() = "外阴皮肤疾病分类法（ISSVD，1987）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 10),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("皮肤和粘膜上皮内非瘤变"),
        MedCalDataBean("      硬化性苔藓"),
        MedCalDataBean("      鳞状上皮增生"),
        MedCalDataBean("      其他皮肤病"),
        MedCalDataBean("上皮内瘤变"),
        MedCalDataBean("      鳞状上皮内瘤变"),
        MedCalDataBean("          轻度不典型增生"),
        MedCalDataBean("          中度不典型增生"),
        MedCalDataBean("          重度不典型增生或原位癌"),
        MedCalDataBean("     非鳞状上皮内瘤变"),
        MedCalDataBean("         派杰氏病"),
        MedCalDataBean("         非浸润性黑色素细胞瘤"),
        MedCalDataBean("浸润性肿瘤")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "该分类将上皮内瘤变与非瘤变分开，有利于治疗选择。"),
        MedCalDataBean("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
