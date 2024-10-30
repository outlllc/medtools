package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentCervicalCancerStageFigo2014FmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class CervicalCancerStageFigo2018_fm:BaseFragmentDataBinding<FragmentCervicalCancerStageFigo2014FmBinding>() {
    override fun getFragmentViewBinding(): FragmentCervicalCancerStageFigo2014FmBinding {
        return FragmentCervicalCancerStageFigo2014FmBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 22)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("分期", "描述")
        var medCalDataBean3 = MedCalDataBean("Ⅰ期", "癌灶局限在宫颈（是否扩散至宫体不予考虑")
        var medCalDataBean4 = MedCalDataBean(" ⅠA", "仅在显微镜下可见浸润癌最大浸润深度<5 mm")
        var medCalDataBean5 = MedCalDataBean("  ⅠA1", "间质浸润深度<3 mm")
        var medCalDataBean6 = MedCalDataBean("  ⅠA2", "间质浸润深度>3 mm，5 mm")
        var medCalDataBean7 = MedCalDataBean("ⅠB", "浸润癌浸润深度>5mm（超过ⅠA期），癌仍局限在ⅠB子宫颈")
        var medCalDataBean8 = MedCalDataBean("  ⅠB1", "间质浸润深度>5 mm，病灶最大径线<2 cm")
        var medCalDataBean9 = MedCalDataBean("  ⅠB2", "癌灶最大径线>2 cm，<4 cm")
        var medCalDataBean10 = MedCalDataBean("  ⅠB3", "癌灶最大径线>4 cm")
        var medCalDataBean11 = MedCalDataBean("Ⅱ期", "癌灶超越子宫，但未达阴道下1/3或未达骨盆壁")
        var medCalDataBean12 = MedCalDataBean("  ⅡA", "侵犯上2/3阴道，无宫旁浸润")
        var medCalDataBean13 = MedCalDataBean("   ⅡA1", "癌灶最大径线≤4 cm")
        var medCalDataBean14 = MedCalDataBean("   ⅡA2", "癌灶最大径线>4 cm")
        var medCalDataBean15 = MedCalDataBean("  ⅡB", "有宫旁浸润，未达盆壁")
        var medCalDataBean16 = MedCalDataBean("Ⅲ期", "癌灶累及阴道下1/3和（或）扩展到骨盆壁和（或）引起肾孟积水或肾无功能和（或）累及盆腔和（或）主动脉旁淋巴结3）")
        var medCalDataBean17 = MedCalDataBean("  ⅢA", "癌灶累及阴道下1/3没有扩展到骨盆壁")
        var medCalDataBean18 = MedCalDataBean("  ⅢB", "癌灶扩展到骨盆壁和（或）引起肾孟积水或肾无功能")
        var medCalDataBean19 = MedCalDataBean("  ⅢC", "不论肿瘤大小和扩散程度，累及盆腔和（或）主动脉旁淋巴结[注明r（影像学）或p（病理）证据]3")
        var medCalDataBean20 = MedCalDataBean("   ⅢC1", "仅累及盆腔淋巴结")
        var medCalDataBean21 = MedCalDataBean("   ⅢC2", "主动脉旁淋巴结转移")
        var medCalDataBean22 = MedCalDataBean("Ⅳ期", "肿瘤侵犯膀胱黏膜或直肠黏膜（活检证实）和（或）超出真骨盆（泡状水肿不分为Ⅳ期）")
        var medCalDataBean23 = MedCalDataBean("  ⅣA", "转移至邻近器官")
        var medCalDataBean24 = MedCalDataBean("  ⅣB", "转移到远处器官")
        data = listOf(medCalDataBean1, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10,
            medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14, medCalDataBean15, medCalDataBean16, medCalDataBean17, medCalDataBean18, medCalDataBean19, medCalDataBean20,
            medCalDataBean21, medCalDataBean22, medCalDataBean23, medCalDataBean24)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "如分期存在争议，应归于更早的期别；1)可利用影像学和病理学结果对临床检查的肿瘤大小和扩展程度进行补充用于分期；2)淋巴脉管间隙(LVSI)浸润不改变分期，不再考虑病灶浸润宽度；3)需注明ⅢC期的影像和病理发现，例如：影像学发现盆腔淋巴结转移，则分期为ⅢC1r，假如是病理学发现的，则分期为ⅢC1p，需记录影像和病理技术的类型。 ")
        var medCalDataBean2 = MedCalDataBean("参考来源", "2018年FIGO癌症分期指南")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
}