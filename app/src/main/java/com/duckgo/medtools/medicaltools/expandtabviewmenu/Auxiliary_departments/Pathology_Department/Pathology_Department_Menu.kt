package com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Pathology_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.Fallopian_Tube_Cancer_surgery_pathological_staging_fm

class Pathology_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）") { Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm() }
        addMenuItem("输卵管癌手术病理分期") { Fallopian_Tube_Cancer_surgery_pathological_staging_fm() }
    }
}
