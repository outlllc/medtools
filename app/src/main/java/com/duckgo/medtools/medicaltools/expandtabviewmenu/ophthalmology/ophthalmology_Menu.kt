package com.duckgo.medtools.medicaltools.expandtabviewmenu.ophthalmology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class ophthalmology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("Graves眼病分级标准") { TODO("Wait for Fragment") } // { Graves_Ophthalmopathy_Grading_fm() }
        addMenuItem("糖尿病视网膜病变国际临床分类法") { TODO("Wait for Fragment") } // { Diabetic_Retinopathy_Classification_fm() }
        addMenuItem("CAS（Graves眼病病情活动评分）") { TODO("Wait for Fragment") } // { CAS_Score_fm() }
    }
}
