package com.duckgo.medtools.medicaltools

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Filter
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentMedicalCalculatorBinding
import com.duckgo.medtools.medicaltools.basefragment.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Anesthesia_Department.Anesthesia_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Interventional_Department.Interventional_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Laboratory_department.Laboratory_department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Medical_Imaging_Department.Medical_Imaging_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Nuclear_Medicine.Nuclear_Medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Pathology_Department.Pathology_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Pharmacy_Department.Pharmacy_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Auxiliary_departments.Ultrasound_Department.Ultrasound_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Department_of_Critical_Care_Medicine.Department_of_Critical_Care_Medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Department_of_Psychiatry.Department_of_Psychiatry_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Dermatology_and_Venereology.Dermatology_and_Venereology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Cardiovascular_Medicine.Cardiovascular_Medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Endocrinology.Endocrinology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Gastroenterology.Gastroenterology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.General_Internal_Medicine.General_Internal_Medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Geriatric_Medicine.Geriatric_Medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Hematology.Hematology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Nephrology.Nephrology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Neurology.Neurology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Respiratory_medicine.Respiratory_medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Rheumatology_and_Immunology.Rheumatology_and_Immunology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Obstetrics_and_Gynecology.Gynecology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Obstetrics_and_Gynecology.Obstetrics_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Obstetrics_and_Gynecology.Obstetrics_and_Gynecology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Oncology.Oncology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Other.Andrology.Andrology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Other.Department_of_Nutrition.Department_of_Nutrition_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Other.Rehabilitation_Department.Rehabilitation_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Other.Reproductive_Medicine.Reproductive_Medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Otolaryngology.Otolaryngology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.General_Pediatric_Internal_Medicine.General_Pediatric_Internal_Medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.General_Pediatric_Surgery.General_Pediatric_Surgery_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Neonatology.Neonatology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Cardiovascular_Medicine_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Emergency_Department.Pediatric_Emergency_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Endocrinology.Pediatric_Endocrinology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Health_Department.Pediatric_Health_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Immunology_Department.Pediatric_Immunology_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.Pediatrics.Pediatric_Orthopedics.Pediatric_Orthopedics_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.common_use.Common_Use
import com.duckgo.medtools.medicaltools.expandtabviewmenu.emergency_department.Emergency_department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.ophthalmology.ophthalmology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Anorectal_surgery.Anorectal_surgery_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Burn_Department.Burn_Department_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Hepatobiliary_Surgery.Hepatobiliary_Surgery_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Thoracic_Surgery.Thoracic_Surgery_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Urology.Urology_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.Vascular_Surgery.Vascular_Surgery_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.general_surgery.general_surgery_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.neurosurgery.neurosurgery_Menu
import com.duckgo.medtools.medicaltools.expandtabviewmenu.surgical.orthopedics.orthopedics_Menu
import com.duckgo.medtools.view.ChildView
import com.duckgo.medtools.view.ExpandTabView
import com.duckgo.medtools.util.addHideFragment
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology.*
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.*
import com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Nephrology.*
import com.duckgo.medtools.medicaltools.functions.comprehensive.*
import com.duckgo.medtools.medicaltools.functions.Internal_Medicine.Endocrinology.HbA1cValuesBloodGlucose_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine.Tanner_Stage_fm

class MenuFragment : Fragment(), MenuSelectAdapter.OnItemClickListener {

    private var _binding: FragmentMedicalCalculatorBinding? = null
    private val binding get() = _binding!!
    private lateinit var expandTabView: ExpandTabView
    private lateinit var viewLeft: ChildView
    private val mViewArray = mutableListOf<View>()

    private val searchEntries = mutableMapOf<String, () -> Fragment>()
    
    // 首页列表数据映射表：标题和构造器的列表
    private val mainPageItems = mutableListOf<Pair<String, () -> Fragment>>()
    private lateinit var menuAdapter: MenuSelectAdapter

    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            if (childFragmentManager.backStackEntryCount > 0) {
                childFragmentManager.popBackStack()
            } else {
                isEnabled = false
                requireActivity().onBackPressedDispatcher.onBackPressed()
                isEnabled = true
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMedicalCalculatorBinding.inflate(inflater, container, false)
        initView()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initValue()
        initListener()
        fillSearchEntries(searchEntries)
        initMainPageData() // 初始化映射表
        setupSearch()
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback)

        // 初始化 RecyclerView，使用通用的 MenuSelectAdapter
        menuAdapter = MenuSelectAdapter(this)
        binding.rvMedCalFirstpage.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = menuAdapter
        }
        menuAdapter.submitList(mainPageItems.map { it.first })

        childFragmentManager.addOnBackStackChangedListener {
            if (childFragmentManager.backStackEntryCount == 0) {
                binding.rvMedCalFirstpage.visibility = View.VISIBLE
                binding.fmMedCalFirstpage.visibility = View.GONE
            } else {
                binding.rvMedCalFirstpage.visibility = View.GONE
                binding.fmMedCalFirstpage.visibility = View.VISIBLE
            }
        }
    }

    private fun initMainPageData() {
        mainPageItems.clear()
        mainPageItems.add("肌酐清除率(Cockcroft-Gault)" to { Creatinine_Clearance_Cockcroft_Gault_fm() })
        mainPageItems.add("体表面积" to { BodySurfaceArea_fm() })
        mainPageItems.add("补水量" to { AmountOfHydration_fm() })
        mainPageItems.add("低钠血症补钠量" to { SodiumDeficitInHyponatremia_fm() })
        mainPageItems.add("肾小球滤过率CKD-EPI" to { Glomerular_Filtration_Rate_CKD_EPI_fm() })
        mainPageItems.add("慢性肾病CKD分期" to { Chronic_Kidney_Disease_Staging_fm() })
        mainPageItems.add("糖化血红蛋白评估平均血糖" to { HbA1cValuesBloodGlucose_fm() })
        mainPageItems.add("BISHOP评分" to { Bishop_fm() })
        mainPageItems.add("妊娠期高血压分类" to { Classification_Of_Hypertension_During_Pregnancy_fm() })
        mainPageItems.add("重度子痫前期诊断" to { Severe_Preeclampsia_Diagnosis_fm() })
        mainPageItems.add("妊娠期高血糖诊断标准（GDM）" to { Diagnostic_Criteria_For_GDM_fm() })
        mainPageItems.add("妊娠期糖尿病分级分期" to { GDM_Grading_And_Staging_fm() })
        mainPageItems.add("妊娠高血压终止妊娠的指征" to { Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm() })
        mainPageItems.add("妊娠期甲状腺功能实验室检查" to { Thyroid_Function_Of_Pregnancy_fm() })
        mainPageItems.add("胎儿生物物理监测Manning评分" to { Manning_Score_fm() })
        mainPageItems.add("正常恶露性状" to { Normal_Lochia_fm() })
        mainPageItems.add("孕期用药对胎儿的影响" to { DrugToFetus_fm() })
        mainPageItems.add("胎儿成熟度监测" to { Fetal_Maturity_fm() })
        mainPageItems.add("Rh 和 ABO 溶血病的比较" to { RH_And_ABO_Hemolysis_Comparison_fm() })
        mainPageItems.add("妊娠期甲亢程度和用药剂量间的关系" to { Hyperthyroidism_Medication_During_Pregnancy_fm() })
        mainPageItems.add("EPDS（爱丁堡产后抑郁量表）" to { Edinburgh_Postnatal_Depression_Scale_fm() })
        mainPageItems.add("不同妊娠周数的宫底高度及子宫长度" to { Uterine_Height_Gestational_Age_fm() })
        mainPageItems.add("产褥期抑郁症诊断标准" to { Diagnosis_Postnatal_Depression_fm() })
        mainPageItems.add("人类精液变量参考值" to { Semen_reference_values_fm() })
        mainPageItems.add("tanner分期（女性性发育）" to { Tanner_Stage_fm() })
        mainPageItems.add("性早熟疾病的辅助检查结果" to { Precocious_Puberty_Auxiliary_Examination_fm() })
        mainPageItems.add("常用单位换算" to { Unit_Conversion_fm() })
        mainPageItems.add("盆腔器官脱垂分期（POP-Q分期法）" to { POPQStage() })
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

    override fun onItemClick(position: Int) {
        if (position in mainPageItems.indices) {
            val fragment = mainPageItems[position].second()
            navigateToDetail(fragment)
        }
    }

    private fun navigateToDetail(fragment: Fragment) {
        onBackPressedCallback.isEnabled = true
        binding.rvMedCalFirstpage.visibility = View.GONE
        binding.fmMedCalFirstpage.visibility = View.VISIBLE
        hideKeyboard()
        childFragmentManager.addHideFragment(fragment, R.id.fm_med_cal_firstpage)
    }

    private fun hideKeyboard() {
        val imm = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        imm?.hideSoftInputFromWindow(binding.etSearch.windowToken, 0)
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
                navigateToDetail(fragment)
                binding.etSearch.setText("")
            }
        }
    }

    private fun onRefresh(view: View, showText: String) {
        expandTabView.onPressBack()
        val position = mViewArray.indexOf(view)
        val oldTitle = expandTabView.getTitle(position)
        
        if (position >= 0 && oldTitle != showText) {
            expandTabView.setTitle(showText, position)
            getFragmentByTitle(showText)?.let {
                navigateToDetail(it)
            }
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
