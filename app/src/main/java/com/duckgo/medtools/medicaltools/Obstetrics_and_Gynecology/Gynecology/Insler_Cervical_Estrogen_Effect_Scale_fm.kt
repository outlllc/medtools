package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.InslerCervicalEstrogenEffectScaleFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Insler_Cervical_Estrogen_Effect_Scale_fm:BaseFragmentDataBinding<InslerCervicalEstrogenEffectScaleFmBinding>(),
    OnCheckedChangeListener {
    override fun getFragmentViewBinding(): InslerCervicalEstrogenEffectScaleFmBinding {
        return InslerCervicalEstrogenEffectScaleFmBinding.inflate(layoutInflater)
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
        var medCalDataBean1 = MedCalDataBean("结果解读", "宫颈评分与卵泡的发育及血雌激素水平呈正相关，达10-12分时，预示排卵即将发生。0-3分，功能不全；4-7分，功能不良；8-10分，功能良好；10-12分，功能优秀。")
        var medCalDataBean2 = MedCalDataBean("相关解释", "宫颈粘液可以作为一种间接评估体内雌激素水平的半定量检测指标。" )
        var medCalDataBean3 = MedCalDataBean("参考来源", "1. The FIGO 2002 Staging and Risk Factor Scoring System for gestational trophoblastic disease. Update and critical discussion: 2015\n" +
                "2. 丰有吉主编. 妇产科学（八年制）（第2版）. 人民卫生出版社. 2010年. p364.")
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
                    R.id.rb41 -> group4_result = 1
                    R.id.rb42 -> group4_result = 2
                    R.id.rb43 -> group4_result = 3
                }
            }
        }
        total_score = group1_result + group2_result + group3_result + group4_result
        uncheck_item = 4 + group1_checked + group2_checked + group3_checked + group4_checked
        binding.tv141.text = "  ${total_score}分 （您已选择${4-uncheck_item}个必选项，还有${uncheck_item}个必选项未选）"
        total_score = 0
    }
}