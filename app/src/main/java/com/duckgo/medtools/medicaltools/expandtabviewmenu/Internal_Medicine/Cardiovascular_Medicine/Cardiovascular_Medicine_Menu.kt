package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Cardiovascular_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Cardiovascular_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("CRUSADE评分（出血风险评分量表）") { TODO("Wait for Fragment") } // { Crusade_Score_fm() }
        addMenuItem("高血压病分级、预后影响因素及危险分层") { TODO("Wait for Fragment") } // { Hypertension_Grading_fm() }
        addMenuItem("CHADS2 score for AF（房颤患者卒中风险评分）") { TODO("Wait for Fragment") } // { Chads2_Score_fm() }
        addMenuItem("GRACE风险评分（急性冠脉综合征）") { TODO("Wait for Fragment") } // { Grace_Score_fm() }
        addMenuItem("HAS-BLED评分（口服抗凝出血风险评估）") { TODO("Wait for Fragment") } // { HasBled_Score_fm() }
        addMenuItem("CHA2DS2-VASc score for AF（房颤患者卒中风险评分）") { TODO("Wait for Fragment") } // { Cha2ds2_Vasc_Score_fm() }
        addMenuItem("华法林出血风险评分-老年患者") { TODO("Wait for Fragment") } // { Warfarin_Risk_Elderly_fm() }
        addMenuItem("NYHA心功能分级（慢性心衰）") { TODO("Wait for Fragment") } // { Nyha_Grading_fm() }
        addMenuItem("六分钟步行试验") { TODO("Wait for Fragment") } // { Six_Minute_Walk_Test_fm() }
        addMenuItem("Framingham心脏危险评分-男性") { TODO("Wait for Fragment") } // { Framingham_Male_fm() }
        addMenuItem("COS-SAF symptom score for AF（房颤症状评分）") { TODO("Wait for Fragment") } // { Cossaf_Score_fm() }
        addMenuItem("SYNTAX积分") { TODO("Wait for Fragment") } // { Syntax_Score_fm() }
        addMenuItem("平均动脉压") { TODO("Wait for Fragment") } // { Map_Calculation_fm() }
        addMenuItem("EHRA评分（房颤相关症状分级）") { TODO("Wait for Fragment") } // { Ehra_Score_fm() }
        addMenuItem("心脏射血分数") { TODO("Wait for Fragment") } // { Ejection_Fraction_fm() }
        addMenuItem("TIMI血流分级") { TODO("Wait for Fragment") } // { Timi_Flow_Grading_fm() }
        addMenuItem("TIMI评分（非ST段抬高型心肌梗死评分）") { TODO("Wait for Fragment") } // { Timi_Nstemi_Score_fm() }
        addMenuItem("心指数") { TODO("Wait for Fragment") } // { Cardiac_Index_fm() }
        addMenuItem("TIMI评分（ST段抬高型心肌梗死评分）") { TODO("Wait for Fragment") } // { Timi_Stemi_Score_fm() }
        addMenuItem("EuroSCORE（欧洲心脏危险评估系统）") { TODO("Wait for Fragment") } // { Euroscore_fm() }
        addMenuItem("稳定性心绞痛分级") { TODO("Wait for Fragment") } // { Stable_Angina_Grading_fm() }
        addMenuItem("Bazett公式（校正QT间期公式）") { TODO("Wait for Fragment") } // { Bazett_Formula_fm() }
        addMenuItem("Levine6级分级法（心脏杂音）") { TODO("Wait for Fragment") } // { Levine_Grading_fm() }
        addMenuItem("OBRI（华法林出血风险评估-门诊病人出血风险指数）") { TODO("Wait for Fragment") } // { Obri_Score_fm() }
        addMenuItem("Framingham心脏危险评分-女性") { TODO("Wait for Fragment") } // { Framingham_Female_fm() }
        addMenuItem("Mayo系统（PCI并发症风险评分）") { TODO("Wait for Fragment") } // { Mayo_Pci_Complication_fm() }
        addMenuItem("慢性心衰分期") { TODO("Wait for Fragment") } // { Chf_Staging_fm() }
        addMenuItem("左心室收缩/舒张末期容积指数") { TODO("Wait for Fragment") } // { Lvi_Index_fm() }
        addMenuItem("系统性冠状动脉风险评估量表") { TODO("Wait for Fragment") } // { Score_Scale_fm() }
        addMenuItem("每搏输出量") { TODO("Wait for Fragment") } // { Stroke_Volume_fm() }
        addMenuItem("Framingham诊断标准（慢性充血性心力衰竭）") { TODO("Wait for Fragment") } // { Framingham_Criteria_fm() }
        addMenuItem("MUSIC危险评分（慢性充血性心力衰竭）") { TODO("Wait for Fragment") } // { Music_Score_fm() }
        addMenuItem("心输出量（超声）") { TODO("Wait for Fragment") } // { Cardiac_Output_fm() }
        addMenuItem("脉压-补液试验反应预测") { TODO("Wait for Fragment") } // { Pp_Fluid_Responsiveness_fm() }
        addMenuItem("国人缺血性心血管病（ICVD）十年发病危险度评估表-女性") { TODO("Wait for Fragment") } // { Icvd_Female_fm() }
        addMenuItem("Duke评分（平板运动试验）") { TODO("Wait for Fragment") } // { Duke_Score_fm() }
        addMenuItem("VALIANT风险评分（心衰）") { TODO("Wait for Fragment") } // { Valiant_Score_fm() }
        addMenuItem("Gorlin公式（心瓣膜面积）") { TODO("Wait for Fragment") } // { Gorlin_Formula_fm() }
        addMenuItem("高脂血症的钠浓度校正") { TODO("Wait for Fragment") } // { Sodium_Correction_Hyperlipidemia_fm() }
        addMenuItem("体循环阻力") { TODO("Wait for Fragment") } // { Svr_Calculation_fm() }
        addMenuItem("WHO-FC肺动脉高压功能分级") { TODO("Wait for Fragment") } // { Who_Fc_Ph_fm() }
        addMenuItem("DeBakey分型（主动脉夹层）") { TODO("Wait for Fragment") } // { Debakey_Type_fm() }
        addMenuItem("Stanford（主动脉夹层）") { TODO("Wait for Fragment") } // { Stanford_Type_fm() }
        addMenuItem("脐动脉血流阻力指数和收缩期/舒张期比值") { TODO("Wait for Fragment") } // { Umbilical_Artery_Ri_fm() }
        addMenuItem("体循环至肺循环分流型先心病推荐手术安全性的无创评估及心导管评估表") { TODO("Wait for Fragment") } // { Chd_Shunt_Assessment_fm() }
    }
}
