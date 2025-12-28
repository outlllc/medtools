package com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Laboratory_department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.Nugent_Scoring_Criteria_fm

class Laboratory_department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("Nugent评分标准（阴道分泌物革兰染色）") { Nugent_Scoring_Criteria_fm() }
    }
}
