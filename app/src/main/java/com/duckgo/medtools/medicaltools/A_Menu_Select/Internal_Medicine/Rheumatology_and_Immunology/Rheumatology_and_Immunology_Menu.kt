package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Rheumatology_and_Immunology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Rheumatology_and_Immunology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("类风湿关节炎疾病活动性评分（DAS 28）", "激素计量换算", "SLEDAI（系统性红斑狼疮的病情活动程度评分）", "系统性红斑狼疮诊断标准（ACR,1997）", "类风湿关节炎分类标准和评分系统",
            "类风湿关节炎诊断标准（ACR，1987）", "类风湿关节炎功能状态分级标准", "强直性脊柱炎诊断标准", "类风湿关节炎临床缓解标准", "狼疮性肾炎分型（ISN/RPS,2003）",
            "Yamaguchi诊断标准（成人still病）", "自身免疫性肝炎的诊断标准与评分系统", "骶髂关节病变X线分级", "类风湿关节炎X线分类标准", "膝关节骨关节炎临床及放射学诊断标准",
            "膝关节骨关节炎临床诊断标准", "髋关节骨关节炎临床诊断标准", "髋关节骨关节炎临床及放射学诊断标准", "手关节骨关节炎临床诊断标准"
        )
        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //类风湿关节炎疾病活动性评分（DAS 28）
            }
            1 -> {
                //激素计量换算
            }
            2 -> {
                //SLEDAI（系统性红斑狼疮的病情活动程度评分）
            }
            3 -> {
                //系统性红斑狼疮诊断标准（ACR,1997）
            }
            4 -> {
                //类风湿关节炎分类标准和评分系统
            }
            5 -> {
                //类风湿关节炎诊断标准（ACR，1987）
            }
            6 -> {
                //类风湿关节炎功能状态分级标准
            }
            7 -> {
                //强直性脊柱炎诊断标准
            }
            8 -> {
                //类风湿关节炎临床缓解标准
            }
            9 -> {
                //狼疮性肾炎分型（ISN/RPS,2003）
            }
            10 -> {
                //Yamaguchi诊断标准（成人still病）
            }
            11 -> {
                //自身免疫性肝炎的诊断标准与评分系统
            }
            12 -> {
                //骶髂关节病变X线分级
            }
            13 -> {
                //类风湿关节炎X线分类标准
            }
            14 -> {
                //膝关节骨关节炎临床及放射学诊断标准
            }
            15 -> {
                //膝关节骨关节炎临床诊断标准
            }
            16 -> {
                //髋关节骨关节炎临床诊断标准
            }
            17 -> {
                //髋关节骨关节炎临床及放射学诊断标准
            }
            18 -> {
                //手关节骨关节炎临床诊断标准
            }

        }
    }
}