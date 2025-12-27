package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Neonatology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Neonatology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "不同时龄足月新生儿黄疸干预标准", "apgar评分", "新生儿黄疸干预指征", "胆红素/白蛋白比值", "早产儿体重增长速度",
            "不同胎龄出生体重早产儿黄疸干预标准（总胆红素）", "新生儿肠外营养TPN推荐用量表", "新生儿窒息复苏常用药物表", "新生儿休克评分表", "新生儿热能的需要量",
            "不同日龄及不同出生体重儿的最适温度", "气管插管型号的选择", "简易胎龄评估表", "动脉导管未闭评分标准", "Rh和ABO溶血病的比较",
            "新生儿常见疾病机械通气初调参数", "新生儿电解质、矿物质、微量元素及维生素需要量", "各胎龄新生儿神经、肌肉、成熟度", "FLACC评分（婴儿和儿童疼痛行为评估量表）", "各类型颅内出血鉴别诊断",
            "DOWNE评分法（新生儿呼吸评分）", "新生儿硬肿症评分标准", "HIE诊断标准和临床分度（新生儿缺血缺氧脑病）", "先天性甲状腺功能减退的血清甲状腺激素诊断标准", "先天性甲低的甲状腺素L-T4替代治疗剂量表",
            "新生儿成熟度评估表（新Ballard评分法）"
        )
    }

    override fun onItemClick(position: Int) {
        // 跳转详情逻辑待实现
    }
}