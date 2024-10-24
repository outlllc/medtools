package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Anorectal_surgery

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Anorectal_surgery_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("结直肠癌TNM分期", "结直肠息肉分类", "小肠肿瘤TNM分期", "Dukes分期（大肠癌）", "胃肠道间质瘤TNM分期",
            "Broders分级（结直肠癌组织学）", "GIST切除术后风险分级（胃肠道间质瘤）", "肛管癌TNM分期"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //结直肠癌TNM分期
            }
            1 -> {
                //结直肠息肉分类
            }
            2 -> {
                //小肠肿瘤TNM分期
            }
            3 -> {
                //Dukes分期（大肠癌）
            }
            4 -> {
                //胃肠道间质瘤TNM分期
            }
            5 -> {
                //Broders分级（结直肠癌组织学）
            }
            6 -> {
                //GIST切除术后风险分级（胃肠道间质瘤）
            }
            7 -> {
                //肛管癌TNM分期
            }
        }
    }
}