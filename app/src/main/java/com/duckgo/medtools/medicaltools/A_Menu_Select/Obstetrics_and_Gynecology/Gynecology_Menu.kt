package com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.*
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Gynecology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "宫颈癌TNM分期", "宫颈癌分期（FIGO,2018）", "宫颈癌分期（FIGO,2014）", "紧急避孕药物剂量与方案", "卵巢癌TNM分期",
            "子宫体肿瘤TNM分期", "卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）", "POP-Q分期法（盆腔器官脱垂分期）", "改良Kupperman指数（妇女更年期症状评分标准）", "子宫内膜癌分期（FOGO,2014）",
            "halfway系统分级法（Baden-Walker盆底器官膨出的阴道半程系统分级法）", "MRS评分（更年期评定量表）", "TBS分类（宫颈细胞学检查）", "卵巢过度刺激综合征OHSS的分度与分级（Golan分类）", "子宫内膜异位症的分期（R-AFS分期，1985）",
            "POP-Q分期（盆腔器官脱垂评估指示点）", "滋养细胞肿瘤改良预后评分系统（FOGO,2000）", "盆腔炎性疾病PID诊断标准", "Insler评分（宫颈雌激素作用程度评分法）", "未成熟畸胎瘤的分级方法",
            "外阴癌TNM分期", "外阴阴道假丝酵母菌VVC临床分类", "阴道癌TNM分期", "RCI（Reid阴道镜评分标准）", "经前焦虑障碍PMDD诊断标准",
            "外阴阴道假丝酵母菌VVC临床表现评分标准", "滋养细胞肿瘤解剖学分期（FOGO,2000）", "子宫肉瘤分期（FOGO,2009）", "Julian分级法（阴道穹窿膨出）", "输卵管癌手术病理分期",
            "妊娠滋养细胞肿瘤TNM分期", "Nugent评分标准（阴道分泌物革兰染色）", "外阴癌分期（FOGO,2014）", "输卵管肿瘤TNM分期", "外阴皮肤疾病分类法",
            "阴道癌分期（FOGO/UICC）", "外阴鳞状上皮内瘤变分类及特征"
        )
    }

    override fun onItemClick(position: Int) {
        val fragment = when (position) {
            0 -> CervicalCancerTNMStage_fm()
            1 -> CervicalCancerStageFigo2018_fm()
            2 -> CervicalCancerStageFigo2014_fm()
            3 -> Emergency_Contraceptive_Pill_Dosage_fm()
            4 -> OvarianCancerTnmStage_fm()
            5 -> Uterine_TumorsTnmStage_fm()
            6 -> Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm()
            7 -> POPQStage()
            8 -> Menopausal_symptom_scoring_Kupperman_index_fm()
            9 -> Endometrial_cancer_staging_fm()
            10 -> Baden_Walker_vaginal_half_step_systematic_grading_of_pelvic_floor_fm()
            11 -> Menopause_Rating_Scale_fm()
            12 -> Tbs_classification_fm()
            13 -> Ohss_Grading_and_grading()
            14 -> Staging_of_endometriosis_rAFS_staging_fm()
            15 -> Popq_Indicator_pointsPelvic_organ_prolapse_assessment_fm()
            16 -> Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm()
            17 -> Pid_Diagnostic_Criteria_fm()
            18 -> Insler_Cervical_Estrogen_Effect_Scale_fm()
            19 -> Immature_TeratomasGrading_method_for_fm()
            20 -> Vulvar_Cancer_Tnm_stage_fm()
            21 -> Vvc_Classification_fm()
            22 -> Vaginal_Cancer_Tnm_Stage_fm()
            23 -> Reid_Colposcopy_Scoring_Criteria_fm()
            24 -> Pmdd_Diagnostic_Criteria_fm()
            25 -> Vvc_Scoring_Criteria_fm()
            26 -> Trophoblastic_Tumors_Anatomical_staging_fm()
            27 -> Uterine_Sarcoma_Staging_fm()
            28 -> Vaginal_Vault_Bulging_Julian_Classification_fm()
            29 -> Fallopian_Tube_Cancer_surgery_pathological_staging_fm()
            30 -> Gestational_Trophoblastic_Tumor_Tnm_stage_fm()
            31 -> Nugent_Scoring_Criteria_fm()
            32 -> Vulvar_cancer_staging_Figo_2014_fm()
            33 -> Fallopian_tube_tumors_Tnm_Stage_fm()
            34 -> Vulvar_skin_diseases_Classification_fm()
            35 -> Vaginal_Cancer_Staging_Figo_Uicc_fm()
            36 -> Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm()
            else -> null
        }
        fragment?.let { inflateFragment(it) }
    }
}
