package com.duckgo.medtools.medicaltools.expandtabviewmenu.Dermatology_and_Venereology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Dermatology_and_Venereology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("原发性皮肤淋巴瘤TNM分期") { TODO("Wait for Fragment") } // { Primary_Skin_Lymphoma_TNM_fm() }
        addMenuItem("皮肤鳞状细胞癌及其它皮肤肿瘤TNM分期") { TODO("Wait for Fragment") } // { Skin_SCC_TNM_fm() }
        addMenuItem("皮肤黑色素瘤TNM分期") { TODO("Wait for Fragment") } // { Skin_Melanoma_TNM_fm() }
        addMenuItem("Merkel细胞瘤TNM分期") { TODO("Wait for Fragment") } // { Merkel_Cell_Tumor_TNM_fm() }
    }
}
