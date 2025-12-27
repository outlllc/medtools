package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentGlomerularFiltrationRateCkdEpiFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter
import kotlin.math.pow

class Glomerular_Filtration_Rate_CKD_EPI_fm : Fragment() {
    private var _binding: FragmentGlomerularFiltrationRateCkdEpiFmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentGlomerularFiltrationRateCkdEpiFmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setupListeners()
    }

    private fun initView() {
        val data = mutableListOf(
            arrayOf("计算公式", "GFR＝a×(血肌酐浓度/b)c×(0.993)年龄\na值：黑人(女166, 男163); 其他(女144, 男141)\nb值：女0.7, 男0.9\nc值：女(≤0.7为-0.329, >0.7为-1.209); 男(≤0.9为-0.411, >0.9为-1.209)"),
            arrayOf("结果正常值范围", "120~138mL/(min*1.73m2)"),
            arrayOf("说明", "2009年发表的CKD-EPI公式较MDRD公式更为精确，尤其当GFR > 60ml/min时。"),
            arrayOf("参考文献", "Levey AS, et al. Ann Intern Med. 2009 May 5;150(9):604-12.")
        )
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MedCalListAdapter(data, "20")
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
        val cr = binding.etCr.text.toString().toDoubleOrNull()
        if (age == null || cr == null) {
            binding.tvResult.text = "请输入正确数据"
            return
        }

        val isMale = binding.rbMan.isChecked
        val isBlack = binding.rbBlack.isChecked
        
        val a = if (isBlack) (if (isMale) 163.0 else 166.0) else (if (isMale) 141.0 else 144.0)
        val b = if (isMale) 0.9 else 0.7
        val c = if (isMale) (if (cr <= 0.9) -0.411 else -1.209) else (if (cr <= 0.7) -0.329 else -1.209)
        
        val result = a * (cr / b).pow(c) * 0.993.pow(age.toDouble())
        binding.tvResult.text = "肾小球滤过率 = ${"%.2f".format(result)} ml/(min*1.73m2)"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
