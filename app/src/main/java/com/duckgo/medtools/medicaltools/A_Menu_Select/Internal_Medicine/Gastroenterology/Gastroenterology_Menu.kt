package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Gastroenterology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Gastroenterology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)

    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("胃癌TNM分期", "食道癌TNM分期", "MELD评分（终末期肝病）", "肝性脑病分期", "上消化道出血病情严重程度分级",
            "Alvarado评分（急性阑尾炎）", "Ranson标准（急性胰腺炎评分）", "CTSI（急性胰腺炎CT严重程度指数）", "H.pylori根除指证（第五次共识，2017）", "胰腺癌TNM分期",
            "Glasgow-Blatchford评分（上消化道出血评分）", "白蛋白/球蛋白比值（白球比）", "慢性胰腺炎CP诊断标准", "Forrest分级（消化道出血）", "Rockall评分（急性上消化道出血）",
            "CDAI计算法（简化克罗恩病活动指数）", "腹水血清白蛋白梯度", "Maddrey判别函数（酒精性肝炎）", "淀粉酶/肌酐清除比值", "克罗恩病诊断要点",
            "Los Angeles分级系统（反流性食管炎GERD分级）", "H.pylori感染的根除标准", "Mayo评分（溃疡性结肠炎活动性评分）", "H.pylori感染的诊断标准", "胃肠道间质瘤TNM分期",
            "NAS（非酒精性脂肪肝NAFLD活动度积分）", "Truelove/Witts分级（溃疡性结肠炎分度）", "胰腺内分泌肿瘤PEN类型及相关临床综合征"
        )
        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position){
            0 -> {
                //胃癌TNM分期
            }
            1 -> {
                //食道癌TNM分期
            }
            2 -> {
                //MELD评分（终末期肝病）
            }
            3 -> {
                //肝性脑病分期
            }
            4 -> {
                //上消化道出血病情严重程度分级
            }
            5 -> {
                //Alvarado评分（急性阑尾炎）
            }
            6 -> {
                //Ranson标准（急性胰腺炎评分）
            }
            7 -> {
                //CTSI（急性胰腺炎CT严重程度指数）
            }
            8 -> {
                //H.pylori根除指证（第五次共识，2017）
            }
            9 -> {
                //胰腺癌TNM分期
            }
            10 -> {
                //Glasgow-Blatchford评分（上消化道出血评分）
            }
            11 -> {
                //白蛋白/球蛋白比值（白球比）
            }
            12 -> {
                //慢性胰腺炎CP诊断标准
            }
            13 -> {
                //Forrest分级（消化道出血）
            }
            14 -> {
                //Rockall评分（急性上消化道出血）
            }
            15 -> {
                //CDAI计算法（简化克罗恩病活动指数）
            }
            16 -> {
                //腹水血清白蛋白梯度
            }
            17 -> {
                //Maddrey判别函数（酒精性肝炎）
            }
            18 -> {
                //淀粉酶/肌酐清除比值
            }
            19 -> {
                //克罗恩病诊断要点
            }
            20 -> {
                //Los Angeles分级系统（反流性食管炎GERD分级）
            }
            21 -> {
                //H.pylori感染的根除标准
            }
            22 -> {
                //Mayo评分（溃疡性结肠炎活动性评分）
            }
            23 -> {
                //H.pylori感染的诊断标准
            }
            24 -> {
                //胃肠道间质瘤TNM分期
            }
            25 -> {
                //NAS（非酒精性脂肪肝NAFLD活动度积分）
            }
            26 -> {
                //Truelove/Witts分级（溃疡性结肠炎分度）
            }
            27 -> {
                //胰腺内分泌肿瘤PEN类型及相关临床综合征
            }
        }
    }
}