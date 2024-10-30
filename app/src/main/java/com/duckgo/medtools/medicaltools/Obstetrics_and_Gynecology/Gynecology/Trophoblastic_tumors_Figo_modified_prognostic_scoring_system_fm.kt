package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import androidx.activity.compose.ReportDrawn
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.TrophoblasticTumorsFigoModifiedPrognosticScoringSystemFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm:BaseFragmentDataBinding<TrophoblasticTumorsFigoModifiedPrognosticScoringSystemFmBinding>(),
    OnCheckedChangeListener {
    override fun getFragmentViewBinding(): TrophoblasticTumorsFigoModifiedPrognosticScoringSystemFmBinding {
        return TrophoblasticTumorsFigoModifiedPrognosticScoringSystemFmBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Rgroup1.setOnCheckedChangeListener(this)
        binding.Rgroup2.setOnCheckedChangeListener(this)
        binding.Rgroup3.setOnCheckedChangeListener(this)
        binding.Rgroup4.setOnCheckedChangeListener(this)
        binding.Rgroup5.setOnCheckedChangeListener(this)
        binding.Rgroup6.setOnCheckedChangeListener(this)
        binding.Rgroup7.setOnCheckedChangeListener(this)
        binding.Rgroup13.setOnCheckedChangeListener(this)
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("结果解读", "总分≤6分者为低危，≥7分者为高危。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "1. The FIGO 2002 Staging and Risk Factor Scoring System for gestational trophoblastic disease. Update and critical discussion: 2015\n" +
                "2. 丰有吉主编. 妇产科学（八年制）（第2版）. 人民卫生出版社. 2010年. p364.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }

    var total_score = 0
    var uncheck_item = 8
    var group1_result = 0
    var group2_result = 0
    var group3_result = 0
    var group4_result = 0
    var group5_result = 0
    var group6_result = 0
    var group7_result = 0
    var group13_result = 0
    var group1_checked = 0
    var group2_checked = 0
    var group3_checked = 0
    var group4_checked = 0
    var group5_checked = 0
    var group6_checked = 0
    var group7_checked = 0
    var group13_checked = 0
    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when (group?.id) {
            R.id.Rgroup1 -> {
                group1_checked = -1
                when (checkedId) {
                    R.id.rb10 -> group1_result = 0
                    R.id.rb11 -> group1_result = 1
                    }
                }
            R.id.Rgroup2 -> {
                group2_checked = -1
                when (checkedId) {
                    R.id.rb20 -> group2_result = 0
                    R.id.rb21 -> group2_result = 1
                    R.id.rb22 -> group2_result = 2
                    R.id.rb23 -> group2_result = 4
                }
            }
            R.id.Rgroup3 -> {
                group3_checked = -1
                when (checkedId) {
                    R.id.rb30 -> group3_result = 0
                    R.id.rb31 -> group3_result = 1
                    R.id.rb32 -> group3_result = 2
                    R.id.rb33 -> group3_result = 4
                }
            }
            R.id.Rgroup4 -> {
                group4_checked = -1
                when (checkedId) {
                    R.id.rb41 -> group4_result = 1
                    R.id.rb42 -> group4_result = 2
                }
            }
            R.id.Rgroup5 -> {
                group5_checked = -1
                when (checkedId) {
                    R.id.rb50 -> group5_result = 0
                    R.id.rb51 -> group5_result = 0
                    R.id.rb52 -> group5_result = 1
                    R.id.rb53 -> group5_result = 4
                }
            }
            R.id.Rgroup6 -> {
                group6_checked = -1
                when (checkedId) {
                    R.id.rb61 -> group6_result = 1
                    R.id.rb62 -> group6_result = 2
                    R.id.rb63 -> group6_result = 4
                }
            }
            R.id.Rgroup7 -> {
                group7_checked = -1
                when (checkedId) {
                    R.id.rb72 -> group7_result = 2
                    R.id.rb73 -> group7_result = 4
                }
            }
            R.id.Rgroup13 -> {
                group13_checked = -1
                when (checkedId) {
                    R.id.rb130 -> group13_result = 0
                    R.id.rb131 -> group13_result = 1
                    R.id.rb132 -> group13_result = 2
                }
            }
        }
        total_score = group1_result + group2_result + group3_result + group4_result + group5_result +
                group6_result + group7_result + group13_result
        binding.tv141.text = "  ${total_score}分 （您已选择${8-uncheck_item}个必选项，还有${uncheck_item}个必选项未选）"
        total_score = 0
    }
}