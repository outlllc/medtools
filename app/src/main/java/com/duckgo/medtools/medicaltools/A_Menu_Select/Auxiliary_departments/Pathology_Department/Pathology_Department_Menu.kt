package com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Pathology_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pathology_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）",
            "输卵管癌手术病理分期"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // 卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）
            }
            1 -> {
                // 输卵管癌手术病理分期
            }
        }
    }
}