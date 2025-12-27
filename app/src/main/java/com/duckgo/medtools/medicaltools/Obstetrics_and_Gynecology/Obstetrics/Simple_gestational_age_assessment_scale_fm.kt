package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentSimpleGestationalAgeAssessmentScaleFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Simple_gestational_age_assessment_scale_fm : Fragment(), RadioGroup.OnCheckedChangeListener {
    private var _binding: FragmentSimpleGestationalAgeAssessmentScaleFmBinding? = null
    private val binding get() = _binding!!
    private val scores = mutableMapOf<Int, Int>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSimpleGestationalAgeAssessmentScaleFmBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(binding.Rgroup1, binding.Rgroup2, binding.Rgroup3, binding.Rgroup4).forEach {
            it.setOnCheckedChangeListener(this)
        }
        initAdaptor()
    }

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val score = when (checkedId) {
            R.id.rb11, R.id.rb21, R.id.rb31, R.id.rb41 -> 1
            R.id.rb12, R.id.rb22, R.id.rb32, R.id.rb42 -> 2
            R.id.rb13, R.id.rb23, R.id.rb33, R.id.rb43 -> 3
            R.id.rb14, R.id.rb44 -> 4
            else -> 0
        }
        scores[group.id] = score
        updateResult()
    }

    private fun updateResult() {
        val totalScore = scores.values.sum()
        val checkedCount = scores.size
        binding.tv1.text = "$totalScore 分（已选 $checkedCount 个，还剩 ${4 - checkedCount} 个未选）"
        binding.tv2.text = "估计孕周为 ${totalScore + 27} 周"
    }

    private fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalAdapterDatabean(initDataAppendix(), 20)
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    private fun initDataAppendix() = listOf(
        MedCalDataBean("结果解读", "胎龄周数 = 总分 + 27。"),
        MedCalDataBean("相关解释", "筛选出足底纹理、乳头形成、指甲、皮肤组织4项体征。此评估量表不能评估27周以下的极低胎龄儿。"),
        MedCalDataBean("参考来源", "《实用新生儿学》（第4版）. 2011年.")
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
