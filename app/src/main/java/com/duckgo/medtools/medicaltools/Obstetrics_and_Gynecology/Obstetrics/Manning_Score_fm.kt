package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentManningScoreFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Manning_Score_fm : Fragment() {
    private var _binding: FragmentManningScoreFmBinding? = null
    private val binding get() = _binding!!
    private val groupScores = mutableMapOf<Int, Int>()
    private val totalItems = 5

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentManningScoreFmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdaptor()
        setupListeners()
    }

    private fun setupListeners() {
        val groups = listOf(binding.rgCer1, binding.rgCer2, binding.rgCer3, binding.rgCer4, binding.rgCer5)
        groups.forEach { group ->
            group.setOnCheckedChangeListener { _, checkedId ->
                val score = when (checkedId) {
                    R.id.rb_cer1_2, R.id.rb_cer2_2, R.id.rb_cer3_2, R.id.rb_cer4_2, R.id.rb_cer5_2 -> 2
                    else -> 0
                }
                groupScores[group.id] = score
                updateResult()
            }
        }
    }

    private fun updateResult() {
        val totalScore = groupScores.values.sum()
        val checkedCount = groupScores.size
        binding.tvTotalScore.text = "$totalScore 分（已选 $checkedCount 个，还剩 ${totalItems - checkedCount} 个未选）"
    }

    private fun initAdaptor() {
        val mainAdapter = MedCalAdapterDatabean(getMainData(), columnWeights = floatArrayOf(1f, 2f, 5f))
        val appendixAdapter = MedCalAdapterDatabean(getAppendixData(), columnWeights = floatArrayOf(1f, 3f))

        binding.rvCombined.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ConcatAdapter(mainAdapter, appendixAdapter)
            overScrollMode = View.OVER_SCROLL_NEVER
            isNestedScrollingEnabled = false
        }
    }

    private fun getMainData() = listOf(
        MedCalDataBean("评分", "胎儿情况", "处理原则"),
        MedCalDataBean("10分", "无急、慢性缺氧", "每周复查1次，高危每周2次"),
        MedCalDataBean("8分", "缺氧可能性小", "每周1次，高危每周2次，羊水过少可终止"),
        MedCalDataBean("6分", "可疑缺氧", "24h内复查，仍≤6或羊水过少终止"),
        MedCalDataBean("4分", "可有缺氧", "24h内复查，仍≤6或羊水过少终止"),
        MedCalDataBean("2分", "急性或伴慢性缺氧", "胎肺成熟终止；不成熟激素治疗48h内终止"),
        MedCalDataBean("0分", "急、慢性缺氧", "终止妊娠，胎肺不成熟同时激素治疗")
    )

    private fun getAppendixData() = listOf(
        MedCalDataBean("相关解释", "5项指标：无应激实验(NST)、胎儿呼吸样运动(FBM)、胎动(FM)、胎儿肌张力(FT)及羊水容量(AFV)。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
