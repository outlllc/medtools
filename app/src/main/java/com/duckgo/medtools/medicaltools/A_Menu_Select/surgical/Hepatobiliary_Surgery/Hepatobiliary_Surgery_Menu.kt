package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Hepatobiliary_Surgery

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Hepatobiliary_Surgery_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("CTP分级（肝功能损害分级系统）", "MELD评分（终末期肝病）", "肝癌TNM分期", "Alvarado评分（急性阑尾炎）", "Ranson标准（急性胰腺炎评分）",
            "CTSI（急性胰腺炎CT严重程度指数）", "BCLC分期（巴塞罗那肝癌分级）", "胆囊癌TNM分期", "AAST（肝损伤分级）", "NAS（非酒精性脂肪肝NAFLD活动度积分）",
            "Bismuth-Corlette分型（肝门部胆管癌）", "肝内胆管癌TNM分期", "肝门胆管癌TNM分期", "Vater壶腹癌TNM分期", "远端胆管癌TNM分期"
        )
        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //CTP分级（肝功能损害分级系统）
            }
            1 -> {
                //MELD评分（终末期肝病）
            }
            2 -> {
                //肝癌TNM分期
            }
            3 -> {
                //Alvarado评分（急性阑尾炎）
            }
            4 -> {
                //Ranson标准（急性胰腺炎评分）
            }
            5 -> {
                //CTSI（急性胰腺炎CT严重程度指数）
            }
            6 -> {
                //BCLC分期（巴塞罗那肝癌分级）
            }
            7 -> {
                //胆囊癌TNM分期
            }
            8 -> {
                //AAST（肝损伤分级）
            }
            9 -> {
                //NAS（非酒精性脂肪肝NAFLD活动度积分）
            }
            10 -> {
                //Bismuth-Corlette分型（肝门部胆管癌）
            }
            11 -> {
                //肝内胆管癌TNM分期
            }
            12 -> {
                //肝门胆管癌TNM分期
            }
            13 -> {
                //Vater壶腹癌TNM分期
            }
            14 -> {
                //远端胆管癌TNM分期
            }
        }
    }
}