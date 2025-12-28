package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class GDM_Grading_And_Staging_fm : BaseMedListFragment() {
    override fun getTitle() = "妊娠期糖尿病的分级与分期"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData()),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), columnWeights = floatArrayOf(1f, 3f))
        )
    }

    private fun provideData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("A级：妊娠期出现或发现的糖尿病。"),
        MedCalDataBean("B级：显性糖尿病，20岁以后发病，病程小于10年，无血管病变。"),
        MedCalDataBean("C级：发病年龄在10~19岁，或病程达10~19年，无血管病变。"),
        MedCalDataBean("D级：10岁以前发病，或病程≥20年，或者合并单纯性视网膜病。"),
        MedCalDataBean("F级：糖尿病性肾病。"),
        MedCalDataBean("R级：有增生性视网膜病变。"),
        MedCalDataBean("H级：糖尿病性心脏病。")
    )

    private fun provideAppendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("结果解读", "A1级：经饮食控制，血糖正常；A2级：需加用胰岛素。"),
        MedCalDataBean("相关解释", "基于发病年龄、病程、是否存在血管合并症等进行分期。"),
        MedCalDataBean("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
