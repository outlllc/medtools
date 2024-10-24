package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Emergency_Department

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Emergency_Department_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("儿童补液", "临床常用液体成分及张力", "各种损失液每100ml所需补水和电解质液量", "外科病儿脱水补液量和补液张力", "小儿肠外营养TPN推荐用量表",
            "气管插管尺寸（儿童）", "喉梗阻分度", "各类型颅内出血鉴别诊断", "儿童铅中毒诊断标准（血铅水平测定）"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //儿童补液
            }
            1 -> {
                //临床常用液体成分及张力
            }
            2 -> {
                //各种损失液每100ml所需补水和电解质液量
            }
            3 -> {
                //外科病儿脱水补液量和补液张力
            }
            4 -> {
                //小儿肠外营养TPN推荐用量表
            }
            5 -> {
                //气管插管尺寸（儿童）
            }
            6 -> {
                //喉梗阻分度
            }
            7 -> {
                //各类型颅内出血鉴别诊断
            }
            8 -> {
                //儿童铅中毒诊断标准（血铅水平测定）
            }
        }
    }
}