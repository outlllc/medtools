package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class RH_And_ABO_Hemolysis_Comparison_fm : BaseMedListFragment() {
    override fun getTitle() = "Rh 和 ABO 溶血病的比较"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "40"),
            GapAdapter(40),
            MedCalListAdapter(provideData2(), "40"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("", "", "Rh溶血病 ", "ABO溶血病"),
        arrayOf("", "频率", "不常见", "常见"),
        arrayOf("", " 苍白", "显著", "轻"),
        arrayOf("临", "水肿", "较常见", "罕见"),
        arrayOf("床", "黄疸", "重度", "轻~中度"),
        arrayOf("特", "肝脾肿大", "显著", "较轻"),
        arrayOf("点", "第1胎受累", "很少", "约半数"),
        arrayOf("", "下一胎更严重", "大多数", "不一定"),
        arrayOf("", "晚期贫血", "可发生", "很少发生")
    )

    private fun provideData2() = mutableListOf(
        arrayOf("实", "母血型", "Rh d、e、c ", "O（多数）"),
        arrayOf("验", "子血型", "Rh D、E、C", "A或B（多数）"),
        arrayOf("室", " 贫血", "显著", "轻"),
        arrayOf("检", "直接法", "阳性", "改良法阳性"),
        arrayOf("查", "抗体释放法", "阳性", "阳性"),
        arrayOf("", "红细胞形态", "有核红细胞增多", "小球形红细胞增多")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
