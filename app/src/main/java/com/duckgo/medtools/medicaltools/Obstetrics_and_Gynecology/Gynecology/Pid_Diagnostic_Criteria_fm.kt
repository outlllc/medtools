package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Pid_Diagnostic_Criteria_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("       最低标准(minimum criteria)")
        var medCalDataBean2 = MedCalDataBean("宫颈举痛或子宫压痛或附件区压痛")
        var medCalDataBean3 = MedCalDataBean("       附加标准(additional criteria)")
        var medCalDataBean4 = MedCalDataBean("体温超过38.3℃(口表)\n" +
                "    宫颈或阴道异常黏液脓性分泌物\n" +
                "    阴道分泌物0.9%氯化钠溶液涂片见到大量白细胞\n" +
                "    红细胞沉降率升高\n" +
                "    血C-反应蛋白升高\n" +
                "    实验室证实的宫颈淋病奈瑟菌或衣原体阳性")
        var medCalDataBean5 = MedCalDataBean("       特异标准(specific criteria)")
        var medCalDataBean6 = MedCalDataBean("子宫内膜活检组织学证实子宫内膜炎\n" +
                "    阴道超声或磁共振检查显示输卵管增粗，输卵管积液，伴或不伴有盆腔积液、输卵管卵巢肿块，以及腹腔镜检查发现PID征象")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("结果解读 ", "最低诊断标准提示在性活跃的年轻女性或者具有性传播疾病的高危人群，若出现下腹痛，并可排除其他引起下腹痛的原因，妇科检查符合最低诊断标准，即可给予经验性抗生素治疗。\n" +
                "    附加标准可增加诊断的特异性，多数PID患者有宫颈黏液脓性分泌物，或阴道分泌物0.9%氯化钠溶液涂片中见到白细胞，若宫颈分泌物正常并且镜下见不到白细胞，PID的诊断需慎重。\n" +
                "    特异标准基本可诊断PID，但由于除B型超声检查外，均为有创检查或费用较高，特异标准仅适用于一些有选择的病例。腹腔镜诊断PID标准包括：①输卵管表面明显充血；②输卵管壁水肿；③输卵管伞端或浆膜面有脓性渗出物。腹腔镜诊断输卵管炎准确率高，并能直接采取感染部位的分泌物做细菌培养，但临床应用有一定局限性。并非所有怀疑PID的患者均能接受这一检查，对轻度输卵管炎的诊断准确性降低。此外，对单独存在的子宫内膜炎无诊断价值。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "盆腔炎性疾病（PID）诊断标准（2006年美国CDC标准）"
    }
}