package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vvc_Classification_fm : BaseMedListFragment() {
    override fun getTitle() = "外阴阴道假丝酵母菌病（VVC）临床分类"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("  ", "单纯性VVC", "复杂性VVC"),
            MedCalDataBean("发生频率", "散发或非经常发作", "复发或经常发作"),
            MedCalDataBean("临床表现", "轻到中度", "重度"),
            MedCalDataBean("真菌种类", "白假丝酵母菌", "非白假丝酵母菌"),
            MedCalDataBean("宿主情况", "免疫功能正常", "免疫力低下或应用免疫抑制剂或糖尿病、妊娠"),
            MedCalDataBean("治疗效果", "好", "欠佳")
        )
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        return listOf(MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年"))
    }
}
