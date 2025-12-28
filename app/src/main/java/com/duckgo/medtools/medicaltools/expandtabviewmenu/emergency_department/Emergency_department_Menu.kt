package com.duckgo.medtools.medicaltools.expandtabviewmenu.emergency_department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.comprehensive.Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.Severe_Preeclampsia_Diagnosis_fm

class Emergency_department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("CHADS2 score for AF（房颤患者卒中风险评分）") { TODO("Wait for Fragment") } // { Chads2_Score_fm() }
        addMenuItem("GRACE风险评分（急性冠脉综合征）") { TODO("Wait for Fragment") } // { Grace_Score_fm() }
        addMenuItem("NIHSS（美国国立卫生院卒中量表）") { TODO("Wait for Fragment") } // { Nihss_Score_fm() }
        addMenuItem("GCS（格拉斯哥昏迷评分）") { TODO("Wait for Fragment") } // { Gcs_Score_fm() }
        addMenuItem("产后出血量估计与休克指数") { Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm() }
        addMenuItem("CHA2DS-VASc score for AF（房颤卒中风险评分）") { TODO("Wait for Fragment") } // { Cha2dsVasc_Score_fm() }
        addMenuItem("APACHE II评分系统（急性生理和慢性健康评分）") { TODO("Wait for Fragment") } // { Apache2_Score_fm() }
        addMenuItem("ABCD评分系统（短暂性脑缺血发作TIA）") { TODO("Wait for Fragment") } // { Abcd_Score_fm() }
        addMenuItem("MODS评分") { TODO("Wait for Fragment") } // { Mods_Score_fm() }
        addMenuItem("ESRS（Essen卒中风险评分量表）") { TODO("Wait for Fragment") } // { Esrs_Score_fm() }
        addMenuItem("COS-SAF symptom score for AF（房颤症状评分）") { TODO("Wait for Fragment") } // { Cossaf_Score_fm() }
        addMenuItem("上消化道出血病情严重程度分级") { TODO("Wait for Fragment") } // { Upper_Gi_Bleed_Grading_fm() }
        addMenuItem("EHRA评分（房颤相关症状分级）") { TODO("Wait for Fragment") } // { Ehra_Score_fm() }
        addMenuItem("Alvarado评分（急性阑尾炎）") { TODO("Wait for Fragment") } // { Alvarado_Score_fm() }
        addMenuItem("TIMI评分（非ST段抬高型心肌梗死评分）") { TODO("Wait for Fragment") } // { Timi_Nstemi_Score_fm() }
        addMenuItem("Killip心功能分级（急性心梗）") { TODO("Wait for Fragment") } // { Killip_Grading_fm() }
        addMenuItem("SOFA脓毒症评分（序贯性器官功能衰竭评分）") { TODO("Wait for Fragment") } // { Sofa_Score_fm() }
        addMenuItem("创伤失血量的判定") { TODO("Wait for Fragment") } // { Trauma_Blood_Loss_fm() }
        addMenuItem("重度子痫前期的诊断") { Severe_Preeclampsia_Diagnosis_fm() }
        addMenuItem("中国脑卒中患者临床神经功能缺损评分") { TODO("Wait for Fragment") } // { Chinese_Stroke_Scale_fm() }
        addMenuItem("Ranson标准（急性胰腺炎评分）") { TODO("Wait for Fragment") } // { Ranson_Criteria_fm() }
        addMenuItem("CTSI（急性胰腺炎CT严重程度指数）") { TODO("Wait for Fragment") } // { Ctsi_Score_fm() }
        addMenuItem("TIMI评分（ST段抬高型心肌梗死评分）") { TODO("Wait for Fragment") } // { Timi_Stemi_Score_fm() }
        addMenuItem("ABCD2评分（短暂性脑缺血发作评分）") { TODO("Wait for Fragment") } // { Abcd2_Score_fm() }
        addMenuItem("TOAST分型（急性缺血性脑卒中）") { TODO("Wait for Fragment") } // { Toast_Classification_fm() }
        addMenuItem("Wells评分（肺栓塞）") { TODO("Wait for Fragment") } // { Wells_Pe_Score_fm() }
        addMenuItem("PERC（肺栓塞排除标准）") { TODO("Wait for Fragment") } // { Perc_Rule_fm() }
        addMenuItem("Glasgow-Blatchford评分（上消化道出血评分）") { TODO("Wait for Fragment") } // { Glasgow_Blatchford_Score_fm() }
        addMenuItem("SAPS II（简化的急性生理功能评分系统）") { TODO("Wait for Fragment") } // { Saps2_Score_fm() }
        addMenuItem("改良Rankin量表") { TODO("Wait for Fragment") } // { Mrs_Scale_fm() }
        addMenuItem("Forrest分级（消化道出血）") { TODO("Wait for Fragment") } // { Forrest_Grading_fm() }
        addMenuItem("Rockall评分（急性上消化道出血）") { TODO("Wait for Fragment") } // { Rockall_Score_fm() }
        addMenuItem("喉梗阻分度") { TODO("Wait for Fragment") } // { Laryngeal_Obstruction_Grading_fm() }
        addMenuItem("新九分法（烧伤面积估计）") { TODO("Wait for Fragment") } // { Rule_Of_Nines_fm() }
        addMenuItem("Brooke公式（烧伤补液）") { TODO("Wait for Fragment") } // { Brooke_Formula_fm() }
        addMenuItem("HUNT-HESS分级（蛛网膜下腔出血）") { TODO("Wait for Fragment") } // { Hunt_Hess_Grading_fm() }
        addMenuItem("Geneva预后评分（肺栓塞）") { TODO("Wait for Fragment") } // { Geneva_Score_fm() }
        addMenuItem("急性肾损伤AKI诊断和分期标准") { TODO("Wait for Fragment") } // { Aki_Criteria_fm() }
        addMenuItem("烧伤补液公式（第三军医大学）") { TODO("Wait for Fragment") } // { Burn_Fluid_Resuscitation_fm() }
        addMenuItem("RASS（Richmond躁动-镇静评分）") { TODO("Wait for Fragment") } // { Rass_Score_fm() }
        addMenuItem("气胸肺压缩程度估算（三线法）") { TODO("Wait for Fragment") } // { Pneumothorax_Compression_fm() }
        addMenuItem("Parkland公式（烧伤补液）") { TODO("Wait for Fragment") } // { Parkland_Formula_fm() }
        addMenuItem("预期肺栓塞早期死亡率的风险分级") { TODO("Wait for Fragment") } // { Pe_Mortality_Risk_fm() }
        addMenuItem("烧伤严重程度分类") { TODO("Wait for Fragment") } // { Burn_Severity_Classification_fm() }
        addMenuItem("创伤时基础能耗估计") { TODO("Wait for Fragment") } // { Trauma_Energy_Expenditure_fm() }
        addMenuItem("三度四分法（烧伤深度分级）") { TODO("Wait for Fragment") } // { Burn_Depth_Classification_fm() }
        addMenuItem("气管插管时肌松程度分级") { TODO("Wait for Fragment") } // { Muscle_Relaxation_Grading_fm() }
        addMenuItem("SFSR定律（旧金山晕厥定律）") { TODO("Wait for Fragment") } // { Sfsr_Syncope_Law_fm() }
        addMenuItem("烧伤热量供应公式（第三军医大学）") { TODO("Wait for Fragment") } // { Burn_Calorie_Supply_fm() }
        addMenuItem("急性下肢缺血分级") { TODO("Wait for Fragment") } // { Acute_Limb_Ischemia_Grading_fm() }
        addMenuItem("斯堪地那维亚卒中量表") { TODO("Wait for Fragment") } // { Scandinavian_Stroke_Scale_fm() }
        addMenuItem("DeBakey分型（主动脉夹层）") { TODO("Wait for Fragment") } // { Debakey_Classification_fm() }
        addMenuItem("急性移植物抗宿主反应GVHD分级") { TODO("Wait for Fragment") } // { Gvhd_Grading_fm() }
        addMenuItem("Stanford分型（主动脉夹层）") { TODO("Wait for Fragment") } // { Stanford_Classification_fm() }
    }
}
