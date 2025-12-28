package com.duckgo.medtools.medicaltools.expandtabviewmenu.Other.Reproductive_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Tanner_Stage_fm
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Reproductive_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("人类精液变量参考值") { Semen_reference_values_fm() }
        addMenuItem("tanner分期(性发育)") { Tanner_Stage_fm() }
        addMenuItem("性早熟疾病的辅助检查结果") { Precocious_Puberty_Auxiliary_Examination_fm() }
    }
}
