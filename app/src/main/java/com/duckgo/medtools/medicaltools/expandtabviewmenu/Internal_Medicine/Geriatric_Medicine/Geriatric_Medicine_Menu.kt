package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Geriatric_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Geriatric_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("阿尔兹海默病临床诊断标准") { TODO("Wait for Fragment") } // { Alzheimer_Diagnosis_fm() }
        addMenuItem("亚洲人骨质疏松自我筛查工具") { TODO("Wait for Fragment") } // { Osteoporosis_Screening_fm() }
        addMenuItem("骨质疏松症风险一分钟测试题") { TODO("Wait for Fragment") } // { Osteoporosis_Risk_Test_fm() }
    }
}
