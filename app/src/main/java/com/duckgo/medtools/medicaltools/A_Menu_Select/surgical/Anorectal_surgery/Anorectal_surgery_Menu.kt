package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Anorectal_surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Anorectal_surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "结直肠癌TNM分期", "结直肠息肉分类", "小肠肿瘤TNM分期", "Dukes分期（大肠癌）", "胃肠道间质瘤TNM分期",
            "Broders分级（结直肠癌组织学）", "GIST切除术后风险分级（胃肠道间质瘤）", "肛管癌TNM分期"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 实现具体跳转逻辑
        }
    }
}