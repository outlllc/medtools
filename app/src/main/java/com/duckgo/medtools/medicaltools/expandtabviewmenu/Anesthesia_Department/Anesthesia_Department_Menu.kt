package com.duckgo.medtools.medicaltools.expandtabviewmenu.Anesthesia_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Anesthesia_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("改良Goldman评分（非心脏手术术前心脏风险指数）") { TODO("Wait for Fragment") } // { Goldman_Score_fm() }
        addMenuItem("ASA手术分级（美国麻醉医师协会健康状况分级）") { TODO("Wait for Fragment") } // { Asa_Grading_fm() }
        addMenuItem("VAS评分（疼痛视觉模拟评分系统）") { TODO("Wait for Fragment") } // { Vas_Score_fm() }
        addMenuItem("Wilson苏醒评分法（困难气道的预测）") { TODO("Wait for Fragment") } // { Wilson_Score_fm() }
        addMenuItem("蛛网膜下腔常用局麻药剂量及浓度") { TODO("Wait for Fragment") } // { Subarachnoid_Anesthesia_Dosage_fm() }
        addMenuItem("Steward苏醒评分法") { TODO("Wait for Fragment") } // { Steward_Score_fm() }
        addMenuItem("硬膜外阻滞常用局麻药浓度和剂量") { TODO("Wait for Fragment") } // { Epidural_Anesthesia_Dosage_fm() }
        addMenuItem("寒战分级") { TODO("Wait for Fragment") } // { Shivering_Grading_fm() }
        addMenuItem("椎管内麻醉（硬、腰、骶）效果评级标准") { TODO("Wait for Fragment") } // { Spinal_Anesthesia_Effect_fm() }
        addMenuItem("Ramsay镇静程度评分") { TODO("Wait for Fragment") } // { Ramsay_Sedation_Scale_fm() }
        addMenuItem("常用局麻药理化性质和麻醉效能") { TODO("Wait for Fragment") } // { Local_Anesthetics_Properties_fm() }
        addMenuItem("清醒程度分级") { TODO("Wait for Fragment") } // { Consciousness_Grading_fm() }
        addMenuItem("改良Mallampati气道分级") { TODO("Wait for Fragment") } // { Mallampati_Grading_fm() }
        addMenuItem("McGill疼痛简式问卷") { TODO("Wait for Fragment") } // { Mcgill_Pain_Questionnaire_fm() }
        addMenuItem("改良Lee's评分（非心脏手术术前心脏风险指数）") { TODO("Wait for Fragment") } // { Lee_Score_fm() }
        addMenuItem("全麻效果评级标准") { TODO("Wait for Fragment") } // { General_Anesthesia_Effect_fm() }
        addMenuItem("PRST评分系统（麻醉深度判断）") { TODO("Wait for Fragment") } // { Prst_Score_fm() }
        addMenuItem("麻醉后恢复期评分") { TODO("Wait for Fragment") } // { Postanesthesia_Recovery_Score_fm() }
        addMenuItem("改良马氏评分") { TODO("Wait for Fragment") } // { Modified_Malinas_Score_fm() }
        addMenuItem("神经阻滞效果评级标准（颈丛、臂丛、下肢神经等）") { TODO("Wait for Fragment") } // { Nerve_Block_Effect_fm() }
        addMenuItem("Prince-Henry评分法") { TODO("Wait for Fragment") } // { Prince_Henry_Score_fm() }
        addMenuItem("内脏牵拉反应") { TODO("Wait for Fragment") } // { Visceral_Traction_Reaction_fm() }
        addMenuItem("改良Bromage评分（运动阻滞评分）") { TODO("Wait for Fragment") } // { Bromage_Score_fm() }
        addMenuItem("POSSUM评分系统") { TODO("Wait for Fragment") } // { Possum_Score_fm() }
        addMenuItem("OAA/S评分法") { TODO("Wait for Fragment") } // { Oaas_Score_fm() }
        addMenuItem("Tarlov神经功能评分标准") { TODO("Wait for Fragment") } // { Tarlov_Score_fm() }
    }
}
