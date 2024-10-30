package com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Bishop_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Classification_Of_Hypertension_During_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Diagnosis_Postnatal_Depression_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Diagnostic_Criteria_For_GDM_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.DrugToFetus_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Edinburgh_Postnatal_Depression_Scale_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Fetal_Maturity_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.GDM_Grading_And_Staging_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Hyperthyroidism_Medication_During_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Manning_Score_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Normal_Lochia_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Fetal_developmental_index_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Simple_gestational_age_assessment_scale_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.RH_And_ABO_Hemolysis_Comparison_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Severe_Preeclampsia_Diagnosis_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Thyroid_Function_Of_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Uterine_Height_Gestational_Age_fm
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Obstetrics_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("BISHOP评分", "胎儿发育指数", "不同妊娠周数的宫底高度及子宫长度", "孕期用药对胎儿的影响", "胎儿成熟度监测",
            "正常恶露性状", "妊娠期高血压分类", "妊娠期高血糖诊断标准（GDM）", "重度子痫前期诊断", "妊娠高血压终止妊娠的指征",
            "胎儿生物物理监测Manning评分", "简易胎龄评估表", "妊娠期糖尿病分级分期", "妊娠期甲状腺功能实验室检查",
            "Rh 和 ABO 溶血病的比较",  "妊娠期甲亢程度和用药剂量间的关系",
            "EPDS（爱丁堡产后抑郁量表）", "产褥期抑郁症诊断标准")

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //BISHOP评分
                val fragment = Bishop_fm()
                inflateFragment(fragment)
            }
            1 -> {
                //胎儿发育指数
                val fragment = Fetal_developmental_index_fm()
                inflateFragment(fragment)
            }
            2 -> {
                //不同妊娠周数的宫底高度及子宫长度
                val fragment = Uterine_Height_Gestational_Age_fm()
                inflateFragment(fragment)
            }
            3 -> {
                //孕期用药对胎儿的影响
                val fragment = DrugToFetus_fm()
                inflateFragment(fragment)
            }
            4 -> {
                //胎儿成熟度监测
                val fragment = Fetal_Maturity_fm()
                inflateFragment(fragment)
            }
            5 -> {
                //正常恶露性状
                val fragment = Normal_Lochia_fm()
                inflateFragment(fragment)
            }
            6 -> {
                //妊娠期高血压分类
                val fragment = Classification_Of_Hypertension_During_Pregnancy_fm()
                inflateFragment(fragment)
            }
            7 -> {
                //妊娠期高血糖诊断标准（GDM）
                val fragment = Diagnostic_Criteria_For_GDM_fm()
                inflateFragment(fragment)
            }
            8 -> {
                //重度子痫前期诊断
                val fragment = Severe_Preeclampsia_Diagnosis_fm()
                inflateFragment(fragment)
            }
            9 -> {
                //妊娠高血压终止妊娠的指征
                val fragment = Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm()
                inflateFragment(fragment)
            }
            10 -> {
                //胎儿生物物理监测Manning评分
                val fragment = Manning_Score_fm()
                inflateFragment(fragment)
            }
            11 -> {
                //简易胎龄评估表
                val fragment = Simple_gestational_age_assessment_scale_fm()
                inflateFragment(fragment)
            }
            12 -> {
                //妊娠期糖尿病分级分期
                val fragment = GDM_Grading_And_Staging_fm()
                inflateFragment(fragment)
            }
            13 -> {
                //妊娠期甲状腺功能实验室检查
                val fragment = Thyroid_Function_Of_Pregnancy_fm()
                inflateFragment(fragment)
            }
            14 -> {
                //Rh 和 ABO 溶血病的比较
                val fragment = RH_And_ABO_Hemolysis_Comparison_fm()
                inflateFragment(fragment)
            }
            15 -> {
                //妊娠期甲亢程度和用药剂量间的关系
                val fragment = Hyperthyroidism_Medication_During_Pregnancy_fm()
                inflateFragment(fragment)
            }
            16 -> {
                //EPDS（爱丁堡产后抑郁量表）
                val fragment = Edinburgh_Postnatal_Depression_Scale_fm()
                inflateFragment(fragment)
            }
            17 -> {
                //产褥期抑郁症诊断标准
                val fragment = Diagnosis_Postnatal_Depression_fm()
                inflateFragment(fragment)
            }
        }
    }
}