package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentHyperthyroidismMedicationDuringPregnancyFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Hyperthyroidism_Medication_During_Pregnancy_fm : Fragment() {
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentHyperthyroidismMedicationDuringPregnancyFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHyperthyroidismMedicationDuringPregnancyFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initData_appendix()
        initAdaptor()
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释 ", "药物治疗首选丙硫氧嘧啶( prophylthiouracil，PTU )，此药通过胎盘量少，速度慢，能在甲状腺内阻断甲状腺激素的合成，并阻断T4转变为T3。积极治疗初次诊断的患者，丙硫氧嘧啶400mg/d，病情减轻或稳定后(一般4~6周)应逐渐减量至初始剂量的25%，不可骤然停药。一般治疗剂量参见表。用药期间密切观察病情变化，包括安静时脉率、脉压、食欲等和游离T3、游离T4等指标。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "40")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    fun initData() {
        var subDataSet1 = arrayOf("程度", "BMR(%)", "心率(/min)", "丙硫氧嘧啶(mg/d)")
        var subDataSet2 = arrayOf("轻", "＜+30", "＜100", "200~300")
        var subDataSet3 = arrayOf("中", "+30~+60", "100~120", "300~400")
        var subDataSet4 = arrayOf("重", "＞+60", "＞120", "400~500")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
    }
}