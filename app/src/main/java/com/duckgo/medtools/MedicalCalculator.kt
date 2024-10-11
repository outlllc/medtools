package com.duckgo.medtools

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MedicalCalculator : Fragment() {

    lateinit var rv_medical_calculator :RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_medical_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataset = arrayOf("肌酐清除率", "体表面积", "补水量", "低钠血症补钠量", "肾小球滤过率CKD-EPI", "慢性肾病CKD分期", "糖化血红蛋白评估平均血糖", "BISHOP评分", "妊娠期高血压分类", "GDM诊断标准", "重度子痫前期诊断", "妊娠期糖尿病分级分期", "妊娠期甲状腺功能实验室检查")
        rv_medical_calculator = view.findViewById(R.id.rv_medical_calculator)
        rv_medical_calculator.layoutManager= LinearLayoutManager(context , LinearLayoutManager.VERTICAL, false)
        rv_medical_calculator.adapter = MyRecycleViewAdaptor(dataset)
    }
}