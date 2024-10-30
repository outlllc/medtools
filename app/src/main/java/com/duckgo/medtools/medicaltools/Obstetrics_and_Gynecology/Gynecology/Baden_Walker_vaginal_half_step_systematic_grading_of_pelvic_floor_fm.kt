package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Baden_Walker_vaginal_half_step_systematic_grading_of_pelvic_floor_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("分度", "描述")
        var medCalDataBean2 = MedCalDataBean("Ⅰ度", "阴道前、后壁的突出部下降到了距处女膜的半程处")
        var medCalDataBean3 = MedCalDataBean("Ⅱ度", "阴道前、后壁突出部位达处女膜")
        var medCalDataBean4 = MedCalDataBean("Ⅲ度", "阴道前、后壁突出部位达处女膜以外")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "注意：膨出分度检查应在最大屏气状态下进行。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "Baden-Walker盆底器官膨出的阴道半程系统分级法"
    }
}