package com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Hepatobiliary_Surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Hepatobiliary_Surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("CTP分级（肝功能损害分级系统）") { TODO("Wait for Fragment") } // { CtpGrading_fm() }
        addMenuItem("MELD评分（终末期肝病）") { TODO("Wait for Fragment") } // { MeldScore_fm() }
        addMenuItem("肝癌TNM分期") { TODO("Wait for Fragment") } // { LiverCancerTNM_fm() }
        addMenuItem("Alvarado评分（急性阑尾炎）") { TODO("Wait for Fragment") } // { AlvaradoScore_fm() }
        addMenuItem("Ranson标准（急性胰腺炎评分）") { TODO("Wait for Fragment") } // { RansonCriteria_fm() }
        addMenuItem("CTSI（急性胰腺炎CT严重程度指数）") { TODO("Wait for Fragment") } // { CtsiScore_fm() }
        addMenuItem("BCLC分期（巴塞罗那肝癌分级）") { TODO("Wait for Fragment") } // { BclcStaging_fm() }
        addMenuItem("胆囊癌TNM分期") { TODO("Wait for Fragment") } // { GallbladderCancerTNM_fm() }
        addMenuItem("AAST（肝损伤分级）") { TODO("Wait for Fragment") } // { AastLiverInjury_fm() }
        addMenuItem("NAS（非酒精性脂肪肝NAFLD活动度积分）") { TODO("Wait for Fragment") } // { NasScore_fm() }
        addMenuItem("Bismuth-Corlette分型（肝门部胆管癌）") { TODO("Wait for Fragment") } // { BismuthCorlette_fm() }
        addMenuItem("肝内胆管癌TNM分期") { TODO("Wait for Fragment") } // { IntrahepaticCholangiocarcinomaTNM_fm() }
        addMenuItem("肝门胆管癌TNM分期") { TODO("Wait for Fragment") } // { PerihilarCholangiocarcinomaTNM_fm() }
        addMenuItem("Vater壶腹癌TNM分期") { TODO("Wait for Fragment") } // { AmpullaOfVaterCancerTNM_fm() }
        addMenuItem("远端胆管癌TNM分期") { TODO("Wait for Fragment") } // { DistalCholangiocarcinomaTNM_fm() }
    }
}
