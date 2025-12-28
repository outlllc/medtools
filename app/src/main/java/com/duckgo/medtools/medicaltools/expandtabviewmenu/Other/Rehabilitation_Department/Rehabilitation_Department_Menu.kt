package com.duckgo.medtools.medicaltools.expandtabviewmenu.Other.Rehabilitation_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Rehabilitation_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("SF-36健康调查简表") { TODO("Wait for Fragment") } // { SF36_fm() }
        addMenuItem("Barthel指数评定") { TODO("Wait for Fragment") } // { Barthel_Index_fm() }
        addMenuItem("FIM评定量表（功能独立性评定量表）") { TODO("Wait for Fragment") } // { FIM_Scale_fm() }
        addMenuItem("PVS表（持续性植物状态评分表）") { TODO("Wait for Fragment") } // { PVS_Score_fm() }
    }
}
