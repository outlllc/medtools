package com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Pharmacy_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.Emergency_Contraceptive_Pill_Dosage_fm

class Pharmacy_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("HAS-BLED评分（口服抗凝出血风险评估）") { TODO("Wait for Fragment") } // { HasBled_fm() }
        addMenuItem("紧急避孕药物剂量与方案") { Emergency_Contraceptive_Pill_Dosage_fm() }
        addMenuItem("OBRI（华法林出血风险评估-门诊病人出血风险指数）") { TODO("Wait for Fragment") } // { OBRI_fm() }
        addMenuItem("托吡酯加量方法（日剂量）") { TODO("Wait for Fragment") } // { Topiramate_Dosage_fm() }
    }
}
