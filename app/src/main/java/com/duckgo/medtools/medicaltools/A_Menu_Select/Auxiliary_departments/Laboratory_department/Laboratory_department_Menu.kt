package com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Laboratory_department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Laboratory_department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("Nugent评分标准（阴道分泌物革兰染色）")
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // TODO: 实现 Nugent评分标准 的跳转
                // val fragment = Nugent_Score_fm()
                // inflateFragment(fragment)
            }
        }
    }
}