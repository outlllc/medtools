package com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Obstetrics_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("BISHOP评分", "胎儿发育指数", "不同妊娠周数的宫底高度及子宫长度", "孕期用药对胎儿的影响", "胎儿成熟度监测",
            "正常恶露性状", "妊娠期高血压分类", "妊娠期高血糖诊断标准（GDM）", "重度子痫前期诊断", "妊娠高血压终止妊娠的指征",
            "胎儿生物物理监测Manning评分", "简易胎龄评估表", "妊娠期糖尿病分级分期", "妊娠期甲状腺功能实验室检查",
            "Rh 和 ABO 溶血病的比较",  "妊娠期甲亢程度和用药剂量间的关系",
            "EPDS（爱丁堡产后抑郁量表）", "产褥期抑郁症诊断标准")

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //BISHOP评分
            }
            1 -> {
                //胎儿发育指数
            }
            2 -> {
                //不同妊娠周数的宫底高度及子宫长度
            }
            3 -> {
                //孕期用药对胎儿的影响
            }
            4 -> {
                //胎儿成熟度监测
            }
            5 -> {
                //正常恶露性状
            }
            6 -> {
                //妊娠期高血压分类
            }
            7 -> {
                //妊娠期高血糖诊断标准（GDM）
            }
            8 -> {
                //重度子痫前期诊断
            }
            9 -> {
                //妊娠高血压终止妊娠的指征
            }
            10 -> {
                //胎儿生物物理监测Manning评分
            }
            11 -> {
                //简易胎龄评估表
            }
            12 -> {
                //妊娠期糖尿病分级分期
            }
            13 -> {
                //妊娠期甲状腺功能实验室检查
            }
            14 -> {
                //Rh 和 ABO 溶血病的比较
            }
            15 -> {
                //妊娠期甲亢程度和用药剂量间的关系
            }
            16 -> {
                //EPDS（爱丁堡产后抑郁量表）
            }
            17 -> {
                //产褥期抑郁症诊断标准
            }
        }
    }
}