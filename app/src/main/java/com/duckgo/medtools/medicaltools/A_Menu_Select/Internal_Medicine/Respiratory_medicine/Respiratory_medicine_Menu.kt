package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Respiratory_medicine

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Respiratory_medicine_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("肺癌TNM分期", "氧合指数", "肺活量", "动脉血气分析、肺最大通气量与肺功能的关系", "Borg呼吸困难分级指数",
            "慢性阻塞性肺疾病COPY的综合评估", "PSI分级/PORT评分（成人社区获得性肺炎严重性评分系统）", "用力呼气一秒量", "呼吸指数", "CURB-65评分（社区获得性肺炎严重程度评分）",
            "肺龄", "动-静脉氧气含量差", "BODE指数（慢性阻塞性肺病COPD）", "Wells评分（肺阻塞）", "PERC（肺栓塞排除标准）",
            "CPIS（临床肺部感染评分）", "肺泡-动脉氧压差", "肺总量", "喉梗阻分度", "气道阻力",
            "Geneva预后评分（肺栓塞）", "肺顺应性", "呼吸商", "V/Q比（通气血流比）", "肺内右-左分流率",
            "氧气使用分率", "氧消耗", "氧输送", "最大呼气中段流量", "峰值流量预测值（成人）",
            "修正centor评分（链球菌咽炎）", "通气效率（死腔占潮气量百分比）", "功能余气量（功能残气量）", "Geneva校正分数（肺栓塞）")

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //肺癌TNM分期
            }
            1 -> {
                //氧合指数
            }
            2 -> {
                //肺活量
            }
            3 -> {
                //动脉血气分析、肺最大通气量与肺功能的关系
            }
            4 -> {
                //Borg呼吸困难分级指数
            }
            5 -> {
                //慢性阻塞性肺疾病COPY的综合评估
            }
            6 -> {
                //PSI分级/PORT评分（成人社区获得性肺炎严重性评分系统）
            }
            7 -> {
                //用力呼气一秒量
            }
            8 -> {
                //呼吸指数
            }
            9 -> {
                //CURB-65评分（社区获得性肺炎严重程度评分）
            }
            10 -> {
                //肺龄
            }
            11 -> {
                //动-静脉氧气含量差
            }
            12 -> {
                //BODE指数（慢性阻塞性肺病COPD）
            }
            13 -> {
                //Wells评分（肺阻塞）
            }
            14 -> {
                //PERC（肺栓塞排除标准）
            }
            15 -> {
                //CPIS（临床肺部感染评分）
            }
            16 -> {
                //肺泡-动脉氧压差
            }
            17 -> {
                //肺总量
            }
            18 -> {
                //喉梗阻分度
            }
            19 -> {
                //气道阻力
            }
            20 -> {
                //Geneva预后评分（肺栓塞）
            }
            21 -> {
                //肺顺应性
            }
            22 -> {
                //呼吸商
            }
            23 -> {
                //V/Q比（通气血流比）
            }
            24 -> {
                //肺内右-左分流率
            }
            25 -> {
                //氧气使用分率
            }
            26 -> {
                //氧消耗
            }
            27 -> {
                //氧输送
            }
            28 -> {
                //最大呼气中段流量
            }
            29 -> {
                //峰值流量预测值（成人）
            }
            30 -> {
                //修正centor评分（链球菌咽炎）
            }
            31 -> {
                //通气效率（死腔占潮气量百分比）
            }
            32 -> {
                //功能余气量（功能残气量）
            }
            33 -> {
                //Geneva校正分数（肺栓塞）
            }
        }
    }
}