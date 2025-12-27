package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Immature_TeratomasGrading_method_for_fm : BaseMedListFragment() {
    override fun getTitle() = "未成熟畸胎瘤的分级方法"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 22),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("0级", "全部为成熟组织"),
        MedCalDataBean("Ⅰ级", "有少量不成熟组织(主要是胶质和原始间充质)，可见核分裂。神经上皮少，每一切片中仅限于1个每40倍视野"),
        MedCalDataBean("Ⅱ级", "有较多未成熟组织，但神经上皮在每一切片中不超过3个每40倍视野"),
        MedCalDataBean("Ⅲ级", "有多量不成熟组织，每一切片中神经上皮的量占4个或更多每40倍视野，并常与肉瘤样的间质融合")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "未成熟畸胎瘤(immature teratoma )属恶性肿瘤，含2～3胚层，占卵巢畸胎瘤1%～3%。 Norris等(1976)提出未成熟畸胎瘤的分级方法。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
