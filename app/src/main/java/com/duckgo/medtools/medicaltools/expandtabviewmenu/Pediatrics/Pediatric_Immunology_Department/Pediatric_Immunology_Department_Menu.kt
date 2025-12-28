package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Immunology_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Immunology_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("KD的诊断标准（川崎病）") { TODO("Wait for Fragment") } // { Kawasaki_Disease_fm() }
        addMenuItem("风湿热Jones诊断标准") { TODO("Wait for Fragment") } // { Jones_Criteria_fm() }
    }
}
