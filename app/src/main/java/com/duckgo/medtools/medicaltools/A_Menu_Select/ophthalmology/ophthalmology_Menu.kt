package com.duckgo.medtools.medicaltools.A_Menu_Select.ophthalmology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class ophthalmology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "Graves眼病分级标准",
            "糖尿病视网膜病变国际临床分类法",
            "CAS（Graves眼病病情活动评分）"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // Graves眼病分级标准
            }
            1 -> {
                // 糖尿病视网膜病变国际临床分类法
            }
            2 -> {
                // CAS（Graves眼病病情活动评分）
            }
        }
    }
}