package com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Interventional_Department

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Interventional_Department_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("Mayo系统（PCI并发症风险评分）")
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // TODO: 实现 Mayo系统（PCI并发症风险评分）的跳转
                // val fragment = Mayo_PCI_Risk_fm()
                // inflateFragment(fragment)
            }
        }
    }
}