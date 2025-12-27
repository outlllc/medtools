package com.duckgo.medtools.medicaltools.A_Menu_Select.Otolaryngology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Otolaryngology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "咽部肿瘤TNM分期", "甲状腺肿瘤TNM分期", "喉部肿瘤TNM分期", "甲状腺肿分级", 
            "鼻腔与鼻窦肿瘤TNM分期", "吞咽功能障碍饮水试验", "吞咽障碍的饮食分级", "神经性耳聋与传导性耳聋的鉴别"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 实现具体的跳转逻辑
        }
    }
}