package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Endocrinology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Endocrinology.HbA1cValuesBloodGlucose_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Tanner_Stage_fm

class Endocrinology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("糖尿病肾病临床分期") { TODO("Wait for Fragment") } // { Diabetic_Nephropathy_Staging_fm() }
        addMenuItem("糖化血红蛋白评估平均血糖") { HbA1cValuesBloodGlucose_fm() }
        addMenuItem("糖尿病诊断标准") { TODO("Wait for Fragment") } // { Diabetes_Diagnostic_Criteria_fm() }
        addMenuItem("甲状腺肿瘤TNM分期") { TODO("Wait for Fragment") } // { Thyroid_Tumor_TNM_fm() }
        addMenuItem("甲状腺肿分级") { TODO("Wait for Fragment") } // { Goiter_Grading_fm() }
        addMenuItem("代谢综合征诊断标准（国际糖尿病联盟）") { TODO("Wait for Fragment") } // { Metabolic_Syndrome_IDF_fm() }
        addMenuItem("Wagner分级法（糖尿病足）") { TODO("Wait for Fragment") } // { Wagner_Grading_fm() }
        addMenuItem("高血糖的钠浓度校正") { TODO("Wait for Fragment") } // { Sodium_Correction_Hyperglycemia_fm() }
        addMenuItem("代谢综合征诊断标准（中华医学会）") { TODO("Wait for Fragment") } // { Metabolic_Syndrome_CDS_fm() }
        addMenuItem("Graves眼病分级标准") { TODO("Wait for Fragment") } // { Graves_Ophthalmopathy_Grading_fm() }
        addMenuItem("糖尿病视网膜病变国际临床分类法") { TODO("Wait for Fragment") } // { Diabetic_Retinopathy_Classification_fm() }
        addMenuItem("CAS（Graves眼病病情活动评分）") { TODO("Wait for Fragment") } // { CAS_Score_fm() }
        addMenuItem("药物激发试验（生长激素缺乏症GHD诊断方法）") { TODO("Wait for Fragment") } // { GHD_Stimulation_Test_fm() }
        addMenuItem("性早熟疾病的辅助检查结果") { Precocious_Puberty_Auxiliary_Examination_fm() }
        addMenuItem("tanner分期（男性性发育）") { Tanner_Stage_fm() }
    }
}
