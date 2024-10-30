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

class OvarianCancerTnmStage_fm : BaseFragmentDataBinding<FragmentCervicalCancerTNMStageFmBinding>() {
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
        var medCalDataBean4 = MedCalDataBean("T1", "Ⅰ", "局限于卵巢（单侧或双侧）")
        var medCalDataBean5 = MedCalDataBean("T1a", "ⅠA", "局限于一侧卵巢，包膜完整，卵巢表面无肿瘤，腹水或腹腔冲洗液中无恶性细胞")
        var medCalDataBean6 = MedCalDataBean("T1b", "ⅠB", "局限于两侧卵巢，包膜完整，卵巢表面无肿瘤，腹水或腹腔冲洗液中无恶性细胞")
        var medCalDataBean7 = MedCalDataBean("T1c", "ⅠC", "肿瘤局限于一侧或两侧卵巢，有下列特征之一：包膜破裂；卵巢表面有肿瘤；腹水或腹腔冲洗液中有恶性细胞")
        var medCalDataBean8 = MedCalDataBean("T2", "Ⅱ", "一侧或两侧卵巢，有盆腔浸润和/或种植")
        var medCalDataBean9 = MedCalDataBean("T2a", "ⅡA", "直接浸润和/或种植到子宫和/或输卵管，腹水或腹腔冲洗液中无恶性细胞")
        var medCalDataBean10 = MedCalDataBean("T2b", "ⅡB", "直接浸润和/或种植到盆腔其它组织，腹水或腹腔冲洗液中无恶性细胞")
        var medCalDataBean11 = MedCalDataBean("T2c", "ⅡC", "T2a或T2b，腹水或腹腔冲洗液中有恶性细胞")
        var medCalDataBean12 = MedCalDataBean("T3", "Ⅲ", "一侧或两侧卵巢，伴镜下证实的盆腔以外的腹腔转移")
        var medCalDataBean13 = MedCalDataBean("T3a", "ⅢA", "镜下可见的盆腔外腹腔转移")
        var medCalDataBean14 = MedCalDataBean("T3b", "ⅢB", "肉眼可见的盆腔外腹腔转移，最大径小于或等于2cm")
        var medCalDataBean15 = MedCalDataBean("T3c", "ⅢC", "盆腔外腹腔转移，最大径大于2cm，和/或区域淋巴结转移")

        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8, medCalDataBean9,
            medCalDataBean10, medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14, medCalDataBean15)
        return data
    }
    fun initData2(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM分期", "FIGO分期", " ")
        var medCalDataBean2 = MedCalDataBean("Nx", " ", "区域淋巴结无法评估")
        var medCalDataBean3 = MedCalDataBean("N0", " ", "无区域淋巴结转移")
        var medCalDataBean4 = MedCalDataBean("N1", "ⅢC", "区域淋巴结转移")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4)
        return data

    }

    fun initData3(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM分期", "FIGO分期", " ")
        var medCalDataBean2 = MedCalDataBean("M0", "", "无远处转移")
        var medCalDataBean3 = MedCalDataBean("M1", "Ⅳ", "远处转移")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3)
        return data
    }
    fun initData4(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("Stage", "T", "N", "M")
        var medCalDataBean3 = MedCalDataBean("Ⅰ", "T1", "N0", "M0")
        var medCalDataBean4 = MedCalDataBean(" ⅠA", "T1a", "N0", "M0")
        var medCalDataBean5 = MedCalDataBean(" ⅠB", "Tb", "N0", "M0")
        var medCalDataBean6 = MedCalDataBean(" ⅠC", "Tc", "N0", "M0")
        var medCalDataBean7 = MedCalDataBean("Ⅱ", "T2", "N0", "M0")
        var medCalDataBean8 = MedCalDataBean(" ⅡA", "T2a", "N0", "M0")
        var medCalDataBean9 = MedCalDataBean(" ⅡB", "T2b", "N0", "M0")
        var medCalDataBean10 = MedCalDataBean(" ⅡC", "T2c", "N0", "M0")
        var medCalDataBean11 = MedCalDataBean("Ⅲ", "T3", "N0", "M0")
        var medCalDataBean12 = MedCalDataBean(" ⅢA", "T3a", "N0", "M0")
        var medCalDataBean13 = MedCalDataBean(" ⅢB", "T3b", "N0", "M0")
        var medCalDataBean14 = MedCalDataBean(" ⅢC", "T3c", "N0", "M0")
        var medCalDataBean15 = MedCalDataBean(" ⅢC", "any T", "N1", "M0")
        var medCalDataBean16 = MedCalDataBean("Ⅳ", "any T", "any N", "M1")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1,  medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8,
            medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14, medCalDataBean15, medCalDataBean16)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "第七版AJCC癌症分期手册 A Companion to the Seventh Editions of the AJCC Cancer Staging Manual and Handbook（2012）.")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
}