package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Emergency_Contraceptive_Pill_Dosage_fm : BaseMedListFragment() {
    override fun getTitle() = "紧急避孕药物剂量与方案"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 60),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("名称", "成分", "含量（mg）", "每次片数", "服用次数", "给药时间"),
        MedCalDataBean("左炔诺孕酮片", "LNG", "0.75", "1", "2", "无保护性交后72小时内首剂，12小时后重复1次"),
        MedCalDataBean("复方左旋18甲短效避孕药", "LNG\n\nEE", "0.015\n\n0.03", "4", "2", "同上"),
        MedCalDataBean("速效探亲片", "炔诺孕酮或LNG", "3\n1.5", "1/2", "2", "同上"),
        MedCalDataBean("米非司酮片", "米非司酮", "25\n\n10", "1\n\n1", "1\n\n1", "无保护性交后120小时内\n同上")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "紧急避孕药(morning-after pill )：有甾体激素类和非甾体激素类。一般应在无保护性生活后3~5日内口服紧急避孕药。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
