package com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Semen_reference_values_fm : BaseMedListFragment() {

    override fun getTitle() = "精液常规检查参考值"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "30"),
            MedCalAdapterDatabean(listOf(MedCalDataBean("其他统计数据")), 10),
            MedCalListAdapter(provideData2(), "30"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData(): MutableList<Array<String>> = mutableListOf(
        arrayOf("参考值项目", "参考值下限", "第四版相关参数"),
        arrayOf("量", "1.5 ml(1.4-1.7 ml)", "≥2.0 ml"),
        arrayOf("总精子数", " 39×106（33-46）/一次射精", "≥40×106 /一次射精"),
        arrayOf("精子密度", "15×106（12-16）/ml", "≥20×106/ml"),
        arrayOf("总活力(PR+NP)", "40%（38-42%）", "a+b≥50%或a≥25%"),
        arrayOf("快速前向运动(PR)", "32%（31-34%）", "-"),
        arrayOf("存活率(活精子)", "58%（55-63%）", "≥50%"),
        arrayOf("形态(正常形态)", "4%（3-4%）", "≥15%")
    )

    private fun provideData2(): MutableList<Array<String>> = mutableListOf(
        arrayOf(" ", "参考值", "备注"),
        arrayOf("PH", "≥7.2", ""),
        arrayOf("圆形细胞", "≤5×106/ml", ""),
        arrayOf("白细胞", "<1.0×106/ml", "过氧化物酶染色阳性"),
        arrayOf("MAR试验", "<50%", "与颗粒结合的活动精子"),
        arrayOf("免疫珠试验", "<50%", "与免疫珠结合的活动精子"),
        arrayOf("精浆锌", "≥2.4μmol/一次射精", ""),
        arrayOf("精浆果糖", "≥13μmol/一次射精", ""),
        arrayOf("精浆中性葡萄糖苷酶", "≥20mU/一次射精", "")
    )

    private fun provideAppendix(): MutableList<Array<String>> = mutableListOf(
        arrayOf("结果解读", "根据精液常规检查的结果，如精子密度少于20×10^6/ml，称少精子症；精液中无精子，称无精子症；前向运动(a+b)少于50%，或快速前向运动(a)少于25%，称弱精子症。\n精液收集：禁欲3~7天，手淫法取样，立即送检。"),
        arrayOf("结果分析说明", "一次检查结果不一定准确，应间隔1~2周、重复检查2~3次。"),
        arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
