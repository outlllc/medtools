package com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Bishop_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Baden_Walker_vaginal_half_step_systematic_grading_of_pelvic_floor_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.CervicalCancerStageFigo2014_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.CervicalCancerStageFigo2018_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.CervicalCancerTNMStage_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Emergency_Contraceptive_Pill_Dosage_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Endometrial_cancer_staging_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Fallopian_Tube_Cancer_surgery_pathological_staging_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Fallopian_tube_tumors_Tnm_Stage_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Gestational_Trophoblastic_Tumor_Tnm_stage_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Immature_TeratomasGrading_method_for_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Insler_Cervical_Estrogen_Effect_Scale_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Menopausal_symptom_scoring_Kupperman_index_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Menopause_Rating_Scale_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Nugent_Scoring_Criteria_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Ohss_Grading_and_grading
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.OvarianCancerTnmStage_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.POPQStage
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Pid_Diagnostic_Criteria_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Pmdd_Diagnostic_Criteria_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Popq_Indicator_pointsPelvic_organ_prolapse_assessment_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Reid_Colposcopy_Scoring_Criteria_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Staging_of_endometriosis_rAFS_staging_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Tbs_classification_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Trophoblastic_Tumors_Anatomical_staging_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Uterine_Sarcoma_Staging_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Uterine_TumorsTnmStage_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vaginal_Cancer_Staging_Figo_Uicc_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vaginal_Cancer_Tnm_Stage_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vaginal_Vault_Bulging_Julian_Classification_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vulvar_Cancer_Tnm_stage_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vulvar_cancer_staging_Figo_2014_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vulvar_skin_diseases_Classification_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vvc_Classification_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.Vvc_Scoring_Criteria_fm
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.util.add_hide_fragment

class Gynecology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("宫颈癌TNM分期", "宫颈癌分期（FIGO,2018）", "宫颈癌分期（FIGO,2014）", "紧急避孕药物剂量与方案", "卵巢癌TNM分期",
            "子宫体肿瘤TNM分期", "卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）", "POP-Q分期法（盆腔器官脱垂分期）", "改良Kupperman指数（妇女更年期症状评分标准）", "子宫内膜癌分期（FOGO,2014）",
            "halfway系统分级法（Baden-Walker盆底器官膨出的阴道半程系统分级法）", "MRS评分（更年期评定量表）", "TBS分类（宫颈细胞学检查）", "卵巢过度刺激综合征OHSS的分度与分级（Golan分类）", "子宫内膜异位症的分期（R-AFS分期，1985）",
            "POP-Q分期（盆腔器官脱垂评估指示点）", "滋养细胞肿瘤改良预后评分系统（FOGO,2000）", "盆腔炎性疾病PID诊断标准", "Insler评分（宫颈雌激素作用程度评分法）", "未成熟畸胎瘤的分级方法",
            "外阴癌TNM分期", "外阴阴道假丝酵母菌VVC临床分类", "阴道癌TNM分期", "RCI（Reid阴道镜评分标准）", "经前焦虑障碍PMDD诊断标准",
            "外阴阴道假丝酵母菌VVC临床表现评分标准", "滋养细胞肿瘤解剖学分期（FOGO,2000）", "子宫肉瘤分期（FOGO,2009）", "Julian分级法（阴道穹窿膨出）", "输卵管癌手术病理分期",
            "妊娠滋养细胞肿瘤TNM分期", "Nugent评分标准（阴道分泌物革兰染色）", "外阴癌分期（FOGO,2014）", "输卵管肿瘤TNM分期", "外阴皮肤疾病分类法",
            "阴道癌分期（FOGO/UICC）", "外阴鳞状上皮内瘤变分类及特征"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //宫颈癌TNM分期
                val fragment = CervicalCancerTNMStage_fm()
                inflateFragment(fragment)
            }
            1 -> {
                //宫颈癌分期（FIGO,2018）
                val fragment = CervicalCancerStageFigo2018_fm()
                inflateFragment(fragment)
            }
            2 -> {
                //宫颈癌分期（FIGO,2014）
                val fragment = CervicalCancerStageFigo2014_fm()
                inflateFragment(fragment)
            }
            3 -> {
                //紧急避孕药物剂量与方案
                val fragment = Emergency_Contraceptive_Pill_Dosage_fm()
                inflateFragment(fragment)
            }
            4 -> {
                //卵巢癌TNM分期
                val fragment = OvarianCancerTnmStage_fm()
                inflateFragment(fragment)
            }
            5 -> {
                //子宫体肿瘤TNM分期
                val fragment = Uterine_TumorsTnmStage_fm()
                inflateFragment(fragment)
            }
            6 -> {
                //卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）
                val fragment = Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm()
                inflateFragment(fragment)
            }
            7 -> {
                //POP-Q分期法（盆腔器官脱垂分期）
                val fragment = POPQStage()
                inflateFragment(fragment)
            }
            8 -> {
                //改良Kupperman指数（妇女更年期症状评分标准）
                val fragment = Menopausal_symptom_scoring_Kupperman_index_fm()
                inflateFragment(fragment)
            }
            9 -> {
                //子宫内膜癌分期（FOGO,2014）
                val fragment = Endometrial_cancer_staging_fm()
                inflateFragment(fragment)
            }
            10 -> {
                //halfway系统分级法（Baden-Walker盆底器官膨出的阴道半程系统分级法）
                val fragment = Baden_Walker_vaginal_half_step_systematic_grading_of_pelvic_floor_fm()
                inflateFragment(fragment)
            }
            11 -> {
                //MRS评分（更年期评定量表）
                val fragment = Menopause_Rating_Scale_fm()
                inflateFragment(fragment)
            }
            12 -> {
                //TBS分类（宫颈细胞学检查）
                val fragment = Tbs_classification_fm()
                inflateFragment(fragment)
            }
            13 -> {
                //卵巢过度刺激综合征OHSS的分度与分级（Golan分类）
                val fragment = Ohss_Grading_and_grading()
                inflateFragment(fragment)
            }
            14 -> {
                //子宫内膜异位症的分期（R-AFS分期，1985）
                val fragment = Staging_of_endometriosis_rAFS_staging_fm()
                inflateFragment(fragment)
            }
            15 -> {
                //POP-Q分期（盆腔器官脱垂评估指示点）
                val fragment = Popq_Indicator_pointsPelvic_organ_prolapse_assessment_fm()
                inflateFragment(fragment)
            }
            16 -> {
                //滋养细胞肿瘤改良预后评分系统（FOGO,2000）
                val fragment = Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm()
                inflateFragment(fragment)
            }
            17 -> {
                //盆腔炎性疾病PID诊断标准
                val fragment = Pid_Diagnostic_Criteria_fm()
                inflateFragment(fragment)
            }
            18 -> {
                //Insler评分（宫颈雌激素作用程度评分法）
                val fragment = Insler_Cervical_Estrogen_Effect_Scale_fm()
                inflateFragment(fragment)
            }
            19 -> {
                //未成熟畸胎瘤的分级方法
                val fragment = Immature_TeratomasGrading_method_for_fm()
                inflateFragment(fragment)
            }
            20 -> {
                //外阴癌TNM分期
                val fragment = Vulvar_Cancer_Tnm_stage_fm()
                inflateFragment(fragment)
            }
            21 -> {
                //外阴阴道假丝酵母菌VVC临床分类
                val fragment = Vvc_Classification_fm()
                inflateFragment(fragment)
            }
            22 -> {
                //阴道癌TNM分期
                val fragment = Vaginal_Cancer_Tnm_Stage_fm()
                inflateFragment(fragment)
            }
            23 -> {
                //RCI（Reid阴道镜评分标准）
                val fragment = Reid_Colposcopy_Scoring_Criteria_fm()
                inflateFragment(fragment)
            }
            24 -> {
                //经前焦虑障碍PMDD诊断标准
                val fragment = Pmdd_Diagnostic_Criteria_fm()
                inflateFragment(fragment)
            }
            25 -> {
                //外阴阴道假丝酵母菌VVC临床表现评分标准
                val fragment = Vvc_Scoring_Criteria_fm()
                inflateFragment(fragment)
            }
            26 -> {
                //滋养细胞肿瘤解剖学分期（FOGO,2000）
                val fragment = Trophoblastic_Tumors_Anatomical_staging_fm()
                inflateFragment(fragment)
            }
            27 -> {
                //子宫肉瘤分期（FOGO,2009）
                val fragment = Uterine_Sarcoma_Staging_fm()
                inflateFragment(fragment)
            }
            28 -> {
                //Julian分级法（阴道穹窿膨出）
                val fragment = Vaginal_Vault_Bulging_Julian_Classification_fm()
                inflateFragment(fragment)
            }
            29 -> {
                //输卵管癌手术病理分期
                val fragment = Fallopian_Tube_Cancer_surgery_pathological_staging_fm()
                inflateFragment(fragment)
            }
            30 -> {
                //妊娠滋养细胞肿瘤TNM分期
                val fragment = Gestational_Trophoblastic_Tumor_Tnm_stage_fm()
                inflateFragment(fragment)
            }
            31 -> {
                //Nugent评分标准（阴道分泌物革兰染色）
                val fragment = Nugent_Scoring_Criteria_fm()
                inflateFragment(fragment)
            }
            32 -> {
                //外阴癌分期（FOGO,2014）
                val fragment = Vulvar_cancer_staging_Figo_2014_fm()
                inflateFragment(fragment)
            }
            33 -> {
                //输卵管肿瘤TNM分期
                val fragment = Fallopian_tube_tumors_Tnm_Stage_fm()
                inflateFragment(fragment)
            }
            34 -> {
                //外阴皮肤疾病分类法
                val fragment = Vulvar_skin_diseases_Classification_fm()
                inflateFragment(fragment)
            }
            35 -> {
                //阴道癌分期（FOGO/UICC）
                val fragment = Vaginal_Cancer_Staging_Figo_Uicc_fm()
                inflateFragment(fragment)
            }
            36 -> {
                //外阴鳞状上皮内瘤变分类及特征
                val fragment = Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm()
                inflateFragment(fragment)
            }
        }
    }
}