package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Urology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Urology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "IIEF-5（国际勃起功能评分5项", "尿石的一般特征", "前列腺癌TNM分期", "肾癌TNM分期", "肾盂和输尿管肿瘤TNM分期",
            "I-PSS（国际前列腺症状评分表）", "膀胱肿瘤TNM分期", "Goldman分类（尿道损伤）", "膀胱癌TNM分期", "尿路钙排泄指数（钙-肌酐比）",
            "睾丸肿瘤TNM分期", "膀胱尿路上皮恶性程度分级系统", "EAU尿道损伤严重程度分级", "不同因素对膀胱癌复发与进展影响的评分", "肾上腺肿瘤TNM分期",
            "尿道肿瘤TNM分期"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 实现具体跳转逻辑
        }
    }
}
