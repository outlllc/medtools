package com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Ultrasound_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Ultrasound_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("心输出量（超声）") { TODO("Wait for Fragment") } // { Cardiac_Output_Ultrasound_fm() }
    }
}
