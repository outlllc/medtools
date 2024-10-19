package com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Bishop
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Classification_Of_Hypertension_During_Pregnancy
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Diagnosis_Postnatal_Depression
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Diagnostic_Criteria_For_GDM
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.DrugToFetus
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Edinburgh_Postnatal_Depression_Scale
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Fetal_Maturity
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.GDM_Grading_And_Staging
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Hyperthyroidism_Medication_During_Pregnancy
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Manning_Score
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Normal_Lochia
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.RH_And_ABO_Hemolysis_Comparison
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Severe_Preeclampsia_Diagnosis
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Thyroid_Function_Of_Pregnancy
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Uterine_Height_Gestational_Age
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Semen_reference_values
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Tanner_Stage

class Obstetrics_and_Gynecology_Menu: Fragment(), MenuSelectAdapter.OnItemClickListener {

    lateinit var rv_medical_calculator: RecyclerView
    var dataSet: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.medcaltool_menu_page_fragment, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
        initData()
        initAdapter()
    }
    private fun initAdapter() {
        rv_medical_calculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        rv_medical_calculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    private fun initData() {
        dataSet = mutableListOf("BISHOP评分", "妊娠期高血压分类", "重度子痫前期诊断", "妊娠期糖尿病分级分期",
            "妊娠期甲状腺功能实验室检查", "妊娠期高血糖诊断标准（GDM）", "妊娠高血压终止妊娠的指征",
            "Rh 和 ABO 溶血病的比较", "胎儿生物物理监测Manning评分", "妊娠期甲亢程度和用药剂量间的关系", "正常恶露性状",
            "EPDS（爱丁堡产后抑郁量表）", "孕期用药对胎儿的影响", "不同妊娠周数的宫底高度及子宫长度",
            "胎儿成熟度监测", "产褥期抑郁症诊断标准", "人类精液变量参考值(WHO, 2011)", "tanner分期（女性性发育）", "性早熟疾病的辅助检查结果")
    }

    private fun initView(view: View) {
        rv_medical_calculator = view.findViewById(R.id.rv_medical_calculator)
    }
    override fun onItemClick(position: Int) {
        when(position) {
            0 -> {
                //bishop评分
                val intent = Intent(activity, Bishop::class.java)
                startActivity(intent)
            }
            1 -> {
                //妊娠期高血压分类
                val intent = Intent(activity, Classification_Of_Hypertension_During_Pregnancy::class.java)
                startActivity(intent)
            }
            2 -> {
                //重度子痫前期诊断
                val intent = Intent(activity, Severe_Preeclampsia_Diagnosis::class.java)
                startActivity(intent)
            }
            3 -> {
                //妊娠期糖尿病分级分期
                val intent = Intent(activity, GDM_Grading_And_Staging::class.java)
                startActivity(intent)
            }
            4 -> {
                //妊娠期甲状腺功能实验室检查
                val intent = Intent(activity, Thyroid_Function_Of_Pregnancy::class.java)
                startActivity(intent)
            }
            5 -> {
                //妊娠期高血糖诊断标准（GDM）
                val intent = Intent(activity, Diagnostic_Criteria_For_GDM::class.java)
                startActivity(intent)
            }
            6 -> {
                //妊娠高血压终止妊娠的指征
                val intent = Intent(activity, Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension::class.java)
                startActivity(intent)
            }
            7 -> {
                //Rh 和 ABO 溶血病的比较
                val intent = Intent(activity, RH_And_ABO_Hemolysis_Comparison::class.java)
                startActivity(intent)
            }
            8 -> {
                //胎儿生物物理监测Manning评分
                val intent = Intent(activity, Manning_Score::class.java)
                startActivity(intent)
            }
            9 -> {
                //妊娠期甲亢程度和用药剂量间的关系
                val intent = Intent(activity, Hyperthyroidism_Medication_During_Pregnancy::class.java)
                startActivity(intent)
            }
            10 -> {
                //正常恶露性状
                val intent = Intent(activity, Normal_Lochia::class.java)
                startActivity(intent)
            }
            11 -> {
                //EPDS（爱丁堡产后抑郁量表）
                val intent = Intent(activity, Edinburgh_Postnatal_Depression_Scale::class.java)
                startActivity(intent)
            }
            12 -> {
                //孕期用药对胎儿的影响
                val intent = Intent(activity, DrugToFetus::class.java)
                startActivity(intent)
            }
            13 -> {
                //不同妊娠周数的宫底高度及子宫长度
                val intent = Intent(activity, Uterine_Height_Gestational_Age::class.java)
                startActivity(intent)
            }
            14 -> {
                //胎儿成熟度监测
                val intent = Intent(activity, Fetal_Maturity::class.java)
                startActivity(intent)
            }
            15 -> {
                //产褥期抑郁症诊断标准
                val intent = Intent(activity, Diagnosis_Postnatal_Depression::class.java)
                startActivity(intent)
            }
            16 -> {
                //人类精液变量参考值(WHO, 2011)
                val intent = Intent(activity, Semen_reference_values::class.java)
                startActivity(intent)
            }
            17 -> {
                //tanner分期（女性性发育）
                val intent = Intent(activity, Tanner_Stage::class.java)
                startActivity(intent)
            }
            18 -> {
                //性早熟疾病的辅助检查结果
                val intent = Intent(activity, Precocious_Puberty_Auxiliary_Examination::class.java)
                startActivity(intent)
            }
            else -> {

            }
        }
    }
}