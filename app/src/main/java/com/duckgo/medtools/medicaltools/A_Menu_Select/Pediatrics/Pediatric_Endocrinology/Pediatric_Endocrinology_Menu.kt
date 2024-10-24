package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Endocrinology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Endocrinology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("先天性甲状腺功能减退症的血清甲状腺激素诊断标准", "药物激发试验（生长激素缺乏症GHD诊断方法）", "先天性甲低的甲状腺素L-T4替代治疗剂量表", "儿童碘缺乏诊断标准（尿碘浓度测定）", "儿童各年龄血苯丙氨酸理想浓度控制范围",
            "tanner分期（男性性发育）",
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //先天性甲状腺功能减退症的血清甲状腺激素诊断标准
            }
            1 -> {
                //药物激发试验（生长激素缺乏症GHD诊断方法）
            }
            2 -> {
                //先天性甲低的甲状腺素L-T4替代治疗剂量表
            }
            3 -> {
                //儿童碘缺乏诊断标准（尿碘浓度测定）
            }
            4 -> {
                //儿童各年龄血苯丙氨酸理想浓度控制范围
            }
            5 -> {
                //tanner分期（男性性发育）
            }
        }
    }
}