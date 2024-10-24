package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Endocrinology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Endocrinology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("糖尿病肾病临床分期", "糖化血红蛋白评估平均血糖", "糖尿病诊断标准", "甲状腺肿瘤TNM分期", "甲状腺肿分级",
            "代谢综合征诊断标准（国际糖尿病联盟）", "Wagner分级法（糖尿病足）", "高血糖的钠浓度校正", "代谢综合征诊断标准（中华医学会）", "Graves眼病分级标准",
            "糖尿病视网膜病变国际临床分类法", "CAS（Graves眼病病情活动评分）", "药物激发试验（生长激素缺乏症GHD诊断方法）", "性早熟疾病的辅助检查结果", "tanner分期（男性性发育）",
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //糖尿病肾病临床分期
            }
            1 -> {
                //糖化血红蛋白评估平均血糖
            }
            2 -> {
                //糖尿病诊断标准
            }
            3 -> {
                //甲状腺肿瘤TNM分期
            }
            4 -> {
                //甲状腺肿分级
            }
            5 -> {
                //代谢综合征诊断标准（国际糖尿病联盟）
            }
            6 -> {
                //Wagner分级法（糖尿病足）
            }
            7 -> {
                //高血糖的钠浓度校正
            }
            8 -> {
                //代谢综合征诊断标准（中华医学会）
            }
            9 -> {
                //Graves眼病分级标准
            }
            10 -> {
                //糖尿病视网膜病变国际临床分类法
            }
            11 -> {
                //CAS（Graves眼病病情活动评分）
            }
            12 -> {
                //药物激发试验（生长激素缺乏症GHD诊断方法）
            }
            13 -> {
                //性早熟疾病的辅助检查结果
            }
            14 -> {
                //tanner分期（男性性发育）
            }
        }
    }
}