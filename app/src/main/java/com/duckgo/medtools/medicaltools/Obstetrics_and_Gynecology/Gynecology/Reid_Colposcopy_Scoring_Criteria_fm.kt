package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.ReidColposcopyScoringCriteriaFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Reid_Colposcopy_Scoring_Criteria_fm:BaseFragmentDataBinding<ReidColposcopyScoringCriteriaFmBinding>(),
    OnCheckedChangeListener {
    override fun getFragmentViewBinding(): ReidColposcopyScoringCriteriaFmBinding {
        return ReidColposcopyScoringCriteriaFmBinding.inflate(layoutInflater)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Rgroup1.setOnCheckedChangeListener(this)
        binding.Rgroup2.setOnCheckedChangeListener(this)
        binding.Rgroup3.setOnCheckedChangeListener(this)
        binding.Rgroup4.setOnCheckedChangeListener(this)
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("注释", "前三项是指\"边界\"、\"颜色\"、\"血管\"三项总得分")
        var medCalDataBean2 = MedCalDataBean("结果解读", " RCI总分：\n" +
                "0～2分：HPV/CINⅠ；\n" +
                "3～5分：CINⅠ-CINⅡ；\n" +
                "6～8分：CINⅡ-CINⅢ。")
        var medCalDataBean3 = MedCalDataBean("参考来源", "Ferris DG, Greenberg MD. Reid's Colposcopic Index. J Fam Pract. 1994;39(1):65-70.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3)
        return data_appendix
    }

    var total_score = 0
    var uncheck_item = 4
    var group1_result = 0
    var group2_result = 0
    var group3_result = 0
    var group4_result = 0
    var group1_checked = 0
    var group2_checked = 0
    var group3_checked = 0
    var group4_checked = 0
    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when (group?.id) {
            R.id.Rgroup1 -> {
                group1_checked = -1
                when (checkedId) {
                    R.id.rb10 -> group1_result = 0
                    R.id.rb11 -> group1_result = 1
                    R.id.rb12 -> group1_result = 2
                }
            }
            R.id.Rgroup2 -> {
                group2_checked = -1
                when (checkedId) {
                    R.id.rb20 -> group2_result = 0
                    R.id.rb21 -> group2_result = 1
                    R.id.rb22 -> group2_result = 2
                }
            }
            R.id.Rgroup3 -> {
                group3_checked = -1
                when (checkedId) {
                    R.id.rb30 -> group3_result = 0
                    R.id.rb31 -> group3_result = 1
                    R.id.rb32 -> group3_result = 2
                }
            }
            R.id.Rgroup4 -> {
                group4_checked = -1
                when (checkedId) {
                    R.id.rb40 -> group4_result = 0
                    R.id.rb41 -> group4_result = 1
                    R.id.rb42 -> group4_result = 2
                }
            }
        }
        total_score = group1_result + group2_result + group3_result + group4_result
        uncheck_item = 4 + group1_checked + group2_checked + group3_checked + group4_checked
        binding.tv141.text = "  ${total_score}分 （您已选择${4-uncheck_item}个必选项，还有${uncheck_item}个必选项未选）"
        total_score = 0
    }
}