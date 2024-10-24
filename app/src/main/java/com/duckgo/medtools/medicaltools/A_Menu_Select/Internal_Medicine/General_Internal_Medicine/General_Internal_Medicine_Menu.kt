package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.General_Internal_Medicine

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragment
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment
import com.duckgo.medtools.medicaltools.comprehensive.BodySurfaceArea_fm
import com.duckgo.medtools.util.add_hide_fragment

class General_Internal_Medicine_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }


    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("体表面积", "体重指数", "标准体重", "体表面积简易公式", "标准体重简易公式",
            "输液计算器", "Harris-Benedict公式（基础能耗公式）", "去脂体重", "腹部肿块的部位和常见疾病", "Shingle-Rosa公式（基础能耗公式）",
            "骨骼肌肌力检查办法")
        
        return dataSet
    }
    

    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun onItemClick(position: Int) {
        when(position){
            0 -> {
                //体表面积
                val fragment = BodySurfaceArea_fm()
                add_hide_fragment(mfragmentManager, fragment)
            }
            1 -> {
                //体重指数
            }
            2 -> {
                //标准体重
            }
            3 -> {
                //体表面积简易公式
            }
            4 -> {
                //标准体重简易公式
            }
            5 -> {
                //输液计算器
            }
            6 -> {
                //Harris-Benedict公式（基础能耗公式）
            }
            7 -> {
                //去脂体重
            }
            8 -> {
                //腹部肿块的部位和常见疾病
            }
            9 -> {
                //Shingle-Rosa公式（基础能耗公式）
            }
            10 -> {
                //骨骼肌肌力检查办法
            }
        }
       
    }
}