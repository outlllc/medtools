package com.duckgo.medtools.medicaltools

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.MedCal_FirstPage_fagment
import com.duckgo.medtools.Med_Cal_Fragment_Adaptor
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentMedicalCalculatorBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology.Obstetrics_and_Gynecology_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Reproductive_Medicine.Reproductive_Medicine_Menu
import com.duckgo.medtools.medicaltools.A_Menu_Select.common_use.Common_Use
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
import com.duckgo.medtools.util.add_hide_fragment
import com.duckgo.medtools.view.ChildView
import com.duckgo.medtools.view.ExpandTabView

class MenuFragment: Fragment(), Med_Cal_Fragment_Adaptor.onItemClickListener{

    lateinit var expandTabView: ExpandTabView
    var mViewArray: ArrayList<View> = ArrayList()
    lateinit var viewLeft: ChildView
    lateinit var rv_medical_calculator : RecyclerView
    lateinit var mfragmentManager: FragmentManager
    lateinit var binding:FragmentMedicalCalculatorBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMedicalCalculatorBinding.inflate(inflater, container, false)
        var mfragmentManager = childFragmentManager
        mfragmentManager.beginTransaction().replace(R.id.fm_med_cal_firstpage, MedCal_FirstPage_fagment())
            .addToBackStack(null)
            ?.commit()
        initView(binding.root)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVaule()
        initListener()

        val dataset = arrayOf("综合", "肌酐清除率(Cockcroft-Gault)", "体表面积", "补水量", "低钠血症补钠量",
            "肾小球滤过率CKD-EPI", "慢性肾病CKD分期", "糖化血红蛋白评估平均血糖", "BISHOP评分", "妊娠期高血压分类",
            "重度子痫前期诊断", "妊娠期高血糖诊断标准（GDM）", "妊娠期糖尿病分级分期", "妊娠高血压终止妊娠的指征", "妊娠期甲状腺功能实验室检查",
            "胎儿生物物理监测Manning评分","正常恶露性状", "孕期用药对胎儿的影响","胎儿成熟度监测", "Rh 和 ABO 溶血病的比较",
            "妊娠期甲亢程度和用药剂量间的关系", "EPDS（爱丁堡产后抑郁量表）","不同妊娠周数的宫底高度及子宫长度", "产褥期抑郁症诊断标准", "人类精液变量参考值",
            "tanner分期（女性性发育）", "性早熟疾病的辅助检查结果", "常用单位换算")
        rv_medical_calculator = view.findViewById(R.id.rv_medical_calculator)
        rv_medical_calculator.layoutManager= LinearLayoutManager(context , LinearLayoutManager.VERTICAL, false)
        rv_medical_calculator.adapter = Med_Cal_Fragment_Adaptor(activity as Context, this, dataset)
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
        when(positionTitle){
            "妇产科综合" -> {
                val fragment = Obstetrics_and_Gynecology_Menu()
                add_hide_fragment(mfragmentManager, fragment)
            }
            "常用计算" -> {
                val fragment = Common_Use()
                add_hide_fragment(mfragmentManager, fragment)
            }
            // 内科
            "大内科" -> {

            }
            "呼吸内科" -> {

            }
            "心血管内科" -> {

            }
            "消化内科" -> {

            }
            "血液内科" -> {

            }
            "肾内科" -> {

            }
            "内分泌科" -> {

            }
            "风湿免疫科" -> {

            }
            "老年医学科" -> {

            }
            "神经内科" -> {

            }
            //  外科
            "大外科" -> {

            }
            "普通外科" -> {

            }
            "骨科" -> {

            }
            "泌尿外科" -> {

            }
            "胸外科" -> {

            }
            "神经外科" -> {

            }
            "血管外科" -> {

            }
            "烧伤科" -> {

            }
            "肝胆外科" -> {

            }
            "肛肠外科" -> {

            }
            // 儿科
            "小儿综合内科" -> {

            }
            "小儿综合外科" -> {

            }
            "新生儿科" -> {

            }
            "小儿心内科" -> {

            }
            "小儿内分泌科" -> {

            }
            "小儿免疫科" -> {

            }
            "小儿骨科" -> {

            }
            "小儿急诊科" -> {

            }
            "儿童保健科" -> {

            }
            //肿瘤科
            "肿瘤科" -> {

            }
            //眼科
            "眼科" -> {

            }
            //急诊科
            "急诊科" -> {

            }
            //麻醉疼痛科
            "麻醉疼痛科" -> {

            }
            //重症医学科
            "重症医学科" -> {

            }
            //皮肤性病科
            "皮肤性病科" -> {

            }
            //耳鼻喉头颈科
            "耳鼻喉头颈科" -> {

            }
            //精神心理科
            "精神心理科" -> {

            }
            //辅助科室
            "检验科" -> {

            }
            "病理科" -> {

            }
            "药剂科" -> {

            }
            "医学影像科" -> {

            }
            "核医学科" -> {

            }
            "超声科" -> {

            }
            "介入科" -> {

            }
            //其他科室
            "康复科" -> {

            }
            "营养科" -> {

            }
            "生殖医学科" -> {
                val fragment = Reproductive_Medicine_Menu()
                add_hide_fragment(mfragmentManager, fragment)
            }
            "男科" -> {

            }

        }
    }

    private fun inflateFragment(fragment: Fragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
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
        mfragmentManager = requireActivity().supportFragmentManager
    }

    override fun onItemClick(position: Int) {
        when(position){
            0 -> {
                //综合
                popupMenu(requireView())
            }
            1 -> {
                //肌酐清除率(Cockcroft-Gault)
                val fragment = Creatinine_Clearance_Cockcroft_Gault_fm()
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

    fun popupMenu(view: View){
        val popupMenu = android.widget.PopupMenu(context, view)
        popupMenu.menuInflater.inflate(R.menu.med_cal_menu, popupMenu.menu)
        popupMenu.setGravity(Gravity.RIGHT)
        popupMenu.show()
        popupMenu.setOnMenuItemClickListener {
                item ->
            when(item.itemId) {
                R.id.med_cal_menu -> {
                    Toast.makeText(context, "Medical Calculator", Toast.LENGTH_SHORT).show()
                    return@setOnMenuItemClickListener true
                }
                else -> {
                    return@setOnMenuItemClickListener false}
            }
        }
    }
}