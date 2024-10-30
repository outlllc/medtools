package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Fallopian_Tube_Cancer_surgery_pathological_staging_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("0期", "原位癌（浸润前癌）")
        var medCalDataBean2 = MedCalDataBean("Ⅰ期", "肿瘤局限于输卵管")
        var medCalDataBean3 = MedCalDataBean("  ⅠA", "肿瘤局限于一侧输卵管，未穿透浆膜层；无腹水")
        var medCalDataBean4 = MedCalDataBean("  ⅠB", "肿瘤局限于双侧输卵管，未穿透浆膜层；无腹水")
        var medCalDataBean5 = MedCalDataBean("  ⅠC", "肿瘤局限于一侧或双侧输卵管，达到或穿透输卵管浆膜层，或在腹水或腹腔冲洗液中发现癌细胞")
        var medCalDataBean6 = MedCalDataBean("Ⅱ期", "肿瘤累及一侧或双侧输卵管，伴有盆腔内扩散")
        var medCalDataBean7 = MedCalDataBean("  ⅡA", "扩散和/或转移到子宫和/或卵巢")
        var medCalDataBean8 = MedCalDataBean("  ⅡB", "扩散到盆腔其他组织")
        var medCalDataBean9 = MedCalDataBean("  ⅡC", "盆腔内扩散（ⅡA或ⅡB）伴腹水或腹腔洗液找到癌细胞")
        var medCalDataBean10 = MedCalDataBean("Ⅲ期", "累及一侧或双侧输卵管，伴盆腔外的腹腔内种植和/或区域淋巴结阳性")
        var medCalDataBean11 = MedCalDataBean("  ⅢA", "显微镜下的盆腔外腹膜转移")
        var medCalDataBean12 = MedCalDataBean("  ⅢB", "肉眼见盆腔外腹膜转移灶，最大直径≤2cm")
        var medCalDataBean13 = MedCalDataBean("  ⅢC", "盆腔外腹膜转移的最大直径＞2cm，和/或腹膜后或腹股沟淋巴结阳性")
        var medCalDataBean14 = MedCalDataBean("Ⅳ期", "远处转移（不包括腹膜转移）")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6,
            medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "输卵管癌手术-病理分期（FIGO, 2000）"
    }
}