package com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Thoracic_Surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Thoracic_Surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("Butchart分期（弥漫型恶性胸膜间皮瘤）") { TODO("Wait for Fragment") } // { ButchartStaging_fm() }
        addMenuItem("胸膜间皮瘤TNM分期") { TODO("Wait for Fragment") } // { PleuralMesotheliomaTNM_fm() }
        addMenuItem("Crawford分型（胸腹主动脉瘤）") { TODO("Wait for Fragment") } // { CrawfordClassification_fm() }
        addMenuItem("漏斗胸指数") { TODO("Wait for Fragment") } // { PectusExcavatumIndex_fm() }
    }
}
