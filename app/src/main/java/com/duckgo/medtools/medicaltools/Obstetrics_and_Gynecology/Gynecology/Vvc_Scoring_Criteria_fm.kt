package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentVvcScoringCriteriaFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vvc_Scoring_Criteria_fm : BaseFragmentDataBinding<FragmentVvcScoringCriteriaFmBinding>(), RadioGroup.OnCheckedChangeListener {
    
    private val scores = mutableMapOf<Int, Int>()
    private val totalItems = 5

    override fun getFragmentViewBinding() = FragmentVvcScoringCriteriaFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(binding.Rgroup1, binding.Rgroup2, binding.Rgroup3, binding.Rgroup4, binding.Rgroup5).forEach {
            it.setOnCheckedChangeListener(this)
        }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalAdapterDatabean(initData_appendix(), 20)
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun initData_appendix() = listOf(
        MedCalDataBean("结果解读", "评分≤6分者为轻、中度VVC，≥7分者为重度VVC。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val score = when (checkedId) {
            R.id.rb10, R.id.rb20, R.id.rb30, R.id.rb40, R.id.rb50 -> 0
            R.id.rb11, R.id.rb21, R.id.rb31, R.id.rb51 -> 1
            R.id.rb12, R.id.rb22, R.id.rb32, R.id.rb52 -> 2
            R.id.rb13, R.id.rb23, R.id.rb33, R.id.rb43, R.id.rb53 -> 3
            else -> 0
        }
        scores[group.id] = score
        updateResult()
    }

    private fun updateResult() {
        val totalScore = scores.values.sum()
        val checkedCount = scores.size
        binding.tv141.text = "$totalScore 分（已选 $checkedCount 个，还剩 ${totalItems - checkedCount} 个未选）"
    }
}
