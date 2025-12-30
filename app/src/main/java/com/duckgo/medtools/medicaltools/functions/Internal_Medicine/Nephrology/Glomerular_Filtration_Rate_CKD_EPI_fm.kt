package com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentGlomerularFiltrationRateCkdEpiFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean
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
        val data = listOf(
            MedCalDataBean("计算公式", "GFR＝a×(血肌酐浓度/b)c×(0.993)年龄\na值：黑人(女166, 男163); 其他(女144, 男141)\nb值：女0.7, 男0.9\nc值：女(≤0.7为-0.329, >0.7为-1.209); 男(≤0.9为-0.411, >0.9为-1.209)"),
            MedCalDataBean("结果正常值范围", "120~138mL/(min*1.73m2)"),
            MedCalDataBean("说明", "2009年发表的CKD-EPI公式较MDRD公式更为精确，尤其当GFR > 60ml/min时。"),
            MedCalDataBean("参考文献", "Levey AS, et al. Ann Intern Med. 2009 May 5;150(9):604-12.")
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
            // 固定左侧标签，仅动态调整右侧单位
            binding.tvUniversal.text = "血肌酐浓度"
            binding.tvUnit.text = if (binding.rbCommon.isChecked) "mg/dL" else "umol/L"
        }
    }

    private fun calculate() {
        val age = binding.etAge.text.toString().toIntOrNull()
        val crInput = binding.etCr.text.toString().toDoubleOrNull()
        
        if (age == null || crInput == null || crInput == 0.0) {
            binding.tvResult.text = "请输入正确数据"
            return
        }

        // 核心逻辑：如果是常用单位(mg/dL)，先转换为umol/L进行计算 (系数 88.402)
        val cr = if (binding.rbCommon.isChecked) crInput * 88.402 else crInput
        
        val isMale = binding.rbMan.isChecked
        val isBlack = binding.rbBlack.isChecked
        
        val a = if (isBlack) (if (isMale) 163.0 else 166.0) else (if (isMale) 141.0 else 144.0)
        val b = if (isMale) 0.9 else 0.7
        val c = if (isMale) (if (crInput <= (if(isMale) 0.9 else 0.7)) -0.411 else -1.209) else (if (crInput <= 0.7) -0.329 else -1.209)
        
        // 注意：CKD-EPI 公式中的 cr/b 这里的 cr 通常是 mg/dL 单位
        // 之前的逻辑似乎混淆了。根据标准公式，cr 应当是 mg/dL
        val crMgDl = if (binding.rbCommon.isChecked) crInput else crInput / 88.402
        
        val result = a * (crMgDl / b).pow(c) * 0.993.pow(age.toDouble())
        binding.tvResult.text = "肾小球滤过率 = ${"%.2f".format(result)} ml/(min*1.73m2)"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
