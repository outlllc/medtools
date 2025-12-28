package com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Health_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Tanner_Stage_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm

class Pediatric_Health_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("小儿体重身长计算") { TODO("Wait for Fragment") } // { Pediatric_Weight_Height_fm() }
        addMenuItem("我国0-18岁儿童身高、体重的百分位数标准值") { TODO("Wait for Fragment") } // { Children_Growth_Standards_fm() }
        addMenuItem("儿童添加辅食的步骤和方法") { TODO("Wait for Fragment") } // { Child_Complementary_Food_fm() }
        addMenuItem("小儿出牙顺序") { TODO("Wait for Fragment") } // { Pediatric_Teething_fm() }
        addMenuItem("小儿体表面积公式") { TODO("Wait for Fragment") } // { Pediatric_BSA_Formula_fm() }
        addMenuItem("婴儿营养素的需要") { TODO("Wait for Fragment") } // { Infant_Nutrients_fm() }
        addMenuItem("小儿各年龄平均血压") { TODO("Wait for Fragment") } // { Pediatric_BP_fm() }
        addMenuItem("儿童口服铁制剂的规格及剂量表") { TODO("Wait for Fragment") } // { Pediatric_Iron_Dosage_fm() }
        addMenuItem("小儿各年龄动作及行为评分") { TODO("Wait for Fragment") } // { Pediatric_Development_Score_fm() }
        addMenuItem("小儿药物计算公式3（按体重计算）") { TODO("Wait for Fragment") } // { Pediatric_Drug_Weight_fm() }
        addMenuItem("小儿基础代谢率") { TODO("Wait for Fragment") } // { Pediatric_BMR_fm() }
        addMenuItem("小儿各年龄心率平均值及范围") { TODO("Wait for Fragment") } // { Pediatric_Heart_Rate_fm() }
        addMenuItem("小儿囟门和颅缝闭合时间") { TODO("Wait for Fragment") } // { Pediatric_Fontanelle_fm() }
        addMenuItem("小儿药物计算公式1（按体表面积计算）") { TODO("Wait for Fragment") } // { Pediatric_Drug_BSA_fm() }
        addMenuItem("tanner分期（性发育）") { Tanner_Stage_fm() }
        addMenuItem("小儿各年龄呼吸频率平均值") { TODO("Wait for Fragment") } // { Pediatric_Respiration_fm() }
        addMenuItem("小儿药物计算公式2（按年龄计算[董氏公式]）") { TODO("Wait for Fragment") } // { Pediatric_Drug_Age_fm() }
        addMenuItem("儿童每日不显性失水量") { TODO("Wait for Fragment") } // { Child_Insensible_Water_Loss_fm() }
        addMenuItem("小儿身体各部位比例") { TODO("Wait for Fragment") } // { Pediatric_Body_Proportion_fm() }
        addMenuItem("Conner's简明症状问卷") { TODO("Wait for Fragment") } // { Conners_Questionnaire_fm() }
        addMenuItem("性早熟疾病的辅助检查结果") { Precocious_Puberty_Auxiliary_Examination_fm() }
        addMenuItem("尿羟脯氨酸指数（蛋白质-能量营养不良）") { TODO("Wait for Fragment") } // { Hydroxyproline_Index_fm() }
        addMenuItem("餐后血清锌浓度反应试验（锌缺乏）") { TODO("Wait for Fragment") } // { Zinc_Deficiency_Test_fm() }
        addMenuItem("相对剂量反应试验（维生素A缺乏）") { TODO("Wait for Fragment") } // { Vitamin_A_Test_fm() }
        addMenuItem("儿童各年龄血苯丙氨酸理想浓度控制范围") { TODO("Wait for Fragment") } // { Phenylalanine_Levels_fm() }
        addMenuItem("tanner分期（男性性发育）") { Tanner_Stage_fm() }
    }
}
