package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import androidx.compose.ui.geometry.Rect
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentVvcScoringCriteriaFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vvc_Scoring_Criteria_fm : BaseFragmentDataBinding<FragmentVvcScoringCriteriaFmBinding>(),
    OnCheckedChangeListener {
    override fun getFragmentViewBinding(): FragmentVvcScoringCriteriaFmBinding {
        return FragmentVvcScoringCriteriaFmBinding.inflate(layoutInflater)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Rgroup1.setOnCheckedChangeListener(this)
        binding.Rgroup2.setOnCheckedChangeListener(this)
        binding.Rgroup3.setOnCheckedChangeListener(this)
        binding.Rgroup4.setOnCheckedChangeListener(this)
        binding.Rgroup5.setOnCheckedChangeListener(this)
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("结果解读", "有关症状严重程度，2004年中华医学会妇产科分会感染协作组提出了评分标准：评分≤6分者为轻、中度VVC，≥7分者为重度VVC。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }

    var total_score = 0
    var uncheck_item = 5
    var group1_result = 0
    var group2_result = 0
    var group3_result = 0
    var group4_result = 0
    var group5_result = 0
    var group1_checked = 0
    var group2_checked = 0
    var group3_checked = 0
    var group4_checked = 0
    var group5_checked = 0
    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        when (group?.id) {
            R.id.Rgroup1 -> {
                group1_checked = -1
                when (checkedId) {
                    R.id.rb10 -> group1_result = 0
                    R.id.rb11 -> group1_result = 1
                    R.id.rb12 -> group1_result = 2
                    R.id.rb13 -> group1_result = 3
                }
            }
            R.id.Rgroup2 -> {
                group2_checked = -1
                when (checkedId) {
                    R.id.rb20 -> group2_result = 0
                    R.id.rb21 -> group2_result = 1
                    R.id.rb22 -> group2_result = 2
                    R.id.rb23 -> group2_result = 3
                }
            }
            R.id.Rgroup3 -> {
                group3_checked = -1
                when (checkedId) {
                    R.id.rb30 -> group3_result = 0
                    R.id.rb31 -> group3_result = 1
                    R.id.rb32 -> group3_result = 2
                    R.id.rb33 -> group3_result = 3
                }
            }
            R.id.Rgroup4 -> {
                group4_checked = -1
                when (checkedId) {
                    R.id.rb40 -> group4_result = 0
                    R.id.rb43 -> group4_result = 3
                }
            }
            R.id.Rgroup5 -> {
                group5_checked = -1
                when (checkedId) {
                    R.id.rb50 -> group5_result = 0
                    R.id.rb51 -> group5_result = 1
                    R.id.rb52 -> group5_result = 2
                    R.id.rb53 -> group5_result = 3
                }
            }
        }
        total_score = group1_result + group2_result + group3_result + group4_result + group5_result
        uncheck_item = 5 + group1_checked + group2_checked + group3_checked + group4_checked + group5_checked
        binding.tv141.text = "  ${total_score}分 （您已选择${5-uncheck_item}个必选项，还有${uncheck_item}个必选项未选）"
        total_score = 0
    }

}