package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class RH_And_ABO_Hemolysis_Comparison_fm : BaseMedListFragment() {
    override fun getTitle() = "Rh 和 ABO 溶血病的比较"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData(), columnWeights = floatArrayOf(1f, 2f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(provideData2(), columnWeights = floatArrayOf(1f, 2f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), columnWeights = floatArrayOf(1f, 3f))
        )
    }

    private fun provideData() = listOf(
        MedCalDataBean("", "", "Rh溶血病", "ABO溶血病"),
        MedCalDataBean("", "频率", "不常见", "常见"),
        MedCalDataBean("", "苍白", "显著", "轻"),
        MedCalDataBean("临", "水肿", "较常见", "罕见"),
        MedCalDataBean("床", "黄疸", "重度", "轻~中度"),
        MedCalDataBean("特", "肝脾肿大", "显著", "较轻"),
        MedCalDataBean("点", "第1胎受累", "很少", "约半数"),
        MedCalDataBean("", "下一胎更严重", "大多数", "不一定"),
        MedCalDataBean("", "晚期贫血", "可发生", "很少发生")
    )

    private fun provideData2() = listOf(
        MedCalDataBean("实", "母血型", "Rh d、e、c", "O（多数）"),
        MedCalDataBean("验", "子血型", "Rh D、E、C", "A或B（多数）"),
        MedCalDataBean("室", "贫血", "显著", "轻"),
        MedCalDataBean("检", "抗人球直接法", "阳性", "改良法阳性"),
        MedCalDataBean("查", "抗体释放法", "阳性", "阳性"),
        MedCalDataBean("", "红细胞形态", "有核红细胞多", "小球形红细胞多")
    )

    private fun provideAppendix() = listOf(
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
