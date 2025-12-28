package com.duckgo.medtools.medicaltools.expandtabviewmenu.Other.Andrology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Semen_reference_values_fm

class Andrology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("IIEF-5（国际勃起功能评分5项）") { TODO("Wait for Fragment") } // { IIEF5_fm() }
        addMenuItem("人类精液变量参考值") { Semen_reference_values_fm() }
        addMenuItem("前列腺癌TNM分期") { TODO("Wait for Fragment") } // { Prostate_Cancer_TNM_fm() }
        addMenuItem("I-PSS（国际前列腺症状评分表）") { TODO("Wait for Fragment") } // { IPSS_Score_fm() }
        addMenuItem("阴茎癌TNM分期") { TODO("Wait for Fragment") } // { Penile_Cancer_TNM_fm() }
    }
}
