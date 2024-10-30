package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Endometrial_cancer_staging_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
    override fun getFragmentViewBinding(): FragmentTwoRecycleviewModelFmBinding {
        return FragmentTwoRecycleviewModelFmBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 20)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("分期", "肿瘤范围")
        var medCalDataBean2 = MedCalDataBean("Ia", "肿瘤局限于子宫体")
        var medCalDataBean3 = MedCalDataBean("  IAa", "肿瘤浸润深度<1/2肌层")
        var medCalDataBean4 = MedCalDataBean("  IBa", "肿瘤浸润深度>1/2肌层")
        var medCalDataBean5 = MedCalDataBean("IIa", "肿瘤侵犯宫颈间质，但无宫体外蔓延b")
        var medCalDataBean6 = MedCalDataBean("IIIa", "肿瘤局部和（或）区域扩散")
        var medCalDataBean7 = MedCalDataBean("  IIIAa", "肿瘤累及浆膜层和（或）附件c")
        var medCalDataBean8 = MedCalDataBean("  IIIBa", "阴道和（或）宫旁受累c")
        var medCalDataBean9 = MedCalDataBean("  IIICa", "盆腔和/或腹主动脉旁淋巴结阳性c")
        var medCalDataBean10 = MedCalDataBean("   IIIC1a", "盆腔淋巴结阳性")
        var medCalDataBean11 = MedCalDataBean("   IIIC2a", "腹主动脉旁淋巴结阳性和（或）盆腔淋巴结阳性")
        var medCalDataBean12 = MedCalDataBean("IVa", "肿瘤侵及膀胱和（或）直肠黏膜，和（或）远处转移")
        var medCalDataBean13 = MedCalDataBean("  IVAa", "肿瘤侵及膀胱或直肠黏膜")
        var medCalDataBean14 = MedCalDataBean("  IVBa", "远处转移，包括腹腔内和（或）腹股沟淋巴结转移")



        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10,
            medCalDataBean11, medCalDataBean12, medCalDataBean13, medCalDataBean14)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "a：G1、G2或G3\n" +
                "b：宫颈管内膜腺体受累仅限于I期，不再是II期\n" +
                "c：细胞学检查阳性应单独报告，但不影响分期")
        var medCalDataBean2 = MedCalDataBean("参考来源", "FIGO Committee on Gynecologic Oncology. FIGO staging for carcinoma of the vulva, cervix, and corpus uteri. Int J Gynaecol Obstet. 2014;125(2):97-8.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }

    override fun initView() {
        binding.tv1.text = "子宫内膜癌分期（FIGO，2014）"
    }
}