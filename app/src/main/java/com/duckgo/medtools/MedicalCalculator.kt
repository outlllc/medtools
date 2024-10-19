package com.duckgo.medtools

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.Internal_Medicine.Endocrinology.HbA1cValuesBloodGlucose
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.AmountOfHydration
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Chronic_Kidney_Disease_Staging
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Creatinine_Clearance_Cockcroft_Gault
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Glomerular_Filtration_Rate_CKD_EPI
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.SodiumDeficitInHyponatremia
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
import com.duckgo.medtools.medicaltools.comprehensive.BodySurfaceArea_fm
import com.duckgo.medtools.medicaltools.comprehensive.Unit_Conversion

class MedicalCalculator: Fragment(), Med_Cal_Fragment_Adaptor.onItemClickListener {

    lateinit var rv_medical_calculator :RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_medical_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataset = arrayOf("综合", "肌酐清除率(Cockcroft-Gault)", "体表面积", "补水量", "低钠血症补钠量", "肾小球滤过率CKD-EPI", "慢性肾病CKD分期",
            "糖化血红蛋白评估平均血糖", "BISHOP评分", "妊娠期高血压分类",  "重度子痫前期诊断", "妊娠期高血糖诊断标准（GDM）",
            "妊娠期糖尿病分级分期", "妊娠高血压终止妊娠的指征", "妊娠期甲状腺功能实验室检查",
            "胎儿生物物理监测Manning评分","正常恶露性状", "孕期用药对胎儿的影响","胎儿成熟度监测",
             "Rh 和 ABO 溶血病的比较", "妊娠期甲亢程度和用药剂量间的关系", "EPDS（爱丁堡产后抑郁量表）","不同妊娠周数的宫底高度及子宫长度",
            "产褥期抑郁症诊断标准", "人类精液变量参考值(WHO, 2011)", "tanner分期（女性性发育）", "性早熟疾病的辅助检查结果", "常用单位换算")
        rv_medical_calculator = view.findViewById(R.id.rv_medical_calculator)
        rv_medical_calculator.layoutManager= LinearLayoutManager(context , LinearLayoutManager.VERTICAL, false)
        rv_medical_calculator.adapter = Med_Cal_Fragment_Adaptor(activity as Context, this, dataset)






        rv_medical_calculator.addOnItemTouchListener(RecyclerItemClickListener(context, rv_medical_calculator,
            object : RecyclerItemClickListener.OnItemClickListener
                {
                    override fun onItemClick(view: View?, position: Int) {

                        when(position){
                            0 -> {
                                popupMenu(view!!)
                            }
                        }
                    }
                }))
    }

    override fun onItemClick(position: Int) {
        when(position){
            0 -> {
                //综合
                popupMenu(requireView())
            }
            1 -> {
                //肌酐清除率(Cockcroft-Gault)
                val intent = Intent(activity, Creatinine_Clearance_Cockcroft_Gault::class.java)
                startActivity(intent)
            }
            2 -> {
                //体表面积
                val fragment = BodySurfaceArea_fm()
                inflateFragment(fragment)
            }
            3 -> {
                //补水量
                val intent = Intent(activity, AmountOfHydration::class.java)
                startActivity(intent)
            }
            4 -> {
                //低钠血症补钠量
                val intent = Intent(activity, SodiumDeficitInHyponatremia::class.java)
                startActivity(intent)
            }
            5 -> {
                //肾小球滤过率CKD-EPI
                val intent = Intent(activity, Glomerular_Filtration_Rate_CKD_EPI::class.java)
                startActivity(intent)
            }
            6 -> {
                //慢性肾病CKD分期
                val intent = Intent(activity, Chronic_Kidney_Disease_Staging::class.java)
                startActivity(intent)
            }
            7 -> {
                //糖化血红蛋白评估平均血糖
                val intent = Intent(activity, HbA1cValuesBloodGlucose::class.java)
                startActivity(intent)
            }
            8 -> {
                //BISHOP评分
                val intent = Intent(activity, Bishop::class.java)
                startActivity(intent)
            }
            9 -> {
                //妊娠期高血压分类
                val intent = Intent(activity, Classification_Of_Hypertension_During_Pregnancy::class.java)
                startActivity(intent)
            }
            10 -> {
                //重度子痫前期诊断
                val intent = Intent(activity, Severe_Preeclampsia_Diagnosis::class.java)
                startActivity(intent)
            }
            11 -> {
                //妊娠期高血糖诊断标准（GDM）
                val intent = Intent(activity, Diagnostic_Criteria_For_GDM::class.java)
                startActivity(intent)
            }
            12 -> {
                //妊娠期糖尿病分级分期
                val intent = Intent(activity, GDM_Grading_And_Staging::class.java)
                startActivity(intent)
            }
            13 -> {
                //妊娠高血压终止妊娠的指征
                val intent = Intent(activity, Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension::class.java)
                startActivity(intent)
            }
            14 -> {
                //妊娠期甲状腺功能实验室检查
                val intent = Intent(activity, Thyroid_Function_Of_Pregnancy::class.java)
                startActivity(intent)
            }
            15 -> {
                //胎儿生物物理监测Manning评分
                val intent = Intent(activity, Manning_Score::class.java)
                startActivity(intent)
            }
            16 -> {
                //正常恶露性状
                val intent = Intent(activity, Normal_Lochia::class.java)
                startActivity(intent)
            }
            17 -> {
                //孕期用药对胎儿的影响
                val intent = Intent(activity, DrugToFetus::class.java)
                startActivity(intent)
            }
            18 -> {
                //胎儿成熟度监测
                val intent = Intent(activity, Fetal_Maturity::class.java)
                startActivity(intent)
            }
            19 -> {
                //Rh 和 ABO 溶血病的比较
                val intent = Intent(activity, RH_And_ABO_Hemolysis_Comparison::class.java)
                startActivity(intent)
            }
            20 -> {
                //妊娠期甲亢程度和用药剂量间的关系
                val intent = Intent(activity, Hyperthyroidism_Medication_During_Pregnancy::class.java)
                startActivity(intent)
            }
            21 -> {
                //EPDS（爱丁堡产后抑郁量表）
                val intent = Intent(activity, Edinburgh_Postnatal_Depression_Scale::class.java)
                startActivity(intent)
            }
            22 -> {
                //不同妊娠周数的宫底高度及子宫长度
                val intent = Intent(activity, Uterine_Height_Gestational_Age::class.java)
                startActivity(intent)
            }
            23 -> {
                //产褥期抑郁症诊断标准
                val intent = Intent(activity, Diagnosis_Postnatal_Depression::class.java)
                startActivity(intent)
            }
            24 -> {
                //人类精液变量参考值(WHO, 2011)
                val intent = Intent(activity, Semen_reference_values::class.java)
                startActivity(intent)
            }
            25 -> {
                //tanner分期（女性性发育）
                val intent = Intent(activity, Tanner_Stage::class.java)
                startActivity(intent)
            }
            26 -> {
                //性早熟疾病的辅助检查结果
                val intent = Intent(activity, Precocious_Puberty_Auxiliary_Examination::class.java)
                startActivity(intent)
            }
            27 -> {
                val fragment = Unit_Conversion()
                val transaction = activity?.supportFragmentManager?.beginTransaction()
                transaction?.replace(R.id.fragment_, fragment)
//                transaction?.addToBackStack(null)
                transaction?.commit()
            }
        }

    }
    private fun inflateFragment(fragment: Fragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
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

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    //    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater.inflate(R.menu.med_cal_menu, menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        var item_id = item.itemId
//        when(item_id){
//            R.id.med_cal_menu -> {
//                Toast.makeText(context, "Medical Calculator", Toast.LENGTH_SHORT).show()
//                return true
//            }
//
//        }
//        return super.onOptionsItemSelected(item)
//    }
}
class RecyclerItemClickListener(context: Context?, rvMedicalCalculator: RecyclerView?, listener: RecyclerItemClickListener.OnItemClickListener) : RecyclerView.OnItemTouchListener {
    private val listener: OnItemClickListener = listener

    interface OnItemClickListener {
        fun onItemClick(view: View?, position: Int)

    }
    //        var gestureDetector = GestureDetector(
//            context, object : GestureDetector.SimpleOnGestureListener() {
//                override fun onSingleTapUp(e: MotionEvent): Boolean {
//                    if (mChildView != null && listener != null) {
//                        pos = mRecyclerView.getChildAdapterPosition(mChildView);
//
//                        if (pos != RecyclerView.NO_POSITION) {
//                            mListener.onItemClick(mChildView, pos);
//                            return true;
//                        }
//                    }
//                    return false;
//                }
//            }
//        )
    override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
        return false
    }

    override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {

    }

    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {

    }
}