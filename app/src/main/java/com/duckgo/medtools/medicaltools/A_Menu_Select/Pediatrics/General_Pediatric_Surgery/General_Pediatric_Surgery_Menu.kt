package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.General_Pediatric_Surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class General_Pediatric_Surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "儿童补液", "PELD评分（儿童终末期肝病）", "临床常用液体成分及张力",
            "各种损失液每100ml所需补水和电解质液量", "外科病儿脱水补液量和补液张力",
            "小儿肠外营养TPN推荐用量表", "儿童每日不显性失水量"
        )
    }

    override fun onItemClick(position: Int) {
        // 跳转详情逻辑待实现
    }
}