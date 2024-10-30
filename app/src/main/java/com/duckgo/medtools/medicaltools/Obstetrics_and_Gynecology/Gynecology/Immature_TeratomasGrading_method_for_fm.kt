package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Immature_TeratomasGrading_method_for_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("0级", "全部为成熟组织")
        var medCalDataBean2 = MedCalDataBean("Ⅰ级", "有少量不成熟组织(主要是胶质和原始间充质)，可见核分裂。神经上皮少，每一切片中仅限于1个每40倍视野")
        var medCalDataBean3 = MedCalDataBean("Ⅱ级", "有较多未成熟组织，但神经上皮在每一切片中不超过3个每40倍视野")
        var medCalDataBean4 = MedCalDataBean("Ⅲ级", "有多量不成熟组织，每一切片中神经上皮的量占4个或更多每40倍视野，并常与肉瘤样的间质融合")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "未成熟畸胎瘤(immature teratoma )属恶性肿瘤，含2～3胚层，占卵巢畸胎瘤1%～3%。肿瘤由分化程度不同的未成熟胚胎组织构成，主要为原始神经组织。多见于年轻患者，平均年龄11～19岁。肿瘤多为实性，可有囊性区域。肿瘤的恶性程度根据未成熟组织所占比例、分化程度及神经上皮含量而定。Norris等(1976)提出未成熟畸胎瘤的分级方法。这种分级对治疗和预后判断均有重要的意义。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "未成熟畸胎瘤的分级方法"
    }
}