package com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Endocrinology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentHbA1cValuesBloodGlucoseFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class HbA1cValuesBloodGlucose_fm : Fragment() {
    private var _binding: FragmentHbA1cValuesBloodGlucoseFmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHbA1cValuesBloodGlucoseFmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnCal.setOnClickListener {
            val hba1c = binding.etHba1c.text.toString().toDoubleOrNull()
            if (hba1c != null) {
                val result = (28.7 * hba1c - 46.7) / 18
                binding.tvResult.text = "平均血糖水平 = ${"%.2f".format(result)} mmol/L"
            } else {
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }

    private fun initView() {
        val data = listOf(
            arrayOf("计算公式", "平均血糖=(28.7*HbA1c-46.7)/18"),
            arrayOf("结果正常值范围", "空腹血糖正常值为3.9~6.1mmol/L"),
            arrayOf("说明", "糖化血红蛋白被视为血糖控制的金标准，与糖尿病的微血管及大血管病变相关，它反应了过去2~3个月的平均血糖水平。"),
            arrayOf("参考来源", "http://professional.diabetes.org/glucosecalculator.aspx")
        )

        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MedCalAdapterDatabean(
                data.map { MedCalDataBean(*it) },
                columnWeights = floatArrayOf(1f, 3f)
            )
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
