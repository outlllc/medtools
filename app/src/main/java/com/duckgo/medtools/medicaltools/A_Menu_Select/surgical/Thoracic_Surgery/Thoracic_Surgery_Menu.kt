package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Thoracic_Surgery

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Thoracic_Surgery_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("Butchart分期（弥漫型恶性胸膜间皮瘤）", "胸膜间皮瘤TNM分期", "Crawford分型（胸腹主动脉瘤）", "漏斗胸指数"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //Butchart分期（弥漫型恶性胸膜间皮瘤）
            }
            1 -> {
                //胸膜间皮瘤TNM分期
            }
            2 -> {
                //Crawford分型（胸腹主动脉瘤）
            }
            3 -> {
                //漏斗胸指数
            }
        }
    }
}