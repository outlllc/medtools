package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Urology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Urology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("IIEF-5（国际勃起功能评分5项", "尿石的一般特征", "前列腺癌TNM分期", "肾癌TNM分期", "肾盂和输尿管肿瘤TNM分期",
            "I-PSS（国际前列腺症状评分表）", "膀胱肿瘤TNM分期", "Goldman分类（尿道损伤）", "膀胱癌TNM分期", "尿路钙排泄指数（钙-肌酐比）",
            "睾丸肿瘤TNM分期", "膀胱尿路上皮恶性程度分级系统", "EAU尿道损伤严重程度分级", "不同因素对膀胱癌复发与进展影响的评分", "肾上腺肿瘤TNM分期",
            "尿道肿瘤TNM分期"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //IIEF-5（国际勃起功能评分5项
            }
            1 -> {
                //尿石的一般特征
            }
            2 -> {
                //前列腺癌TNM分期
            }
            3 -> {
                //肾癌TNM分期
            }
            4 -> {
                //肾盂和输尿管肿瘤TNM分期
            }
            5 -> {
                //I-PSS（国际前列腺症状评分表）
            }
            6 -> {
                //膀胱肿瘤TNM分期
            }
            7 -> {
                //Goldman分类（尿道损伤）
            }
            8 -> {
                //膀胱癌TNM分期
            }
            9 -> {
                //尿路钙排泄指数（钙-肌酐比）
            }
            10 -> {
                //睾丸肿瘤TNM分期
            }
            11 -> {
                //膀胱尿路上皮恶性程度分级系统
            }
            12 -> {
                //EAU尿道损伤严重程度分级
            }
            13 -> {
                //不同因素对膀胱癌复发与进展影响的评分
            }
            14 -> {
                //肾上腺肿瘤TNM分期
            }
            15 -> {
                //尿道肿瘤TNM分期
            }
        }
    }
}