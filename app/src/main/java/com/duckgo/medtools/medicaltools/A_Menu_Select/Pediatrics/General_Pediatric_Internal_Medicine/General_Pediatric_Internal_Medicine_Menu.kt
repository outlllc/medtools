package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.General_Pediatric_Internal_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class General_Pediatric_Internal_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "儿童体表面积", "小儿常用补液量计算", "小儿气管插管型号及深度", "小儿基础代谢能耗(HB公式)",
            "小儿脱水程度及补液方案", "儿童哮喘病情严重程度评估", "小儿血压参考值", "小儿心率参考值"
        )
    }

    override fun onItemClick(position: Int) {
        // 跳转详情逻辑待添加
    }
}