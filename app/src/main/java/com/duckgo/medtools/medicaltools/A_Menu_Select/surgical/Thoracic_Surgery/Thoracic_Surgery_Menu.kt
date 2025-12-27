package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Thoracic_Surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Thoracic_Surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "Butchart分期（弥漫型恶性胸膜间皮瘤）",
            "胸膜间皮瘤TNM分期",
            "Crawford分型（胸腹主动脉瘤）",
            "漏斗胸指数"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 实现具体跳转逻辑
        }
    }
}