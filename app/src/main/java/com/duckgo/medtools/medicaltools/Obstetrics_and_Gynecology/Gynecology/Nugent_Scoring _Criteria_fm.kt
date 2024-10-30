package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.NugentScoringCriteriaFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Nugent_Scoring_Criteria_fm:BaseFragmentDataBinding<NugentScoringCriteriaFmBinding>(),
    OnCheckedChangeListener {
    override fun getFragmentViewBinding(): NugentScoringCriteriaFmBinding {
        return NugentScoringCriteriaFmBinding.inflate(layoutInflater)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Rgroup1.setOnCheckedChangeListener(this)
        binding.Rgroup2.setOnCheckedChangeListener(this)
        binding.Rgroup3.setOnCheckedChangeListener(this)
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("结果解读", "按每10个油镜视野下（×1000倍）观察到的每种细菌形态的平均数量进行计数并分配分值：0：未见细菌；1+：少于一个细菌；2+：1～4个细菌；3+：5～30个细菌；4+：30个以上细菌。三种细菌总分值≥7分为细菌性阴道病。")
        var medCalDataBean2 = MedCalDataBean("相关解释", "宫颈粘液可以作为一种间接评估体内雌激素水平的半定量检测指标。" )
        var medCalDataBean3 = MedCalDataBean("参考来源", "Nugent RP, Krohn MA, Hillier SL. Reliability of diagnosing bacterial vaginosis is improved by a standardized method of gram stain interpretation. J Clin Microbiol. 1991;29(2):297-301.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3)
        return data_appendix
    }

    var total_score = 0
    var uncheck_item = 3
    var group1_result = 0
    var group2_result = 0
    var group3_result = 0
    var group1_checked = 0
    var group2_checked = 0
    var group3_checked = 0
    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when (group?.id) {
            R.id.Rgroup1 -> {
                group1_checked = -1
                when (checkedId) {
                    R.id.rb10 -> group1_result = 0
                    R.id.rb11 -> group1_result = 1
                    R.id.rb12 -> group1_result = 2
                    R.id.rb13 -> group1_result = 3
                    R.id.rb14 -> group1_result = 4
                }
            }
            R.id.Rgroup2 -> {
                group2_checked = -1
                when (checkedId) {
                    R.id.rb20 -> group2_result = 0
                    R.id.rb21 -> group2_result = 1
                    R.id.rb22 -> group2_result = 2
                    R.id.rb23 -> group2_result = 3
                    R.id.rb24 -> group2_result = 4
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
        }
        total_score = group1_result + group2_result + group3_result
        uncheck_item = 3 + group1_checked + group2_checked + group3_checked
        binding.tv141.text = "  ${total_score}分 （您已选择${3-uncheck_item}个必选项，还有${uncheck_item}个必选项未选）"
        total_score = 0
    }
}