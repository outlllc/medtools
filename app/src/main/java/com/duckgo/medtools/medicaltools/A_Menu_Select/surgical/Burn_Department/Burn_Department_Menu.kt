package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Burn_Department

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Burn_Department_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("新九分法（烧伤面积估计）", "Brooke公式（烧伤补液）", "烧伤补液公式（第三军医大学）", "Parkland公式（烧伤补液）", "烧伤严重程度分类",
            "三度四分法（烧伤深度分级）", "烧伤热量供应公式（第三军医大学）"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //新九分法（烧伤面积估计）
            }
            1 -> {
                //Brooke公式（烧伤补液）
            }
            2 -> {
                //烧伤补液公式（第三军医大学）
            }
            3 -> {
                //Parkland公式（烧伤补液）
            }
            4 -> {
                //烧伤严重程度分类
            }
            5 -> {
                //三度四分法（烧伤深度分级）
            }
            6 -> {
                //烧伤热量供应公式（第三军医大学）
            }
        }
    }
}