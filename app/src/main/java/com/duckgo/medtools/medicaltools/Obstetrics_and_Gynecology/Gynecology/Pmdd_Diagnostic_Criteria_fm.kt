package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Pmdd_Diagnostic_Criteria_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("对患者2～3个月经周期所记录的症状作前瞻性评估。在黄体期的最后一个星期存在5种(或更多种)下述症状，并且在经后消失，其中至少有一种症状必须是1，2，3，或4；")
        var medCalDataBean2 = MedCalDataBean("1.明显的抑郁情绪，自我否定意识，感到失望")
        var medCalDataBean3 = MedCalDataBean("2.明显焦虑、紧张，感到“激动”或“不安”")
        var medCalDataBean4 = MedCalDataBean("3.情感不稳定，比如突然伤感、哭泣或对拒绝增加敏感性")
        var medCalDataBean5 = MedCalDataBean("4.持续和明显易怒或发怒，或与他人的争吵增加")
        var medCalDataBean6 = MedCalDataBean("5.对平时活动（如工作、学习、友谊、嗜好）的兴趣降低")
        var medCalDataBean7 = MedCalDataBean("6.主观感觉注意力集中困难")
        var medCalDataBean8 = MedCalDataBean("7.嗜睡、易疲劳或能量明显缺乏")
        var medCalDataBean9 = MedCalDataBean("8.食欲明显改变，有过度摄食或产生特殊的嗜食渴望")
        var medCalDataBean10 = MedCalDataBean("9.失眠")
        var medCalDataBean11 = MedCalDataBean("10.主观感觉不安或失控")
        var medCalDataBean12 = MedCalDataBean("11.其他躯体症状，如乳房触痛或肿胀，头痛、关节或肌肉痛、肿胀感，体重增加\n这些失调务必是明显干扰工作或学习或日常的社会活动及与他人的关系（如逃避社会活动、生产力和工作学习效率降低）\n" +
                "这些失调确实不是另一种疾病加重的表现（加重型抑郁症、恐慌症、恶劣心境或人格障碍）")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6,
            medCalDataBean7, medCalDataBean8, medCalDataBean9, medCalDataBean10, medCalDataBean11, medCalDataBean12)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("结果解读", "诊断PMDD的要求：连续3次月经前具有表中11种症状中的5种，月经来潮4日内缓解，无症状期持续到周期第13日；5种症状中必须至少包括1种精神症状(如易怒、情绪波动、焦虑或抑郁)；具有的多种躯体症状仅作为1种症状评估。\n" +
                "相关解释 ")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "经前焦虑障碍PMDD诊断标准"
    }
}