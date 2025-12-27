package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Cardiovascular_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("婴儿心衰分级评分表", "动脉导管未闭评分标准", "儿童心衰指数评分（纽约大学）")
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // 婴儿心衰分级评分表
            }
            1 -> {
                // 动脉导管未闭评分标准
            }
            2 -> {
                // 儿童心衰指数评分（纽约大学）
            }
        }
    }
}
