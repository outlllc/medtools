package com.duckgo.medtools.medicaltools.expandtabviewmenu.Department_of_Psychiatry

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.Edinburgh_Postnatal_Depression_Scale_fm
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.Diagnosis_Postnatal_Depression_fm
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.Pmdd_Diagnostic_Criteria_fm

class Department_of_Psychiatry_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("MMSE（简易智能精神状态检查量表）") { TODO("Wait for Fragment") } // { MMSE_fm() }
        addMenuItem("HAMD（汉密尔顿抑郁量表）") { TODO("Wait for Fragment") } // { HAMD_fm() }
        addMenuItem("HAD（医院焦虑抑郁情绪测量表）") { TODO("Wait for Fragment") } // { HAD_fm() }
        addMenuItem("汉密尔顿焦虑量表") { TODO("Wait for Fragment") } // { HAMA_fm() }
        addMenuItem("SAPS（阳性症状量表）") { TODO("Wait for Fragment") } // { SAPS_fm() }
        addMenuItem("BPRS（简明精神病量表）") { TODO("Wait for Fragment") } // { BPRS_fm() }
        addMenuItem("EPDS（爱丁堡产后抑郁量表）") { Edinburgh_Postnatal_Depression_Scale_fm() }
        addMenuItem("克莱顿皇家医院行为量表") { TODO("Wait for Fragment") } // { Crichton_fm() }
        addMenuItem("Rancho Los Amigos认知功能分级表") { TODO("Wait for Fragment") } // { Rancho_fm() }
        addMenuItem("经前期焦虑障碍PMDD诊断标准") { Pmdd_Diagnostic_Criteria_fm() }
        addMenuItem("SANS（阴性症状量表）") { TODO("Wait for Fragment") } // { SANS_fm() }
        addMenuItem("产褥期抑郁症诊断标准") { Diagnosis_Postnatal_Depression_fm() }
    }
}
