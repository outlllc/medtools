package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentIndicationsForPregnancyTerminationOfGestationalHypertensionFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm : Fragment() {
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentIndicationsForPregnancyTerminationOfGestationalHypertensionFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIndicationsForPregnancyTerminationOfGestationalHypertensionFmBinding.inflate(layoutInflater)
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
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "10")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释", "终止妊娠是治疗妊娠期高血压疾病的有效措施")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("1.重度子痫前期患者经积极治疗24-48小时仍无明显好转者")
        var subDataSet2 = arrayOf("2.重度子痫前期患者孕周已超过34周")
        var subDataSet3 = arrayOf("3.重度子痫前期患者孕龄不足34周，但胎盘功能减退，胎儿已成熟")
        var subDataSet4 = arrayOf("4.重度子痫前期患者，孕龄不足34周，胎盘功能减退，胎儿尚未成熟者，可用地塞米松促胎肺成熟后终止妊娠")
        var subDataSet5 = arrayOf("5.子痫控制后2小时可考虑终止妊娠")
        dataSet = ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
    }
}