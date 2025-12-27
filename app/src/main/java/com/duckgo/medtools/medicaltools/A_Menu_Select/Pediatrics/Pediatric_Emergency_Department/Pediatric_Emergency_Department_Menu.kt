package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Emergency_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Emergency_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "儿童补液", "临床常用液体成分及张力", "各种损失液每100ml所需补水 and 电解质液量",
            "外科病儿脱水补液量和补液张力", "小儿肠外营养TPN推荐用量表",
            "气管插管尺寸（儿童）", "喉梗阻分度", "各类型颅内出血鉴别诊断", "儿童铅中毒诊断标准（血铅水平测定）"
        )
    }

    override fun onItemClick(position: Int) {
        // 跳转详情逻辑待实现
    }
}