package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Immunology_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Immunology_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("KD的诊断标准（川崎病）", "风湿热Jones诊断标准")
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // KD的诊断标准（川崎病）
            }
            1 -> {
                // 风湿热Jones诊断标准
            }
        }
    }
}
