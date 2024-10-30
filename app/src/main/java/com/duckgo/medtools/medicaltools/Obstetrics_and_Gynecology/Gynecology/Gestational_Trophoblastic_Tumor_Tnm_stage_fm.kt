package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentCervicalCancerTNMStageFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Gestational_Trophoblastic_Tumor_Tnm_stage_fm:BaseFragmentDataBinding<FragmentCervicalCancerTNMStageFmBinding>() {
    override fun getFragmentViewBinding(): FragmentCervicalCancerTNMStageFmBinding {
        return FragmentCervicalCancerTNMStageFmBinding.inflate(layoutInflater)
    }
    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 33)
        binding.rv2.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv2.adapter = MedCalAdapterDatabean(initData2(), 10)
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
        var medCalDataBean4 = MedCalDataBean("T1", "Ⅰ", "局限于子宫")
        var medCalDataBean5 = MedCalDataBean("T2", "Ⅱ", "直接浸润或转移至其它生殖结构（卵巢、输卵管、阴道、阔韧带）")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5)
        return data
    }
    fun initData2(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean( "无指定的区域淋巴结，淋巴结转移一律分为M1")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1)
        return data

    }

    fun initData3(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM分期", "FIGO分期", " ")
        var medCalDataBean2 = MedCalDataBean("M0", "", "无远处转移")
        var medCalDataBean3 = MedCalDataBean("M1", "", "远处转移")
        var medCalDataBean4 = MedCalDataBean("M1a", "Ⅲ", "转移至肺")
        var medCalDataBean5 = MedCalDataBean("M1b", "Ⅳ", "其它远处转移")

        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5)
        return data
    }
    fun initData4(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("Stage", "T", "M", "危险因素")
        var medCalDataBean2 = MedCalDataBean("Ⅰ", "T1", "M0", "不详")
        var medCalDataBean3 = MedCalDataBean("ⅠA", "T1", "M0", "低危")
        var medCalDataBean4 = MedCalDataBean("ⅠB", "T1", "M0", "高危")
        var medCalDataBean5 = MedCalDataBean("Ⅱ", "T2", "M0", "不详")
        var medCalDataBean6 = MedCalDataBean("ⅡA", "T2", "M0", "低危")
        var medCalDataBean7 = MedCalDataBean("ⅡB", "T2", "M0", "高危")
        var medCalDataBean8 = MedCalDataBean("Ⅲ", "any T", "M1a", "不详")
        var medCalDataBean9 = MedCalDataBean("ⅢA", "any T", "M1a", "低危")
        var medCalDataBean10 = MedCalDataBean("ⅢB", "any T", "M1a", "高危")
        var medCalDataBean11 = MedCalDataBean("Ⅳ", "any T", "M1b", "不详")
        var medCalDataBean12 = MedCalDataBean("ⅣA", "any T", "M1b", "低危")
        var medCalDataBean13 = MedCalDataBean("ⅣB", "any T", "M1b", "高危")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6,
            medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12, medCalDataBean13)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "第七版AJCC癌症分期手册A Companion to the Seventh Editions of the AJCC Cancer Staging Manual and Handbook（2012）.")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
}