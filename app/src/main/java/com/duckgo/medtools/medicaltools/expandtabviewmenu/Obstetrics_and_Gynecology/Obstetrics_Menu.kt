package com.duckgo.medtools.medicaltools.expandtabviewmenu.Obstetrics_and_Gynecology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.*
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.comprehensive.Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm

class Obstetrics_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("BISHOP评分") { Bishop_fm() }
        addMenuItem("胎儿发育指数") { Fetal_developmental_index_fm() }
        addMenuItem("不同妊娠周数的宫底高度及子宫长度") { Uterine_Height_Gestational_Age_fm() }
        addMenuItem("孕期用药对胎儿的影响") { DrugToFetus_fm() }
        addMenuItem("胎儿成熟度监测") { Fetal_Maturity_fm() }
        addMenuItem("正常恶露性状") { Normal_Lochia_fm() }
        addMenuItem("妊娠期高血压分类") { Classification_Of_Hypertension_During_Pregnancy_fm() }
        addMenuItem("妊娠期高血糖诊断标准（GDM）") { Diagnostic_Criteria_For_GDM_fm() }
        addMenuItem("重度子痫前期诊断") { Severe_Preeclampsia_Diagnosis_fm() }
        addMenuItem("妊娠高血压终止妊娠的指征") { Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm() }
        addMenuItem("胎儿生物物理监测Manning评分") { Manning_Score_fm() }
        addMenuItem("简易胎龄评估表") { Simple_gestational_age_assessment_scale_fm() }
        addMenuItem("妊娠期糖尿病分级分期") { GDM_Grading_And_Staging_fm() }
        addMenuItem("妊娠期甲状腺功能实验室检查") { Thyroid_Function_Of_Pregnancy_fm() }
        addMenuItem("Rh 和 ABO 溶血病的比较") { RH_And_ABO_Hemolysis_Comparison_fm() }
        addMenuItem("妊娠期甲亢程度和用药剂量间的关系") { Hyperthyroidism_Medication_During_Pregnancy_fm() }
        addMenuItem("EPDS（爱丁堡产后抑郁量表）") { Edinburgh_Postnatal_Depression_Scale_fm() }
        addMenuItem("产褥期抑郁症诊断标准") { Diagnosis_Postnatal_Depression_fm() }
        addMenuItem("产后出血量估计与休克指数") { Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm() }
    }
}
