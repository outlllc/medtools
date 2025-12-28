package com.duckgo.medtools.medicaltools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import com.duckgo.medtools.medicaltools.MedCal_FirstPage_fagment
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentMedicalCalculatorBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.Anesthesia_Department.Anesthesia_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Interventional_Department.Interventional_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Laboratory_department.Laboratory_department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Medical_Imaging_Department.Medical_Imaging_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Nuclear_Medicine.Nuclear_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Pathology_Department.Pathology_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Pharmacy_Department.Pharmacy_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Auxiliary_departments.Ultrasound_Department.Ultrasound_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Department_of_Critical_Care_Medicine.Department_of_Critical_Care_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Department_of_Psychiatry.Department_of_Psychiatry_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Dermatology_and_Venereology.Dermatology_and_Venereology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Cardiovascular_Medicine.Cardiovascular_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Endocrinology.Endocrinology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Gastroenterology.Gastroenterology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.General_Internal_Medicine.General_Internal_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Geriatric_Medicine.Geriatric_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Hematology.Hematology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Nephrology.Nephrology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Neurology.Neurology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Respiratory_medicine.Respiratory_medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Rheumatology_and_Immunology.Rheumatology_and_Immunology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology.Gynecology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology.Obstetrics_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology.Obstetrics_and_Gynecology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Oncology.Oncology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Andrology.Andrology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Department_of_Nutrition.Department_of_Nutrition_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Rehabilitation_Department.Rehabilitation_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Reproductive_Medicine.Reproductive_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Otolaryngology.Otolaryngology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.General_Pediatric_Internal_Medicine.General_Pediatric_Internal_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.General_Pediatric_Surgery.General_Pediatric_Surgery_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Neonatology.Neonatology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Endocrinology.Pediatric_Endocrinology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Emergency_Department.Pediatric_Emergency_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Health_Department.Pediatric_Health_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Immunology_Department.Pediatric_Immunology_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Orthopedics.Pediatric_Orthopedics_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Cardiovascular_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.common_use.Common_Use
import com.duckgo.medtools.medicaltools.A_Menu_Select.emergency_department.Emergency_department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.ophthalmology.ophthalmology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Anorectal_surgery.Anorectal_surgery_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Burn_Department.Burn_Department_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Hepatobiliary_Surgery.Hepatobiliary_Surgery_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Thoracic_Surgery.Thoracic_Surgery_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Urology.Urology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.Vascular_Surgery.Vascular_Surgery_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.general_surgery.general_surgery_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.neurosurgery.neurosurgery_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.orthopedics.orthopedics_Menu
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology.*
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics.*
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.*
import com.duckgo.medtools.medicaltools.comprehensive.*
import com.duckgo.medtools.medicaltools.Internal_Medicine.Endocrinology.HbA1cValuesBloodGlucose_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Tanner_Stage_fm
import com.duckgo.medtools.view.ChildView
import com.duckgo.medtools.view.ExpandTabView
import com.duckgo.medtools.util.add_hide_fragment

class MenuFragment : Fragment() {

    private var _binding: FragmentMedicalCalculatorBinding? = null
    private val binding get() = _binding!!
    private lateinit var expandTabView: ExpandTabView
    private lateinit var viewLeft: ChildView
    private val mViewArray = mutableListOf<View>()

    private val searchEntries = mutableMapOf<String, () -> Fragment>()

    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            if (childFragmentManager.backStackEntryCount > 0) {
                childFragmentManager.popBackStack()
            } else {
                isEnabled = false
                requireActivity().onBackPressedDispatcher.onBackPressed()
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMedicalCalculatorBinding.inflate(inflater, container, false)
        if (savedInstanceState == null) {
            childFragmentManager.beginTransaction()
                .replace(R.id.fm_med_cal_firstpage, MedCal_FirstPage_fagment())
                .commit()
        }
        initView()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initValue()
        initListener()
        initSearchData()
        setupSearch()
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback)
    }

    private fun initView() {
        viewLeft = ChildView(requireContext())
        expandTabView = binding.expandtabView
    }

    private fun initListener() {
        viewLeft.setOnSelectListener { showText ->
            showText?.let { onRefresh(viewLeft, it) }
        }
    }

    private fun setupSearch() {
        val allTitles = searchEntries.keys.toList()
        val adapter = object : ArrayAdapter<String>(requireContext(), android.R.layout.simple_dropdown_item_1line, ArrayList(allTitles)) {
            override fun getFilter(): Filter {
                return object : Filter() {
                    override fun performFiltering(constraint: CharSequence?): FilterResults {
                        val results = FilterResults()
                        val suggestions = if (constraint.isNullOrEmpty()) {
                            allTitles
                        } else {
                            allTitles.filter { it.contains(constraint, ignoreCase = true) }
                        }
                        results.values = suggestions
                        results.count = suggestions.size
                        return results
                    }

                    @Suppress("UNCHECKED_CAST")
                    override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                        clear()
                        if (results != null && results.count > 0) {
                            addAll(results.values as List<String>)
                        }
                        notifyDataSetChanged()
                    }
                }
            }
        }

        binding.etSearch.setAdapter(adapter)
        binding.etSearch.setOnItemClickListener { parent, _, position, _ ->
            val selectedTitle = parent.getItemAtPosition(position) as String
            searchEntries[selectedTitle]?.invoke()?.let { fragment ->
                onBackPressedCallback.isEnabled = true
                add_hide_fragment(childFragmentManager, fragment, R.id.fm_med_cal_firstpage)
                binding.etSearch.setText("")
            }
        }
    }

    private fun initSearchData() {
        // Gynecology
        searchEntries["宫颈癌TNM分期"] = { CervicalCancerTNMStage_fm() }
        searchEntries["宫颈癌分期（FIGO,2018）"] = { CervicalCancerStageFigo2018_fm() }
        searchEntries["宫颈癌分期（FIGO,2014）"] = { CervicalCancerStageFigo2014_fm() }
        searchEntries["紧急避孕药物剂量与方案"] = { Emergency_Contraceptive_Pill_Dosage_fm() }
        searchEntries["卵巢癌TNM分期"] = { OvarianCancerTnmStage_fm() }
        searchEntries["子宫体肿瘤TNM分期"] = { Uterine_TumorsTnmStage_fm() }
        searchEntries["卵巢癌、输卵管癌和腹膜癌的分期系统"] = { Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm() }
        searchEntries["POP-Q分期法（盆腔器官脱垂分期）"] = { POPQStage() }
        searchEntries["改良Kupperman指数"] = { Menopausal_symptom_scoring_Kupperman_index_fm() }
        searchEntries["子宫内膜癌分期（FIGO,2014）"] = { Endometrial_cancer_staging_fm() }
        searchEntries["Baden-Walker盆底器官分级法"] = { Baden_Walker_vaginal_half_step_systematic_grading_of_pelvic_floor_fm() }
        searchEntries["MRS评分（更年期评定量表）"] = { Menopause_Rating_Scale_fm() }
        searchEntries["TBS分类（宫颈细胞学检查）"] = { Tbs_classification_fm() }
        searchEntries["OHSS的分度与分级（Golan分类）"] = { Ohss_Grading_and_grading() }
        searchEntries["子宫内膜异位症的分期（R-AFS分期）"] = { Staging_of_endometriosis_rAFS_staging_fm() }
        searchEntries["POP-Q分期（盆腔器官脱垂评估指示点）"] = { Popq_Indicator_pointsPelvic_organ_prolapse_assessment_fm() }
        searchEntries["滋养细胞肿瘤改良预后评分系统"] = { Trophoblastic_tumors_Figo_modified_prognostic_scoring_system_fm() }
        searchEntries["盆腔炎性疾病PID诊断标准"] = { Pid_Diagnostic_Criteria_fm() }
        searchEntries["Insler评分（宫颈雌激素作用程度评分法）"] = { Insler_Cervical_Estrogen_Effect_Scale_fm() }
        searchEntries["未成熟畸胎瘤的分级方法"] = { Immature_TeratomasGrading_method_for_fm() }
        searchEntries["外阴癌TNM分期"] = { Vulvar_Cancer_Tnm_stage_fm() }
        searchEntries["外阴阴道假丝酵母菌VVC临床分类"] = { Vvc_Classification_fm() }
        searchEntries["阴道癌TNM分期"] = { Vaginal_Cancer_Tnm_Stage_fm() }
        searchEntries["RCI（Reid阴道镜评分标准）"] = { Reid_Colposcopy_Scoring_Criteria_fm() }
        searchEntries["经前焦虑障碍PMDD诊断标准"] = { Pmdd_Diagnostic_Criteria_fm() }
        searchEntries["VVC临床表现评分标准"] = { Vvc_Scoring_Criteria_fm() }
        searchEntries["滋养细胞肿瘤解剖学分期"] = { Trophoblastic_Tumors_Anatomical_staging_fm() }
        searchEntries["子宫肉瘤分期"] = { Uterine_Sarcoma_Staging_fm() }
        searchEntries["Julian分级法（阴道穹窿膨出）"] = { Vaginal_Vault_Bulging_Julian_Classification_fm() }
        searchEntries["输卵管癌手术病理分期"] = { Fallopian_Tube_Cancer_surgery_pathological_staging_fm() }
        searchEntries["妊娠滋养细胞肿瘤TNM分期"] = { Gestational_Trophoblastic_Tumor_Tnm_stage_fm() }
        searchEntries["Nugent评分标准"] = { Nugent_Scoring_Criteria_fm() }
        searchEntries["外阴癌分期（FIGO,2014）"] = { Vulvar_cancer_staging_Figo_2014_fm() }
        searchEntries["输卵管肿瘤TNM分期"] = { Fallopian_tube_tumors_Tnm_Stage_fm() }
        searchEntries["外阴皮肤疾病分类法"] = { Vulvar_skin_diseases_Classification_fm() }
        searchEntries["阴道癌分期（FIGO/UICC）"] = { Vaginal_Cancer_Staging_Figo_Uicc_fm() }
        searchEntries["外阴鳞状上皮内瘤变分类及特征"] = { Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm() }

        // Obstetrics
        searchEntries["BISHOP评分"] = { Bishop_fm() }
        searchEntries["妊娠期高血压分类"] = { Classification_Of_Hypertension_During_Pregnancy_fm() }
        searchEntries["产褥期抑郁症诊断标准"] = { Diagnosis_Postnatal_Depression_fm() }
        searchEntries["妊娠期糖尿病诊断标准（GDM）"] = { Diagnostic_Criteria_For_GDM_fm() }
        searchEntries["孕期用药对胎儿的影响"] = { DrugToFetus_fm() }
        searchEntries["爱丁堡产后抑郁量表（EPDS）"] = { Edinburgh_Postnatal_Depression_Scale_fm() }
        searchEntries["胎儿成熟度监测"] = { Fetal_Maturity_fm() }
        searchEntries["妊娠期糖尿病分级分期"] = { GDM_Grading_And_Staging_fm() }
        searchEntries["妊娠期甲状腺功能实验室检查"] = { Thyroid_Function_Of_Pregnancy_fm() }
        searchEntries["不同妊娠周数的宫底高度及子宫长度"] = { Uterine_Height_Gestational_Age_fm() }
        searchEntries["胎儿发育指数"] = { Fetal_developmental_index_fm() }
        searchEntries["简易胎龄评估表"] = { Simple_gestational_age_assessment_scale_fm() }

        // Nephrology
        searchEntries["补水量"] = { AmountOfHydration_fm() }
        searchEntries["慢性肾病CKD分期"] = { Chronic_Kidney_Disease_Staging_fm() }
        searchEntries["肌酐清除率(Cockcroft-Gault)"] = { Creatinine_Clearance_Cockcroft_Gault_fm() }
        searchEntries["肾小球滤过率CKD-EPI"] = { Glomerular_Filtration_Rate_CKD_EPI_fm() }
        searchEntries["低钠血症补钠量"] = { SodiumDeficitInHyponatremia_fm() }

        // Endocrinology
        searchEntries["糖化血红蛋白评估平均血糖"] = { HbA1cValuesBloodGlucose_fm() }

        // Comprehensive
        searchEntries["体表面积"] = { BodySurfaceArea_fm() }
        searchEntries["常用单位换算"] = { Unit_Conversion_fm() }
        searchEntries["标准体重IBW"] = { standard_weight_fm() }
        
        // Reproductive Medicine
        searchEntries["人类精液变量参考值"] = { Semen_reference_values_fm() }
        searchEntries["Tanner分期（女性性发育）"] = { Tanner_Stage_fm() }
        searchEntries["性早熟疾病的辅助检查结果"] = { Precocious_Puberty_Auxiliary_Examination_fm() }
    }

    private fun onRefresh(view: View, showText: String) {
        expandTabView.onPressBack()
        val position = mViewArray.indexOf(view)
        if (position >= 0 && expandTabView.getTitle(position) != showText) {
            expandTabView.setTitle(showText, position)
        }

        getFragmentByTitle(expandTabView.getTitle(position))?.let {
            onBackPressedCallback.isEnabled = true
            childFragmentManager.beginTransaction()
                .replace(R.id.fm_med_cal_firstpage, it)
                .commit()
        }
    }

    private fun getFragmentByTitle(title: String?): Fragment? = when (title) {
        "妇产科综合" -> Obstetrics_and_Gynecology_Menu()
        "妇科" -> Gynecology_Menu()
        "产科" -> Obstetrics_Menu()
        "常用计算" -> Common_Use()
        "大内科" -> General_Internal_Medicine_Menu()
        "呼吸内科" -> Respiratory_medicine_Menu()
        "心血管内科" -> Cardiovascular_Medicine_Menu()
        "消化内科" -> Gastroenterology_Menu()
        "血液内科" -> Hematology_Menu()
        "肾内科" -> Nephrology_Menu()
        "内分泌科" -> Endocrinology_Menu()
        "风湿免疫科" -> Rheumatology_and_Immunology_Menu()
        "老年医学科" -> Geriatric_Medicine_Menu()
        "神经内科" -> Neurology_Menu()
        "普通外科" -> general_surgery_Menu()
        "骨科" -> orthopedics_Menu()
        "泌尿外科" -> Urology_Menu()
        "胸外科" -> Thoracic_Surgery_Menu()
        "神经外科" -> neurosurgery_Menu()
        "血管外科" -> Vascular_Surgery_Menu()
        "烧伤科" -> Burn_Department_Menu()
        "肝胆外科" -> Hepatobiliary_Surgery_Menu()
        "肛肠外科" -> Anorectal_surgery_Menu()
        "小儿综合内科" -> General_Pediatric_Internal_Medicine_Menu()
        "小儿综合外科" -> General_Pediatric_Surgery_Menu()
        "新生儿科" -> Neonatology_Menu()
        "小儿内分泌科" -> Pediatric_Endocrinology_Menu()
        "小儿免疫科" -> Pediatric_Immunology_Department_Menu()
        "小儿骨科" -> Pediatric_Orthopedics_Menu()
        "小儿心内科" -> Pediatric_Cardiovascular_Medicine_Menu()
        "小儿急诊科" -> Pediatric_Emergency_Department_Menu()
        "儿童保健科" -> Pediatric_Health_Department_Menu()
        "肿瘤科" -> Oncology_Menu()
        "眼科" -> ophthalmology_Menu()
        "急诊科" -> Emergency_department_Menu()
        "麻醉疼痛科" -> Anesthesia_Department_Menu()
        "重症医学科" -> Department_of_Critical_Care_Medicine_Menu()
        "皮肤性病科" -> Dermatology_and_Venereology_Menu()
        "耳鼻喉头颈科" -> Otolaryngology_Menu()
        "精神心理科" -> Department_of_Psychiatry_Menu()
        "检验科" -> Laboratory_department_Menu()
        "病理科" -> Pathology_Department_Menu()
        "药剂科" -> Pharmacy_Department_Menu()
        "医学影像科" -> Medical_Imaging_Department_Menu()
        "核医学科" -> Nuclear_Medicine_Menu()
        "超声科" -> Ultrasound_Department_Menu()
        "介入科" -> Interventional_Department_Menu()
        "康复科" -> Rehabilitation_Department_Menu()
        "营养科" -> Department_of_Nutrition_Menu()
        "生殖医学科" -> Reproductive_Medicine_Menu()
        "男科" -> Andrology_Menu()
        else -> null
    }

    private fun initValue() {
        mViewArray.clear()
        mViewArray.add(viewLeft)
        expandTabView.setValue(arrayListOf("根据科室选择"), ArrayList(mViewArray))
        expandTabView.setTitle(viewLeft.showText, 0)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
