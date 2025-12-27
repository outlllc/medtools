package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentEdinburghPostnatalDepressionScaleFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Edinburgh_Postnatal_Depression_Scale_fm : Fragment(), RadioGroup.OnCheckedChangeListener {

    private var _binding: FragmentEdinburghPostnatalDepressionScaleFmBinding? = null
    private val binding get() = _binding!!
    private val groupScores = mutableMapOf<Int, Int>()
    private val totalItems = 10

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentEdinburghPostnatalDepressionScaleFmBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdaptor()
        setupListeners()
    }

    private fun setupListeners() {
        val groups = listOf(
            binding.rg1, binding.rg2, binding.rg3, binding.rg4, binding.rg5,
            binding.rg6, binding.rg7, binding.rg8, binding.rg9, binding.rg10
        )
        groups.forEach { it.setOnCheckedChangeListener(this) }

        binding.btnClear.setOnClickListener {
            groups.forEach { it.clearCheck() }
            groupScores.clear()
            updateResult()
        }
    }

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        // 核心修复逻辑：精确匹配 RadioButton 的 ID 资源。
        val score = when (checkedId) {
            // 第1题
            R.id.rb_1_3 -> 3
            R.id.rb_1_2 -> 2
            R.id.rb_1_1 -> 1
            R.id.rb_1_0 -> 0
            // 第2题
            R.id.rb_2_3 -> 3
            R.id.rb_2_2 -> 2
            R.id.rb_2_1 -> 1
            R.id.rb_2_0 -> 0
            // 第3题
            R.id.rb_3_3 -> 3
            R.id.rb_3_2 -> 2
            R.id.rb_3_1 -> 1
            R.id.rb_3_0 -> 0
            // 第4题
            R.id.rb_4_3 -> 3
            R.id.rb_4_2 -> 2
            R.id.rb_4_1 -> 1
            R.id.rb_4_0 -> 0
            // 第5题
            R.id.rb_5_3 -> 3
            R.id.rb_5_2 -> 2
            R.id.rb_5_1 -> 1
            R.id.rb_5_0 -> 0
            // 第6题
            R.id.rb_6_3 -> 3
            R.id.rb_6_2 -> 2
            R.id.rb_6_1 -> 1
            R.id.rb_6_0 -> 0
            // 第7题
            R.id.rb_7_3 -> 3
            R.id.rb_7_2 -> 2
            R.id.rb_7_1 -> 1
            R.id.rb_7_0 -> 0
            // 第8题
            R.id.rb_8_3 -> 3
            R.id.rb_8_2 -> 2
            R.id.rb_8_1 -> 1
            R.id.rb_8_0 -> 0
            // 第9题
            R.id.rb_9_3 -> 3
            R.id.rb_9_2 -> 2
            R.id.rb_9_1 -> 1
            R.id.rb_9_0 -> 0
            // 第10题
            R.id.rb_10_3 -> 3
            R.id.rb_10_2 -> 2
            R.id.rb_10_1 -> 1
            R.id.rb_10_0 -> 0
            else -> null // 如果没有选中任何项（例如调用了 clearCheck()），则从 map 中移除该组得分
        }
        
        if (score != null) {
            groupScores[group.id] = score
        } else {
            groupScores.remove(group.id)
        }
        updateResult()
    }

    private fun updateResult() {
        val totalScore = groupScores.values.sum()
        val checkedCount = groupScores.size
        binding.tvTotalScore.text = "$totalScore 分（已选 $checkedCount 个项目，还剩 ${totalItems - checkedCount} 个未选）"
    }

    private fun initAdaptor() {
        val data = mutableListOf(
            arrayOf("结果解读", "总分 ≥13 分者可诊断为产褥期抑郁症。"),
            arrayOf("参考来源", "Cox JL, et al. Br J Psychiatry. 1987;150:782-6.")
        )
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalListAdapter(data, "20")
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
