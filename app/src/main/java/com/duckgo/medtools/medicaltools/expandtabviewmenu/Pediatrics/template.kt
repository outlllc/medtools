package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Template_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        // addMenuItem("条目名称") { TODO("Wait for Fragment") } // { ..._fm() }
    }
}
