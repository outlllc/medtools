package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Trophoblastic_Tumors_Anatomical_staging_fm : BaseMedListFragment() {
    override fun getTitle() = "滋养细胞肿瘤解剖学分期（FIGO, 2000）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 4f)),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("分期", "描述"),
        MedCalDataBean("I 期", "病变局限于子宫"),
        MedCalDataBean("II期", "病变扩散，但仍局限于生殖器官"),
        MedCalDataBean("III期", "病变转移至肺，有或无生殖系统病变"),
        MedCalDataBean("IV期", "所有其他转移")
    )

    override fun initData_appendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
