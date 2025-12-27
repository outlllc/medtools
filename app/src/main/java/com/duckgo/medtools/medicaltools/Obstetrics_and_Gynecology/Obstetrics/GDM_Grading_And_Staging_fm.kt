package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class GDM_Grading_And_Staging_fm : BaseMedListFragment() {
    override fun getTitle() = "妊娠期糖尿病的分级与分期"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "10"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("A级：妊娠期出现或发现的糖尿病。"),
        arrayOf("B级：显性糖尿病，20岁以后发病，病程小于10年，无血管病变。"),
        arrayOf("C级：发病年龄在10~19岁，或病程达10~19年，无血管病变。"),
        arrayOf("D级：10岁以前发病，或病程≥20年，或者合并单纯性视网膜病。"),
        arrayOf("F级：糖尿病性肾病。"),
        arrayOf("R级：有增生性视网膜病变。"),
        arrayOf("H级：糖尿病性心脏病。")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("结果解读", "A1级：经饮食控制，血糖正常；A2级：需加用胰岛素。"),
        arrayOf("相关解释", "基于发病年龄、病程、是否存在血管合并症等进行分期。"),
        arrayOf("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
