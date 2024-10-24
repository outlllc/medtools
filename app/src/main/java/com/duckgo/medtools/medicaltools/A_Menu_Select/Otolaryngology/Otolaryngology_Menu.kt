package com.duckgo.medtools.medicaltools.A_Menu_Select.Otolaryngology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Otolaryngology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("咽部肿瘤TNM分期", "甲状腺肿瘤TNM分期", "喉部肿瘤TNM分期", "甲状腺肿分级", "鼻腔与鼻窦肿瘤TNM分期",
            "吞咽功能障碍饮水试验", "吞咽障碍的饮食分级", "神经性耳聋与传导性耳聋的鉴别"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //咽部肿瘤TNM分期
            }
            1 -> {
                //甲状腺肿瘤TNM分期
            }
            2 -> {
                //喉部肿瘤TNM分期
            }
            3 -> {
                //甲状腺肿分级
            }
            4 -> {
                //鼻腔与鼻窦肿瘤TNM分期
            }
            5 -> {
                //吞咽功能障碍饮水试验
            }
            6 -> {
                //吞咽障碍的饮食分级
            }
            7 -> {
                //神经性耳聋与传导性耳聋的鉴别
            }
        }
    }
}