package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Rheumatology_and_Immunology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Rheumatology_and_Immunology_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "类风湿关节炎疾病活动性评分（DAS 28）", "激素计量换算", "SLEDAI（系统性红斑狼疮的病情活动程度评分）", "系统性红斑狼疮诊断标准（ACR,1997）", "类风湿关节炎分类标准和评分系统",
            "类风湿关节炎诊断标准（ACR，1987）", "类风湿关节炎功能状态分级标准", "强直性脊柱炎诊断标准", "类风湿关节炎临床缓解标准", "狼疮性肾炎分型（ISN/RPS,2003）",
            "Yamaguchi诊断标准（成人still病）", "自身免疫性肝炎的诊断标准与评分系统", "骶髂关节病变X线分级", "类风湿关节炎X线分类标准", "膝关节骨关节炎临床及放射学诊断标准",
            "膝关节骨关节炎临床诊断标准", "髋关节骨关节炎临床诊断标准", "髋关节骨关节炎临床及放射学诊断标准", "手关节骨关节炎临床诊断标准"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 跳转详情逻辑待实现
        }
    }
}
