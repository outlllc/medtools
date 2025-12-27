package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Burn_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Burn_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "新九分法（烧伤面积估计）", "Brooke公式（烧伤补液）", "烧伤补液公式（第三军医大学）",
            "Parkland公式（烧伤补液）", "烧伤严重程度分类", "三度四分法（烧伤深度分级）",
            "烧伤热量供应公式（第三军医大学）"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // TODO: Implement navigation to specific fragments
        }
    }
}