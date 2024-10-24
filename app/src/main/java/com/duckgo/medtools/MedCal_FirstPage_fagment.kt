package com.duckgo.medtools

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcalFirstpageFagmentBinding
import com.duckgo.medtools.medicaltools.Internal_Medicine.Endocrinology.HbA1cValuesBloodGlucose_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.AmountOfHydration_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Chronic_Kidney_Disease_Staging_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Creatinine_Clearance_Cockcroft_Gault_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Glomerular_Filtration_Rate_CKD_EPI_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.SodiumDeficitInHyponatremia_fm
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
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.RH_And_ABO_Hemolysis_Comparison_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Severe_Preeclampsia_Diagnosis_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Thyroid_Function_Of_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Uterine_Height_Gestational_Age_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Tanner_Stage_fm
import com.duckgo.medtools.medicaltools.comprehensive.BodySurfaceArea_fm
import com.duckgo.medtools.medicaltools.comprehensive.Unit_Conversion_fm
import com.duckgo.medtools.test.TestBaseFragment
import com.duckgo.medtools.util.add_hide_fragment

class MedCal_FirstPage_fagment: Fragment(), Med_Cal_Fragment_Adaptor.onItemClickListener {
    lateinit var binding: MedcalFirstpageFagmentBinding
    lateinit var mfragmentManager: FragmentManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MedcalFirstpageFagmentBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataset = arrayOf("综合", "肌酐清除率(Cockcroft-Gault)", "体表面积", "补水量", "低钠血症补钠量",
            "肾小球滤过率CKD-EPI", "慢性肾病CKD分期", "糖化血红蛋白评估平均血糖", "BISHOP评分", "妊娠期高血压分类",
            "重度子痫前期诊断", "妊娠期高血糖诊断标准（GDM）", "妊娠期糖尿病分级分期", "妊娠高血压终止妊娠的指征", "妊娠期甲状腺功能实验室检查",
            "胎儿生物物理监测Manning评分","正常恶露性状", "孕期用药对胎儿的影响","胎儿成熟度监测", "Rh 和 ABO 溶血病的比较",
            "妊娠期甲亢程度和用药剂量间的关系", "EPDS（爱丁堡产后抑郁量表）","不同妊娠周数的宫底高度及子宫长度", "产褥期抑郁症诊断标准", "人类精液变量参考值",
            "tanner分期（女性性发育）", "性早熟疾病的辅助检查结果", "常用单位换算")
        binding.rvMedCalFirstpage.layoutManager= LinearLayoutManager(context , LinearLayoutManager.VERTICAL, false)
        binding.rvMedCalFirstpage.adapter = Med_Cal_Fragment_Adaptor(activity as Context, this, dataset)
        mfragmentManager = requireActivity().supportFragmentManager
    }

    override fun onItemClick(position: Int) {
        when(position) {
            0 -> {
                //综合
                val fragment = TestBaseFragment()
                add_hide_fragment(mfragmentManager, fragment)
            }

            1 -> {
                //肌酐清除率(Cockcroft-Gault)
//                val mchildFragmentManager= childFragmentManager.getFragments()
//                for (i in mchildFragmentManager.indices) {
//                        if (mchildFragmentManager[i] != null)
//                        mchildFragmentManager[i].childFragmentManager.beginTransaction()!!.hide(mchildFragmentManager[i]!!).commit()
//                }
                val fragment = Creatinine_Clearance_Cockcroft_Gault_fm()
//                val mFragmentManager = activity?.supportFragmentManager
//                val transaction = activity?.supportFragmentManager?.beginTransaction()
////                transaction?.replace(R.id.fragment_, fragment)
////                transaction?.addToBackStack(null)
//                if (childFragmentManager.findFragmentById(R.id.fm_med_cal_firstpage) != null) {
//                    childFragmentManager.beginTransaction().remove(childFragmentManager.findFragmentById(R.id.fm_med_cal_firstpage)!!!!).commit()
//                }
//
//                transaction?.replace(R.id.fragment_, fragment)
////                transaction?.show(fragment)
//                transaction?.addToBackStack(null)
////                if (mFragmentManager?.findFragmentById(R.id.fragment_) != null) {
////                    mFragmentManager!!.beginTransaction()!!.hide(mFragmentManager?.findFragmentById(R.id.fragment_)!!).commit()
////                }
////                if (mchildFragmentManager?.findFragmentById(R.id.fm_med_cal_firstpage) != null) {
////                    mFragmentManager!!.beginTransaction()!!.hide(mFragmentManager?.findFragmentById(R.id.fm_med_cal_firstpage)!!)
////                }
//                transaction?.commit()
                add_hide_fragment(mfragmentManager, fragment)
            }
            2 -> {
                //体表面积
                val fragment = BodySurfaceArea_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            3 -> {
                //补水量
                val fragment = AmountOfHydration_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            4 -> {
                //低钠血症补钠量
                val fragment = SodiumDeficitInHyponatremia_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            5 -> {
                //肾小球滤过率CKD-EPI
                val fragment = Glomerular_Filtration_Rate_CKD_EPI_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            6 -> {
                //慢性肾病CKD分期
                val fragment = Chronic_Kidney_Disease_Staging_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            7 -> {
                //糖化血红蛋白评估平均血糖
                val fragment = HbA1cValuesBloodGlucose_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            8 -> {
                //BISHOP评分
                val fragment = Bishop_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            9 -> {
                //妊娠期高血压分类
                val fragment = Classification_Of_Hypertension_During_Pregnancy_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            10 -> {
                //重度子痫前期诊断
                val fragment = Severe_Preeclampsia_Diagnosis_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            11 -> {
                //妊娠期高血糖诊断标准（GDM）
                val fragment = Diagnostic_Criteria_For_GDM_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            12 -> {
                //妊娠期糖尿病分级分期
                val fragment = GDM_Grading_And_Staging_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            13 -> {
                //妊娠高血压终止妊娠的指征
                val fragment = Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            14 -> {
                //妊娠期甲状腺功能实验室检查
                val fragment = Thyroid_Function_Of_Pregnancy_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            15 -> {
                //胎儿生物物理监测Manning评分
                val fragment = Manning_Score_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            16 -> {
                //正常恶露性状
                val fragment = Normal_Lochia_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            17 -> {
                //孕期用药对胎儿的影响
                val fragment = DrugToFetus_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            18 -> {
                //胎儿成熟度监测
                val fragment = Fetal_Maturity_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            19 -> {
                //Rh 和 ABO 溶血病的比较
                val fragment = RH_And_ABO_Hemolysis_Comparison_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            20 -> {
                //妊娠期甲亢程度和用药剂量间的关系
                val fragment = Hyperthyroidism_Medication_During_Pregnancy_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            21 -> {
                //EPDS（爱丁堡产后抑郁量表）
                val fragment = Edinburgh_Postnatal_Depression_Scale_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            22 -> {
                //不同妊娠周数的宫底高度及子宫长度
                val fragment = Uterine_Height_Gestational_Age_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            23 -> {
                //产褥期抑郁症诊断标准
                val fragment = Diagnosis_Postnatal_Depression_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            24 -> {
                //人类精液变量参考值(WHO, 2011)
                val fragment = Semen_reference_values_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            25 -> {
                //tanner分期（女性性发育）
                val fragment = Tanner_Stage_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            26 -> {
                //性早熟疾病的辅助检查结果
                val fragment = Precocious_Puberty_Auxiliary_Examination_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            27 -> {
                val fragment = Unit_Conversion_fm()
//                inflateFragment(fragment)
//                add_hide_fragment(fragment)
                add_hide_fragment(mfragmentManager, fragment)

            }
        }
    }

//    override fun onResume() {
//        super.onResume()
//        binding.root.setOnKeyListener { v, keyCode, event ->
//            if (keyCode == (KeyEvent.KEYCODE_BACK)) {
////                activity?.finish()
//                val mFragmentManager = activity?.supportFragmentManager
//                if (mFragmentManager?.findFragmentById(R.id.fragment_) != null) {
//                    mFragmentManager!!.beginTransaction()!!.show(mFragmentManager?.findFragmentById(R.id.fragment_)!!).commit()
//                    return@setOnKeyListener true
//                }
//
//            }
//            return@setOnKeyListener false
//        }
//    }
}