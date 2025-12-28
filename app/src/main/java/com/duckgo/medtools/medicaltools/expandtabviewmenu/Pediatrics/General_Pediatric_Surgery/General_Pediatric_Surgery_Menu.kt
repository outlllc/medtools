package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.General_Pediatric_Surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class General_Pediatric_Surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("儿童补液") { TODO("Wait for Fragment") } // { Pediatric_Fluid_Replacement_fm() }
        addMenuItem("PELD评分（儿童终末期肝病）") { TODO("Wait for Fragment") } // { PELD_Score_fm() }
        addMenuItem("临床常用液体成分及张力") { TODO("Wait for Fragment") } // { Fluid_Composition_Tension_fm() }
        addMenuItem("各种损失液每100ml所需补水和电解质液量") { TODO("Wait for Fragment") } // { Loss_Fluid_Replacement_fm() }
        addMenuItem("外科病儿脱水补液量和补液张力") { TODO("Wait for Fragment") } // { Surgical_Pediatric_Dehydration_fm() }
        addMenuItem("小儿肠外营养TPN推荐用量表") { TODO("Wait for Fragment") } // { Pediatric_TPN_Dosage_fm() }
        addMenuItem("儿童每日不显性失水量") { TODO("Wait for Fragment") } // { Pediatric_Insensible_Water_Loss_fm() }
    }
}
