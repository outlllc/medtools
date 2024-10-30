package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vaginal_Cancer_Staging_Figo_Uicc_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean(" ", "FIGO分期", "UICC分期（TNM）")
        var medCalDataBean2 = MedCalDataBean("0", "原位癌（浸润前癌)", "TisN0M0")
        var medCalDataBean3 = MedCalDataBean("Ⅰ", "癌瘤局限于阴道", "T1N0M0")
        var medCalDataBean4 = MedCalDataBean("Ⅱ", "癌瘤侵及阴道旁组织但未达盆侧壁", "T2N0M0")
        var medCalDataBean5 = MedCalDataBean("Ⅲ", "癌瘤扩散达盆侧壁", "T3N0M0\nT3N1M0\n" +
                "T1N1M0\n" +
                "T2N1M0")
        var medCalDataBean6 = MedCalDataBean("ⅣA", "癌瘤侵入膀胱及直肠黏膜，和（或）扩散超出真骨盆", "T4任何NM0")
        var medCalDataBean7 = MedCalDataBean("ⅣB", "远处转移", "任何T，任何N，M1")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "阴道癌FIGO分期是基于临床发现，包括体格检查，膀胱镜，直肠镜和胸部X线。影像学检查如CT或MRI也许对原发性肿瘤、腹腔情况和后腹膜淋巴结治疗前评估有帮助，然而这些检查并没有应用于正式FIGO分期过程中。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "阴道癌分期（FIGO/UICC）"
    }
}