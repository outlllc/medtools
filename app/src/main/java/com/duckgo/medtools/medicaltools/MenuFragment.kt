package com.duckgo.medtools.medicaltools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.duckgo.medtools.MedCal_FirstPage_fagment
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
import com.duckgo.medtools.view.ChildView
import com.duckgo.medtools.view.ExpandTabView


class MenuFragment: Fragment(){

    lateinit var expandTabView: ExpandTabView
    var mViewArray: ArrayList<View> = ArrayList()
    lateinit var viewLeft: ChildView
    lateinit var mfragmentManager: FragmentManager
    lateinit var binding:FragmentMedicalCalculatorBinding

    // 监听返回键的回调
    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            // 如果内部管理器有回退记录（例如 Bishop评分），则弹出
            if (mfragmentManager.backStackEntryCount > 0) {
                mfragmentManager.popBackStack()
            } else {
                // 如果没有，说明已经在科室列表页，禁用回调并让 Activity 处理返回（退出计算器）
                isEnabled = false
                requireActivity().onBackPressedDispatcher.onBackPressed()
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMedicalCalculatorBinding.inflate(inflater, container, false)
        mfragmentManager = childFragmentManager

        if (savedInstanceState == null) {
            mfragmentManager.beginTransaction()
                .replace(R.id.fm_med_cal_firstpage, MedCal_FirstPage_fagment())
                .commit()
        }

        initView(binding.root)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVaule()
        initListener()
        // 注册返回键回调
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback)
    }

    private fun initView(view: View) {
        viewLeft = ChildView(activity)
        expandTabView = view.findViewById(R.id.expandtab_view)
    }

    private fun initListener() {
        viewLeft.setOnSelectListener(object : ChildView.OnSelectListener {
            override fun getValue(showText: String?) {
                onRefresh(viewLeft, showText!!)
            }
        })
    }

    fun onRefresh(view: View, showText: String) {
        expandTabView.onPressBack() 
        var position = getPositon(view)
        if (position >= 0 && !expandTabView.getTitle(position).equals(showText)) {
            expandTabView.setTitle(showText, position)
        }
        var positionTitle = expandTabView.getTitle(position)
        
        val fragment: Fragment? = when(positionTitle){
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

        fragment?.let {
            // 科室切换开启回调监听
            onBackPressedCallback.isEnabled = true
            mfragmentManager.beginTransaction()
                .replace(R.id.fm_med_cal_firstpage, it)
                .commit()
        }
    }

    fun getPositon(tView: View): Int {
        for (i in 0 until mViewArray.size){
            if (mViewArray[i] == tView){
                return i
            }
        }
        return -1
    }

    private fun initVaule() {
        mViewArray.add(viewLeft)
        var mTextArray: ArrayList<String> = ArrayList()
        mTextArray.add("根据科室选择")
        expandTabView.setValue(mTextArray, mViewArray)
        expandTabView.setTitle(viewLeft.showText, 0)
    }
}