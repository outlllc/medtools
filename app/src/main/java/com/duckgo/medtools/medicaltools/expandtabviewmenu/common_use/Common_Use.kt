package com.duckgo.medtools.medicaltools.expandtabviewmenu.common_use

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.comprehensive.*

class Common_Use : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("体表面积") { BodySurfaceArea_fm() }
        addMenuItem("体重指数") { Body_Index_fm() }
        addMenuItem("标准体重") { standard_weight_fm() }
        addMenuItem("常用单位换算") { Unit_Conversion_fm() }
        addMenuItem("低钠血症时补氯化钠值") { TODO("Wait for Fragment") } // { Sodium_Chloride_Correction_fm() }
        addMenuItem("补水量") { TODO("Wait for Fragment") } // { Water_Deficit_fm() }
        addMenuItem("卡铂计量") { TODO("Wait for Fragment") } // { Carboplatin_Dosage_fm() }
        addMenuItem("体表面积简易公式") { TODO("Wait for Fragment") } // { Bsa_Simple_fm() }
        addMenuItem("低钠血症时补钠值") { TODO("Wait for Fragment") } // { Sodium_Deficit_fm() }
        addMenuItem("标准体重简易公式") { TODO("Wait for Fragment") } // { Ibw_Simple_fm() }
        addMenuItem("输液计算器") { TODO("Wait for Fragment") } // { Infusion_Calculator_fm() }
        addMenuItem("血浆渗透压") { TODO("Wait for Fragment") } // { Plasma_Osmolality_fm() }
        addMenuItem("低钠血症时补生理盐水") { TODO("Wait for Fragment") } // { Saline_Correction_fm() }
        addMenuItem("低白蛋白血症钙浓度校正") { TODO("Wait for Fragment") } // { Corrected_Calcium_fm() }
        addMenuItem("酸碱平衡紊乱判断") { TODO("Wait for Fragment") } // { Acid_Base_Disorder_fm() }
        addMenuItem("产后出血量估计与休克指数") { Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm() }
        addMenuItem("激素剂量换算") { TODO("Wait for Fragment") } // { Steroid_Conversion_fm() }
        addMenuItem("氧合指数") { TODO("Wait for Fragment") } // { Oxygenation_Index_fm() }
        addMenuItem("病人合作评分") { TODO("Wait for Fragment") } // { Patient_Cooperation_Score_fm() }
        addMenuItem("APACHE II评分(急性生理合慢性健康评分)") { TODO("Wait for Fragment") } // { Apache2_Score_fm() }
        addMenuItem("动脉血气分析、肺最大通气量与肺功能关系") { TODO("Wait for Fragment") } // { Blood_Gas_Lung_fm() }
        addMenuItem("Harris-Benedict公式(基础能耗公式)") { TODO("Wait for Fragment") } // { Harris_Benedict_fm() }
        addMenuItem("不同给氧方法的氧流量和FiO2的关系") { TODO("Wait for Fragment") } // { Oxygen_Flow_FiO2_fm() }
        addMenuItem("贫血的分类") { TODO("Wait for Fragment") } // { Anemia_Classification_fm() }
        addMenuItem("去脂体重") { TODO("Wait for Fragment") } // { Lean_Body_Mass_fm() }
        addMenuItem("动脉血氧分压预测值") { TODO("Wait for Fragment") } // { PaO2_Predicted_fm() }
        addMenuItem("高血糖的钠浓度校正") { TODO("Wait for Fragment") } // { Sodium_Correction_Glucose_fm() }
        addMenuItem("血浆容量") { TODO("Wait for Fragment") } // { Plasma_Volume_fm() }
        addMenuItem("Brunnstrom分期(肌力评定)") { TODO("Wait for Fragment") } // { Brunnstrom_Staging_fm() }
        addMenuItem("不同给氧方式与氧气浓度的关系") { TODO("Wait for Fragment") } // { Oxygen_Concentration_fm() }
        addMenuItem("Shizgal-Rosa公式(基础能耗公式)") { TODO("Wait for Fragment") } // { Shizgal_Rosa_fm() }
        addMenuItem("阴离子间隙") { TODO("Wait for Fragment") } // { Anion_Gap_fm() }
        addMenuItem("肺龄") { TODO("Wait for Fragment") } // { Lung_Age_fm() }
        addMenuItem("HAD(医院焦虑抑郁情绪测量表)") { TODO("Wait for Fragment") } // { HAD_Score_fm() }
        addMenuItem("MRC肌力分级") { TODO("Wait for Fragment") } // { MRC_Strength_fm() }
        addMenuItem("SF-36健康调查简表") { TODO("Wait for Fragment") } // { SF36_fm() }
        addMenuItem("跨管钾梯度") { TODO("Wait for Fragment") } // { TTKG_fm() }
        addMenuItem("校正阴离子间隙") { TODO("Wait for Fragment") } // { Corrected_Anion_Gap_fm() }
        addMenuItem("Barthel指数评定") { TODO("Wait for Fragment") } // { Barthel_Index_fm() }
        addMenuItem("校正网织红细胞计数") { TODO("Wait for Fragment") } // { Corrected_Reticulocyte_fm() }
        addMenuItem("尿阴离子间隙") { TODO("Wait for Fragment") } // { Urinary_Anion_Gap_fm() }
        addMenuItem("高脂血症的钠浓度校正") { TODO("Wait for Fragment") } // { Sodium_Correction_Lipid_fm() }
        addMenuItem("FIM评定量表(功能独立性评定量表)") { TODO("Wait for Fragment") } // { FIM_Scale_fm() }
    }
}
