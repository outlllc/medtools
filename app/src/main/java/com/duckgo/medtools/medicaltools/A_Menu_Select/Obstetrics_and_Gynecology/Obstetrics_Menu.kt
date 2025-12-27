package com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.*
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Obstetrics_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "BISHOP评分", "胎儿发育指数", "不同妊娠周数的宫底高度及子宫长度", "孕期用药对胎儿的影响", "胎儿成熟度监测",
            "正常恶露性状", "妊娠期高血压分类", "妊娠期高血糖诊断标准（GDM）", "重度子痫前期诊断", "妊娠高血压终止妊娠的指征",
            "胎儿生物物理监测Manning评分", "简易胎龄评估表", "妊娠期糖尿病分级分期", "妊娠期甲状腺功能实验室检查",
            "Rh 和 ABO 溶血病的比较", "妊娠期甲亢程度和用药剂量间的关系",
            "EPDS（爱丁堡产后抑郁量表）", "产褥期抑郁症诊断标准"
        )
    }

    override fun onItemClick(position: Int) {
        val fragment = when (position) {
            0 -> Bishop_fm()
            1 -> Fetal_developmental_index_fm()
            2 -> Uterine_Height_Gestational_Age_fm()
            3 -> DrugToFetus_fm()
            4 -> Fetal_Maturity_fm()
            5 -> Normal_Lochia_fm()
            6 -> Classification_Of_Hypertension_During_Pregnancy_fm()
            7 -> Diagnostic_Criteria_For_GDM_fm()
            8 -> Severe_Preeclampsia_Diagnosis_fm()
            9 -> Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm()
            10 -> Manning_Score_fm()
            11 -> Simple_gestational_age_assessment_scale_fm()
            12 -> GDM_Grading_And_Staging_fm()
            13 -> Thyroid_Function_Of_Pregnancy_fm()
            14 -> RH_And_ABO_Hemolysis_Comparison_fm()
            15 -> Hyperthyroidism_Medication_During_Pregnancy_fm()
            16 -> Edinburgh_Postnatal_Depression_Scale_fm()
            17 -> Diagnosis_Postnatal_Depression_fm()
            else -> null
        }
        fragment?.let { inflateFragment(it) }
    }
}
