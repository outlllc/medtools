package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Neonatology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.Simple_gestational_age_assessment_scale_fm
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.RH_And_ABO_Hemolysis_Comparison_fm

class Neonatology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("不同时龄足月新生儿黄疸干预标准") { TODO("Wait for Fragment") } // { Neonatal_Jaundice_Standard_fm() }
        addMenuItem("apgar评分") { TODO("Wait for Fragment") } // { Apgar_Score_fm() }
        addMenuItem("新生儿黄疸干预指征") { TODO("Wait for Fragment") } // { Jaundice_Intervention_fm() }
        addMenuItem("胆红素/白蛋白比值") { TODO("Wait for Fragment") } // { Bilirubin_Albumin_Ratio_fm() }
        addMenuItem("早产儿体重增长速度") { TODO("Wait for Fragment") } // { Preterm_Weight_Growth_fm() }
        addMenuItem("不同胎龄出生体重早产儿黄疸干预标准（总胆红素）") { TODO("Wait for Fragment") } // { Preterm_Jaundice_Standard_fm() }
        addMenuItem("新生儿肠外营养TPN推荐用量表") { TODO("Wait for Fragment") } // { Neonatal_TPN_fm() }
        addMenuItem("新生儿窒息复苏常用药物表") { TODO("Wait for Fragment") } // { Resuscitation_Drugs_fm() }
        addMenuItem("新生儿休克评分表") { TODO("Wait for Fragment") } // { Neonatal_Shock_Score_fm() }
        addMenuItem("新生儿热能的需要量") { TODO("Wait for Fragment") } // { Neonatal_Energy_Needs_fm() }
        addMenuItem("不同日龄及不同出生体重儿的最适温度") { TODO("Wait for Fragment") } // { Optimal_Temperature_fm() }
        addMenuItem("气管插管型号的选择") { TODO("Wait for Fragment") } // { Intubation_Size_Selection_fm() }
        addMenuItem("简易胎龄评估表") { Simple_gestational_age_assessment_scale_fm() }
        addMenuItem("动脉导管未闭评分标准") { TODO("Wait for Fragment") } // { Pda_Score_fm() }
        addMenuItem("Rh和ABO溶血病的比较") { RH_And_ABO_Hemolysis_Comparison_fm() }
        addMenuItem("新生儿常见疾病机械通气初调参数") { TODO("Wait for Fragment") } // { Neonatal_Ventilator_Params_fm() }
        addMenuItem("新生儿电解质、矿物质、微量元素及维生素需要量") { TODO("Wait for Fragment") } // { Neonatal_Nutrient_Needs_fm() }
        addMenuItem("各胎龄新生儿神经、肌肉、成熟度") { TODO("Wait for Fragment") } // { Gestational_Maturity_fm() }
        addMenuItem("FLACC评分（婴儿和儿童疼痛行为评估量表）") { TODO("Wait for Fragment") } // { Flacc_Score_fm() }
        addMenuItem("各类型颅内出血鉴别诊断") { TODO("Wait for Fragment") } // { Ich_Differential_fm() }
        addMenuItem("DOWNE评分法（新生儿呼吸评分）") { TODO("Wait for Fragment") } // { Downe_Score_fm() }
        addMenuItem("新生儿硬肿症评分标准") { TODO("Wait for Fragment") } // { Scleredema_Score_fm() }
        addMenuItem("HIE诊断标准和临床分度（新生儿缺血缺氧脑病）") { TODO("Wait for Fragment") } // { Hie_Criteria_fm() }
        addMenuItem("先天性甲状腺功能减退的血清甲状腺激素诊断标准") { TODO("Wait for Fragment") } // { Cht_Diagnosis_fm() }
        addMenuItem("先天性甲低的甲状腺素L-T4替代治疗剂量表") { TODO("Wait for Fragment") } // { Cht_Treatment_fm() }
        addMenuItem("新生儿成熟度评估表（新Ballard评分法）") { TODO("Wait for Fragment") } // { Ballard_Score_fm() }
    }
}
