package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.General_Pediatric_Surgery

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class General_Pediatric_Surgery_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("儿童补液", "PELD评分（儿童终末期肝病）", "临床常用液体成分及张力", "各种损失液每100ml所需补水和电解质液量", "外科病儿脱水补液量和补液张力",
            "小儿肠外营养TPN推荐用量表", "儿童每日不显性失水量"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //儿童补液
            }
            1 -> {
                //PELD评分（儿童终末期肝病）
            }
            2 -> {
                //临床常用液体成分及张力
            }
            3 -> {
                //各种损失液每100ml所需补水和电解质液量
            }
            4 -> {
                //外科病儿脱水补液量和补液张力
            }
            5 -> {
                //小儿肠外营养TPN推荐用量表
            }
            6 -> {
                //儿童每日不显性失水量
            }
        }
    }
}