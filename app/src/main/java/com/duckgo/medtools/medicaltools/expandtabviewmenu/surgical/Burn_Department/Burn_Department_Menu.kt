package com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Burn_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Burn_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("新九分法（烧伤面积估计）") { TODO("Wait for Fragment") } // { RuleOfNines_fm() }
        addMenuItem("Brooke公式（烧伤补液）") { TODO("Wait for Fragment") } // { BrookeFormula_fm() }
        addMenuItem("烧伤补液公式（第三军医大学）") { TODO("Wait for Fragment") } // { BurnResuscitation_fm() }
        addMenuItem("Parkland公式（烧伤补液）") { TODO("Wait for Fragment") } // { ParklandFormula_fm() }
        addMenuItem("烧伤严重程度分类") { TODO("Wait for Fragment") } // { BurnSeverity_fm() }
        addMenuItem("三度四分法（烧伤深度分级）") { TODO("Wait for Fragment") } // { BurnDepth_fm() }
        addMenuItem("烧伤热量供应公式（第三军医大学）") { TODO("Wait for Fragment") } // { BurnCalorieSupply_fm() }
    }
}
