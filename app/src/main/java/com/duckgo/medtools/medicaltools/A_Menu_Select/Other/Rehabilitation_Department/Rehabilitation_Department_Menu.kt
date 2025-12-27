package com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Rehabilitation_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Rehabilitation_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "SF-36健康调查简表", "Barthel指数评定", "FIM评定量表（功能独立性评定量表）", "PVS表（持续性植物状态评分表）"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // SF-36健康调查简表
            }
            1 -> {
                // Barthel指数评定
            }
            2 -> {
                // FIM评定量表（功能独立性评定量表）
            }
            3 -> {
                // PVS表（持续性植物状态评分表）
            }
        }
    }
}