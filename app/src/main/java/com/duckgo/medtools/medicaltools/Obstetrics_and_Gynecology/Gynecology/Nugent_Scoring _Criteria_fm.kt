package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.NugentScoringCriteriaFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Nugent_Scoring_Criteria_fm : BaseFragmentDataBinding<NugentScoringCriteriaFmBinding>(), RadioGroup.OnCheckedChangeListener {
    
    private val scores = mutableMapOf<Int, Int>()
    private val totalItems = 3

    override fun getFragmentViewBinding() = NugentScoringCriteriaFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(binding.Rgroup1, binding.Rgroup2, binding.Rgroup3).forEach {
            it.setOnCheckedChangeListener(this)
        }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun initData_appendix() = listOf(
        MedCalDataBean("结果解读", "总分值≥7分为细菌性阴道病。"),
        MedCalDataBean("相关解释", "0：未见；1+：<1个；2+：1～4个；3+：5～30个；4+：>30个。"),
        MedCalDataBean("参考来源", "J Clin Microbiol. 1991;29(2):297-301.")
    )

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val score = when (checkedId) {
            R.id.rb10, R.id.rb20, R.id.rb30 -> 0
            R.id.rb11, R.id.rb21, R.id.rb31 -> 1
            R.id.rb12, R.id.rb22, R.id.rb32 -> 2
            R.id.rb13, R.id.rb23 -> 3
            R.id.rb14, R.id.rb24 -> 4
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
