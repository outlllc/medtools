package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentDiagnosticCriteriaForGdmFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Diagnostic_Criteria_For_GDM_fm : Fragment() {
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentDiagnosticCriteriaForGdmFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDiagnosticCriteriaForGdmFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "40")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "依据2014年妊娠合并糖尿病诊治指南：75g OGTT结果的3项中任何1项值达到或超过标准即可诊断GDM。")
        var subDataSet2 = arrayOf("相关解释 ", "1．推荐医疗机构对所有尚未被诊断为PGDM或GDM的孕妇，在妊娠24～28周以及28周后首次就诊时行OGTT。OGTT前禁食至少8 h，试验前连续3 d正常饮食，即每日进食碳水化合物不少于150 g，检查期间静坐、禁烟。检查时，5 min内口服含75 g葡萄糖的液体300 ml，分别抽取孕妇服糖前及服糖后1、2 h的静脉血(从开始饮用葡萄糖水计算时间)，放入含有氟化钠的试管中，采用葡萄糖氧化酶法测定血糖水平。\n" +
                "2. 孕妇具有GDM高危因素或者医疗资源缺乏地区，建议妊娠24-28周首先检查FPG。FPG≥5.1mmol／L，可以直接诊断GDM，不必行OGTT；FPG<4.4 mmol／L(80 mg／dl)，发生GDM可能性极小，可以暂时不行OGTT。FPG≥4.4 mmol／L且<5.1mmol／L时，应尽早行OGTT。\n" +
                "3．孕妇具有GDM高危因素，首次OGTT结果正常，必要时可在妊娠晚期重复OGTT。\n" +
                "4．妊娠早、中期随孕周增加FPG水平逐渐下降，尤以妊娠早期下降明显，因而，妊娠早期FPG水平不能作为GDM的诊断依据。\n" +
                "5．未定期检查者，如果首次就诊时间在妊娠28周以后，建议首次就诊时或就诊后尽早行OGTT或FPG检查。")
        var subDataSet3 = arrayOf("参考来源", "中华医学会内分泌学分会. 妊娠期糖尿病诊治指南. 中华内分泌代谢杂志. 2014年第30卷第6期")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("抽血时间", "空腹(FPG)", "1h", "2h")
        var subDataSet2 = arrayOf("血糖标准 mmol/L(mg/dl)", "5.1(92)", "10.0(180)", "8.5(153)")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
    }
}