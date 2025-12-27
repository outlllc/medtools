package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Vascular_Surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Vascular_Surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "Wells评分（下肢深静脉血栓形成DVT诊断评分", "急性下肢缺血分级", "DeBakey分型（主动脉夹层）", "Stanford分型（主动脉夹层）",
            "TASC分级（慢性下肢缺血-股腘动脉病变）", "TASC分级（慢性下肢缺血-主髂动脉病变）", "Fontaine/Rutherford分级（慢性下肢缺血）",
            "TASC分级（慢性下肢缺血-腘动脉以下病变）"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 实现具体跳转逻辑
        }
    }
}