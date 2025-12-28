package com.duckgo.medtools.medicaltools.expandtabviewmenu.Oncology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.*

class Oncology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("肺癌TNM分期") { TODO("Wait for Fragment") } // { Lung_Cancer_TNM_fm() }
        addMenuItem("结直肠癌TNM分期") { TODO("Wait for Fragment") } // { Colorectal_Cancer_TNM_fm() }
        addMenuItem("胃癌TNM分期") { TODO("Wait for Fragment") } // { Stomach_Cancer_TNM_fm() }
        addMenuItem("乳腺癌TNM分期") { TODO("Wait for Fragment") } // { Breast_Cancer_TNM_fm() }
        addMenuItem("食管癌TNM分期") { TODO("Wait for Fragment") } // { Esophageal_Cancer_TNM_fm() }
        addMenuItem("咽部肿瘤TNM分期") { TODO("Wait for Fragment") } // { Pharyngeal_Tumor_TNM_fm() }
        addMenuItem("ZPS（体力状况ECOG评分标准）") { TODO("Wait for Fragment") } // { ECOG_ZPS_fm() }
        addMenuItem("唇和口腔肿瘤TNM分期") { TODO("Wait for Fragment") } // { Lip_Oral_Tumor_TNM_fm() }
        addMenuItem("KPS法和ZPS法（体能状态评分标准）") { TODO("Wait for Fragment") } // { KPS_ZPS_fm() }
        addMenuItem("肝癌TNM分期") { TODO("Wait for Fragment") } // { Liver_Cancer_TNM_fm() }
        addMenuItem("宫颈癌TNM分期") { CervicalCancerTNMStage_fm() }
        addMenuItem("甲状腺肿瘤TNM分期") { TODO("Wait for Fragment") } // { Thyroid_Tumor_TNM_fm() }
        addMenuItem("宫颈癌分期（FIGO,2018）") { CervicalCancerStageFigo2018_fm() }
        addMenuItem("宫颈癌分期（FIGO,2014）") { CervicalCancerStageFigo2014_fm() }
        addMenuItem("喉部肿瘤TNM分期") { TODO("Wait for Fragment") } // { Laryngeal_Tumor_TNM_fm() }
        addMenuItem("鼻腔与鼻窦肿瘤TNM分期") { TODO("Wait for Fragment") } // { Nasal_Sinus_Tumor_TNM_fm() }
        addMenuItem("霍奇金和非霍奇金淋巴瘤TNM分期") { TODO("Wait for Fragment") } // { Lymphoma_TNM_fm() }
        addMenuItem("胰腺癌TNM分期") { TODO("Wait for Fragment") } // { Pancreatic_Cancer_TNM_fm() }
        addMenuItem("化疗后骨髓抑制的分度") { TODO("Wait for Fragment") } // { Myelosuppression_Grading_fm() }
        addMenuItem("卵巢癌TNM分期") { OvarianCancerTnmStage_fm() }
        addMenuItem("腹腔器官肿瘤标志物分类") { TODO("Wait for Fragment") } // { Abdominal_Tumor_Markers_fm() }
        addMenuItem("子宫体肿瘤TNM分期") { Uterine_TumorsTnmStage_fm() }
        addMenuItem("卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）") { Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm() }
        addMenuItem("BCLC分期（巴塞罗那肝癌分级）") { TODO("Wait for Fragment") } // { BCLC_Staging_fm() }
        addMenuItem("前列腺癌TNM分期") { TODO("Wait for Fragment") } // { Prostate_Cancer_TNM_fm() }
        addMenuItem("肾癌TNM分期") { TODO("Wait for Fragment") } // { Renal_Cancer_TNM_fm() }
        addMenuItem("Durie-Salmon分期（多发性骨髓瘤MM）") { TODO("Wait for Fragment") } // { Durie_Salmon_Staging_fm() }
        addMenuItem("IPI（国际淋巴瘤预后指数）") { TODO("Wait for Fragment") } // { IPI_Score_fm() }
        addMenuItem("肾盂和输尿管肿瘤TNM分期") { TODO("Wait for Fragment") } // { Renal_Pelvis_Ureter_TNM_fm() }
        addMenuItem("乳腺癌术后复发风险分组及全身辅助治疗选择") { TODO("Wait for Fragment") } // { Breast_Cancer_Recurrence_Risk_fm() }
        addMenuItem("胆囊癌TNM分期") { TODO("Wait for Fragment") } // { Gallbladder_Cancer_TNM_fm() }
        addMenuItem("结直肠息肉分类") { TODO("Wait for Fragment") } // { Colorectal_Polyp_Classification_fm() }
        addMenuItem("急性髓系白血病的危险度分级") { TODO("Wait for Fragment") } // { AML_Risk_Grading_fm() }
        addMenuItem("膀胱肿瘤TNM分期") { TODO("Wait for Fragment") } // { Bladder_Tumor_TNM_fm() }
        addMenuItem("子宫内膜癌分期（FIGO,2014）") { Endometrial_cancer_staging_fm() }
        addMenuItem("小肠肿瘤TNM分期") { TODO("Wait for Fragment") } // { Small_Intestine_Tumor_TNM_fm() }
        addMenuItem("ISS（多发性骨髓瘤MM国际分期系统）") { TODO("Wait for Fragment") } // { ISS_Staging_fm() }
        addMenuItem("大唾液腺肿瘤TNM分期") { TODO("Wait for Fragment") } // { Salivary_Gland_Tumor_TNM_fm() }
        addMenuItem("Dukes分期（大肠癌）") { TODO("Wait for Fragment") } // { Dukes_Staging_fm() }
        addMenuItem("胃肠道间质瘤TNM分期") { TODO("Wait for Fragment") } // { GIST_TNM_fm() }
        addMenuItem("Broders分级（结直肠癌组织学）") { TODO("Wait for Fragment") } // { Broders_Grading_fm() }
        addMenuItem("Bismuth-Corlette分型（肝门部胆管癌）") { TODO("Wait for Fragment") } // { Bismuth_Corlette_fm() }
        addMenuItem("Butchart分期（弥漫型恶性胸膜间皮瘤）") { TODO("Wait for Fragment") } // { Butchart_Staging_fm() }
        addMenuItem("神经内分泌瘤TNM分期") { TODO("Wait for Fragment") } // { Neuroendocrine_Tumor_TNM_fm() }
        addMenuItem("肝内胆管癌TNM分期") { TODO("Wait for Fragment") } // { Intrahepatic_Cholangiocarcinoma_TNM_fm() }
        addMenuItem("肝门胆管癌TNM分期") { TODO("Wait for Fragment") } // { Perihilar_Cholangiocarcinoma_TNM_fm() }
        addMenuItem("膀胱癌TNM分期") { TODO("Wait for Fragment") } // { Bladder_Cancer_TNM_fm() }
        addMenuItem("阑尾肿瘤TNM分期") { TODO("Wait for Fragment") } // { Appendix_Tumor_TNM_fm() }
        addMenuItem("滋养细胞肿瘤改良预后评分系统（FIGO,2000）") { Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm() }
        addMenuItem("GIST切除术后风险分级（胃肠道间质瘤）") { TODO("Wait for Fragment") } // { GIST_Risk_fm() }
        addMenuItem("HL国际预后评分（霍奇金淋巴瘤）") { TODO("Wait for Fragment") } // { HL_IPI_fm() }
        addMenuItem("肛管癌TNM分期") { TODO("Wait for Fragment") } // { Anal_Cancer_TNM_fm() }
        addMenuItem("软组织肉瘤TNM分期") { TODO("Wait for Fragment") } // { Soft_Tissue_Sarcoma_TNM_fm() }
        addMenuItem("Ann Arbor分期系统（霍奇金淋巴瘤HL分期）") { TODO("Wait for Fragment") } // { Ann_Arbor_Staging_fm() }
        addMenuItem("胰腺内分泌肿瘤PEN类型及相关临床综合征") { TODO("Wait for Fragment") } // { PEN_Types_fm() }
        addMenuItem("Vater壶腹癌TNM分期") { TODO("Wait for Fragment") } // { Ampulla_of_Vater_Cancer_TNM_fm() }
        addMenuItem("睾丸肿瘤TNM分期") { TODO("Wait for Fragment") } // { Testicular_Tumor_TNM_fm() }
        addMenuItem("未成熟畸胎瘤的分级方法") { Immature_TeratomasGrading_method_for_fm() }
        addMenuItem("阴茎癌TNM分期") { TODO("Wait for Fragment") } // { Penile_Cancer_TNM_fm() }
        addMenuItem("骨肿瘤TNM分期") { TODO("Wait for Fragment") } // { Bone_Tumor_TNM_fm() }
        addMenuItem("外阴癌TNM分期") { Vulvar_Cancer_Tnm_stage_fm() }
        addMenuItem("阴道癌TNM分期") { Vaginal_Cancer_Tnm_Stage_fm() }
        addMenuItem("胸膜间皮瘤TNM分期") { TODO("Wait for Fragment") } // { Pleural_Mesothelioma_TNM_fm() }
        addMenuItem("远端胆管癌TNM分期") { TODO("Wait for Fragment") } // { Distal_Cholangiocarcinoma_TNM_fm() }
        addMenuItem("膀胱尿路上皮恶性程度分级系统") { TODO("Wait for Fragment") } // { Bladder_Urothelial_Grading_fm() }
        addMenuItem("原发性皮肤淋巴瘤TNM分期") { TODO("Wait for Fragment") } // { Primary_Skin_Lymphoma_TNM_fm() }
        addMenuItem("皮肤鳞状细胞癌及其它皮肤肿瘤TNM分期") { TODO("Wait for Fragment") } // { Skin_SCC_TNM_fm() }
        addMenuItem("皮肤黑色素瘤TNM分期") { TODO("Wait for Fragment") } // { Skin_Melanoma_TNM_fm() }
        addMenuItem("滋养细胞肿瘤解剖学分期（FIGO,2000）") { Trophoblastic_Tumors_Anatomical_staging_fm() }
        addMenuItem("子宫肉瘤分期（FIGO,2009）") { Uterine_Sarcoma_Staging_fm() }
        addMenuItem("神经系统副肿瘤综合征PNS诊断标准") { TODO("Wait for Fragment") } // { PNS_Criteria_fm() }
        addMenuItem("输卵管癌手术病理分期") { Fallopian_Tube_Cancer_surgery_pathological_staging_fm() }
        addMenuItem("妊娠滋养细胞肿瘤TNM分期") { Gestational_Trophoblastic_Tumor_Tnm_stage_fm() }
        addMenuItem("不同因素对膀胱癌复发与进展影响的评分") { TODO("Wait for Fragment") } // { Bladder_Cancer_Recurrence_Score_fm() }
        addMenuItem("肾上腺肿瘤TNM分期") { TODO("Wait for Fragment") } // { Adrenal_Tumor_TNM_fm() }
        addMenuItem("外阴癌分期（FIGO,2014）") { Vulvar_cancer_staging_Figo_2014_fm() }
        addMenuItem("输卵管肿瘤TNM分期") { Fallopian_tube_tumors_Tnm_Stage_fm() }
        addMenuItem("尿道肿瘤TNM分期") { TODO("Wait for Fragment") } // { Urethral_Tumor_TNM_fm() }
        addMenuItem("阴道癌分期（FIGO/UICC）") { Vaginal_Cancer_Staging_Figo_Uicc_fm() }
        addMenuItem("Crawford分型（胸腹主动脉瘤）") { TODO("Wait for Fragment") } // { Crawford_Classification_fm() }
        addMenuItem("外阴鳞状上皮内瘤变分类及特征") { Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm() }
        addMenuItem("NFI和NFII诊断标准（神经纤维瘤病）") { TODO("Wait for Fragment") } // { NF_Criteria_fm() }
        addMenuItem("Merkel细胞瘤TNM分期") { TODO("Wait for Fragment") } // { Merkel_Cell_Tumor_TNM_fm() }
    }
}
