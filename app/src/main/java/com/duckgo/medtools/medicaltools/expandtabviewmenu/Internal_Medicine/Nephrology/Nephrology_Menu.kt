package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Nephrology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Nephrology.*

class Nephrology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("Cockcroft-Gault公式（内生肌酐清除率公式）") { Creatinine_Clearance_Cockcroft_Gault_fm() }
        addMenuItem("CKD-EPI公式（肾小球滤过率）") { Glomerular_Filtration_Rate_CKD_EPI_fm() }
        addMenuItem("MDRD简化公式（肾小球滤过率简化公式）") { TODO("Wait for Fragment") } // { Mdrd_Simplified_fm() }
        addMenuItem("MDRD公式（肾小球滤过率公式）") { TODO("Wait for Fragment") } // { Mdrd_Formula_fm() }
        addMenuItem("内生肌酐清除率-测量法") { TODO("Wait for Fragment") } // { Creatinine_Clearance_Measured_fm() }
        addMenuItem("慢性肾脏病CKD分期") { Chronic_Kidney_Disease_Staging_fm() }
        addMenuItem("Durate公式（内生肌酐清除率公式）") { TODO("Wait for Fragment") } // { Durate_Formula_fm() }
        addMenuItem("肾衰指数") { TODO("Wait for Fragment") } // { Renal_Failure_Index_fm() }
        addMenuItem("Kt-V透析有效性指数") { TODO("Wait for Fragment") } // { KtV_Index_fm() }
        addMenuItem("残余肾功能") { TODO("Wait for Fragment") } // { Residual_Renal_Function_fm() }
        addMenuItem("蛋白质摄入量") { TODO("Wait for Fragment") } // { Protein_Intake_fm() }
        addMenuItem("尿蛋白排泄量估计") { TODO("Wait for Fragment") } // { Urinary_Protein_Excretion_fm() }
        addMenuItem("造影剂肾病危险因素评分") { TODO("Wait for Fragment") } // { Cin_Risk_Score_fm() }
        addMenuItem("尿素排泄分数") { TODO("Wait for Fragment") } // { FeUrea_fm() }
        addMenuItem("LEE分级（IgA肾病，根据光镜表现）") { TODO("Wait for Fragment") } // { Lee_Grading_IgA_fm() }
        addMenuItem("钠排泌分数") { TODO("Wait for Fragment") } // { FeNa_fm() }
        addMenuItem("bosniak分级（肾囊性病变）") { TODO("Wait for Fragment") } // { Bosniak_Classification_fm() }
        addMenuItem("肾癌TNM分期") { TODO("Wait for Fragment") } // { Renal_Cancer_TNM_fm() }
        addMenuItem("肾盂和输尿管肿瘤TNM分期") { TODO("Wait for Fragment") } // { Renal_Pelvis_Ureter_TNM_fm() }
        addMenuItem("急性肾损伤AKI诊断和分期标准") { TODO("Wait for Fragment") } // { AKI_Criteria_fm() }
        addMenuItem("肾小管磷重吸收") { TODO("Wait for Fragment") } // { Tubular_Phosphate_Reabsorption_fm() }
        addMenuItem("肾上腺肿瘤TNM分期") { TODO("Wait for Fragment") } // { Adrenal_Tumor_TNM_fm() }
    }
}
