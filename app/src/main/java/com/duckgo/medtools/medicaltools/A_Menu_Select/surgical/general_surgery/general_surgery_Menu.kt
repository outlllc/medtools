package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.general_surgery

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class general_surgery_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("输液计算器", "常用冬眠合计及其特点", "外科ICU（SICU）术前、术后病人高危标准", "腹部肿块的部位和常见疾病", "手术中失血量估计方法（红细胞压积法）",
            "腹腔器官肿瘤标志物分类", "改良Goldman评分（非心脏手术术前心脏风险指数）", "胃肠道间质瘤TNM分期", "改良Lee‘s评分（非心脏手术术前心脏风险指数）", "GIST切除术后风险分级（胃肠道间质瘤）"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //输液计算器
            }
            1 -> {
                //常用冬眠合计及其特点
            }
            2 -> {
                //外科ICU（SICU）术前、术后病人高危标准
            }
            3 -> {
                //腹部肿块的部位和常见疾病
            }
            4 -> {
                //手术中失血量估计方法（红细胞压积法）
            }
            5 -> {
                //腹腔器官肿瘤标志物分类
            }
            6 -> {
                //改良Goldman评分（非心脏手术术前心脏风险指数）
            }
            7 -> {
                //胃肠道间质瘤TNM分期
            }
            8 -> {
                //改良Lee‘s评分（非心脏手术术前心脏风险指数）
            }
            9 -> {
                //GIST切除术后风险分级（胃肠道间质瘤）
            }
        }
    }
}