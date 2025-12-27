package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Geriatric_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Geriatric_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("阿尔兹海默病临床诊断标准", "亚洲人骨质疏松自我筛查工具", "骨质疏松症风险一分钟测试题")
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // 阿尔兹海默病临床诊断标准
            }
            1 -> {
                // 亚洲人骨质疏松自我筛查工具
            }
            2 -> {
                // 骨质疏松症风险一分钟测试题
            }
        }
    }
}
