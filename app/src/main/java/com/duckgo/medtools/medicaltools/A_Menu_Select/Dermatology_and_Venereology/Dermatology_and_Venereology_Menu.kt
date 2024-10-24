package com.duckgo.medtools.medicaltools.A_Menu_Select.Dermatology_and_Venereology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Dermatology_and_Venereology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("原发性皮肤淋巴瘤TNM分期", "皮肤鳞状细胞癌及其它皮肤肿瘤TNM分期", "皮肤黑色素瘤TNM分期", "Merkel细胞瘤TNM分期"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //原发性皮肤淋巴瘤TNM分期
            }
            1 -> {
                //皮肤鳞状细胞癌及其它皮肤肿瘤TNM分期
            }
            2 -> {
                //皮肤黑色素瘤TNM分期
            }
            3 -> {
                //Merkel细胞瘤TNM分期
            }
        }
    }
}