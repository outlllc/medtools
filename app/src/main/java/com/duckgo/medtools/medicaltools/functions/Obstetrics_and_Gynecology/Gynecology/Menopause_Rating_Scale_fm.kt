package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.medicaltools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentMenopauseRatingScaleFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Menopause_Rating_Scale_fm : BaseFragmentDataBinding<FragmentMenopauseRatingScaleFmBinding>(), RadioGroup.OnCheckedChangeListener {
    
    private val scores = mutableMapOf<Int, Int>()
    private val totalItems = 11

    override fun getFragmentViewBinding() = FragmentMenopauseRatingScaleFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(
            binding.Rgroup1, binding.Rgroup2, binding.Rgroup3, binding.Rgroup4,
            binding.Rgroup5, binding.Rgroup6, binding.Rgroup7, binding.Rgroup8,
            binding.Rgroup9, binding.Rgroup10, binding.Rgroup11
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
        MedCalDataBean("结果解读", "轻度（0-4分）；中度（5-8分）；重度（9-15分）；非常严重（＞16分）"),
        MedCalDataBean("参考来源", "Health Qual Life Outcomes.2003 Jul 30；1:28.")
    )

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val score = when (checkedId) {
            R.id.rb10, R.id.rb20, R.id.rb30, R.id.rb40, R.id.rb50, R.id.rb60, R.id.rb70, R.id.rb80, R.id.rb90, R.id.rb100, R.id.rb110 -> 0
            R.id.rb11, R.id.rb21, R.id.rb31, R.id.rb41, R.id.rb51, R.id.rb61, R.id.rb71, R.id.rb81, R.id.rb91, R.id.rb101, R.id.rb111 -> 1
            R.id.rb12, R.id.rb22, R.id.rb32, R.id.rb42, R.id.rb52, R.id.rb62, R.id.rb72, R.id.rb82, R.id.rb92, R.id.rb102, R.id.rb112 -> 2
            R.id.rb13, R.id.rb23, R.id.rb33, R.id.rb43, R.id.rb53, R.id.rb63, R.id.rb73, R.id.rb83, R.id.rb93, R.id.rb103, R.id.rb113 -> 3
            R.id.rb14, R.id.rb24, R.id.rb34, R.id.rb44, R.id.rb54, R.id.rb64, R.id.rb74, R.id.rb84, R.id.rb94, R.id.rb104, R.id.rb114 -> 4
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
