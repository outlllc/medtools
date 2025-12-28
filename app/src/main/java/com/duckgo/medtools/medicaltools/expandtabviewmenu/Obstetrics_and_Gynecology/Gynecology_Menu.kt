package com.duckgo.medtools.medicaltools.expandtabviewmenu.Obstetrics_and_Gynecology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.*
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Gynecology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("宫颈癌TNM分期") { CervicalCancerTNMStage_fm() }
        addMenuItem("宫颈癌分期（FIGO,2018）") { CervicalCancerStageFigo2018_fm() }
        addMenuItem("宫颈癌分期（FIGO,2014）") { CervicalCancerStageFigo2014_fm() }
        addMenuItem("紧急避孕药物剂量与方案") { Emergency_Contraceptive_Pill_Dosage_fm() }
        addMenuItem("卵巢癌TNM分期") { OvarianCancerTnmStage_fm() }
        addMenuItem("子宫体肿瘤TNM分期") { Uterine_TumorsTnmStage_fm() }
        addMenuItem("卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）") { Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm() }
        addMenuItem("POP-Q分期法（盆腔器官脱垂分期）") { POPQStage() }
        addMenuItem("改良Kupperman指数（妇女更年期症状评分标准）") { Menopausal_symptom_scoring_Kupperman_index_fm() }
        addMenuItem("子宫内膜癌分期（FIGO,2014）") { Endometrial_cancer_staging_fm() }
        addMenuItem("halfway系统分级法（Baden-Walker盆底器官膨出的阴道半程系统分级法）") { Baden_Walker_vaginal_half_step_systematic_grading_of_pelvic_floor_fm() }
        addMenuItem("MRS评分（更年期评定量表）") { Menopause_Rating_Scale_fm() }
        addMenuItem("TBS分类（宫颈细胞学检查）") { Tbs_classification_fm() }
        addMenuItem("卵巢过度刺激综合征OHSS的分度与分级（Golan分类）") { Ohss_Grading_and_grading() }
        addMenuItem("子宫内膜异位症的分期（R-AFS分期，1985）") { Staging_of_endometriosis_rAFS_staging_fm() }
        addMenuItem("POP-Q分期（盆腔器官脱垂评估指示点）") { Popq_Indicator_pointsPelvic_organ_prolapse_assessment_fm() }
        addMenuItem("滋养细胞肿瘤改良预后评分系统（FIGO,2000）") { Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm() }
        addMenuItem("盆腔炎性疾病PID诊断标准") { Pid_Diagnostic_Criteria_fm() }
        addMenuItem("Insler评分（宫颈雌激素作用程度评分法）") { Insler_Cervical_Estrogen_Effect_Scale_fm() }
        addMenuItem("未成熟畸胎瘤的分级方法") { Immature_TeratomasGrading_method_for_fm() }
        addMenuItem("外阴癌TNM分期") { Vulvar_Cancer_Tnm_stage_fm() }
        addMenuItem("外阴阴道假丝酵母菌VVC临床分类") { Vvc_Classification_fm() }
        addMenuItem("阴道癌TNM分期") { Vaginal_Cancer_Tnm_Stage_fm() }
        addMenuItem("RCI（Reid阴道镜评分标准）") { Reid_Colposcopy_Scoring_Criteria_fm() }
        addMenuItem("经前焦虑障碍PMDD诊断标准") { Pmdd_Diagnostic_Criteria_fm() }
        addMenuItem("外阴阴道假丝酵母菌VVC临床表现评分标准") { Vvc_Scoring_Criteria_fm() }
        addMenuItem("滋养细胞肿瘤解剖学分期（FIGO,2000）") { Trophoblastic_Tumors_Anatomical_staging_fm() }
        addMenuItem("子宫肉瘤分期（FIGO,2009）") { Uterine_Sarcoma_Staging_fm() }
        addMenuItem("Julian分级法（阴道穹窿膨出）") { Vaginal_Vault_Bulging_Julian_Classification_fm() }
        addMenuItem("输卵管癌手术病理分期") { Fallopian_Tube_Cancer_surgery_pathological_staging_fm() }
        addMenuItem("妊娠滋养细胞肿瘤TNM分期") { Gestational_Trophoblastic_Tumor_Tnm_stage_fm() }
        addMenuItem("Nugent评分标准（阴道分泌物革兰染色）") { Nugent_Scoring_Criteria_fm() }
        addMenuItem("外阴癌分期（FIGO,2014）") { Vulvar_cancer_staging_Figo_2014_fm() }
        addMenuItem("输卵管肿瘤TNM分期") { Fallopian_tube_tumors_Tnm_Stage_fm() }
        addMenuItem("外阴皮肤疾病分类法") { Vulvar_skin_diseases_Classification_fm() }
        addMenuItem("阴道癌分期（FIGO/UICC）") { Vaginal_Cancer_Staging_Figo_Uicc_fm() }
        addMenuItem("外阴鳞状上皮内瘤变分类及特征") { Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm() }
    }
}
