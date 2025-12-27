package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import androidx.compose.runtime.remember
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentStagingOfEndometriosisRAFSStagingFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Staging_of_endometriosis_rAFS_staging_fm : BaseFragmentDataBinding<FragmentStagingOfEndometriosisRAFSStagingFmBinding>(),OnCheckedChangeListener {
    override fun getFragmentViewBinding(): FragmentStagingOfEndometriosisRAFSStagingFmBinding {
        return FragmentStagingOfEndometriosisRAFSStagingFmBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rg1.setOnCheckedChangeListener(this)
        binding.rg2.setOnCheckedChangeListener(this)
        binding.rg3.setOnCheckedChangeListener(this)
        binding.rg4.setOnCheckedChangeListener(this)
        binding.rg5.setOnCheckedChangeListener(this)
        binding.rg6.setOnCheckedChangeListener(this)
        binding.rg7.setOnCheckedChangeListener(this)
        binding.rg8.setOnCheckedChangeListener(this)
        binding.rg9.setOnCheckedChangeListener(this)
        binding.rg10.setOnCheckedChangeListener(this)
        binding.rg11.setOnCheckedChangeListener(this)
        binding.rg12.setOnCheckedChangeListener(this)
        binding.rg13.setOnCheckedChangeListener(this)
        binding.rg14.setOnCheckedChangeListener(this)
        binding.rg15.setOnCheckedChangeListener(this)
        binding.btnClear.setOnClickListener {
            clearAll()
        }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }
    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "注意：膨出分度检查应在最大屏气状态下进行。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
    var total_score = 0
    var group1_2_result = 0
    var group3_4_result = 0
    var group5_6_result = 0
    var group7_8_result = 0
    var group9_10_result = 0
    var group11_12_result = 0
    var group13_14_result = 0
    var group15_result = 0
    var is_rg1_checked = false
    var is_rg2_checked = false
    var is_rg3_checked = false
    var is_rg4_checked = false
    var is_rg5_checked = false
    var is_rg6_checked = false
    var is_rg7_checked = false
    var is_rg8_checked = false
    var is_rg9_checked = false
    var is_rg10_checked = false
    var is_rg11_checked = false
    var is_rg12_checked = false
    var is_rg13_checked = false
    var is_rg14_checked = false
    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        when(group?.id){
            R.id.rg1 -> {
                if (is_rg2_checked) {
                    binding.rg2.clearCheck()
                    is_rg2_checked = false
                }
                when (checkedId) {
                    R.id.rb11 -> group1_2_result = 1
                    R.id.rb12 -> group1_2_result = 2
                    R.id.rb13 -> group1_2_result = 4
                }
                is_rg1_checked = true
            }
            R.id.rg2 -> {
                if (is_rg1_checked) {
                    binding.rg1.clearCheck()
                }
                when(checkedId){
                    R.id.rb21 -> group1_2_result = 2
                    R.id.rb22 -> group1_2_result = 4
                    R.id.rb23 -> group1_2_result = 6
                }
                is_rg2_checked = true
            }
            R.id.rg3 -> {
                if (is_rg4_checked) {
                    binding.rg4.clearCheck()
                }
                when(checkedId){
                    R.id.rb31 -> group3_4_result = 1
                    R.id.rb32 -> group3_4_result = 2
                    R.id.rb33 -> group3_4_result = 4
                }
                is_rg3_checked = true
            }
            R.id.rg4 -> {
                if (is_rg3_checked) {
                    binding.rg3.clearCheck()
                }
                when(checkedId){
                    R.id.rb41 -> group3_4_result = 4
                    R.id.rb42 -> group3_4_result = 16
                    R.id.rb43 -> group3_4_result = 20
                }
                is_rg4_checked = true
            }
            R.id.rg5 -> {
                if (is_rg6_checked){
                    binding.rg6.clearCheck()
                }
                when(checkedId){
                    R.id.rb51 -> group5_6_result = 1
                    R.id.rb52 -> group5_6_result = 2
                    R.id.rb53 -> group5_6_result = 4
                }
                is_rg5_checked = true
            }
            R.id.rg6 -> {
                if (is_rg5_checked){
                    binding.rg5.clearCheck()
                }
                when(checkedId){
                    R.id.rb61 -> group5_6_result = 4
                    R.id.rb62 -> group5_6_result = 16
                    R.id.rb63 -> group5_6_result = 20
                }
                is_rg6_checked = true
            }
            R.id.rg7 -> {
                if (is_rg8_checked) {
                    binding.rg8.clearCheck()
                }
                when(checkedId){
                    R.id.rb71 -> group7_8_result = 1
                    R.id.rb72 -> group7_8_result = 2
                    R.id.rb73 -> group7_8_result = 4
                }
                is_rg7_checked = true
            }
            R.id.rg8 -> {
                if (is_rg7_checked) {
                    binding.rg7.clearCheck()
                }
                when(checkedId){
                    R.id.rb81 -> group7_8_result = 4
                    R.id.rb82 -> group7_8_result = 8
                    R.id.rb83 -> group7_8_result = 16
                }
                is_rg8_checked = true
            }
            R.id.rg9 -> {
                if (is_rg10_checked) {
                    binding.rg10.clearCheck()
                }
                when(checkedId){
                    R.id.rb91 -> group9_10_result = 1
                    R.id.rb92 -> group9_10_result = 2
                    R.id.rb93 -> group9_10_result = 4
                }
                is_rg9_checked = true
            }
            R.id.rg10 -> {
                if (is_rg9_checked) {
                    binding.rg9.clearCheck()
                }
                when(checkedId){
                    R.id.rb101 -> group9_10_result = 4
                    R.id.rb102 -> group9_10_result = 8
                    R.id.rb103 -> group9_10_result = 16
                }
                is_rg10_checked = true
            }
            R.id.rg11 -> {
                if (is_rg12_checked) {
                    binding.rg12.clearCheck()
                }
                when(checkedId){
                    R.id.rb111 -> group11_12_result = 1
                    R.id.rb112 -> group11_12_result = 2
                    R.id.rb113 -> group11_12_result = 4
                }
                is_rg11_checked = true
            }
            R.id.rg12 -> {
                if (is_rg11_checked) {
                    binding.rg11.clearCheck()
                }
                when(checkedId){
                    R.id.rb121 -> group11_12_result = 4
                    R.id.rb122 -> group11_12_result = 8
                    R.id.rb123 -> group11_12_result = 16
                }
                is_rg12_checked = true
            }
            R.id.rg13 -> {
                if (is_rg14_checked) {
                    binding.rg14.clearCheck()
                }
                when(checkedId){
                    R.id.rb131 -> group13_14_result = 1
                    R.id.rb132 -> group13_14_result = 2
                    R.id.rb133 -> group13_14_result = 4
                }
                is_rg13_checked = true
            }
            R.id.rg14 -> {
                if (is_rg13_checked) {
                    binding.rg13.clearCheck()
                }
                when(checkedId){
                    R.id.rb141 -> group13_14_result = 4
                    R.id.rb142 -> group13_14_result = 8
                    R.id.rb143 -> group13_14_result = 16
                }
                is_rg14_checked = true
            }
            R.id.rg15 -> {
                when(checkedId){
                    R.id.rb151 -> group15_result = 4
                    R.id.rb152 -> group15_result = 40
                }
            }
        }
        total_score = group1_2_result + group3_4_result + group5_6_result +
                group7_8_result + group9_10_result + group11_12_result + group13_14_result + group15_result
        binding.tv161.text = "  ${total_score}分"
        total_score = 0
    }

    fun clearAll(){
        binding.rg1.clearCheck()
        binding.rg2.clearCheck()
        binding.rg3.clearCheck()
        binding.rg4.clearCheck()
        binding.rg5.clearCheck()
        binding.rg6.clearCheck()
        binding.rg7.clearCheck()
        binding.rg8.clearCheck()
        binding.rg9.clearCheck()
        binding.rg10.clearCheck()
        binding.rg11.clearCheck()
        binding.rg12.clearCheck()
        binding.rg13.clearCheck()
        binding.rg14.clearCheck()
        binding.rg15.clearCheck()
        total_score = 0
        group1_2_result = 0
        group3_4_result = 0
        group5_6_result = 0
        group7_8_result = 0
        group9_10_result = 0
        group11_12_result = 0
        group13_14_result = 0
        group15_result = 0
        binding.tv161.text = "  ${total_score}分"

    }


}