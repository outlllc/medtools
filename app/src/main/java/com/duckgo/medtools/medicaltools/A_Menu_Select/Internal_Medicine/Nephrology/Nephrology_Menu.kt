package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Nephrology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Nephrology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "Cockcroft-Gault公式（内生肌酐清除率公式）", "CKD-EPI公式（肾小球滤过率）", "MDRD简化公式（肾小球滤过率简化公式）", "MDRD公式（肾小球滤过率公式）", "内生肌酐清除率-测量法",
            "慢性肾脏病CKD分期", "Durate公式（内生肌酐清除率公式）", "肾衰指数", "Kt-V透析有效性指数", "残余肾功能",
            "蛋白质摄入量", "尿蛋白排泄量估计", "造影剂肾病危险因素评分", "尿素排泄分数", "LEE分级（IgA肾病，根据光镜表现）",
            "钠排泌分数", "bosniak分级（肾囊性病变）", "肾癌TNM分期", "肾盂和输尿管肿瘤TNM分期", "急性肾损伤AKI诊断和分期标准",
            "肾小管磷重吸收", "肾上腺肿瘤TNM分期"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 实现具体跳转逻辑
        }
    }
}
