package com.duckgo.medtools.medicaltools.A_Menu_Select.Department_of_Critical_Care_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Department_of_Critical_Care_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "产后出血量估计与休克指数", "临床常用呼吸机参数设置", "APACHEII评分系统（急性生理和慢性健康评分）", "MODS评分", "呼吸机撤离呼吸参数标准",
            "不同给氧方法的氧流量和FiO2的关系", "SIRS标准（全身炎症反应综合征）", "机械通气适应症", "常用冬眠合剂及其特点", "SOFA脓毒症评分（序贯性器官功能衰竭评分）",
            "创伤失血量的判定", "外科ICU（SICU）术前、术后病人高危标准", "不同给氧方式与气浓度的关系", "不同肺顺应性状态下呼吸机各种参数的初调值", "SAPS II（简化的急性生理功能评分系统）",
            "气管插管尺寸（儿童）", "昏迷、植物状态、最低意识状态和闭锁综合征的临床特征比较", "Wells评分（下肢深静脉血栓形成DVT诊断评分）", "RASS（Richmond躁动-镇静评分）", "Ramsay镇静程度评分",
            "气管插管时肌松程度分级"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //产后出血量估计与休克指数
            }
            1 -> {
                //临床常用呼吸机参数设置
            }
            2 -> {
                //APACHEII评分系统（急性生理和慢性健康评分）
            }
            3 -> {
                //MODS评分
            }
            4 -> {
                //呼吸机撤离呼吸参数标准
            }
            5 -> {
                //不同给氧方法的氧流量和FiO2的关系
            }
            6 -> {
                //SIRS标准（全身炎症反应综合征）
            }
            7 -> {
                //机械通气适应症
            }
            8 -> {
                //常用冬眠合剂及其特点
            }
            9 -> {
                //SOFA脓毒症评分（序贯性器官功能衰竭评分）
            }
            10 -> {
                //创伤失血量的判定
            }
            11 -> {
                //外科ICU（SICU）术前、术后病人高危标准
            }
            12 -> {
                //不同给氧方式与气浓度的关系
            }
            13 -> {
                //不同肺顺应性状态下呼吸机各种参数的初调值
            }
            14 -> {
                //SAPS II（简化的急性生理功能评分系统）
            }
            15 -> {
                //气管插管尺寸（儿童）
            }
            16 -> {
                //昏迷、植物状态、最低意识状态和闭锁综合征的临床特征比较
            }
            17 -> {
                //Wells评分（下肢深静脉血栓形成DVT诊断评分）
            }
            18 -> {
                //RASS（Richmond躁动-镇静评分）
            }
            19 -> {
                //Ramsay镇静程度评分
            }
            20 -> {
                //气管插管时肌松程度分级
            }
        }
    }
}
