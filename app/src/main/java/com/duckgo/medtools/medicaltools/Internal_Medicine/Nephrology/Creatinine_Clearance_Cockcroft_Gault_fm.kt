package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentCreatinineClearanceCockcroftGaultFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Creatinine_Clearance_Cockcroft_Gault_fm : Fragment() {

    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentCreatinineClearanceCockcroftGaultFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreatinineClearanceCockcroftGaultFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData_appendix()
        initAdaptor()
        binding.rgDisplay.setOnCheckedChangeListener { _, _ -> checkDisplay() }
        calculate()
    }

    fun calculate() {
        binding.btnCal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
            binding.tvResult.text= "CCrE = ${ String.format("%.2f",result) } ml/(min*1.73m2)"
            }else{
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }
    fun checkDisplay(){
        val dialysis = if (binding.rbCommon.isChecked) "common" else "universal"
        if (dialysis == "common"){
            binding.tvUniversal.text = "血肌酐浓度(mg/dL):"
        }else if (dialysis == "universal"){
            binding.tvUniversal.text = "血肌酐浓度(mmol/L):"
        }
    }
    fun getInput() :Double{
        val age = binding.etAge.text.toString().toIntOrNull()
        val weight = binding.etBodyWeight.text.toString().toDoubleOrNull()
        val cr = binding.etCr.text.toString().toDoubleOrNull()
        val gender = if (binding.rbMan.isChecked) "man" else "woman"
        var result = if( (gender == "man") and (age != null) and (weight != null) and (cr != null)){
            (140 - age!!) * weight!! * 1.23 / cr!!
        }else if ((gender == "woman") and (age != null) and (weight != null) and (cr != null)){
            0.85*(140 - age!!) * weight!! * 1.23 / cr!!
        } else{
            0.0
        }
        return result
    }

    private fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("公式英文名称", "Creatinine Clearance Estimate by Cockcroft-Gault Equation,CCrE")
        var subDataSet2 = arrayOf("计算公式", "CCrE（女性*0.85）=(140-年龄)*体重*1.23/血肌酐浓度（国际单位,SI）")
        var subDataSet3 = arrayOf("结果正常值", "成人80～120 mL/(min*1.73m2)")
        var subDataSet4 = arrayOf("说明", "CCr常用来对肾功能进行分期以指导治疗，如慢性肾功能衰竭分级时结合CCr将病程分为四期，指导治疗。")
        var subDataSet5 = arrayOf("参考文献", "1.Cockcroft DW, Gault MH. Prediction of creatinine clearance from serum creatinine. Nephron. 1976;16(1):31-42.\n" +
                                "2. Winter MA, et al. Impact of various body weights and serum creatinine concentrations on the bias and accuracy of the Cockcroft-Gault equation. Pharmacotherapy. 2012;32(7):604-12.")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
        dataSet_appendix.add(subDataSet4)
        dataSet_appendix.add(subDataSet5)
    }
}