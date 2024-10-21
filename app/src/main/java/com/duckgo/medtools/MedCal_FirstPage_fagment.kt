package com.duckgo.medtools

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcalFirstpageFagmentBinding
import com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology.Creatinine_Clearance_Cockcroft_Gault_fm

class MedCal_FirstPage_fagment: Fragment(), Med_Cal_Fragment_Adaptor.onItemClickListener {
    lateinit var binding: MedcalFirstpageFagmentBinding



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
    }

    override fun onItemClick(position: Int) {
        when(position) {
            0 -> {
                //综合
            }

            1 -> {
                //肌酐清除率(Cockcroft-Gault)
//                val mchildFragmentManager= childFragmentManager.getFragments()
//                for (i in mchildFragmentManager.indices) {
//                        if (mchildFragmentManager[i] != null)
//                        mchildFragmentManager[i].childFragmentManager.beginTransaction()!!.hide(mchildFragmentManager[i]!!).commit()
//                }
                val fragment = Creatinine_Clearance_Cockcroft_Gault_fm()
                val mFragmentManager = activity?.supportFragmentManager
                val transaction = activity?.supportFragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_, fragment)
//                transaction?.addToBackStack(null)
                transaction?.add(R.id.fragment_, fragment)
                transaction?.show(fragment)
                transaction?.addToBackStack(null)
                if (mFragmentManager?.findFragmentById(R.id.fragment_) != null) {
                    mFragmentManager!!.beginTransaction()!!.hide(mFragmentManager?.findFragmentById(R.id.fragment_)!!).commit()
                }
//                if (mchildFragmentManager?.findFragmentById(R.id.fm_med_cal_firstpage) != null) {
//                    mFragmentManager!!.beginTransaction()!!.hide(mFragmentManager?.findFragmentById(R.id.fm_med_cal_firstpage)!!)
//                }
                transaction?.commit()
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