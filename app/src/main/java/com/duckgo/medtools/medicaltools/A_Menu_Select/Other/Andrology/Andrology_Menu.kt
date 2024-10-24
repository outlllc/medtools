package com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Andrology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Andrology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("IIEF-5（国际勃起功能评分5项）", "人类精液变量参考值", "前列腺癌TNM分期", "I-PSS（国际前列腺症状评分表）", "阴茎癌TNM分期"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //IIEF-5（国际勃起功能评分5项）
            }
            1 -> {
                //人类精液变量参考值
            }
            2 -> {
                //前列腺癌TNM分期
            }
            3 -> {
                //I-PSS（国际前列腺症状评分表）
            }
            4 -> {
                //阴茎癌TNM分期
            }
        }
    }
}