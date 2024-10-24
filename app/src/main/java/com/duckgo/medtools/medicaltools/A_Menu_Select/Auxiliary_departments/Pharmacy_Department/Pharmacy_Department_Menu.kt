package com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Pharmacy_Department

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pharmacy_Department_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("HAS-BLED评分（口服抗凝出血风险评估）", "紧急避孕药物剂量与方案", "OBRI（华法林出血风险评估-门诊病人出血风险指数）", "托吡酯加量方法（日剂量）")

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //HAS-BLED评分（口服抗凝出血风险评估）
            }
            1 -> {
                //紧急避孕药物剂量与方案
            }
            2 -> {
                //OBRI（华法林出血风险评估-门诊病人出血风险指数）
            }
            3 -> {
                //托吡酯加量方法（日剂量）
            }
        }
    }
}