package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Hematology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Hematology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("贫血的分类", "霍奇金和非霍奇金淋巴瘤TNM分期", "化疗后骨髓抑制的分度", "DIC诊断积分系统", "Durie-Salmon分期（多发性骨髓瘤MM)",
            "IPI（国际淋巴瘤预后指数）", "HLH-2004（嗜血细胞综合征HPS诊断标准）", "IPSS（骨髓增生异常综合征MDS国际预后评分系统）", "急性髓系白血病的危险度分级", "ISS（多发性骨髓瘤MM国际分期系统",
            "Lavin-Osband分级法（朗格汉斯细胞组织细胞增生症LCH临床分型）", "HL国际预后评分（霍奇金淋巴瘤）", "Ann Arbor分期系统（霍奇金淋巴瘤HL分期）", "4Ts评分系统（肝素诱导的血小板减少评分系统）", "WPSS（骨髓增生异常综合征MDS基于WHO分类的预后评分系统）",
            "急性移植物抗宿主反应GVHD分级"
        )
        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // 贫血的分类
            }
            1 -> {
                // 霍奇金和非霍奇金淋巴瘤TNM分期
            }
            2 -> {
                // 化疗后骨髓抑制的分度
            }
            3 -> {
                // DIC诊断积分系统
            }
            4 -> {
                // Durie-Salmon分期（多发性骨髓瘤MM）
            }
            5 -> {
                // IPI（国际淋巴瘤预后指数）
            }
            6 -> {
                // HLH-2004（嗜血细胞综合征HPS诊断标准）
            }
            7 -> {
                // IPSS（骨髓增生异常综合征MDS国际预后评分系统）
            }
            8 -> {
                // 急性髓系白血病的危险度分级
            }
            9 -> {
                // ISS（多发性骨髓瘤MM国际分期系统）
            }
            10 -> {
                // Lavin-Osband分级法（朗格汉斯细胞组织细胞增生症LCH临床分型）
            }
            11 -> {
                // HL国际预后评分（霍奇金淋巴瘤）
            }
            12 -> {
                // Ann Arbor分期系统（霍奇金淋巴瘤HL分期）
            }
            13 -> {
                // 4Ts评分系统（肝素诱导的血小板减少评分系统）
            }
            14 -> {
                // WPSS（骨髓增生异常综合征MDS基于WHO分类的预后评分系统）
            }
            15 -> {
                // 急性移植物抗宿主反应GVHD分级
            }
        }
    }
}