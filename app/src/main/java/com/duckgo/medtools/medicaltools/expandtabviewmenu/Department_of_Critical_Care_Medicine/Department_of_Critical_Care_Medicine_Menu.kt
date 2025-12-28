package com.duckgo.medtools.medicaltools.expandtabviewmenu.Department_of_Critical_Care_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.comprehensive.Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm

class Department_of_Critical_Care_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("产后出血量估计与休克指数") { Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm() }
        addMenuItem("临床常用呼吸机参数设置") { TODO("Wait for Fragment") } // { Ventilator_Settings_fm() }
        addMenuItem("APACHEII评分系统（急性生理和慢性健康评分）") { TODO("Wait for Fragment") } // { Apache2_Score_fm() }
        addMenuItem("MODS评分") { TODO("Wait for Fragment") } // { Mods_Score_fm() }
        addMenuItem("呼吸机撤离呼吸参数标准") { TODO("Wait for Fragment") } // { Ventilator_Weaning_fm() }
        addMenuItem("不同给氧方法的氧流量和FiO2的关系") { TODO("Wait for Fragment") } // { Oxygen_Flow_FiO2_fm() }
        addMenuItem("SIRS标准（全身炎症反应综合征）") { TODO("Wait for Fragment") } // { Sirs_Criteria_fm() }
        addMenuItem("机械通气适应症") { TODO("Wait for Fragment") } // { Mechanical_Ventilation_Indications_fm() }
        addMenuItem("常用冬眠合剂及其特点") { TODO("Wait for Fragment") } // { Hibernation_Mixtures_fm() }
        addMenuItem("SOFA脓毒症评分（序贯性器官功能衰竭评分）") { TODO("Wait for Fragment") } // { Sofa_Score_fm() }
        addMenuItem("创伤失血量的判定") { TODO("Wait for Fragment") } // { Trauma_Blood_Loss_fm() }
        addMenuItem("外科ICU（SICU）术前、术后病人高危标准") { TODO("Wait for Fragment") } // { Sicu_High_Risk_Criteria_fm() }
        addMenuItem("不同给氧方式与气浓度的关系") { TODO("Wait for Fragment") } // { Oxygen_Delivery_Methods_fm() }
        addMenuItem("不同肺顺应性状态下呼吸机各种参数的初调值") { TODO("Wait for Fragment") } // { Ventilator_Initial_Params_fm() }
        addMenuItem("SAPS II（简化的急性生理功能评分系统）") { TODO("Wait for Fragment") } // { Saps2_Score_fm() }
        addMenuItem("气管插管尺寸（儿童）") { TODO("Wait for Fragment") } // { Pediatric_Endotracheal_Tube_Size_fm() }
        addMenuItem("昏迷、植物状态、最低意识状态和闭锁综合征的临床特征比较") { TODO("Wait for Fragment") } // { Consciousness_States_Comparison_fm() }
        addMenuItem("Wells评分（下肢深静脉血栓形成DVT诊断评分）") { TODO("Wait for Fragment") } // { Wells_Dvt_Score_fm() }
        addMenuItem("RASS（Richmond躁动-镇静评分）") { TODO("Wait for Fragment") } // { Rass_Score_fm() }
        addMenuItem("Ramsay镇静程度评分") { TODO("Wait for Fragment") } // { Ramsay_Score_fm() }
        addMenuItem("气管插管时肌松程度分级") { TODO("Wait for Fragment") } // { Muscle_Relaxation_Grading_fm() }
    }
}
