package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Gastroenterology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Gastroenterology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("胃癌TNM分期") { TODO("Wait for Fragment") } // { Stomach_Cancer_TNM_fm() }
        addMenuItem("食道癌TNM分期") { TODO("Wait for Fragment") } // { Esophageal_Cancer_TNM_fm() }
        addMenuItem("MELD评分（终末期肝病）") { TODO("Wait for Fragment") } // { Meld_Score_fm() }
        addMenuItem("肝性脑病分期") { TODO("Wait for Fragment") } // { Hepatic_Encephalopathy_Staging_fm() }
        addMenuItem("上消化道出血病情严重程度分级") { TODO("Wait for Fragment") } // { Ugib_Severity_Grading_fm() }
        addMenuItem("Alvarado评分（急性阑尾炎）") { TODO("Wait for Fragment") } // { Alvarado_Score_fm() }
        addMenuItem("Ranson标准（急性胰腺炎评分）") { TODO("Wait for Fragment") } // { Ranson_Criteria_fm() }
        addMenuItem("CTSI（急性胰腺炎CT严重程度指数）") { TODO("Wait for Fragment") } // { Ctsi_Score_fm() }
        addMenuItem("H.pylori根除指证（第五次共识，2017）") { TODO("Wait for Fragment") } // { Hp_Eradication_Indications_fm() }
        addMenuItem("胰腺癌TNM分期") { TODO("Wait for Fragment") } // { Pancreatic_Cancer_TNM_fm() }
        addMenuItem("Glasgow-Blatchford评分（上消化道出血评分）") { TODO("Wait for Fragment") } // { Glasgow_Blatchford_Score_fm() }
        addMenuItem("白蛋白/球蛋白比值（白球比）") { TODO("Wait for Fragment") } // { Ag_Ratio_fm() }
        addMenuItem("慢性胰腺炎CP诊断标准") { TODO("Wait for Fragment") } // { Chronic_Pancreatitis_Criteria_fm() }
        addMenuItem("Forrest分级（消化道出血）") { TODO("Wait for Fragment") } // { Forrest_Classification_fm() }
        addMenuItem("Rockall评分（急性上消化道出血）") { TODO("Wait for Fragment") } // { Rockall_Score_fm() }
        addMenuItem("CDAI计算法（简化克罗恩病活动指数）") { TODO("Wait for Fragment") } // { Cdai_Calculation_fm() }
        addMenuItem("腹水血清白蛋白梯度") { TODO("Wait for Fragment") } // { Saag_Calculation_fm() }
        addMenuItem("Maddrey判别函数（酒精性肝炎）") { TODO("Wait for Fragment") } // { Maddrey_Function_fm() }
        addMenuItem("淀粉酶/肌酐清除比值") { TODO("Wait for Fragment") } // { Amylase_Creatinine_Ratio_fm() }
        addMenuItem("克罗恩病诊断要点") { TODO("Wait for Fragment") } // { Crohns_Disease_Diagnosis_fm() }
        addMenuItem("Los Angeles分级系统（反流性食管炎GERD分级）") { TODO("Wait for Fragment") } // { Los_Angeles_Classification_fm() }
        addMenuItem("H.pylori感染的根除标准") { TODO("Wait for Fragment") } // { Hp_Eradication_Criteria_fm() }
        addMenuItem("Mayo评分（溃疡性结肠炎活动性评分）") { TODO("Wait for Fragment") } // { Mayo_Uc_Score_fm() }
        addMenuItem("H.pylori感染的诊断标准") { TODO("Wait for Fragment") } // { Hp_Diagnosis_Criteria_fm() }
        addMenuItem("胃肠道间质瘤TNM分期") { TODO("Wait for Fragment") } // { Gist_Tnm_Staging_fm() }
        addMenuItem("NAS（非酒精性脂肪肝NAFLD活动度积分）") { TODO("Wait for Fragment") } // { Nas_Score_fm() }
        addMenuItem("Truelove/Witts分级（溃疡性结肠炎分度）") { TODO("Wait for Fragment") } // { Truelove_Witts_Grading_fm() }
        addMenuItem("胰腺内分泌肿瘤PEN类型及相关临床综合征") { TODO("Wait for Fragment") } // { Pen_Types_Syndromes_fm() }
    }
}
