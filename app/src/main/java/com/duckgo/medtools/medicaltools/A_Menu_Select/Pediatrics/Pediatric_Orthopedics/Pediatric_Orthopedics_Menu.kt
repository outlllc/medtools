package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Orthopedics

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Orthopedics_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("S-H分类法（小儿骨骺损伤Solen-Harris分类）")
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // S-H分类法（小儿骨骺损伤Solen-Harris分类）
            }
        }
    }
}