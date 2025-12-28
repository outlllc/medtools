package com.duckgo.medtools.medicaltools.functions.comprehensive

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentUnitConversionBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Unit_Conversion_fm : Fragment() {

    private var _binding: FragmentUnitConversionBinding? = null
    private val binding get() = _binding!!

    // 定义单位和转换系数的映射
    private data class ConversionInfo(val oldUnit: String, val siUnit: String, val oldToSi: Double, val siToOld: Double)
    
    private val conversionMap by lazy {
        mapOf(
            binding.rbBp.id to ConversionInfo("kPa", "mmHg", 7.5, 0.133),
            binding.rbBg.id to ConversionInfo("mg/dL", "mmol/L", 0.0555, 18.02),
            binding.rbBb.id to ConversionInfo("mg/dL", "μmol/L", 17.1, 0.0585),
            binding.rbBc.id to ConversionInfo("mg/dL", "μmol/L", 88.4, 0.0113),
            binding.rbBu.id to ConversionInfo("mg/dL", "mmol/L", 0.357, 2.8),
            binding.rbBgl.id to ConversionInfo("mg/dL", "mmol/L", 0.01129, 88.6),
            binding.rbBch.id to ConversionInfo("mg/dL", "mmol/L", 0.0259, 38.67),
            binding.rbBHL.id to ConversionInfo("mg/dL", "mmol/L", 0.0259, 38.67),
            binding.rbUc.id to ConversionInfo("mg/dL", "μmol/L", 59.48, 0.01681),
            binding.rbBCa.id to ConversionInfo("mg/dL", "mmol/L", 0.25, 4.0)
        )
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentUnitConversionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRadioGroups()
        initTextWatchers()
        initAppendix()
    }

    private fun initRadioGroups() {
        val radioButtons = listOf(binding.rbBp, binding.rbBg, binding.rbBb, binding.rbBc, binding.rbBu, 
                                 binding.rbBgl, binding.rbBch, binding.rbBHL, binding.rbUc, binding.rbBCa)
        
        radioButtons.forEach { rb ->
            rb.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    // 互斥逻辑：取消另一个 RadioGroup 中的选中项
                    val otherGroup = if (rb.parent == binding.rg1) binding.rg2 else binding.rg1
                    otherGroup.clearCheck()
                    
                    // 更新单位
                    conversionMap[rb.id]?.let {
                        binding.tvOldUnit.text = it.oldUnit
                        binding.tvSIUnit.text = it.siUnit
                    }
                    clearInput()
                }
            }
        }
    }

    private fun initTextWatchers() {
        binding.etOld.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (binding.etOld.hasFocus()) calculate(true)
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        binding.etSI.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (binding.etSI.hasFocus()) calculate(false)
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }

    private fun calculate(isOldToSi: Boolean) {
        val selectedId = binding.rg1.checkedRadioButtonId.takeIf { it != -1 } ?: binding.rg2.checkedRadioButtonId
        val info = conversionMap[selectedId] ?: return
        
        if (isOldToSi) {
            val oldVal = binding.etOld.text.toString().toDoubleOrNull()
            binding.tvSiResult.text = oldVal?.let { "%.2f".format(it * info.oldToSi) } ?: ""
        } else {
            val siVal = binding.etSI.text.toString().toDoubleOrNull()
            binding.tvOldResult.text = siVal?.let { "%.2f".format(it * info.siToOld) } ?: ""
        }
    }

    private fun clearInput() {
        binding.etOld.setText("")
        binding.etSI.setText("")
        binding.tvOldResult.text = ""
        binding.tvSiResult.text = ""
    }

    private fun initAppendix() {
        val data = listOf(
            MedCalDataBean("常用单位换算公式"),
            MedCalDataBean("血压：1kPa = 7.5mmHg"),
            MedCalDataBean("血糖：1mg/dL = 0.0555mmol/L"),
            MedCalDataBean("胆红素：1mg/dL = 17.1μmol/L"),
            MedCalDataBean("血肌酐：1mg/dL = 88.4μmol/L"),
            MedCalDataBean("血尿素氮：1mg/dL = 0.357mmol/L"),
            MedCalDataBean("甘油三酯：1mg/dL = 0.01129mmol/L"),
            MedCalDataBean("胆固醇/HDL/LDL：1mg/dL = 0.0259mmol/L"),
            MedCalDataBean("血尿酸：1mg/dL = 59.48μmol/L"),
            MedCalDataBean("血钙：1mg/dL = 0.25mmol/L")
        )
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = MedCalAdapterDatabean(data)
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
