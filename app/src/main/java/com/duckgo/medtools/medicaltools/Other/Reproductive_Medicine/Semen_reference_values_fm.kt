package com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Semen_reference_values_fm : BaseMedListFragment() {

    override fun getTitle() = "精液常规检查参考值"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData(), floatArrayOf(1f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(listOf(MedCalDataBean("其他统计数据"))),
            MedCalAdapterDatabean(provideData2(), floatArrayOf(1f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), floatArrayOf(1f, 3f))
        )
    }

    private fun provideData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("参考值项目", "参考值下限", "第四版相关参数"),
        MedCalDataBean("量", "1.5 ml(1.4-1.7 ml)", "≥2.0 ml"),
        MedCalDataBean("总精子数", "39×10^6（33-46）/一次射精", "≥40×10^6 /一次射精"),
        MedCalDataBean("精子密度", "15×10^6（12-16）/ml", "≥20×10^6/ml"),
        MedCalDataBean("总活力(PR+NP)", "40%（38-42%）", "a+b≥50%或a≥25%"),
        MedCalDataBean("快速前向运动(PR)", "32%", "(31-34%)"),
        MedCalDataBean("存活率(活精子)", "58%（55-63%）", "≥50%"),
        MedCalDataBean("形态(正常形态)", "4%（3-4%）", "≥15%")
    )

    private fun provideData2(): List<MedCalDataBean> = listOf(
        MedCalDataBean(" ", "参考值下限", "第四版相关参数"),
        MedCalDataBean("PH", "≥7.2", "≥7.2"),
        MedCalDataBean("圆形细胞", "≤5×10^6/ml", "≤5×10^6/ml"),
        MedCalDataBean("白细胞(过氧化物酶染色阳性)", "<1.0×10^6/ml", "<1.0×10^6/ml"),
        MedCalDataBean("MAR试验(与颗粒结合的活动精子)", "<50%", ""),
        MedCalDataBean("免疫珠试验(与免疫珠结合的活动精子)", "<50%", ""),
        MedCalDataBean("精浆锌", "≥2.4μmol/一次射精", ""),
        MedCalDataBean("精浆果糖", "≥13μmol/一次射精", ""),
        MedCalDataBean("精浆中性葡萄糖苷酶", "≥20mU/一次射精", "")
    )

    private fun provideAppendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("结果解读", "根据精液常规检查的结果，如精子密度少于20×10^6/ml，称少精子症；精液中无精子，称无精子症；前向运动(a+b)少于50%，或快速前向运动(a)少于25%，称弱精子症。\n精液收集：禁欲3~7天，手淫法取样，立即送检。"),
        MedCalDataBean("结果分析说明", "一次检查结果不一定准确，应间隔1~2周、重复检查2~3次。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
