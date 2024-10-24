package com.duckgo.medtools.medicaltools.A_Menu_Select.Department_of_Psychiatry

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Department_of_Psychiatry_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("MMSE（简易智能精神状态检查量表）", "HAMD（汉密尔顿抑郁量表）", "HAD（医院焦虑抑郁情绪测量表）", "汉密尔顿焦虑量表", "SAPS（阳性症状量表）",
            "BPRS（简明精神病量表）", "EPDS（爱丁堡产后抑郁量表）", "克莱顿皇家医院行为量表", "Rancho Los Amigos认知功能分级表", "经前期焦虑障碍PMDD诊断标准",
            "SANS（阴性症状量表）", "产褥期抑郁症诊断标准"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //MMSE（简易智能精神状态检查量表）
            }
            1 -> {
                //HAMD（汉密尔顿抑郁量表）
            }
            2 -> {
                //HAD（医院焦虑抑郁情绪测量表）
            }
            3 -> {
                //汉密尔顿焦虑量表
            }
            4 -> {
                //SAPS（阳性症状量表）
            }
            5 -> {
                //BPRS（简明精神病量表）
            }
            6 -> {
                //EPDS（爱丁堡产后抑郁量表）
            }
            7 -> {
                //克莱顿皇家医院行为量表
            }
            8 -> {
                //Rancho Los Amigos认知功能分级表
            }
            9 -> {
                //经前期焦虑障碍PMDD诊断标准
            }
            10 -> {
                //SANS（阴性症状量表）
            }
            11 -> {
                //产褥期抑郁症诊断标准
            }
        }
    }
}