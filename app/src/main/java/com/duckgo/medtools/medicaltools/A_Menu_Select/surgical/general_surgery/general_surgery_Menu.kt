package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.general_surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class general_surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "输液计算器", "常用冬眠合计及其特点", "外科ICU（SICU）术前、术后病人高危标准", "腹部肿块的部位和常见疾病", "手术中失血量估计方法（红细胞压积法）",
            "腹腔器官肿瘤标志物分类", "改良Goldman评分（非心脏手术术前心脏风险指数）", "胃肠道间质瘤TNM分期", "改良Lee‘s评分（非心脏手术术前心脏风险指数）", "GIST切除术后风险分级（胃肠道间质瘤）"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // Implement navigation logic here
        }
    }
}