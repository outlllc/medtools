package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Rheumatology_and_Immunology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Rheumatology_and_Immunology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("类风湿关节炎疾病活动性评分（DAS 28）") { TODO("Wait for Fragment") } // { DAS28_fm() }
        addMenuItem("激素计量换算") { TODO("Wait for Fragment") } // { Steroid_Conversion_fm() }
        addMenuItem("SLEDAI（系统性红斑狼疮的病情活动程度评分）") { TODO("Wait for Fragment") } // { SLEDAI_fm() }
        addMenuItem("系统性红斑狼疮诊断标准（ACR,1997）") { TODO("Wait for Fragment") } // { SLE_Criteria_ACR1997_fm() }
        addMenuItem("类风湿关节炎分类标准和评分系统") { TODO("Wait for Fragment") } // { RA_Classification_Score_fm() }
        addMenuItem("类风湿关节炎诊断标准（ACR，1987）") { TODO("Wait for Fragment") } // { RA_Criteria_ACR1987_fm() }
        addMenuItem("类风湿关节炎功能状态分级标准") { TODO("Wait for Fragment") } // { RA_Functional_Grading_fm() }
        addMenuItem("强直性脊柱炎诊断标准") { TODO("Wait for Fragment") } // { AS_Criteria_fm() }
        addMenuItem("类风湿关节炎临床缓解标准") { TODO("Wait for Fragment") } // { RA_Remission_Criteria_fm() }
        addMenuItem("狼疮性肾炎分型（ISN/RPS,2003）") { TODO("Wait for Fragment") } // { Lupus_Nephritis_ISN2003_fm() }
        addMenuItem("Yamaguchi诊断标准（成人still病）") { TODO("Wait for Fragment") } // { Yamaguchi_Criteria_fm() }
        addMenuItem("自身免疫性肝炎的诊断标准与评分系统") { TODO("Wait for Fragment") } // { AIH_Criteria_Score_fm() }
        addMenuItem("骶髂关节病变X线分级") { TODO("Wait for Fragment") } // { Sacroiliitis_Xray_fm() }
        addMenuItem("类风湿关节炎X线分类标准") { TODO("Wait for Fragment") } // { RA_Xray_Classification_fm() }
        addMenuItem("膝关节骨关节炎临床及放射学诊断标准") { TODO("Wait for Fragment") } // { OA_Knee_Clinical_Xray_fm() }
        addMenuItem("膝关节骨关节炎临床诊断标准") { TODO("Wait for Fragment") } // { OA_Knee_Clinical_fm() }
        addMenuItem("髋关节骨关节炎临床诊断标准") { TODO("Wait for Fragment") } // { OA_Hip_Clinical_fm() }
        addMenuItem("髋关节骨关节炎临床及放射学诊断标准") { TODO("Wait for Fragment") } // { OA_Hip_Clinical_Xray_fm() }
        addMenuItem("手关节骨关节炎临床诊断标准") { TODO("Wait for Fragment") } // { OA_Hand_Clinical_fm() }
    }
}
