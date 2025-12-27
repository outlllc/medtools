package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Baden_Walker_vaginal_half_step_systematic_grading_of_pelvic_floor_fm : BaseMedListFragment() {
    override fun getTitle() = "Baden-Walker盆底器官膨出的阴道半程系统分级法"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 20),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("分度", "描述"),
        MedCalDataBean("Ⅰ度", "阴道前、后壁的突出部下降到了距处女膜的半程处"),
        MedCalDataBean("Ⅱ度", "阴道前、后壁突出部位达处女膜"),
        MedCalDataBean("Ⅲ度", "阴道前、后壁突出部位达处女膜以外")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "注意：膨出分度检查应在最大屏气状态下进行。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
