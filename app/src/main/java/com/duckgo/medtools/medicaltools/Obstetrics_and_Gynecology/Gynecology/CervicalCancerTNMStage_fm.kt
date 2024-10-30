package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragment
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentCervicalCancerTNMStageFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class CervicalCancerTNMStage_fm : BaseFragmentDataBinding<FragmentCervicalCancerTNMStageFmBinding>() {
    override fun getFragmentViewBinding(): FragmentCervicalCancerTNMStageFmBinding {
        return FragmentCervicalCancerTNMStageFmBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 33)
        binding.rv2.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv2.adapter = MedCalAdapterDatabean(initData2(), 30)
        binding.rv3.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv3.adapter = MedCalAdapterDatabean(initData3(), 30)
        binding.rv4.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv4.adapter = MedCalAdapterDatabean(initData4(), 40)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM分期", "FIGO分期 ", "  ")
        var medCalDataBean2 = MedCalDataBean("Tx", " ", "原发肿瘤无法评估")
        var medCalDataBean3 = MedCalDataBean("T0", " ", "无原发肿瘤的证据")
        var medCalDataBean4 = MedCalDataBean("Tis", " ", "原位癌")
        var medCalDataBean5 = MedCalDataBean("T1", "Ⅰ", "宫颈癌局限于子宫颈")
        var medCalDataBean6 = MedCalDataBean("T1a", "ⅠA", "仅镜下诊断为浸润癌，间质浸润深度不超过5mm，宽度不超过7mm")
        var medCalDataBean7 = MedCalDataBean("T1a1", "ⅠA1", "间质浸润深度不超过3mm，宽度不超过7mm")
        var medCalDataBean8 = MedCalDataBean("T1a2", "ⅠA2", "间质浸润深度超过3mm，但不超过5mm，宽度不超过7mm")
        var medCalDataBean9 = MedCalDataBean("T1b", "ⅠB", "临床可见的病灶局限于子宫颈或镜下病变超过T1a")
        var medCalDataBean10 = MedCalDataBean("T1b1", "ⅠB1", "临床可见的病灶小于或等于4cm")
        var medCalDataBean11 = MedCalDataBean("T1b2", "ⅠB2", "临床可见的病灶大于4cm")
        var medCalDataBean12 = MedCalDataBean("T2", "Ⅱ", "浸润范围超过子宫颈，但未及盆壁或阴道下1/3")
        var medCalDataBean13 = MedCalDataBean("T2a", "ⅡA", "无宫旁浸润")
        var medCalDataBean14 = MedCalDataBean("T2a1", "ⅡA1", "临床可见的病灶小于或等于4cm")
        var medCalDataBean15 = MedCalDataBean("T2a2", "ⅡA2", "临床可见的病灶大于4cm")
        var medCalDataBean16 = MedCalDataBean("T2b", "ⅡB", "有宫旁浸润")
        var medCalDataBean17 = MedCalDataBean("T3", "Ⅲ", "侵及盆壁和/或下1/3阴道，和/或导致肾积水或无功能肾")
        var medCalDataBean18 = MedCalDataBean("T3a", "ⅢA", "侵及下1/3阴道，未到达盆壁")
        var medCalDataBean19 = MedCalDataBean("T3b", "ⅢB", "到达盆壁或引起肾积水或无功能肾")
        var medCalDataBean20 = MedCalDataBean("T4", "ⅣA", "侵及膀胱或直肠粘膜，和/或超出真骨盆")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8, medCalDataBean9,
            medCalDataBean10, medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14, medCalDataBean15, medCalDataBean16, medCalDataBean17,
            medCalDataBean18, medCalDataBean19, medCalDataBean20)
        return data
    }
    fun initData2(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM分期", "FIGO分期", " ")
        var medCalDataBean2 = MedCalDataBean("Nx", " ", "区域淋巴结无法评估")
        var medCalDataBean3 = MedCalDataBean("N0", " ", "无区域淋巴结转移")
        var medCalDataBean4 = MedCalDataBean("N1", "ⅢB", "区域淋巴结转移")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4)
        return data

    }

    fun initData3(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM分期", "FIGO分期", " ")
        var medCalDataBean2 = MedCalDataBean("M0", "", "无远处转移")
        var medCalDataBean3 = MedCalDataBean("M1", "ⅣB", "远处转移")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3)
        return data
    }
    fun initData4(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("Stage", "T", "N", "M")
        var medCalDataBean2 = MedCalDataBean("0", "Tis", "N0", "M0")
        var medCalDataBean3 = MedCalDataBean("Ⅰ", "T1", "N0", "M0")
        var medCalDataBean4 = MedCalDataBean("ⅠA", "T1a", "N0", "M0")
        var medCalDataBean5 = MedCalDataBean("ⅠA1", "T1a1", "N0", "M0")
        var medCalDataBean6 = MedCalDataBean("ⅠA2", "T1a2", "N0", "M0")
        var medCalDataBean7 = MedCalDataBean("ⅠB", "T1b", "N0", "M0")
        var medCalDataBean8 = MedCalDataBean("ⅠB1", "T1b1", "N0", "M0")
        var medCalDataBean9 = MedCalDataBean("ⅠB2", "T1b2", "N0", "M0")
        var medCalDataBean10 = MedCalDataBean("Ⅱ", "T2", "N0", "M0")
        var medCalDataBean11 = MedCalDataBean("ⅡA", "T2a", "N0", "M0")
        var medCalDataBean12 = MedCalDataBean("ⅡA1", "T2a1", "N0", "M0")
        var medCalDataBean13 = MedCalDataBean("ⅡA2", "T2a2", "N0", "M0")
        var medCalDataBean14 = MedCalDataBean("ⅡB", "T2b", "N0", "M0")
        var medCalDataBean15 = MedCalDataBean("Ⅲ", "T3", "N0", "M0")
        var medCalDataBean16 = MedCalDataBean("ⅢA", "T3a", "N0", "M0")
        var medCalDataBean17 = MedCalDataBean("ⅢB", "T3b", "any N", "M0")
        var medCalDataBean18 = MedCalDataBean("ⅢB", "T1-3", "N1", "M0")
        var medCalDataBean19 = MedCalDataBean("ⅣA", "T4", "any N", "M0")
        var medCalDataBean20 = MedCalDataBean("ⅣB", "any T", "any N", "M1")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8,
            medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14, medCalDataBean15, medCalDataBean16,
            medCalDataBean17, medCalDataBean18, medCalDataBean19, medCalDataBean20)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "第七版AJCC癌症分期手册A Companion to the Seventh Editions of the AJCC Cancer Staging Manual and Handbook（2012）.")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
}