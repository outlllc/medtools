package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentSimpleGestationalAgeAssessmentScaleFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Simple_gestational_age_assessment_scale_fm : BaseFragmentDataBinding<FragmentSimpleGestationalAgeAssessmentScaleFmBinding>(),
    OnCheckedChangeListener {
    override fun getFragmentViewBinding(): FragmentSimpleGestationalAgeAssessmentScaleFmBinding {
        return FragmentSimpleGestationalAgeAssessmentScaleFmBinding.inflate(layoutInflater)
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
        var medCalDataBean1 = MedCalDataBean("结果解读", "胎龄周数=总分+27；各体征的评分如介于两者之间，可用其均数。")
        var medCalDataBean2 = MedCalDataBean("相关解释", "此简易评分法检查项目少，操作简便，是上海市第一妇婴保健院参考国外几种方法，在4000多例临床新生儿实践后，经电子计算机采用逐步回归分析，筛选出足底纹理、乳头形成、指甲、皮肤组织4项体征最重要，使之变成极为方便的简易评估法，即总分加上常数27就是该新生儿的胎龄周数，不必查表。\n" +
                "此评估量表不能评估27周以下的极低胎龄儿。" )
        var medCalDataBean3 = MedCalDataBean("参考来源", "邵肖梅，叶鸿瑁，丘小汕主编. 实用新生儿学（第4版）. 2011年.")
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
    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
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
                }
            }
            R.id.Rgroup3 -> {
                group3_checked = -1
                when (checkedId) {
                    R.id.rb31 -> group3_result = 1
                    R.id.rb32 -> group3_result = 2
                    R.id.rb33 -> group3_result = 3
                }
            }
            R.id.Rgroup4 -> {
                group4_checked = -1
                when (checkedId) {
                    R.id.rb40 -> group4_result = 0
                    R.id.rb41 -> group4_result = 1
                    R.id.rb42 -> group4_result = 2
                    R.id.rb43 -> group4_result = 3
                    R.id.rb44 -> group4_result = 4
                }
            }
        }
        total_score = group1_result + group2_result + group3_result + group4_result
        uncheck_item = 4 + group1_checked + group2_checked + group3_checked + group4_checked
        binding.tv1.text = "  ${total_score}分 （您已选择${4-uncheck_item}个必选项，还有${uncheck_item}个必选项未选）"
        binding.tv2.text = "估计孕周为  ${total_score+27}周"
        total_score = 0
    }

}