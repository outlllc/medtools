package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Respiratory_medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Respiratory_medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("肺癌TNM分期") { TODO("Wait for Fragment") } // { Lung_Cancer_TNM_fm() }
        addMenuItem("氧合指数") { TODO("Wait for Fragment") } // { Oxygenation_Index_fm() }
        addMenuItem("肺活量") { TODO("Wait for Fragment") } // { Vital_Capacity_fm() }
        addMenuItem("动脉血气分析、肺最大通气量与肺功能的关系") { TODO("Wait for Fragment") } // { Blood_Gas_Lung_Function_fm() }
        addMenuItem("Borg呼吸困难分级指数") { TODO("Wait for Fragment") } // { Borg_Scale_fm() }
        addMenuItem("慢性阻塞性肺疾病COPY的综合评估") { TODO("Wait for Fragment") } // { COPD_Assessment_fm() }
        addMenuItem("PSI分级/PORT评分（成人社区获得性肺炎严重性评分系统）") { TODO("Wait for Fragment") } // { PSI_PORT_Score_fm() }
        addMenuItem("用力呼气一秒量") { TODO("Wait for Fragment") } // { FEV1_fm() }
        addMenuItem("呼吸指数") { TODO("Wait for Fragment") } // { Respiratory_Index_fm() }
        addMenuItem("CURB-65评分（社区获得性肺炎严重程度评分）") { TODO("Wait for Fragment") } // { CURB65_Score_fm() }
        addMenuItem("肺龄") { TODO("Wait for Fragment") } // { Lung_Age_fm() }
        addMenuItem("动-静脉氧气含量差") { TODO("Wait for Fragment") } // { AV_Oxygen_Diff_fm() }
        addMenuItem("BODE指数（慢性阻塞性肺病COPD）") { TODO("Wait for Fragment") } // { BODE_Index_fm() }
        addMenuItem("Wells评分（肺阻塞）") { TODO("Wait for Fragment") } // { Wells_PE_Score_fm() }
        addMenuItem("PERC（肺栓塞排除标准）") { TODO("Wait for Fragment") } // { PERC_Rule_fm() }
        addMenuItem("CPIS（临床肺部感染评分）") { TODO("Wait for Fragment") } // { CPIS_Score_fm() }
        addMenuItem("肺泡-动脉氧压差") { TODO("Wait for Fragment") } // { Aa_Oxygen_Gradient_fm() }
        addMenuItem("肺总量") { TODO("Wait for Fragment") } // { Total_Lung_Capacity_fm() }
        addMenuItem("喉梗阻分度") { TODO("Wait for Fragment") } // { Laryngeal_Obstruction_Grading_fm() }
        addMenuItem("气道阻力") { TODO("Wait for Fragment") } // { Airway_Resistance_fm() }
        addMenuItem("Geneva预后评分（肺栓塞）") { TODO("Wait for Fragment") } // { Geneva_Score_fm() }
        addMenuItem("肺顺应性") { TODO("Wait for Fragment") } // { Lung_Compliance_fm() }
        addMenuItem("呼吸商") { TODO("Wait for Fragment") } // { Respiratory_Quotient_fm() }
        addMenuItem("V/Q比（通气血流比）") { TODO("Wait for Fragment") } // { VQ_Ratio_fm() }
        addMenuItem("肺内右-左分流率") { TODO("Wait for Fragment") } // { Intrapulmonary_Shunt_fm() }
        addMenuItem("氧气使用分率") { TODO("Wait for Fragment") } // { Oxygen_Extraction_Ratio_fm() }
        addMenuItem("氧消耗") { TODO("Wait for Fragment") } // { Oxygen_Consumption_fm() }
        addMenuItem("氧输送") { TODO("Wait for Fragment") } // { Oxygen_Delivery_fm() }
        addMenuItem("最大呼气中段流量") { TODO("Wait for Fragment") } // { MMEF_fm() }
        addMenuItem("峰值流量预测值（成人）") { TODO("Wait for Fragment") } // { PEF_Predict_fm() }
        addMenuItem("修正centor评分（链球菌咽炎）") { TODO("Wait for Fragment") } // { Modified_Centor_Score_fm() }
        addMenuItem("通气效率（死腔占潮气量百分比）") { TODO("Wait for Fragment") } // { VD_VT_Ratio_fm() }
        addMenuItem("功能余气量（功能残气量）") { TODO("Wait for Fragment") } // { FRC_fm() }
        addMenuItem("Geneva校正分数（肺栓塞）") { TODO("Wait for Fragment") } // { Revised_Geneva_Score_fm() }
    }
}
