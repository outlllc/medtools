package com.duckgo.medtools.medicaltools.A_Menu_Select.common_use

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.comprehensive.*

class Common_Use : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "体表面积", "体重指数", "标准体重", "常用单位换算", "低钠血症时补氯化钠值",
            "补水量", "卡铂计量", "体表面积简易公式", "低钠血症时补钠值", "标准体重简易公式",
            "输液计算器", "血浆渗透压", "低钠血症时补生理盐水", "低白蛋白血症钙浓度校正", "酸碱平衡紊乱判断",
            "产后出血量估计与休克指数", "激素剂量换算", "氧合指数", "病人合作评分", "APACHE II评分(急性生理合慢性健康评分)",
            "动脉血气分析、肺最大通气量与肺功能关系", "Harris-Benedict公式(基础能耗公式)", "不同给氧方法的氧流量和FiO2的关系", "贫血的分类", "去脂体重",
            "动脉血氧分压预测值", "高血糖的钠浓度校正", "血浆容量", "Brunnstrom分期(肌力评定)", "不同给氧方式与氧气浓度的关系",
            "Shizgal-Rosa公式(基础能耗公式)", "阴离子间隙", "肺龄", "HAD(医院焦虑抑郁情绪测量表)", "MRC肌力分级",
            "SF-36健康调查简表", "跨管钾梯度", "校正阴离子间隙", "Barthel指数评定", "校正网织红细胞计数",
            "尿阴离子间隙", "高脂血症的钠浓度校正", "FIM评定量表(功能独立性评定量表)"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> inflateFragment(BodySurfaceArea_fm())
            1 -> inflateFragment(Body_Index_fm())
            2 -> inflateFragment(standard_weight_fm())
            3 -> inflateFragment(Unit_Conversion_fm())
            15 -> inflateFragment(Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm())
        }
    }
}