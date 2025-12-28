package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.ReidColposcopyScoringCriteriaFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Reid_Colposcopy_Scoring_Criteria_fm : BaseFragmentDataBinding<ReidColposcopyScoringCriteriaFmBinding>(), RadioGroup.OnCheckedChangeListener {
    
    private val scores = mutableMapOf<Int, Int>()
    private val totalItems = 4

    override fun getFragmentViewBinding() = ReidColposcopyScoringCriteriaFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(binding.Rgroup1, binding.Rgroup2, binding.Rgroup3, binding.Rgroup4).forEach {
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
        MedCalDataBean("注释", "前三项是指\"边界\"、\"颜色\"、\"血管\"三项总得分"),
        MedCalDataBean("结果解读", "RCI总分：\n0～2分：HPV/CINⅠ；\n3～5分：CINⅠ-CINⅡ；\n6～8分：CINⅡ-CINⅢ。"),
        MedCalDataBean("参考来源", "Ferris DG, Greenberg MD. Reid's Colposcopic Index. J Fam Pract. 1994;39(1):65-70.")
    )

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val score = when (checkedId) {
            R.id.rb10, R.id.rb20, R.id.rb30, R.id.rb40 -> 0
            R.id.rb11, R.id.rb21, R.id.rb31, R.id.rb41 -> 1
            R.id.rb12, R.id.rb22, R.id.rb32, R.id.rb42 -> 2
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
