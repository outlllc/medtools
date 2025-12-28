package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentCreatinineClearanceCockcroftGaultFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Creatinine_Clearance_Cockcroft_Gault_fm : Fragment() {
    private var _binding: FragmentCreatinineClearanceCockcroftGaultFmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentCreatinineClearanceCockcroftGaultFmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setupListeners()
    }

    private fun initView() {
        val data = listOf(
            MedCalDataBean("公式英文名称", "Creatinine Clearance Estimate by Cockcroft-Gault Equation, CCrE"),
            MedCalDataBean("计算公式", "CCrE (女性×0.85) = (140-年龄) × 体重 × 1.23 / 血肌酐浓度 (SI)"),
            MedCalDataBean("结果正常值", "成人 80～120 mL/(min*1.73m2)"),
            MedCalDataBean("说明", "CCr 常用来对肾功能进行分期以指导治疗。"),
            MedCalDataBean("参考文献", "1. Cockcroft DW, et al. Nephron. 1976;16(1):31-42.\n2. Winter MA, et al. Pharmacotherapy. 2012;32(7):604-12.")
        )
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MedCalAdapterDatabean(data, floatArrayOf(1f, 3f))
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    private fun setupListeners() {
        binding.btnCal.setOnClickListener { calculate() }
        binding.rgDisplay.setOnCheckedChangeListener { _, _ ->
            binding.tvUniversal.text = if (binding.rbCommon.isChecked) "血肌酐浓度(mg/dL):" else "血肌酐浓度(mmol/L):"
        }
    }

    private fun calculate() {
        val age = binding.etAge.text.toString().toIntOrNull()
        val weight = binding.etBodyWeight.text.toString().toDoubleOrNull()
        val crInput = binding.etCr.text.toString().toDoubleOrNull()
        
        if (age == null || weight == null || crInput == null || crInput == 0.0) {
            binding.tvResult.text = "请输入正确数据"
            return
        }

        val genderFactor = if (binding.rbMan.isChecked) 1.0 else 0.85
        val crSI = if (binding.rbCommon.isChecked) crInput * 88.402 else crInput
        
        val result = genderFactor * (140 - age) * weight * 1.23 / crSI
        binding.tvResult.text = "CCrE = ${"%.2f".format(result)} ml/(min*1.73m2)"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
