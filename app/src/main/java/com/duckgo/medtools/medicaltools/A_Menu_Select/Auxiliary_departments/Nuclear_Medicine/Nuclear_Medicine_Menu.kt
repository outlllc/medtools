package com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Nuclear_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Nuclear_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "CTSI（急性胰腺炎CT严重程度指数）",
            "Chiari畸形CT/MRI表现（小脑扁桃体下疝畸形）"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // CTSI（急性胰腺炎CT严重程度指数）
            }
            1 -> {
                // Chiari畸形CT/MRI表现（小脑扁桃体下疝畸形）
            }
        }
    }
}