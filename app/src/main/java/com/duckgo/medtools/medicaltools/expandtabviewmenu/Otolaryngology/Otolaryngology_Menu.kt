package com.duckgo.medtools.medicaltools.expandtabviewmenu.Otolaryngology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Otolaryngology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("咽部肿瘤TNM分期") { TODO("Wait for Fragment") } // { Pharyngeal_Tumor_TNM_fm() }
        addMenuItem("甲状腺肿瘤TNM分期") { TODO("Wait for Fragment") } // { Thyroid_Tumor_TNM_fm() }
        addMenuItem("喉部肿瘤TNM分期") { TODO("Wait for Fragment") } // { Laryngeal_Tumor_TNM_fm() }
        addMenuItem("甲状腺肿分级") { TODO("Wait for Fragment") } // { Goiter_Grading_fm() }
        addMenuItem("鼻腔与鼻窦肿瘤TNM分期") { TODO("Wait for Fragment") } // { Nasal_Sinus_Tumor_TNM_fm() }
        addMenuItem("吞咽功能障碍饮水试验") { TODO("Wait for Fragment") } // { Water_Swallow_Test_fm() }
        addMenuItem("吞咽障碍的饮食分级") { TODO("Wait for Fragment") } // { Dysphagia_Diet_Grading_fm() }
        addMenuItem("神经性耳聋与传导性耳聋的鉴别") { TODO("Wait for Fragment") } // { Deafness_Differential_fm() }
    }
}
