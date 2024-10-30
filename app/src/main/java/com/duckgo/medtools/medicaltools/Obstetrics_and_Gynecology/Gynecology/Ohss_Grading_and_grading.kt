package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Ohss_Grading_and_grading:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("OHSS分度", "OHSS分级", "描述")
        var medCalDataBean2 = MedCalDataBean("轻度", "Ⅰ", "腹胀和不适")
        var medCalDataBean3 = MedCalDataBean("轻度", "Ⅱ", "Ⅰ级症状加恶心、呕吐和/或腹泻卵巢不同程度增大，直径不超过5cm")
        var medCalDataBean4 = MedCalDataBean("中度", "Ⅲ", "轻度OHSS症状加重，腹水的超声证据，卵巢直径5~10cm之间")
        var medCalDataBean5 = MedCalDataBean("重度", "Ⅳ", "中度OHSS特征，腹水的临床证据")
        var medCalDataBean6 = MedCalDataBean("重度", "Ⅴ", "血球压积>45%(比基线升高>30%) WBC>15000/mL，少尿，血肌酐1.0~1.5mg/dl(88.4~132.6mmol/l)，肌酐清除率≥50mL/min")
        var medCalDataBean7 = MedCalDataBean("危重", "Ⅵ", "张力性腹水(伴或无胸水)，血球压积>55%，WBC>25000/mL，血肌酐>1.6mg/dl，肌酐清除率>50mL/min，血栓栓塞，急性呼吸窘迫综合征(ARDS)")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("参考来源", "Golan A, et al. Ovarian hyperstimulation syndrome: An update review. Obstet Gynecol Surv. 1989;44:430–40.")
        data_appendix = listOf(medCalDataBean1)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "卵巢过度刺激综合征 OHSS 的分度与分级（Golan分类）"
    }
}