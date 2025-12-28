package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Emergency_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Emergency_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("儿童补液") { TODO("Wait for Fragment") } // { Pediatric_Fluid_fm() }
        addMenuItem("临床常用液体成分及张力") { TODO("Wait for Fragment") } // { Fluid_Composition_fm() }
        addMenuItem("各种损失液每100ml所需补水 and 电解质液量") { TODO("Wait for Fragment") } // { Loss_Fluid_fm() }
        addMenuItem("外科病儿脱水补液量和补液张力") { TODO("Wait for Fragment") } // { Surgical_Dehydration_fm() }
        addMenuItem("小儿肠外营养TPN推荐用量表") { TODO("Wait for Fragment") } // { Pediatric_TPN_fm() }
        addMenuItem("气管插管尺寸（儿童）") { TODO("Wait for Fragment") } // { Pediatric_ET_Size_fm() }
        addMenuItem("喉梗阻分度") { TODO("Wait for Fragment") } // { Laryngeal_Obstruction_fm() }
        addMenuItem("各类型颅内出血鉴别诊断") { TODO("Wait for Fragment") } // { Ich_Differential_fm() }
        addMenuItem("儿童铅中毒诊断标准（血铅水平测定）") { TODO("Wait for Fragment") } // { Lead_Poisoning_fm() }
    }
}
