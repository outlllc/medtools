package com.duckgo.medtools.medicaltools.A_Menu_Select.Anesthesia_Department

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Anesthesia_Department_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("改良Goldman评分（非心脏手术术前心脏风险指数）", "ASA手术分级（美国麻醉医师协会健康状况分级）", "VAS评分（疼痛视觉模拟评分系统）", "Wilson苏醒评分法（困难气道的预测）", "蛛网膜下腔常用局麻药剂量及浓度",
            "Steward苏醒评分法", "硬膜外阻滞常用局麻药浓度和剂量", "寒战分级", "椎管内麻醉（硬、腰、骶）效果评级标准", "Ramsay镇静程度评分",
            "常用局麻药理化性质和麻醉效能", "清醒程度分级", "改良Mallampati气道分级", "McGill疼痛简式问卷", "改良Lee's评分（非心脏手术术前心脏风险指数）",
            "全麻效果评级标准", "PRST评分系统（麻醉深度判断）", "麻醉后恢复期评分", "改良马氏评分", "神经阻滞效果评级标准（颈丛、臂丛、下肢神经等）",
            "Prince-Henry评分法", "内脏牵拉反应", "改良Bromage评分（运动阻滞评分）", "POSSUM评分系统", "OAA/S评分法",
            "Tarlov神经功能评分标准"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //改良Goldman评分（非心脏手术术前心脏风险指数）
            }
            1 -> {
                //ASA手术分级（美国麻醉医师协会健康状况分级）
            }
            2 -> {
                //VAS评分（疼痛视觉模拟评分系统）
            }
            3 -> {
                //Wilson苏醒评分法（困难气道的预测）
            }
            4 -> {
                //蛛网膜下腔常用局麻药剂量及浓度
            }
            5 -> {
                //Steward苏醒评分法
            }
            6 -> {
                //硬膜外阻滞常用局麻药浓度和剂量
            }
            7 -> {
                //寒战分级
            }
            8 -> {
                //椎管内麻醉（硬、腰、骶）效果评级标准
            }
            9 -> {
                //Ramsay镇静程度评分
            }
            10 -> {
                //常用局麻药理化性质和麻醉效能
            }
            11 -> {
                //清醒程度分级
            }
            12 -> {
                //改良Mallampati气道分级
            }
            13 -> {
                //McGill疼痛简式问卷
            }
            14 -> {
                //改良Lee's评分（非心脏手术术前心脏风险指数）
            }
            15 -> {
                //全麻效果评级标准
            }
            16 -> {
                //PRST评分系统（麻醉深度判断）
            }
            17 -> {
                //麻醉后恢复期评分
            }
            18 -> {
                //改良马氏评分
            }
            19 -> {
                //神经阻滞效果评级标准（颈丛、臂丛、下肢神经等）
            }
            20 -> {
                //Prince-Henry评分法
            }
            21 -> {
                //内脏牵拉反应
            }
            22 -> {
                //改良Bromage评分（运动阻滞评分）
            }
            23 -> {
                //POSSUM评分系统
            }
            24 -> {
                //OAA/S评分法
            }
            25 -> {
                //Tarlov神经功能评分标准
            }
        }
    }
}