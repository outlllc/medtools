package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Vascular_Surgery

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Vascular_Surgery_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("Wells评分（下肢深静脉血栓形成DVT诊断评分", "急性下肢缺血分级", "DeBakey分型（主动脉夹层）", "Stanford分型（主动脉夹层）", "TASC分级（慢性下肢缺血-股腘动脉病变）",
            "TASC分级（慢性下肢缺血-主髂动脉病变）", "Fontaine/Rutherford分级（慢性下肢缺血）", "TASC分级（慢性下肢缺血-腘动脉以下病变）"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // Wells评分（下肢深静脉血栓形成DVT诊断评分
            }
            1 -> {
                // 急性下肢缺血分级
            }
            2 -> {
                // DeBakey分型（主动脉夹层）
            }
            3 -> {
                // Stanford分型（主动脉夹层）
            }
            4 -> {
                // TASC分级（慢性下肢缺血-股腘动脉病变）
            }
            5 -> {
                // TASC分级（慢性下肢缺血-主髂动脉病变）
            }
            6 -> {
                // Fontaine/Rutherford分级（慢性下肢缺血）
            }
            7 -> {
                // TASC分级（慢性下肢缺血-腘动脉以下病变）
            }
        }
    }
}