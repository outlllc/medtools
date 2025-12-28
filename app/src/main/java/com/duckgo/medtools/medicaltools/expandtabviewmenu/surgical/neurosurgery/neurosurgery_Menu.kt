package com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.neurosurgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class neurosurgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("HUNT-HESS分级（蛛网膜下腔出血）") { TODO("Wait for Fragment") } // { HuntHessGrading_fm() }
        addMenuItem("运动瘫痪类型的鉴别") { TODO("Wait for Fragment") } // { MotorParalysis_fm() }
        addMenuItem("Seddon分类（神经损伤）") { TODO("Wait for Fragment") } // { SeddonClassification_fm() }
        addMenuItem("SFSR定律（旧金山晕厥定律）") { TODO("Wait for Fragment") } // { SfsrSyncopeLaw_fm() }
        addMenuItem("Frankel脊髓损伤分级法") { TODO("Wait for Fragment") } // { FrankelStaging_fm() }
        addMenuItem("Sunderland分类法（神经损伤）") { TODO("Wait for Fragment") } // { SunderlandClassification_fm() }
        addMenuItem("Spetsler-Martin分级（颅内出血动静脉畸形AVM）") { TODO("Wait for Fragment") } // { SpetslerMartinGrading_fm() }
        addMenuItem("Chiari畸形分型（小脑扁桃体下疝畸形）") { TODO("Wait for Fragment") } // { ChiariClassification_fm() }
        addMenuItem("颈神经根受累的症状和体征") { TODO("Wait for Fragment") } // { CervicalRadiculopathy_fm() }
        addMenuItem("神经系统副肿瘤综合征PNS诊断标准") { TODO("Wait for Fragment") } // { PnsDiagnosis_fm() }
        addMenuItem("NFI和NFII诊断标准（神经纤维瘤）") { TODO("Wait for Fragment") } // { NfDiagnosis_fm() }
    }
}
