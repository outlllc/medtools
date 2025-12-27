package com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Bishop_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Classification_Of_Hypertension_During_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Diagnosis_Postnatal_Depression_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Diagnostic_Criteria_For_GDM_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.DrugToFetus_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Edinburgh_Postnatal_Depression_Scale_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Fetal_Maturity_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.GDM_Grading_And_Staging_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Hyperthyroidism_Medication_During_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Manning_Score_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Normal_Lochia_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.RH_And_ABO_Hemolysis_Comparison_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Severe_Preeclampsia_Diagnosis_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Thyroid_Function_Of_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Uterine_Height_Gestational_Age_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Tanner_Stage_fm
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Obstetrics_and_Gynecology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "BISHOP评分", "妊娠期高血压分类", "重度子痫前期诊断", "妊娠期糖尿病分级分期",
            "妊娠期甲状腺功能实验室检查", "妊娠期高血糖诊断标准（GDM）", "妊娠高血压终止妊娠的指征",
            "Rh 和 ABO 溶血病的比较", "胎儿生物物理监测Manning评分", "妊娠期甲亢程度和用药剂量间的关系", "正常恶露性状",
            "EPDS（爱丁堡产后抑郁量表）", "孕期用药对胎儿的影响", "不同妊娠周数的宫底高度及子宫长度",
            "胎儿成熟度监测", "产褥期抑郁症诊断标准", "人类精液变量参考值", "tanner分期（女性性发育）", "性早熟疾病的辅助检查结果"
        )
    }

    override fun onItemClick(position: Int) {
        val fragment = when (position) {
            0 -> Bishop_fm()
            1 -> Classification_Of_Hypertension_During_Pregnancy_fm()
            2 -> Severe_Preeclampsia_Diagnosis_fm()
            3 -> GDM_Grading_And_Staging_fm()
            4 -> Thyroid_Function_Of_Pregnancy_fm()
            5 -> Diagnostic_Criteria_For_GDM_fm()
            6 -> Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm()
            7 -> RH_And_ABO_Hemolysis_Comparison_fm()
            8 -> Manning_Score_fm()
            9 -> Hyperthyroidism_Medication_During_Pregnancy_fm()
            10 -> Normal_Lochia_fm()
            11 -> Edinburgh_Postnatal_Depression_Scale_fm()
            12 -> DrugToFetus_fm()
            13 -> Uterine_Height_Gestational_Age_fm()
            14 -> Fetal_Maturity_fm()
            15 -> Diagnosis_Postnatal_Depression_fm()
            16 -> Semen_reference_values_fm()
            17 -> Tanner_Stage_fm()
            18 -> Precocious_Puberty_Auxiliary_Examination_fm()
            else -> null
        }
        fragment?.let { inflateFragment(it) }
    }
}
