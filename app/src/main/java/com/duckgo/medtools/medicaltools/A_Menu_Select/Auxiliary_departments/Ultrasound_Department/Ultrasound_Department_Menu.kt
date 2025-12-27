package com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Ultrasound_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Ultrasound_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("心输出量（超声）")
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // 心输出量（超声）
            }
        }
    }
}