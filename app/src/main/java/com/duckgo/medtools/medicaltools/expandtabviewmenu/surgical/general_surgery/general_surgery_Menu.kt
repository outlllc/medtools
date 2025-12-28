package com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.general_surgery

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class general_surgery_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("输液计算器") { TODO("Wait for Fragment") } // { Infusion_Calculator_fm() }
        addMenuItem("常用冬眠合计及其特点") { TODO("Wait for Fragment") } // { Hibernation_Mixture_fm() }
        addMenuItem("外科ICU（SICU）术前、术后病人高危标准") { TODO("Wait for Fragment") } // { Sicu_High_Risk_fm() }
        addMenuItem("腹部肿块的部位和常见疾病") { TODO("Wait for Fragment") } // { Abdominal_Mass_Location_fm() }
        addMenuItem("手术中失血量估计方法（红细胞压积法）") { TODO("Wait for Fragment") } // { Blood_Loss_Estimation_fm() }
        addMenuItem("腹腔器官肿瘤标志物分类") { TODO("Wait for Fragment") } // { Abdominal_Tumor_Markers_fm() }
        addMenuItem("改良Goldman评分（非心脏手术术前心脏风险指数）") { TODO("Wait for Fragment") } // { Goldman_Score_fm() }
        addMenuItem("胃肠道间质瘤TNM分期") { TODO("Wait for Fragment") } // { GIST_TNM_fm() }
        addMenuItem("改良Lee‘s评分（非心脏手术术前心脏风险指数）") { TODO("Wait for Fragment") } // { Lee_Score_fm() }
        addMenuItem("GIST切除术后风险分级（胃肠道间质瘤）") { TODO("Wait for Fragment") } // { GIST_Risk_Grading_fm() }
    }
}
