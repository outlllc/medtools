package com.duckgo.medtools.medicaltools.expandtabviewmenu.Other.Department_of_Nutrition

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Department_of_Nutrition_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("Harris-Benedict公式（基础能耗公式）") { TODO("Wait for Fragment") } // { Harris_Benedict_fm() }
        addMenuItem("蛋白质摄入量") { TODO("Wait for Fragment") } // { Protein_Intake_fm() }
        addMenuItem("婴儿添加辅食的步骤和方法") { TODO("Wait for Fragment") } // { Infant_Complementary_Food_fm() }
        addMenuItem("新生儿肠外营养TPN推荐用量表") { TODO("Wait for Fragment") } // { Neonatal_Tpn_fm() }
        addMenuItem("Shizgal-Rosa公式（基础能耗公式）") { TODO("Wait for Fragment") } // { Shizgal_Rosa_fm() }
        addMenuItem("小儿肠外营养TPN推荐用量表") { TODO("Wait for Fragment") } // { Pediatric_Tpn_fm() }
        addMenuItem("婴儿营养素的需要") { TODO("Wait for Fragment") } // { Infant_Nutrients_fm() }
        addMenuItem("相对剂量反应试验（维生素A缺乏）") { TODO("Wait for Fragment") } // { Vitamin_A_Test_fm() }
    }
}
