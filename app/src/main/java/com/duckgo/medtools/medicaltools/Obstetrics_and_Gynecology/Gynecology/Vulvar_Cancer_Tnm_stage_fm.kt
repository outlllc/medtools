package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentCervicalCancerTNMStageFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vulvar_Cancer_Tnm_stage_fm:BaseFragmentDataBinding<FragmentCervicalCancerTNMStageFmBinding>() {
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
        var medCalDataBean5 = MedCalDataBean("T1a", "ⅠA", "病灶小于或等于2cm，局限于外阴或会阴部，且间质浸润小于或等于1.0mm")
        var medCalDataBean6 = MedCalDataBean("T1b", "ⅠB", "病灶大于2cm，或不论大小间质浸润大于1.0mm，局限于外阴或会阴部")
        var medCalDataBean7 = MedCalDataBean("T2", "Ⅱ", "不论大小，侵及会阴邻近的结构（尿道远端1/3，阴道远端1/3，或肛管)")
        var medCalDataBean8 = MedCalDataBean("T3", "ⅣA", "不论大小，侵及以下任一结构：尿道近端2/3；阴道近端2/3；膀胱粘膜；直肠粘膜；或固定于盆骨")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8)
        return data
    }
    fun initData2(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM分期", "FIGO分期", " ")
        var medCalDataBean2 = MedCalDataBean("Nx", " ", "区域淋巴结无法评估")
        var medCalDataBean3 = MedCalDataBean("N0", " ", "无区域淋巴结转移")
        var medCalDataBean4 = MedCalDataBean("N1", "", "1-2个区域淋巴结，且具有下列特征：")
        var medCalDataBean5 = MedCalDataBean("N1a", "ⅢA", "1-2个区域淋巴结，都小于或等于5mm")
        var medCalDataBean6 = MedCalDataBean("N1b", "ⅢA", "单个淋巴结，大于5mm")
        var medCalDataBean7 = MedCalDataBean("N2", "ⅢB", "区域淋巴结转移，伴以下特征：")
        var medCalDataBean8 = MedCalDataBean("N2a", "ⅢB", "3个或更多淋巴结转移，均小于5mm")
        var medCalDataBean9 = MedCalDataBean("N2b", "ⅢB", "2个或更多淋巴结转移，5mm或更大")
        var medCalDataBean10 = MedCalDataBean("N2c", "ⅢC", "淋巴结转移伴包膜外浸润")
        var medCalDataBean11 = MedCalDataBean("N3", "ⅣA", "转移淋巴结固定或溃疡")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6,
            medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10, medCalDataBean11)
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
        var medCalDataBean5 = MedCalDataBean("ⅠB ", "T1b", "N0", "M0")
        var medCalDataBean6 = MedCalDataBean("Ⅱ", "T2", "N0", "M0")
        var medCalDataBean7 = MedCalDataBean("ⅢA", "T1,T2", "N1a,N1b", "M0")
        var medCalDataBean8 = MedCalDataBean("ⅢB", "T1,T2", "N2a,N2b", "M0")
        var medCalDataBean9 = MedCalDataBean("ⅢC", "T1,T2", "N2c", "M0")
        var medCalDataBean10 = MedCalDataBean("ⅣA", "T1,T2", "N3", "M0")
        var medCalDataBean11 = MedCalDataBean("ⅣA", "T3", "any N", "M0")
        var medCalDataBean12 = MedCalDataBean("ⅣB", "any T", "any N", "M1")
        var data: List<MedCalDataBean> = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8,
            medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "第七版AJCC癌症分期手册A Companion to the Seventh Editions of the AJCC Cancer Staging Manual and Handbook（2012）.")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }

}