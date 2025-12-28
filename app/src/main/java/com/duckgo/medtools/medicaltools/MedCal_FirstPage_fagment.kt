package com.duckgo.medtools.medicaltools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.Med_Cal_Fragment_Adaptor
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.MedcalFirstpageFagmentBinding
import com.duckgo.medtools.medicaltools.Internal_Medicine.Endocrinology.HbA1cValuesBloodGlucose_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.AmountOfHydration_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Chronic_Kidney_Disease_Staging_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Creatinine_Clearance_Cockcroft_Gault_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Glomerular_Filtration_Rate_CKD_EPI_fm
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.SodiumDeficitInHyponatremia_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.POPQStage
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Bishop_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Classification_Of_Hypertension_During_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Diagnosis_Postnatal_Depression_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Diagnostic_Criteria_For_GDM_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.DrugToFetus_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Edinburgh_Postnatal_Depression_Scale_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Fetal_Maturity_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.GDM_Grading_And_Staging_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Hyperthyroidism_Medication_During_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Manning_Score_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Normal_Lochia_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.RH_And_ABO_Hemolysis_Comparison_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Severe_Preeclampsia_Diagnosis_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Thyroid_Function_Of_Pregnancy_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.Uterine_Height_Gestational_Age_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Tanner_Stage_fm
import com.duckgo.medtools.medicaltools.comprehensive.BodySurfaceArea_fm
import com.duckgo.medtools.medicaltools.comprehensive.Unit_Conversion_fm
import com.duckgo.medtools.util.add_hide_fragment

class MedCal_FirstPage_fagment : Fragment(), Med_Cal_Fragment_Adaptor.OnItemClickListener {
    private var _binding: MedcalFirstpageFagmentBinding? = null
    private val binding get() = _binding!!

    private val dataset = arrayOf(
        "肌酐清除率(Cockcroft-Gault)", "体表面积", "补水量", "低钠血症补钠量",
        "肾小球滤过率CKD-EPI", "慢性肾病CKD分期", "糖化血红蛋白评估平均血糖", "BISHOP评分", "妊娠期高血压分类",
        "重度子痫前期诊断", "妊娠期高血糖诊断标准（GDM）", "妊娠期糖尿病分级分期", "妊娠高血压终止妊娠的指征", "妊娠期甲状腺功能实验室检查",
        "胎儿生物物理监测Manning评分", "正常恶露性状", "孕期用药对胎儿的影响", "胎儿成熟度监测", "Rh 和 ABO 溶血病的比较",
        "妊娠期甲亢程度和用药剂量间的关系", "EPDS（爱丁堡产后抑郁量表）", "不同妊娠周数的宫底高度及子宫长度", "产褥期抑郁症诊断标准", "人类精液变量参考值",
        "tanner分期（女性性发育）", "性早熟疾病的辅助检查结果", "常用单位换算", "盆腔器官脱垂分期（POP-Q分期法）"
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = MedcalFirstpageFagmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvMedCalFirstpage.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = Med_Cal_Fragment_Adaptor(this@MedCal_FirstPage_fagment, dataset)
        }
    }

    override fun onItemClick(position: Int) {
        val fragment: Fragment = when (position) {
            0 -> Creatinine_Clearance_Cockcroft_Gault_fm()
            1 -> BodySurfaceArea_fm()
            2 -> AmountOfHydration_fm()
            3 -> SodiumDeficitInHyponatremia_fm()
            4 -> Glomerular_Filtration_Rate_CKD_EPI_fm()
            5 -> Chronic_Kidney_Disease_Staging_fm()
            6 -> HbA1cValuesBloodGlucose_fm()
            7 -> Bishop_fm()
            8 -> Classification_Of_Hypertension_During_Pregnancy_fm()
            9 -> Severe_Preeclampsia_Diagnosis_fm()
            10 -> Diagnostic_Criteria_For_GDM_fm()
            11 -> GDM_Grading_And_Staging_fm()
            12 -> Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm()
            13 -> Thyroid_Function_Of_Pregnancy_fm()
            14 -> Manning_Score_fm()
            15 -> Normal_Lochia_fm()
            16 -> DrugToFetus_fm()
            17 -> Fetal_Maturity_fm()
            18 -> RH_And_ABO_Hemolysis_Comparison_fm()
            19 -> Hyperthyroidism_Medication_During_Pregnancy_fm()
            20 -> Edinburgh_Postnatal_Depression_Scale_fm()
            21 -> Uterine_Height_Gestational_Age_fm()
            22 -> Diagnosis_Postnatal_Depression_fm()
            23 -> Semen_reference_values_fm()
            24 -> Tanner_Stage_fm()
            25 -> Precocious_Puberty_Auxiliary_Examination_fm()
            26 -> Unit_Conversion_fm()
            27 -> POPQStage()
            else -> return
        }
        add_hide_fragment(parentFragmentManager, fragment, R.id.fm_med_cal_firstpage)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}