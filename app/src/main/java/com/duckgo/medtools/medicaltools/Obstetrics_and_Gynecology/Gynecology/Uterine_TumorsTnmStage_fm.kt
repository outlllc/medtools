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

class Uterine_TumorsTnmStage_fm : BaseFragmentDataBinding<FragmentCervicalCancerTNMStageFmBinding>() {
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
        var medCalDataBean5 = MedCalDataBean("T1", "Ⅰ", "局限于子宫体")
        var medCalDataBean6 = MedCalDataBean("T1a", "ⅠA", "局限于子宫内膜或不到子宫肌层的1/2")
        var medCalDataBean7 = MedCalDataBean("T1b", "ⅠB", "达到或超过子宫肌层的1/2")
        var medCalDataBean8 = MedCalDataBean("T2", "Ⅱ", "侵及宫颈间质结缔组织，但未超出子宫")
        var medCalDataBean9 = MedCalDataBean("T3a", "ⅢA", "侵及浆膜和/或附件（直接浸润或转移）")
        var medCalDataBean10 = MedCalDataBean("T3b", "ⅢB", "迁及阴道（直接浸润或转移）")
        var medCalDataBean11 = MedCalDataBean("T4", "ⅣA", "侵及膀胱和/或肠粘膜")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8, medCalDataBean9,
            medCalDataBean10, medCalDataBean11)
        return data
    }
    fun initData2(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM分期", "FIGO分期", " ")
        var medCalDataBean2 = MedCalDataBean("Nx", " ", "区域淋巴结无法评估")
        var medCalDataBean3 = MedCalDataBean("N0", " ", "无区域淋巴结转移")
        var medCalDataBean4 = MedCalDataBean("N1", "ⅢC1", "转移至盆腔淋巴结")
        var medCalDataBean5 = MedCalDataBean("N2", "ⅢC2", "转移至主动脉旁淋巴结，有或无盆腔淋巴结转移")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5)
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
        var medCalDataBean5 = MedCalDataBean("ⅠB", "T1b", "N0", "M0")
        var medCalDataBean6 = MedCalDataBean("Ⅱ", "T2", "N0", "M0")
        var medCalDataBean7 = MedCalDataBean("Ⅲ", "T3", "N0", "M0")
        var medCalDataBean8 = MedCalDataBean("ⅢA", "T3a", "N0", "M0")
        var medCalDataBean9 = MedCalDataBean("ⅢB", "T3b", "N0", "M0")
        var medCalDataBean10 = MedCalDataBean("ⅢC1", "T1-T3", "N1", "M0")
        var medCalDataBean11 = MedCalDataBean("ⅢC2", "T1-T3", "N2", "M0")
        var medCalDataBean12 = MedCalDataBean("ⅣA", "T4", "any N", "M0")
        var medCalDataBean13 = MedCalDataBean("ⅣB", "any T", "any N", "M1")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8,
            medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12, medCalDataBean13)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "第七版AJCC癌症分期手册A Companion to the Seventh Editions of the AJCC Cancer Staging Manual and Handbook（2012）.")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
}