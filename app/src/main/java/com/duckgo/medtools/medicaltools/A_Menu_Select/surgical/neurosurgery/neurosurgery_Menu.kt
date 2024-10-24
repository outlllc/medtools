package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.neurosurgery

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class neurosurgery_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("HUNT-HESS分级（蛛网膜下腔出血）", "运动瘫痪类型的鉴别", "Seddon分类（神经损伤）", "SFSR定律（旧金山晕厥定律）", "Frankel脊髓损伤分级法",
            "Sunderland分类法（神经损伤）", "Spetsler-Martin分级（颅内出血动静脉畸形AVM）", "Chiari畸形分型（小脑扁桃体下疝畸形）", "颈神经根受累的症状和体征", "神经系统副肿瘤综合征PNS诊断标准",
            "NFI和NFII诊断标准（神经纤维瘤）"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //HUNT-HESS分级（蛛网膜下腔出血）
            }
            1 -> {
                //运动瘫痪类型的鉴别
            }
            2 -> {
                //Seddon分类（神经损伤）
            }
            3 -> {
                //SFSR定律（旧金山晕厥定律）
            }
            4 -> {
                //Frankel脊髓损伤分级法
            }
            5 -> {
                //Sunderland分类法（神经损伤）
            }
            6 -> {
                //Spetsler-Martin分级（颅内出血动静脉畸形AVM）
            }
            7 -> {
                //Chiari畸形分型（小脑扁桃体下疝畸形）
            }
            8 -> {
                //颈神经根受累的症状和体征
            }
            9 -> {
                //神经系统副肿瘤综合征PNS诊断标准
            }
            10 -> {
                //NFI和NFII诊断标准（神经纤维瘤）
            }
        }
    }
}