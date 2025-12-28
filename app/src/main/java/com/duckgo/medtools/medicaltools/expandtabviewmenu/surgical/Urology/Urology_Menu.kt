package com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Urology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Urology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("IIEF-5（国际勃起功能评分5项") { TODO("Wait for Fragment") } // { IIEF5_fm() }
        addMenuItem("尿石的一般特征") { TODO("Wait for Fragment") } // { Urinary_Stones_fm() }
        addMenuItem("前列腺癌TNM分期") { TODO("Wait for Fragment") } // { Prostate_Cancer_TNM_fm() }
        addMenuItem("肾癌TNM分期") { TODO("Wait for Fragment") } // { Renal_Cancer_TNM_fm() }
        addMenuItem("肾盂和输尿管肿瘤TNM分期") { TODO("Wait for Fragment") } // { Renal_Pelvis_Ureter_TNM_fm() }
        addMenuItem("I-PSS（国际前列腺症状评分表）") { TODO("Wait for Fragment") } // { IPSS_Score_fm() }
        addMenuItem("膀胱肿瘤TNM分期") { TODO("Wait for Fragment") } // { Bladder_Tumor_TNM_fm() }
        addMenuItem("Goldman分类（尿道损伤）") { TODO("Wait for Fragment") } // { Goldman_Urethral_Injury_fm() }
        addMenuItem("膀胱癌TNM分期") { TODO("Wait for Fragment") } // { Bladder_Cancer_TNM_fm() }
        addMenuItem("尿路钙排泄指数（钙-肌酐比）") { TODO("Wait for Fragment") } // { Urinary_Calcium_Excretion_fm() }
        addMenuItem("睾丸肿瘤TNM分期") { TODO("Wait for Fragment") } // { Testicular_Tumor_TNM_fm() }
        addMenuItem("膀胱尿路上皮恶性程度分级系统") { TODO("Wait for Fragment") } // { Bladder_Urothelial_Grading_fm() }
        addMenuItem("EAU尿道损伤严重程度分级") { TODO("Wait for Fragment") } // { EAU_Urethral_Injury_fm() }
        addMenuItem("不同因素对膀胱癌复发与进展影响的评分") { TODO("Wait for Fragment") } // { Bladder_Cancer_Recurrence_Score_fm() }
        addMenuItem("肾上腺肿瘤TNM分期") { TODO("Wait for Fragment") } // { Adrenal_Tumor_TNM_fm() }
        addMenuItem("尿道肿瘤TNM分期") { TODO("Wait for Fragment") } // { Urethral_Tumor_TNM_fm() }
    }
}
