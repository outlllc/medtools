package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Popq_Indicator_pointsPelvic_organ_prolapse_assessment_fm:BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
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
        var medCalDataBean1 = MedCalDataBean("Aa", "阴道前壁中线距处女膜3cm处，相当于尿道膀胱沟处", "-3～+3cm")
        var medCalDataBean2 = MedCalDataBean("Ba", "阴道顶端或前穹窿到Aa点之间阴道前壁上段中的最远点", "在无阴道脱垂时，此点位于-3cm，在子宫切除术后阴道完全外翻时，此点将为+TVL")
        var medCalDataBean3 = MedCalDataBean("C", "宫颈或子宫切除后阴道顶端所处的最远端", "-TVL～+TVL")
        var medCalDataBean4 = MedCalDataBean("D", "有宫颈时的后穹窿的位置，它提示了子宫骶骨韧带附着到近端宫颈后壁的水平", "-TVL～+TVL或空缺（子宫切除后）")
        var medCalDataBean5 = MedCalDataBean("Ap", "阴道后壁中线距处女膜3cm处，Ap与Aa点相对应", "-3～+3cm")
        var medCalDataBean6 = MedCalDataBean("BP", "阴道顶端或后穹窿到Ap点之间阴道后壁上段中的最远点，BP与Ap点相对应", "在无阴道脱垂时，此点位于-3cm，在子宫切除术后阴道完全外翻时，此点将为+TVL")

        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "此分期系统是分别利用阴道前壁、阴道顶端、阴道后壁上的2个解剖指示点与处女膜的关系来界定盆腔器官的脱垂程度。与处女膜平行以0表示，位于处女膜以上用负数表示，处女膜以下则用正数表示。阴道前壁上的2个点分别为Aa和Ba点；阴道顶端的2个点分别为C和D点；阴道后壁的AP、BP两点与阴道前壁Aa、Ba点是对应的。另外还包括阴裂(gh)的长度，会阴体(pb)的长度，以及阴道的总长度(TVL)。测量值均用厘米表示。\n" +
                "阴裂的长度(gh)为尿道外口中线到处女膜后缘的中线距离。\n" +
                "会阴体的长度(pb)为阴裂的后端边缘到肛门中点距离。\n" +
                "阴道总长度(TVL)为总阴道长度。\n" +
                "注:POP-Q分期应在向下用力屏气时，以脱垂最大限度出现时的最远端部位距离处女膜的正负值计算。\n" +
                "POP-Q通过3×3格表记录以上各测量值，客观地反映盆腔器官脱垂变化的各个部位的具体数值")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    override fun initView() {
        binding.tv1.text = "盆腔器官脱垂评估指示点（POP-Q分期）"
    }
}