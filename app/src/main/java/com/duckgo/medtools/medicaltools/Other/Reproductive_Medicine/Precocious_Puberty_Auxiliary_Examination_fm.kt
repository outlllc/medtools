package com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentPrecociousPubertyAuxiliaryExaminationFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Precocious_Puberty_Auxiliary_Examination_fm : Fragment() {
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentPrecociousPubertyAuxiliaryExaminationFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrecociousPubertyAuxiliaryExaminationFmBinding.inflate(layoutInflater)
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
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "70")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("","性腺大小", "基础FSH/LH", "E2", "DHAS", "睾酮T", "GnRH反应")
        var subDataSet2 = arrayOf("特发性", "增大", "升高", "升高", "升高", "升高", "增强")
        var subDataSet3 = arrayOf("中枢性", "增大", "升高","升高", "升高", "升高", "增强")
        var subDataSet4 = arrayOf("性腺性", " 增大", "不高", "升高", "不高", "可高", "无反应")
        var subDataSet5 = arrayOf("Albright", "增大", "不高", "升高", "可高", "可高", "无反应")
        var subDataSet6 = arrayOf("肾上腺性 ", "小", "不高", "升高", "升高", "可高", "无反应")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
    }
}