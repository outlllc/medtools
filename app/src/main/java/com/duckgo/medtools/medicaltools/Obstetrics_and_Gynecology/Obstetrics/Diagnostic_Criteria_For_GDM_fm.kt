package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Diagnostic_Criteria_For_GDM_fm : BaseMedListFragment() {
    override fun getTitle() = "妊娠期糖尿病诊断标准（75g OGTT）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "40"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("抽血时间", "空腹(FPG)", "1h", "2h"),
        arrayOf("血糖标准 mmol/L(mg/dl)", "5.1(92)", "10.0(180)", "8.5(153)")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("结果解读", "依据2014年妊娠合并糖尿病诊治指南：75g OGTT结果的3项中任何1项值达到或超过标准即可诊断GDM。"),
        arrayOf("参考来源", "中华医学会内分泌学分会. 妊娠期糖尿病诊治指南. 2014年")
    )
}
