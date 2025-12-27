package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.View
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.ActivityCreatinineClearanceCockcroftGaultBinding

class Creatinine_Clearance_Cockcroft_Gault : AppCompatActivity() {
    private lateinit var binding: ActivityCreatinineClearanceCockcroftGaultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCreatinineClearanceCockcroftGaultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupListeners()
        showList()
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
        val cr = binding.etCr.text.toString().toDoubleOrNull()
        
        if (age == null || weight == null || cr == null || cr == 0.0) {
            binding.tvResult.text = "请输入正确数据"
            return
        }

        val genderFactor = if (binding.rbMan.isChecked) 1.0 else 0.85
        val result = genderFactor * (140 - age) * weight * 1.23 / cr
        binding.tvResult.text = "CCrE = ${"%.2f".format(result)} ml/(min*1.73m2)"
    }

    private fun showList() {
        val titles = arrayOf("公式英文名称", "计算公式", "结果正常值", "说明", "参考文献")
        val contents = arrayOf(
            "Creatinine Clearance Estimate by Cockcroft-Gault Equation, CCrE",
            "CCrE (女性×0.85) = (140-年龄) × 体重 × 1.23 / 血肌酐浓度 (SI)",
            "成人 80～120 mL/(min*1.73m2)",
            "CCr 常用来对肾功能进行分期以指导治疗。",
            "1. Cockcroft DW, et al. Nephron. 1976;16(1):31-42.\n2. Winter MA, et al. Pharmacotherapy. 2012;32(7):604-12."
        )

        val listItem = titles.mapIndexed { i, title ->
            mapOf("header" to title, "second" to contents[i])
        }

        binding.listView.apply {
            adapter = SimpleAdapter(
                this@Creatinine_Clearance_Cockcroft_Gault,
                listItem,
                R.layout.cal_list,
                arrayOf("header", "second"),
                intArrayOf(R.id.tvF, R.id.tvS)
            )
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }
}
