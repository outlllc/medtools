package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Tbs_classification_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
    override fun getFragmentViewBinding(): FragmentTwoRecycleviewModelFmBinding {
        return FragmentTwoRecycleviewModelFmBinding.inflate(layoutInflater)
    }
    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 10)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("异常上皮细胞")
        var medCalDataBean2 = MedCalDataBean("鳞状细胞    又分两类：意义未明的不典型鳞状细胞(Atypical squamous cells of undetermined significance,ASC-US)与不能排除高度上皮内病变的不典型鳞状细胞(Atypical squamous cells-cannot exclude HSIL,ASC-H)")
        var medCalDataBean3 = MedCalDataBean("轻度鳞状细胞上皮内病变(( low-grade squmous intraepithelial lesion, ISIL)，包括HPV感染/CIN 1")
        var medCalDataBean4 = MedCalDataBean("高度鳞状细胞上皮内病变(high-grade squmous intraepithelial lesion, HSIL)，包括CIN 2及3")
        var medCalDataBean5 = MedCalDataBean("鳞状细胞癌(squamous cell carcinoma, SCC)")
        var medCalDataBean6 = MedCalDataBean("腺细胞")
        var medCalDataBean7 = MedCalDataBean("不典型(AGC)，倾向于瘤变")
        var medCalDataBean8 = MedCalDataBean("原位腺癌(宫颈管)")
        var medCalDataBean9 = MedCalDataBean("腺癌(宫颈管，子宫内膜、子宫外)")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8, medCalDataBean9)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "TBS分类（宫颈细胞学检查）"
    }
}