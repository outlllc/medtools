package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vaginal_Vault_Bulging_Julian_Classification_fm : BaseMedListFragment() {
    override fun getTitle() = "Julian 分级法（阴道穹窿膨出）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 22),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("分度", "描述"),
        MedCalDataBean("Ⅰ度", "穹窿下降达坐骨棘水平"),
        MedCalDataBean("Ⅱ度", "穹窿下降超过坐骨棘水平但未达到阴道外口"),
        MedCalDataBean("Ⅲ度", "穹窿下降已到阴道外口"),
        MedCalDataBean("Ⅳ度", "穹窿下降超过阴道外口")
    )

    override fun initData_appendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("相关解释", "目前国内尚无确定的分期标准。1998年美国威斯康辛州大学的Julian教授通过阴道穹窿相对阴道口距离长度将阴道穹窿膨出分为4度。以屏气下膨出最大程度来判定。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
