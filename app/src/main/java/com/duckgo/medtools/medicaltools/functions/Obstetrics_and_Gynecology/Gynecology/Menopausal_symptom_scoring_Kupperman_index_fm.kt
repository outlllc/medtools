package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.medicaltools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentMenopausalSymptomScoringKuppermanIndexFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Menopausal_symptom_scoring_Kupperman_index_fm : BaseFragmentDataBinding<FragmentMenopausalSymptomScoringKuppermanIndexFmBinding>(), RadioGroup.OnCheckedChangeListener {
    
    private val groupScores = mutableMapOf<Int, Int>()
    private val weights = mapOf(
        R.id.Rgroup1 to 4, R.id.Rgroup2 to 2, R.id.Rgroup3 to 2, R.id.Rgroup13 to 2,
        R.id.Rgroup4 to 1, R.id.Rgroup5 to 1, R.id.Rgroup6 to 1, R.id.Rgroup7 to 1,
        R.id.Rgroup8 to 1, R.id.Rgroup9 to 1, R.id.Rgroup10 to 1, R.id.Rgroup11 to 1, R.id.Rgroup12 to 1
    )

    override fun getFragmentViewBinding() = FragmentMenopausalSymptomScoringKuppermanIndexFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(
            binding.Rgroup1, binding.Rgroup2, binding.Rgroup3, binding.Rgroup4, binding.Rgroup5,
            binding.Rgroup6, binding.Rgroup7, binding.Rgroup8, binding.Rgroup9, binding.Rgroup10,
            binding.Rgroup11, binding.Rgroup12, binding.Rgroup13
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
        MedCalDataBean("结果解读", "①评分：基本分×程度评分；\n②总分0~63分；\n③轻度：15~20分；中度：20~35分；重度：＞35分。"),
        MedCalDataBean("参考来源", "曹泽毅主编. 《妇产科临床手册》, 1998年.")
    )

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val degree = when (checkedId % 10) {
            0 -> 0
            1 -> 1
            2 -> 2
            3 -> 3
            else -> 0
        }
        val weight = weights[group.id] ?: 1
        groupScores[group.id] = degree * weight
        
        val totalScore = groupScores.values.sum()
        val checkedCount = groupScores.size
        binding.tv141.text = "$totalScore 分（已选 $checkedCount 个，还剩 ${13 - checkedCount} 个未选）"
    }
}
