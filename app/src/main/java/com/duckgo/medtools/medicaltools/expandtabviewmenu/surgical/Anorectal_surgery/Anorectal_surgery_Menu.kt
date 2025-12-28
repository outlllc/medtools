package com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Anorectal_surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Anorectal_surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("结直肠癌TNM分期") { TODO("Wait for Fragment") } // { Colorectal_Cancer_TNM_fm() }
        addMenuItem("结直肠息肉分类") { TODO("Wait for Fragment") } // { Colorectal_Polyp_Classification_fm() }
        addMenuItem("小肠肿瘤TNM分期") { TODO("Wait for Fragment") } // { Small_Intestine_Tumor_TNM_fm() }
        addMenuItem("Dukes分期（大肠癌）") { TODO("Wait for Fragment") } // { Dukes_Staging_fm() }
        addMenuItem("胃肠道间质瘤TNM分期") { TODO("Wait for Fragment") } // { Gist_Tnm_Staging_fm() }
        addMenuItem("Broders分级（结直肠癌组织学）") { TODO("Wait for Fragment") } // { Broders_Grading_fm() }
        addMenuItem("GIST切除术后风险分级（胃肠道间质瘤）") { TODO("Wait for Fragment") } // { Gist_Risk_fm() }
        addMenuItem("肛管癌TNM分期") { TODO("Wait for Fragment") } // { Anal_Cancer_TNM_fm() }
    }
}
