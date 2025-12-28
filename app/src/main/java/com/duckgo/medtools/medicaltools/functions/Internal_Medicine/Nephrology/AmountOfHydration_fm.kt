package com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentAmountOfHydrationFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class AmountOfHydration_fm : Fragment() {

    private var _binding: FragmentAmountOfHydrationFmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAmountOfHydrationFmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnCal.setOnClickListener {
            val sodium = binding.etSodium.text.toString().toDoubleOrNull()
            val weight = binding.etBodyWeight.text.toString().toDoubleOrNull()

            if (sodium != null && weight != null) {
                val result = (sodium - 142) * weight * 4
                binding.tvResult.text = "补液量 = ${"%.2f".format(result)} ml"
            } else {
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }

    private fun initView() {
        val data = listOf(
            arrayOf("计算公式", "补水量 = (血清钠浓度 - 142) × 体重 × 4\n注：补液时还应加上每日正常需要量 2000ml"),
            arrayOf("说明", "为避免输入过量导致血容量过分扩张及水中毒，计算所得的补水量不宜一次性输入，一般分 2 天补给。"),
            arrayOf("参考文献", "陈孝平主编. 外科学（八年制）（第 2 版）. 人民卫生出版社. 2010 年")
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
