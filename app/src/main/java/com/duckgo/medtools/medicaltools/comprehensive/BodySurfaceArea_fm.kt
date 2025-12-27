package com.duckgo.medtools.medicaltools.comprehensive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.ActivityBodySurfaceAreaBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class BodySurfaceArea_fm : Fragment() {

    private var _binding: ActivityBodySurfaceAreaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ActivityBodySurfaceAreaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnCal.setOnClickListener {
            val height = binding.etHeight.text.toString().toDoubleOrNull()
            val weight = binding.etBodyWeight.text.toString().toDoubleOrNull()

            if (height != null && weight != null) {
                val bsa = if (binding.rbMan.isChecked) {
                    0.00607 * height + 0.0127 * weight - 0.0698
                } else {
                    0.00586 * height + 0.0126 * weight - 0.0461
                }
                binding.tvResult.text = "体表面积BSA = ${String.format("%.2f", bsa)} m2"
            } else {
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }

    private fun initAdapter() {
        val dataSetAppendix = mutableListOf(
            arrayOf("公式英文名称"),
            arrayOf("Body Surface Area, BSA"),
            arrayOf("计算公式"),
            arrayOf("男性：BSA=0.00607*身高+0.0127*体重-0.0698\n女性：0.00586*身高+0.0126*体重-0.0461"),
            arrayOf("说明"),
            arrayOf("通过身高、体重估算体表面积，进而调整化疗药的给药剂量。也常用于评价心脏指数和基础代谢率等临床指标"),
            arrayOf("参考文献"),
            arrayOf("1.赵松山，刘友梅，姚家邦等.中国成年男子体表面积的测量.营养学报.1984;02:3-11.\n2.赵松山，刘友梅，姚家邦等.中国成年女子体表面积的测量.营养学报.1987;03:10-17.")
        )
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MedCalListAdapter(dataSetAppendix, "10")
            // 设置过滚动模式为从不，这样滑动到边缘时就不会有发光或回弹动画效果
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
