package com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Department_of_Nutrition

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Department_of_Nutrition_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("Harris-Benedict公式（基础能耗公式）", "蛋白质摄入量", "婴儿添加辅食的步骤和方法", "新生儿肠外营养TPN推荐用量表", "Shizgal-Rosa公式（基础能耗公式）",
            "小儿肠外营养TPN推荐用量表", "婴儿营养素的需要", "相对剂量反应试验（维生素A缺乏）"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // Harris-Benedict公式（基础能耗公式）
            }
            1 -> {
                // 蛋白质摄入量
            }
            2 -> {
                // 婴儿添加辅食的步骤和方法
            }
            3 -> {
                // 新生儿肠外营养TPN推荐用量表
            }
            4 -> {
                // Shizgal-Rosa公式（基础能耗公式）
            }
            5 -> {
                // 小儿肠外营养TPN推荐用量表
            }
            6 -> {
                // 婴儿营养素的需要
            }
            7 -> {
                // 相对剂量反应试验（维生素A缺乏）
            }
        }
    }
}