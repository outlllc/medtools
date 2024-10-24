package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Nephrology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Nephrology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("Cockcroft-Gault公式（内生肌酐清除率公式）", "CKD-EPI公式（肾小球滤过率）", "MDRD简化公式（肾小球滤过率简化公式）", "MDRD公式（肾小球滤过率公式）", "内生肌酐清除率-测量法",
            "慢性肾脏病CKD分期", "Durate公式（内生肌酐清除率公式）", "肾衰指数", "Kt-V透析有效性指数", "残余肾功能",
            "蛋白质摄入量", "尿蛋白排泄量估计", "造影剂肾病危险因素评分", "尿素排泄分数", "LEE分级（IgA肾病，根据光镜表现）",
            "钠排泌分数", "bosniak分级（肾囊性病变）", "肾癌TNM分期", "肾盂和输尿管肿瘤TNM分期", "急性肾损伤AKI诊断和分期标准",
            "肾小管磷重吸收", "肾上腺肿瘤TNM分期"
        )
        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //cockcroft-gault公式（内生肌酐清除率公式）
            }
            1 -> {
                //CKD-EPI公式（肾小球滤过率）
            }
            2 -> {
                //MDRD简化公式（肾小球滤过率简化公式）
            }
            3 -> {
                //MDRD公式（肾小球滤过率公式）
            }
            4 -> {
                //内生肌酐清除率-测量法
            }
            5 -> {
                //慢性肾脏病CKD分期
            }
            6 -> {
                //Durate公式（内生肌酐清除率公式）
            }
            7 -> {
                //肾衰指数
            }
            8 -> {
                //Kt-V透析有效性指数
            }
            9 -> {
                //残余肾功能
            }
            10 -> {
                //蛋白质摄入量
            }
            11 -> {
                //尿蛋白排泄量估计
            }
            12 -> {
                //造影剂肾病危险因素评分
            }
            13 -> {
                //尿素排泄分数
            }
            14 -> {
                //LEE分级（IgA肾病，根据光镜表现）
            }
            15 -> {
                //钠排泌分数
            }
            16 -> {
                //bosniak分级（肾囊性病变）
            }
            17 -> {
                //肾癌TNM分期
            }
            18 -> {
                //肾盂和输尿管肿瘤TNM分期
            }
            19 -> {
                //急性肾损伤AKI诊断和分期标准
            }
            20 -> {
                //肾小管磷重吸收
            }
            21 -> {
                //肾上腺肿瘤TNM分期
            }
        }
    }
}