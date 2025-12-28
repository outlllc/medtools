package com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Interventional_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Interventional_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("Mayo系统（PCI并发症风险评分）") { TODO("Wait for Fragment") } // { Mayo_PCI_Risk_fm() }
    }
}
