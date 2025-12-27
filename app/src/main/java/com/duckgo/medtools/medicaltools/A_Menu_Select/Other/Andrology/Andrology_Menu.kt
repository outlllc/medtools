package com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Andrology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Andrology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "IIEF-5（国际勃起功能评分5项）", "人类精液变量参考值", "前列腺癌TNM分期", 
            "I-PSS（国际前列腺症状评分表）", "阴茎癌TNM分期"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 实现具体跳转逻辑
        }
    }
}