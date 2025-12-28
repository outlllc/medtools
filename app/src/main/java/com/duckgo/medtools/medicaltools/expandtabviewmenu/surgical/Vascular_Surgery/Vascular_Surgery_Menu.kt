package com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Vascular_Surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Vascular_Surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("Wells评分（下肢深静脉血栓形成DVT诊断评分") { TODO("Wait for Fragment") } // { WellsDvt_fm() }
        addMenuItem("急性下肢缺血分级") { TODO("Wait for Fragment") } // { AcuteLimbIschemia_fm() }
        addMenuItem("DeBakey分型（主动脉夹层）") { TODO("Wait for Fragment") } // { DeBakey_fm() }
        addMenuItem("Stanford分型（主动脉夹层）") { TODO("Wait for Fragment") } // { Stanford_fm() }
        addMenuItem("TASC分级（慢性下肢缺血-股腘动脉病变）") { TODO("Wait for Fragment") } // { TASC_Femoral_fm() }
        addMenuItem("TASC分级（慢性下肢缺血-主髂动脉病变）") { TODO("Wait for Fragment") } // { TASC_Iliac_fm() }
        addMenuItem("Fontaine/Rutherford分级（慢性下肢缺血）") { TODO("Wait for Fragment") } // { FontaineRutherford_fm() }
        addMenuItem("TASC分级（慢性下肢缺血-腘动脉以下病变）") { TODO("Wait for Fragment") } // { TASC_Popliteal_fm() }
    }
}
