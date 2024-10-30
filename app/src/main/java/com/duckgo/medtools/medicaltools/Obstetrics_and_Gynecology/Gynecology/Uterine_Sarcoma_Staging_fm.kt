package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Uterine_Sarcoma_Staging_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
    override fun getFragmentViewBinding(): FragmentTwoRecycleviewModelFmBinding {
        return FragmentTwoRecycleviewModelFmBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 22)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("  ", "(1)子宫平滑肌肉瘤FIGO分期")
        var medCalDataBean2 = MedCalDataBean("Ⅰ期", "肿瘤局限于子宫")
        var medCalDataBean3 = MedCalDataBean("ⅠA", "＜5cm")
        var medCalDataBean4 = MedCalDataBean("ⅠB", "＞5cm")
        var medCalDataBean5 = MedCalDataBean("Ⅱ期", "肿瘤扩散到盆腔")
        var medCalDataBean6 = MedCalDataBean("ⅡA", "附件受累")
        var medCalDataBean7 = MedCalDataBean("ⅡB", "扩散到其他盆腔组织")
        var medCalDataBean8 = MedCalDataBean("Ⅲ期", "肿瘤扩散到腹腔")
        var medCalDataBean9 = MedCalDataBean("ⅢA", "1处")
        var medCalDataBean10 = MedCalDataBean("ⅢB", "1处以上")
        var medCalDataBean11 = MedCalDataBean("ⅢC", "盆腔或腹主动脉旁淋巴结转移")
        var medCalDataBean12 = MedCalDataBean("Ⅳ期", "膀胱和（或）直肠转移，和（或）远隔转移")
        var medCalDataBean13 = MedCalDataBean("ⅣA", "膀胱和（或）直肠转移")
        var medCalDataBean14 = MedCalDataBean("ⅣB", "远隔转移")
        var medCalDataBean15 = MedCalDataBean(" ", " ")
        var medCalDataBean16 = MedCalDataBean(" ", "(2)子宫内膜间质肉瘤和腺肉瘤FIGO分期")
        var medCalDataBean17 = MedCalDataBean("Ⅰ期", "肿瘤局限于子宫")
        var medCalDataBean18 = MedCalDataBean("ⅠA", "肿瘤局限在内膜或宫颈管，无肌层浸润")
        var medCalDataBean19 = MedCalDataBean("ⅠB", "≤1/2肌层浸润")
        var medCalDataBean20 = MedCalDataBean("ⅠC", "＞1/2肌层浸润")
        var medCalDataBean21 = MedCalDataBean("Ⅱ期", "同平滑肌肉瘤")
        var medCalDataBean22 = MedCalDataBean("Ⅲ期", "同平滑肌肉瘤")
        var medCalDataBean23 = MedCalDataBean("Ⅳ期 ", "同平滑肌肉瘤")
        var medCalDataBean24 = MedCalDataBean(" ", " ")
        var medCalDataBean25 = MedCalDataBean(" ", "(3)癌肉瘤（恶性混合性苗勒氏管肿瘤MMMT）FIGO分期")
        var medCalDataBean26 = MedCalDataBean("", "按照子宫内膜癌分期")

        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6,
            medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12,
            medCalDataBean13, medCalDataBean14, medCalDataBean15, medCalDataBean16, medCalDataBean17,
            medCalDataBean18, medCalDataBean19, medCalDataBean20, medCalDataBean21, medCalDataBean22, medCalDataBean23, medCalDataBean24,
            medCalDataBean25, medCalDataBean26)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "子宫肉瘤分期（FIGO, 2009）"
    }
}