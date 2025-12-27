package com.duckgo.medtools.medicaltools.A_Menu_Select.Dermatology_and_Venereology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Dermatology_and_Venereology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "原发性皮肤淋巴瘤TNM分期",
            "皮肤鳞状细胞癌及其它皮肤肿瘤TNM分期",
            "皮肤黑色素瘤TNM分期",
            "Merkel细胞瘤TNM分期"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // 原发性皮肤淋巴瘤TNM分期
            }
            1 -> {
                // 皮肤鳞状细胞癌及其它皮肤肿瘤TNM分期
            }
            2 -> {
                // 皮肤黑色素瘤TNM分期
            }
            3 -> {
                // Merkel细胞瘤TNM分期
            }
        }
    }
}