package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.General_Internal_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.comprehensive.BodySurfaceArea_fm

class General_Internal_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "体表面积", "体重指数", "标准体重", "体表面积简易公式", "标准体重简易公式",
            "输液计算器", "Harris-Benedict公式（基础能耗公式）", "去脂体重", "腹部肿块的部位和常见疾病", "Shingle-Rosa公式（基础能耗公式）",
            "骨骼肌肌力检查办法"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> inflateFragment(BodySurfaceArea_fm())
            // 其他项跳转逻辑待实现
        }
    }
}
