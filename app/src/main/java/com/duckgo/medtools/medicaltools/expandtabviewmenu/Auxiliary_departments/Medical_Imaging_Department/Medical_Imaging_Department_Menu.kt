package com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Medical_Imaging_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Medical_Imaging_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("BI-RADS（乳腺影像报告和数据系统）") { TODO("Wait for Fragment") } // { BIRADS_fm() }
        addMenuItem("Chiari畸形CT/MRI表现（小脑扁桃体下疝畸形）") { TODO("Wait for Fragment") } // { Chiari_Malformation_fm() }
    }
}
