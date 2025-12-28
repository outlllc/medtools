package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.TrophoblasticTumorsFigoModifiedPrognosticScoringSystemFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm : BaseFragmentDataBinding<TrophoblasticTumorsFigoModifiedPrognosticScoringSystemFmBinding>(), RadioGroup.OnCheckedChangeListener {
    
    private val groupScores = mutableMapOf<Int, Int>()
    private val totalItems = 8

    override fun getFragmentViewBinding() = TrophoblasticTumorsFigoModifiedPrognosticScoringSystemFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(
            binding.Rgroup1, binding.Rgroup2, binding.Rgroup3, binding.Rgroup4,
            binding.Rgroup5, binding.Rgroup6, binding.Rgroup7, binding.Rgroup13
        ).forEach { it.setOnCheckedChangeListener(this) }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun initData_appendix() = listOf(
        MedCalDataBean("结果解读", "总分≤6分为低危，≥7分为高危。"),
        MedCalDataBean("参考来源", "1. FIGO 2002 Staging and Risk Factor Scoring System.\n2. 《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val score = when (checkedId) {
            R.id.rb11, R.id.rb21, R.id.rb31, R.id.rb41, R.id.rb131 -> 1
            R.id.rb22, R.id.rb32, R.id.rb42, R.id.rb62, R.id.rb72, R.id.rb132 -> 2
            R.id.rb23, R.id.rb33, R.id.rb53, R.id.rb63, R.id.rb73 -> 4
            else -> 0
        }
        groupScores[group.id] = score
        updateResult()
    }

    private fun updateResult() {
        val totalScore = groupScores.values.sum()
        val checkedCount = groupScores.size
        binding.tv141.text = "$totalScore 分（已选 $checkedCount 个，还剩 ${totalItems - checkedCount} 个未选）"
    }
}
