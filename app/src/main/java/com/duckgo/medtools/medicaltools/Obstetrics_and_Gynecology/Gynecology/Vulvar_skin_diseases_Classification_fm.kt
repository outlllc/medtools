package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vulvar_skin_diseases_Classification_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("皮肤和粘膜上皮内非瘤变（nonneoplasitc epithelial disorder of skin and mucosa）")
        var medCalDataBean2 = MedCalDataBean("      硬化性苔藓（lichen sclerosis）")
        var medCalDataBean3 = MedCalDataBean("      鳞状上皮增生（squamous hyperplasia）")
        var medCalDataBean4 = MedCalDataBean("      其他皮肤病（other dermatoses）")
        var medCalDataBean5 = MedCalDataBean("上皮内瘤变（intraepithelial neoplasia）")
        var medCalDataBean6 = MedCalDataBean("      鳞状上皮内瘤变（squamous intraepithelial nieplasia）")
        var medCalDataBean7 = MedCalDataBean("          轻度不典型增生（mild dysplasia）")
        var medCalDataBean8 = MedCalDataBean("          中度不典型增生（moderate dysplasia）")
        var medCalDataBean9 = MedCalDataBean("          重度不典型增生或原位癌（severe dysplasia or carcinoma in situ）")
        var medCalDataBean10 = MedCalDataBean("     非鳞状上皮内瘤变（nonsquamous intraepithelial dysplasia）")
        var medCalDataBean11 = MedCalDataBean("         派杰氏病（Paget's disease）")
        var medCalDataBean12 = MedCalDataBean("         非浸润性黑色素细胞瘤（tumors of melanocytes， noninvasive）")
        var medCalDataBean13 = MedCalDataBean("浸润性肿瘤（invasive tumors）")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7,
            medCalDataBean8, medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12, medCalDataBean13)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "该分类的特点是将上皮内瘤变与非瘤变截然分开，有利于临床治疗方法选择及疗效比较。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "外阴皮肤疾病分类法（ISSVD，1987）"
    }
}