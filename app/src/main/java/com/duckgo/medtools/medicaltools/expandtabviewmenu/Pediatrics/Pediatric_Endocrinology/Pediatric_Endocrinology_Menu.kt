package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Endocrinology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Tanner_Stage_fm

class Pediatric_Endocrinology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("先天性甲状腺功能减退症的血清甲状腺激素诊断标准") { TODO("Wait for Fragment") } // { Cht_Diagnosis_fm() }
        addMenuItem("药物激发试验（生长激素缺乏症GHD诊断方法）") { TODO("Wait for Fragment") } // { Ghd_Stimulation_Test_fm() }
        addMenuItem("先天性甲低的甲状腺素L-T4替代治疗剂量表") { TODO("Wait for Fragment") } // { Cht_Treatment_fm() }
        addMenuItem("儿童碘缺乏诊断标准（尿碘浓度测定）") { TODO("Wait for Fragment") } // { Iodine_Deficiency_fm() }
        addMenuItem("儿童各年龄血苯丙氨酸理想浓度控制范围") { TODO("Wait for Fragment") } // { Phenylalanine_Levels_fm() }
        addMenuItem("tanner分期（男性性发育）") { Tanner_Stage_fm() }
    }
}
