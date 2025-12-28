package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Hematology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Hematology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("贫血的分类") { TODO("Wait for Fragment") } // { Anemia_Classification_fm() }
        addMenuItem("霍奇金和非霍奇金淋巴瘤TNM分期") { TODO("Wait for Fragment") } // { Lymphoma_TNM_fm() }
        addMenuItem("化疗后骨髓抑制的分度") { TODO("Wait for Fragment") } // { Myelosuppression_Grading_fm() }
        addMenuItem("DIC诊断积分系统") { TODO("Wait for Fragment") } // { DIC_Score_fm() }
        addMenuItem("Durie-Salmon分期（多发性骨髓瘤MM)") { TODO("Wait for Fragment") } // { Durie_Salmon_Staging_fm() }
        addMenuItem("IPI（国际淋巴瘤预后指数）") { TODO("Wait for Fragment") } // { IPI_Score_fm() }
        addMenuItem("HLH-2004（嗜血细胞综合征HPS诊断标准）") { TODO("Wait for Fragment") } // { HLH_Criteria_fm() }
        addMenuItem("IPSS（骨髓增生异常综合征MDS国际预后评分系统）") { TODO("Wait for Fragment") } // { IPSS_Score_fm() }
        addMenuItem("急性髓系白血病的危险度分级") { TODO("Wait for Fragment") } // { AML_Risk_Grading_fm() }
        addMenuItem("ISS（多发性骨髓瘤MM国际分期系统") { TODO("Wait for Fragment") } // { ISS_Staging_fm() }
        addMenuItem("Lavin-Osband分级法（朗格汉斯细胞组织细胞增生症LCH临床分型）") { TODO("Wait for Fragment") } // { LCH_Classification_fm() }
        addMenuItem("HL国际预后评分（霍奇金淋巴瘤）") { TODO("Wait for Fragment") } // { HL_IPI_Score_fm() }
        addMenuItem("Ann Arbor分期系统（霍奇金淋巴瘤HL分期）") { TODO("Wait for Fragment") } // { Ann_Arbor_Staging_fm() }
        addMenuItem("4Ts评分系统（肝素诱导的血小板减少评分系统）") { TODO("Wait for Fragment") } // { HIT_4Ts_Score_fm() }
        addMenuItem("WPSS（骨髓增生异常综合征MDS基于WHO分类的预后评分系统）") { TODO("Wait for Fragment") } // { WPSS_Score_fm() }
        addMenuItem("急性移植物抗宿主反应GVHD分级") { TODO("Wait for Fragment") } // { GVHD_Grading_fm() }
    }
}
