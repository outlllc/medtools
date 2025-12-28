package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.General_Internal_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.comprehensive.BodySurfaceArea_fm
import com.duckgo.medtools.medicaltools.functions.comprehensive.Body_Index_fm
import com.duckgo.medtools.medicaltools.functions.comprehensive.standard_weight_fm

class General_Internal_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("体表面积") { BodySurfaceArea_fm() }
        addMenuItem("体重指数") { Body_Index_fm() }
        addMenuItem("标准体重") { standard_weight_fm() }
        addMenuItem("体表面积简易公式") { TODO("Wait for Fragment") } // { BodySurfaceArea_Simple_fm() }
        addMenuItem("标准体重简易公式") { TODO("Wait for Fragment") } // { StandardWeight_Simple_fm() }
        addMenuItem("输液计算器") { TODO("Wait for Fragment") } // { Infusion_Calculator_fm() }
        addMenuItem("Harris-Benedict公式（基础能耗公式）") { TODO("Wait for Fragment") } // { Harris_Benedict_fm() }
        addMenuItem("去脂体重") { TODO("Wait for Fragment") } // { Lean_Body_Mass_fm() }
        addMenuItem("腹部肿块的部位和常见疾病") { TODO("Wait for Fragment") } // { Abdominal_Mass_fm() }
        addMenuItem("Shingle-Rosa公式（基础能耗公式）") { TODO("Wait for Fragment") } // { Shizgal_Rosa_fm() }
        addMenuItem("骨骼肌肌力检查办法") { TODO("Wait for Fragment") } // { Muscle_Strength_Test_fm() }
    }
}
