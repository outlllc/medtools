package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Cardiovascular_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("婴儿心衰分级评分表") { TODO("Wait for Fragment") } // { InfantHeartFailure_fm() }
        addMenuItem("动脉导管未闭评分标准") { TODO("Wait for Fragment") } // { PDA_Score_fm() }
        addMenuItem("儿童心衰指数评分（纽约大学）") { TODO("Wait for Fragment") } // { PediatricHeartFailure_fm() }
    }
}
