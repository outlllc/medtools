package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Endocrinology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Endocrinology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "糖尿病肾病临床分期", "糖化血红蛋白评估平均血糖", "糖尿病诊断标准", "甲状腺肿瘤TNM分期", "甲状腺肿分级",
            "代谢综合征诊断标准（国际糖尿病联盟）", "Wagner分级法（糖尿病足）", "高血糖的钠浓度校正", "代谢综合征诊断标准（中华医学会）", "Graves眼病分级标准",
            "糖尿病视网膜病变国际临床分类法", "CAS（Graves眼病病情活动评分）", "药物激发试验（生长激素缺乏症GHD诊断方法）", "性早熟疾病的辅助检查结果", "tanner分期（男性性发育）"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // TODO: 根据需要实现具体详情页跳转
        }
    }
}
