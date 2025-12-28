package com.duckgo.medtools.medicaltools

import androidx.fragment.app.Fragment
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.*
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.*
import com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Nephrology.*
import com.duckgo.medtools.medicaltools.functions.comprehensive.*
import com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Endocrinology.HbA1cValuesBloodGlucose_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Tanner_Stage_fm

/**
 * 填充搜索数据映射表
 * 包含 functions 目录下所有已实现的科室功能页面
 */
fun fillSearchEntries(searchEntries: MutableMap<String, () -> Fragment>) {
    // === 妇科 (Gynecology) ===
    searchEntries["宫颈癌TNM分期"] = { CervicalCancerTNMStage_fm() }
    searchEntries["宫颈癌分期（FIGO,2018）"] = { CervicalCancerStageFigo2018_fm() }
    searchEntries["宫颈癌分期（FIGO,2014）"] = { CervicalCancerStageFigo2014_fm() }
    searchEntries["紧急避孕药物剂量与方案"] = { Emergency_Contraceptive_Pill_Dosage_fm() }
    searchEntries["卵巢癌TNM分期"] = { OvarianCancerTnmStage_fm() }
    searchEntries["子宫体肿瘤TNM分期"] = { Uterine_TumorsTnmStage_fm() }
    searchEntries["卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）"] = { Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm() }
    searchEntries["POP-Q分期法（盆腔器官脱垂分期）"] = { POPQStage() }
    searchEntries["改良Kupperman指数（妇女更年期症状评分标准）"] = { Menopausal_symptom_scoring_Kupperman_index_fm() }
    searchEntries["子宫内膜癌分期（FIGO,2014）"] = { Endometrial_cancer_staging_fm() }
    searchEntries["Baden-Walker盆底器官分级法（阴道半程系统分级法）"] = { Baden_Walker_vaginal_half_step_systematic_grading_of_pelvic_floor_fm() }
    searchEntries["MRS评分（更年期评定量表）"] = { Menopause_Rating_Scale_fm() }
    searchEntries["TBS分类（宫颈细胞学检查）"] = { Tbs_classification_fm() }
    searchEntries["OHSS的分度与分级（Golan分类）"] = { Ohss_Grading_and_grading() }
    searchEntries["子宫内膜异位症的分期（R-AFS分期，1985）"] = { Staging_of_endometriosis_rAFS_staging_fm() }
    searchEntries["POP-Q分期（盆腔器官脱垂评估指示点）"] = { Popq_Indicator_pointsPelvic_organ_prolapse_assessment_fm() }
    searchEntries["滋养细胞肿瘤改良预后评分系统（FIGO,2000）"] = { Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm() }
    searchEntries["盆腔炎性疾病PID诊断标准"] = { Pid_Diagnostic_Criteria_fm() }
    searchEntries["Insler评分（宫颈雌激素作用程度评分法）"] = { Insler_Cervical_Estrogen_Effect_Scale_fm() }
    searchEntries["未成熟畸胎瘤的分级方法"] = { Immature_TeratomasGrading_method_for_fm() }
    searchEntries["外阴癌TNM分期"] = { Vulvar_Cancer_Tnm_stage_fm() }
    searchEntries["外阴阴道假丝酵母菌VVC临床分类"] = { Vvc_Classification_fm() }
    searchEntries["阴道癌TNM分期"] = { Vaginal_Cancer_Tnm_Stage_fm() }
    searchEntries["RCI（Reid阴道镜评分标准）"] = { Reid_Colposcopy_Scoring_Criteria_fm() }
    searchEntries["经前焦虑障碍PMDD诊断标准"] = { Pmdd_Diagnostic_Criteria_fm() }
    searchEntries["VVC临床表现评分标准"] = { Vvc_Scoring_Criteria_fm() }
    searchEntries["滋养细胞肿瘤解剖学分期（FIGO,2000）"] = { Trophoblastic_Tumors_Anatomical_staging_fm() }
    searchEntries["子宫肉瘤分期（FIGO,2009）"] = { Uterine_Sarcoma_Staging_fm() }
    searchEntries["Julian分级法（阴道穹窿膨出）"] = { Vaginal_Vault_Bulging_Julian_Classification_fm() }
    searchEntries["输卵管癌手术病理分期"] = { Fallopian_Tube_Cancer_surgery_pathological_staging_fm() }
    searchEntries["妊娠滋养细胞肿瘤TNM分期"] = { Gestational_Trophoblastic_Tumor_Tnm_stage_fm() }
    searchEntries["Nugent评分标准（阴道分泌物革兰染色）"] = { Nugent_Scoring_Criteria_fm() }
    searchEntries["外阴癌分期（FIGO,2014）"] = { Vulvar_cancer_staging_Figo_2014_fm() }
    searchEntries["输卵管肿瘤TNM分期"] = { Fallopian_tube_tumors_Tnm_Stage_fm() }
    searchEntries["外阴皮肤疾病分类法"] = { Vulvar_skin_diseases_Classification_fm() }
    searchEntries["阴道癌分期（FIGO/UICC）"] = { Vaginal_Cancer_Staging_Figo_Uicc_fm() }
    searchEntries["外阴鳞状上皮内瘤变分类及特征"] = { Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm() }

    // === 产科 (Obstetrics) ===
    searchEntries["BISHOP评分"] = { Bishop_fm() }
    searchEntries["妊娠期高血压分类"] = { Classification_Of_Hypertension_During_Pregnancy_fm() }
    searchEntries["产褥期抑郁症诊断标准"] = { Diagnosis_Postnatal_Depression_fm() }
    searchEntries["妊娠期糖尿病诊断标准（GDM）"] = { Diagnostic_Criteria_For_GDM_fm() }
    searchEntries["孕期用药对胎儿的影响"] = { DrugToFetus_fm() }
    searchEntries["爱丁堡产后抑郁量表（EPDS）"] = { Edinburgh_Postnatal_Depression_Scale_fm() }
    searchEntries["胎儿成熟度监测"] = { Fetal_Maturity_fm() }
    searchEntries["妊娠期糖尿病分级分期"] = { GDM_Grading_And_Staging_fm() }
    searchEntries["妊娠期甲状腺功能实验室检查"] = { Thyroid_Function_Of_Pregnancy_fm() }
    searchEntries["不同妊娠周数的宫底高度及子宫长度"] = { Uterine_Height_Gestational_Age_fm() }
    searchEntries["胎儿发育指数"] = { Fetal_developmental_index_fm() }
    searchEntries["简易胎龄评估表"] = { Simple_gestational_age_assessment_scale_fm() }
    searchEntries["产后出血量估计与休克指数"] = { Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm() }
    searchEntries["重度子痫前期诊断"] = { Severe_Preeclampsia_Diagnosis_fm() }
    searchEntries["正常恶露性状"] = { Normal_Lochia_fm() }
    searchEntries["Rh 和 ABO 溶血病的比较"] = { RH_And_ABO_Hemolysis_Comparison_fm() }
    searchEntries["妊娠高血压终止妊娠的指征"] = { Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm() }
    searchEntries["胎儿生物物理监测Manning评分"] = { Manning_Score_fm() }
    searchEntries["妊娠期甲亢程度和用药剂量间的关系"] = { Hyperthyroidism_Medication_During_Pregnancy_fm() }

    // === 肾内科 (Nephrology) ===
    searchEntries["补水量"] = { AmountOfHydration_fm() }
    searchEntries["慢性肾病CKD分期"] = { Chronic_Kidney_Disease_Staging_fm() }
    searchEntries["肌酐清除率(Cockcroft-Gault)"] = { Creatinine_Clearance_Cockcroft_Gault_fm() }
    searchEntries["肾小球滤过率CKD-EPI"] = { Glomerular_Filtration_Rate_CKD_EPI_fm() }
    searchEntries["低钠血症补钠量"] = { SodiumDeficitInHyponatremia_fm() }

    // === 内分泌科 (Endocrinology) ===
    searchEntries["糖化血红蛋白评估平均血糖"] = { HbA1cValuesBloodGlucose_fm() }

    // === 综合计算 (Comprehensive) ===
    searchEntries["体表面积"] = { BodySurfaceArea_fm() }
    searchEntries["常用单位换算"] = { Unit_Conversion_fm() }
    searchEntries["标准体重IBW"] = { standard_weight_fm() }
    searchEntries["体重指数BMI"] = { Body_Index_fm() }
    
    // === 生殖医学 (Reproductive Medicine) ===
    searchEntries["人类精液变量参考值"] = { Semen_reference_values_fm() }
    searchEntries["Tanner分期（女性性发育）"] = { Tanner_Stage_fm() }
    searchEntries["性早熟疾病的辅助检查结果"] = { Precocious_Puberty_Auxiliary_Examination_fm() }
}
