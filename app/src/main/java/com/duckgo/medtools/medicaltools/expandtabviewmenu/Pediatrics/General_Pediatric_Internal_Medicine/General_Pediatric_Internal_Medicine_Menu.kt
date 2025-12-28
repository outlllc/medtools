package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.General_Pediatric_Internal_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class General_Pediatric_Internal_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("儿童体表面积") { TODO("Wait for Fragment") } // { Pediatric_BSA_fm() }
        addMenuItem("小儿常用补液量计算") { TODO("Wait for Fragment") } // { Pediatric_Fluid_Calculation_fm() }
        addMenuItem("小儿气管插管型号及深度") { TODO("Wait for Fragment") } // { Pediatric_Intubation_fm() }
        addMenuItem("小儿基础代谢能耗(HB公式)") { TODO("Wait for Fragment") } // { Pediatric_HB_Formula_fm() }
        addMenuItem("小儿脱水程度及补液方案") { TODO("Wait for Fragment") } // { Pediatric_Dehydration_fm() }
        addMenuItem("儿童哮喘病情严重程度评估") { TODO("Wait for Fragment") } // { Pediatric_Asthma_Severity_fm() }
        addMenuItem("小儿血压参考值") { TODO("Wait for Fragment") } // { Pediatric_BP_Reference_fm() }
        addMenuItem("小儿心率参考值") { TODO("Wait for Fragment") } // { Pediatric_Heart_Rate_fm() }
    }
}
