package com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Medical_Imaging_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Medical_Imaging_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "BI-RADS（乳腺影像报告和数据系统）",
            "Chiari畸形CT/MRI表现（小脑扁桃体下疝畸形）"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // BI-RADS
            }
            1 -> {
                // Chiari畸形
            }
        }
    }
}