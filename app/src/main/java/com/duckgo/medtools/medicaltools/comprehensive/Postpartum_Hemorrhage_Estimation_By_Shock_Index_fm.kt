package com.duckgo.medtools.medicaltools.comprehensive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentPostpartumHemorrhageEstimationByShockIndexBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm : Fragment() {

    private var _binding: FragmentPostpartumHemorrhageEstimationByShockIndexBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentPostpartumHemorrhageEstimationByShockIndexBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        binding.btnResult.setOnClickListener { calculateShockIndex() }
    }

    private fun calculateShockIndex() {
        val hr = binding.etHR.text.toString().toDoubleOrNull()
        val sbp = binding.etSBP.text.toString().toDoubleOrNull()
        
        if (hr == null || sbp == null || sbp == 0.0) {
            binding.tvShowResult.text = "请输入正确的数值"
            return
        }

        val si = hr / sbp
        val desc = when {
            si <= 0.5 -> "血容量正常"
            si <= 1.0 -> "SI=1时估计失血量500ml~1500ml(<10%~30%)"
            si <= 1.5 -> "SI=1.5时估计失血量1500-2500ml(30-50%)"
            si <= 2.0 -> "SI=2.0时估计失血量2500-3500ml(50-70%)"
            else -> ""
        }
        
        binding.tvShowResult.text = "休克指数: ${"%.2f".format(si)}${if (desc.isNotEmpty()) " , $desc" else ""}"
    }

    private fun initView() {
        val data = listOf(
            arrayOf("计算公式"),
            arrayOf("休克指数=心率（次/分）/收缩压（mmHg）"),
            arrayOf("结果正常值范围："),
            arrayOf("正常为0.5"),
            arrayOf("说明"),
            arrayOf("＜0.9：估计失血量＜500ml（＜20%）\n1~1.5：估计失血量1000~1500ml（20%~30%）\n≥2：估计失血量≥2500ml（≥50%）\n\n" +
                    "当SI = 0.5时，血容量正常；\n当SI = 1时，失血量为10%-30%（500-1500ml）\n" +
                    "当SI = 1.5时，失血量为30%-50%（1500-2500ml）\n当SI = 2时，失血量为50%-70%（2500-3500ml）"),
            arrayOf("参考文献"),
            arrayOf("1.赵松山...1984;02:3-11.\n2.赵松山...1987;03:10-17.\n丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        )

        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MedCalAdapterDatabean(data.map { MedCalDataBean(*it) })
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
