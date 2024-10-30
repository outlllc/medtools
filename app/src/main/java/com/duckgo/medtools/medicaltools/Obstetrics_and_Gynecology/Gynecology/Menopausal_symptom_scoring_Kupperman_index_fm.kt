package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import androidx.compose.material3.RichTooltip
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentMenopausalSymptomScoringKuppermanIndexFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Menopausal_symptom_scoring_Kupperman_index_fm : BaseFragmentDataBinding<FragmentMenopausalSymptomScoringKuppermanIndexFmBinding>(),OnCheckedChangeListener {
    override fun getFragmentViewBinding(): FragmentMenopausalSymptomScoringKuppermanIndexFmBinding {
        return FragmentMenopausalSymptomScoringKuppermanIndexFmBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("结果解读", "①症状评分：基本分×程度评分；\n" +
                "②各项症状评分相加之和为总分，总计分0~63分；\n" +
                "③更年期症状的病情程度评价标准：轻度：总分15~20分；中度：总分20~35分；重度：＞35分。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "曹泽毅主编. 《妇产科临床手册》, 山东科学技术出版社, 1998年.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
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
        binding.Rgroup8.setOnCheckedChangeListener(this)
        binding.Rgroup9.setOnCheckedChangeListener(this)
        binding.Rgroup10.setOnCheckedChangeListener(this)
        binding.Rgroup11.setOnCheckedChangeListener(this)
        binding.Rgroup12.setOnCheckedChangeListener(this)
        binding.Rgroup13.setOnCheckedChangeListener(this)

    }

    var total_score = 0
    var uncheck_item = 13
    var group1_result = 0
    var group2_result = 0
    var group3_result = 0
    var group4_result = 0
    var group5_result = 0
    var group6_result = 0
    var group7_result = 0
    var group8_result = 0
    var group9_result = 0
    var group10_result = 0
    var group11_result = 0
    var group12_result = 0
    var group13_result = 0
    var group1_checked = 0
    var group2_checked = 0
    var group3_checked = 0
    var group4_checked = 0
    var group5_checked = 0
    var group6_checked = 0
    var group7_checked = 0
    var group8_checked = 0
    var group9_checked = 0
    var group10_checked = 0
    var group11_checked = 0
    var group12_checked = 0
    var group13_checked = 0

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when(group?.id){
            R.id.Rgroup1 -> {
                group1_checked = -1
                when(checkedId){
                    R.id.rb10 -> group1_result = 0
                    R.id.rb11 -> group1_result = 1*4
                    R.id.rb12 -> group1_result = 2*4
                    R.id.rb13 -> group1_result = 3*4
                }
            }
            R.id.Rgroup2 -> {
                group2_checked = -1
                when(checkedId){
                    R.id.rb20 -> group2_result = 0
                    R.id.rb21 -> group2_result = 1*2
                    R.id.rb22 -> group2_result = 2*2
                    R.id.rb23 -> group2_result = 3*2
                }
            }
            R.id.Rgroup3 -> {
                group3_checked = -1
                when(checkedId){
                    R.id.rb30 -> group3_result = 0
                    R.id.rb31 -> group3_result = 1*2
                    R.id.rb32 -> group3_result = 2*2
                    R.id.rb33 -> group3_result = 3*2
                }
            }
            R.id.Rgroup4 -> {
                group4_checked = -1
                when(checkedId){
                    R.id.rb40 -> group4_result = 0
                    R.id.rb41 -> group4_result = 1*1
                    R.id.rb42 -> group4_result = 2*1
                    R.id.rb43 -> group4_result = 3*1
                }
            }
            R.id.Rgroup5 -> {
                group5_checked = -1
                when(checkedId){
                    R.id.rb50 -> group5_result = 0
                    R.id.rb51 -> group5_result = 1*1
                    R.id.rb52 -> group5_result = 2*1
                    R.id.rb53 -> group5_result = 3*1
                }
            }
            R.id.Rgroup6 -> {
                group6_checked = -1
                when(checkedId){
                    R.id.rb60 -> group6_result = 0
                    R.id.rb61 -> group6_result = 1*1
                    R.id.rb62 -> group6_result = 2*1
                    R.id.rb63 -> group6_result = 3*1
                }
            }
            R.id.Rgroup7 -> {
                group7_checked = -1
                when(checkedId){
                    R.id.rb70 -> group7_result = 0
                    R.id.rb71 -> group7_result = 1*1
                    R.id.rb72 -> group7_result = 2*1
                    R.id.rb73 -> group7_result = 3*1
                }
            }
            R.id.Rgroup8 -> {
                group8_checked = -1
                when(checkedId){
                    R.id.rb80 -> group8_result = 0
                    R.id.rb81 -> group8_result = 1*1
                    R.id.rb82 -> group8_result = 2*1
                    R.id.rb83 -> group8_result = 3*1
                }
            }
            R.id.Rgroup9 -> {
                group9_checked = -1
                when(checkedId){
                    R.id.rb90 -> group9_result = 0
                    R.id.rb91 -> group9_result = 1*1
                    R.id.rb92 -> group9_result = 2*1
                    R.id.rb93 -> group9_result = 3*1
                }
            }
            R.id.Rgroup10 -> {
                group10_checked = -1
                when(checkedId){
                    R.id.rb100 -> group10_result = 0
                    R.id.rb101 -> group10_result = 1*1
                    R.id.rb102 -> group10_result = 2*1
                    R.id.rb103 -> group10_result = 3*1
                }
            }
            R.id.Rgroup11 -> {
                group11_checked = -1
                when(checkedId){
                    R.id.rb110 -> group11_result = 0
                    R.id.rb111 -> group11_result = 1*1
                    R.id.rb112 -> group11_result = 2*1
                    R.id.rb113 -> group11_result = 3*1
                }
            }
            R.id.Rgroup12 -> {
                group12_checked = -1
                when(checkedId){
                    R.id.rb120 -> group12_result = 0
                    R.id.rb121 -> group12_result = 1*1
                    R.id.rb122 -> group12_result = 2*1
                    R.id.rb123 -> group12_result = 3*1
                }
            }
            R.id.Rgroup13 -> {
                group13_checked = -1
                when(checkedId){
                    R.id.rb130 -> group13_result = 0
                    R.id.rb131 -> group13_result = 1*2
                    R.id.rb132 -> group13_result = 2*2
                    R.id.rb133 -> group13_result = 3*2
                }
            }
        }
        total_score = group1_result + group2_result + group3_result + group4_result + group5_result +
                group6_result + group7_result + group8_result + group9_result + group10_result +
                group11_result + group12_result + group13_result
        binding.tv141.text = "  ${total_score}分 （您已选择${13-uncheck_item}个必选项，还有${uncheck_item}个必选项未选）"
        total_score = 0
    }
}