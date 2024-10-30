package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentCervicalCancerStageFigo2014FmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class CervicalCancerStageFigo2014_fm : BaseFragmentDataBinding<FragmentCervicalCancerStageFigo2014FmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("FIGO分期", "肿瘤表现")
        var medCalDataBean2 = MedCalDataBean("", "原发肿瘤无法评估")
        var medCalDataBean3 = MedCalDataBean("Ⅰ期", "宫颈癌局限在宫颈（扩展至宫体将被忽略）")
        var medCalDataBean4 = MedCalDataBean(" ⅠA", "肉眼未见癌灶，仅在显微镜下可见浸润癌，（浅表浸润的肉眼可见癌灶也为IB期）间质浸润测量范围限制于深度5 mma，宽度7mm")
        var medCalDataBean5 = MedCalDataBean("  ⅠA1", "间质浸润深度≤3 mm，水平扩散≤7mm")
        var medCalDataBean6 = MedCalDataBean("  ⅠA2", "间质浸润深度3～5mm，水平扩散≤7mm")
        var medCalDataBean7 = MedCalDataBean("ⅠB", "肉眼可见癌灶局限于宫颈，或者镜下病灶>ⅠA期")
        var medCalDataBean8 = MedCalDataBean("  ⅠB1", "肉眼可见癌灶最大径线≤4cm")
        var medCalDataBean9 = MedCalDataBean("  ⅠB2", "肉眼可见癌灶最大径线>4cm")
        var medCalDataBean10 = MedCalDataBean("Ⅱ期", "肿瘤超越宫颈，但未达骨盆壁或未达阴道下1/3")
        var medCalDataBean11 = MedCalDataBean("  ⅡA", "癌灶累及阴道上2/3，无明显宫旁浸润")
        var medCalDataBean12 = MedCalDataBean("   ⅡA1", "肉眼可见病灶最大径线≤4cm")
        var medCalDataBean13 = MedCalDataBean("   ⅡA2", "肉眼可见病灶最大径线>4cm")
        var medCalDataBean14 = MedCalDataBean("  ⅡB", "有明显宫旁浸润，但未达盆壁")
        var medCalDataBean15 = MedCalDataBean("Ⅲ期", "癌灶扩展到骨盆壁和（或）累及阴道下1/3和（或）引起肾盂积水或肾无功能")
        var medCalDataBean16 = MedCalDataBean("  ⅢA", "癌灶累及阴道下1/3，没有扩展到骨盆壁")
        var medCalDataBean17 = MedCalDataBean("  ⅢB", "癌灶扩展到骨盆壁和（或）引起肾盂积水或肾无功能")
        var medCalDataBean18 = MedCalDataBean("Ⅳ期", "癌灶扩散超出真骨盆或癌浸润膀胱黏膜或直肠黏膜")
        var medCalDataBean19 = MedCalDataBean("  ⅣA", "癌灶扩散至邻近盆腔脏器")
        var medCalDataBean20 = MedCalDataBean("  ⅣB", "远处转移")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10,
            medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14, medCalDataBean15, medCalDataBean16, medCalDataBean17, medCalDataBean18, medCalDataBean19, medCalDataBean20)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "a: 浸润深度从癌起源的表面上皮或腺体的基底部看是测量不应大于5mm。脉管受累不影响分期。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "FIGO Committee on Gynecologic Oncology. FIGO staging for carcinoma of the vulva, cervix, and corpus uteri. Int J Gynaecol Obstet. 2014;125(2):97-8.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
}