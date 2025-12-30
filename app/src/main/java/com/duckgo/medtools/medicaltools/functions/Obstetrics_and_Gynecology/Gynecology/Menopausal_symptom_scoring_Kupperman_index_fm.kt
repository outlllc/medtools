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
    
    // 明确定义每个 RadioGroup 对应的基本分（权数）
    private val weights by lazy {
        mapOf(
            binding.Rgroup1.id to 4,
            binding.Rgroup13.id to 2,
            binding.Rgroup2.id to 2,
            binding.Rgroup3.id to 2,
            binding.Rgroup4.id to 1,
            binding.Rgroup5.id to 1,
            binding.Rgroup6.id to 1,
            binding.Rgroup7.id to 1,
            binding.Rgroup8.id to 1,
            binding.Rgroup9.id to 1,
            binding.Rgroup10.id to 1,
            binding.Rgroup11.id to 1,
            binding.Rgroup12.id to 1
        )
    }

    override fun getFragmentViewBinding() = FragmentMenopausalSymptomScoringKuppermanIndexFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val groups = listOf(
            binding.Rgroup1, binding.Rgroup2, binding.Rgroup3, binding.Rgroup4, binding.Rgroup5,
            binding.Rgroup6, binding.Rgroup7, binding.Rgroup8, binding.Rgroup9, binding.Rgroup10,
            binding.Rgroup11, binding.Rgroup12, binding.Rgroup13
        )
        groups.forEach { it.setOnCheckedChangeListener(this) }
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
        // 根据选中的 RadioButton ID 判断程度系数 (0, 1, 2, 3)
        val degreeCoefficient = when (checkedId) {
            // 0分项
            R.id.rb10, R.id.rb130, R.id.rb20, R.id.rb30, R.id.rb40, R.id.rb50, R.id.rb60, R.id.rb70, R.id.rb80, R.id.rb90, R.id.rb100, R.id.rb110, R.id.rb120 -> 0
            // 1分项
            R.id.rb11, R.id.rb131, R.id.rb21, R.id.rb31, R.id.rb41, R.id.rb51, R.id.rb61, R.id.rb71, R.id.rb81, R.id.rb91, R.id.rb101, R.id.rb111, R.id.rb121 -> 1
            // 2分项
            R.id.rb12, R.id.rb132, R.id.rb22, R.id.rb32, R.id.rb42, R.id.rb52, R.id.rb62, R.id.rb72, R.id.rb82, R.id.rb92, R.id.rb102, R.id.rb112, R.id.rb122 -> 2
            // 3分项
            R.id.rb13, R.id.rb133, R.id.rb23, R.id.rb33, R.id.rb43, R.id.rb53, R.id.rb63, R.id.rb73, R.id.rb83, R.id.rb93, R.id.rb103, R.id.rb113, R.id.rb123 -> 3
            else -> 0
        }
        
        val weight = weights[group.id] ?: 1
        groupScores[group.id] = degreeCoefficient * weight
        
        val totalScore = groupScores.values.sum()
        val checkedCount = groupScores.size
        binding.tv141.text = "$totalScore 分（已选 $checkedCount 个，还剩 ${13 - checkedCount} 个未选）"
    }
}
