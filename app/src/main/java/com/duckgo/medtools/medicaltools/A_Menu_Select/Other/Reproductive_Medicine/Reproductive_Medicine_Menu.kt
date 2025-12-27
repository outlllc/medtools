package com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Reproductive_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Tanner_Stage_fm
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Reproductive_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("人类精液变量参考值", "tanner分期(性发育)", "性早熟疾病的辅助检查结果")
    }

    override fun onItemClick(position: Int) {
        val fragment = when (position) {
            0 -> Semen_reference_values_fm()
            1 -> Tanner_Stage_fm()
            2 -> Precocious_Puberty_Auxiliary_Examination_fm()
            else -> null
        }
        fragment?.let { inflateFragment(it) }
    }
}