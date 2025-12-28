package com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Nuclear_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Nuclear_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("CTSI（急性胰腺炎CT严重程度指数）") { TODO("Wait for Fragment") } // { CTSI_fm() }
        addMenuItem("Chiari畸形CT/MRI表现（小脑扁桃体下疝畸形）") { TODO("Wait for Fragment") } // { Chiari_Malformation_fm() }
    }
}
