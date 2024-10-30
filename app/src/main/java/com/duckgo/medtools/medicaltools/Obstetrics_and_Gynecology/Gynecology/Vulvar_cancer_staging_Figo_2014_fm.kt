package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vulvar_cancer_staging_Figo_2014_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("FIGO", "癌肿累及范围")
        var medCalDataBean2 = MedCalDataBean("Ⅰ期", "肿瘤局限于外阴")
        var medCalDataBean3 = MedCalDataBean("  ⅠA期", "局限于外阴或外阴和会阴，肿瘤最大直径≤2cm，伴间质浸润≤1mma，无淋巴结转移")
        var medCalDataBean4 = MedCalDataBean("  ⅠB期", "肿瘤局限于外阴或外阴和会阴，肿瘤最大直径＞2cm或伴间质浸润＞1mm [a]，无淋巴结转移")
        var medCalDataBean5 = MedCalDataBean("Ⅱ期", "肿瘤有或无侵犯下列任何部位：下1/3尿道、下1/3阴道、肛门，但无淋巴结转移")
        var medCalDataBean6 = MedCalDataBean("Ⅲ期", "肿瘤有或无侵犯下列任何部位：下1/3尿道、下1/3阴道、肛门，有腹股沟-股淋巴结转移")
        var medCalDataBean7 = MedCalDataBean("  ⅢA期", "(1)1个淋巴结转移(≥5mm)\n(2)1-2个淋巴结转移(<5mm)")
        var medCalDataBean8 = MedCalDataBean("  ⅢB期", "(1)2个或以上淋巴结转移(≥5mm)\n(2)3个或以上淋巴结转移(<5mm)")
        var medCalDataBean9 = MedCalDataBean("ⅢC期", "淋巴结阳性伴淋巴结包膜外转移")
        var medCalDataBean10 = MedCalDataBean("Ⅳ期", "肿瘤侵犯其他区域（上2/3尿道，上2/3阴道）或远处转移")
        var medCalDataBean11 = MedCalDataBean("Ⅳa期", "肿瘤累及下列部位\n(1)上尿道和（或）阴道黏膜，膀胱黏膜，直肠黏膜，或达盆壁\n" +
                "(2)腹股沟-股淋巴结固定或溃疡形成")
        var medCalDataBean12 = MedCalDataBean("Ⅳb期", "任何远处转移，包括盆腔淋巴结转移")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6,
            medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "a: 浸润深度指肿瘤邻近最表浅真皮乳头的表皮-间质连接处至浸润最深处。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "FIGO Committee on Gynecologic Oncology. FIGO staging for carcinoma of the vulva, cervix, and corpus uteri. Int J Gynaecol Obstet. 2014;125(2):97-8.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "外阴癌分期（FIGO，2014）"
    }
}