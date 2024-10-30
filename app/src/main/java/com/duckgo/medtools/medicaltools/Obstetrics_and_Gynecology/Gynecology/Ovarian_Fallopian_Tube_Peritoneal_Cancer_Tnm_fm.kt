package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
    override fun getFragmentViewBinding(): FragmentTwoRecycleviewModelFmBinding {
        return FragmentTwoRecycleviewModelFmBinding.inflate(layoutInflater)
    }
    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 33)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("TNM", "FIGO分期", "肿瘤表现")
        var medCalDataBean2 = MedCalDataBean("T1", "I", "肿瘤局限于卵巢或输卵管")
        var medCalDataBean3 = MedCalDataBean("T1a", "IA", "肿瘤局限于一侧卵巢，包膜完整，卵巢表面无肿瘤；腹水或腹腔冲洗液未找到恶性细胞")
        var medCalDataBean4 = MedCalDataBean("T1b", "IB", "肿瘤局限于双侧卵巢，包膜完整，卵巢表面无肿瘤；腹水或腹腔冲洗液未找到恶性细胞")
        var medCalDataBean5 = MedCalDataBean("T1c", "IC", "肿瘤局限于单或双侧卵巢并伴有如下任何一项：包膜破裂；卵巢表面有肿瘤；腹水或腹腔冲洗液有恶性细胞")
        var medCalDataBean6 = MedCalDataBean("T1c", "IC1", "术中手术导致肿瘤破裂")
        var medCalDataBean7 = MedCalDataBean("T1c", "IC2", "术前肿瘤包膜破裂，或者卵巢或输卵管表面出现肿瘤")
        var medCalDataBean8 = MedCalDataBean("T1c", "IC3", "腹水或腹腔冲洗液中出现恶性细胞")
        var medCalDataBean9 = MedCalDataBean("T2", "Ⅱ", "肿瘤累及一侧或双侧卵巢伴有盆腔扩散，或腹膜癌")
        var medCalDataBean10 = MedCalDataBean("T2a", "ⅡA", "扩散和/或种植到子宫和（或）输卵管；腹水或腹腔冲洗液无恶性细胞")
        var medCalDataBean11 = MedCalDataBean("T2b", "ⅡB", "扩散到其他盆腔器官；腹水或腹腔冲洗液无恶性细胞")
        var medCalDataBean12 = MedCalDataBean("T3/N1", "Ⅲ", "肿瘤侵犯一侧或双侧卵巢，并有显微镜证实的盆腔外腹膜转移和/或局部淋巴结转移")
        var medCalDataBean13 = MedCalDataBean("T3a", "ⅢA", "病变大体所见局限于真骨盆，淋巴结阴性，但腹腔腹膜面有镜下种植，或镜下证实己扩展到小肠或肠系膜")
        var medCalDataBean14 = MedCalDataBean("T3a/T3aN1", "ⅢA1", "仅有腹膜后淋巴结阳性（细胞学或组织学确认）")
        var medCalDataBean15 = MedCalDataBean("T3c/T3cN1", "ⅢA2", "骨盆外（骨盆缘之上）累及腹膜的微小转移，伴有或不伴有腹膜后淋巴结阳性")
        var medCalDataBean16 = MedCalDataBean("任何T，任何N", "ⅢB  ", "肉眼盆腔外腹膜转移灶最大径线≤2cm")
        var medCalDataBean17 = MedCalDataBean("M1", "ⅢC", "肉眼盆腔外腹膜转移灶最大径线＞2cm，和（或）区域淋巴结转移")
        var medCalDataBean18 = MedCalDataBean("T3c/T3cN1", "Ⅳ", "超出腹腔外的远处转移")
        var medCalDataBean19 = MedCalDataBean("", "ⅣA", "胸水细胞学阳性")
        var medCalDataBean20 = MedCalDataBean("", "ⅣB", "转移至腹腔外器官（包括腹股沟淋巴结和腹腔外淋巴结)")

        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10,
            medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14, medCalDataBean15, medCalDataBean16, medCalDataBean17, medCalDataBean18, medCalDataBean19, medCalDataBean20)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "1973年FIGO（ 国际妇产科联合会）首次发布卵巢癌、卵管癌和腹膜癌的分期，1988年有过一次修订。本次为第三个版本。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "Mutch DG, Prat J. 2014 FIGO staging for ovarian, fallopian tube and peritoneal cancer. Gynecol Oncol. 2014;133(3):401-4.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }

    override fun initView() {
        binding.tv1.text = "卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM，2014）"
    }
}