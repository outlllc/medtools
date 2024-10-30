package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vvc_Classification_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
    override fun getFragmentViewBinding(): FragmentTwoRecycleviewModelFmBinding {
        return FragmentTwoRecycleviewModelFmBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 30)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("  ", "单纯性VVC", "复杂性VVC")
        var medCalDataBean2 = MedCalDataBean("发生频率", "散发或非经常发作", "复发或经常发作")
        var medCalDataBean3 = MedCalDataBean("临床表现", "轻到中度", "重度")
        var medCalDataBean4 = MedCalDataBean("真菌种类", "白假丝酵母菌", "非白假丝酵母菌")
        var medCalDataBean5 = MedCalDataBean("宿主情况", "免疫功能正常", "免疫力低下或应用免疫抑制剂或糖尿病、妊娠")
        var medCalDataBean6 = MedCalDataBean("治疗效果", "好", "欠佳")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "外阴阴道假丝酵母菌病（VVC）临床分类"
    }
}