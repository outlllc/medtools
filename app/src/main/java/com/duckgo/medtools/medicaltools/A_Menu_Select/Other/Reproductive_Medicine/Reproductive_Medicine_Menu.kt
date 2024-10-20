package com.duckgo.medtools.medicaltools.A_Menu_Select.Other.Reproductive_Medicine

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Precocious_Puberty_Auxiliary_Examination_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Semen_reference_values_fm
import com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine.Tanner_Stage_fm

class Reproductive_Medicine_Menu:Fragment(), MenuSelectAdapter.OnItemClickListener {
    var dataSet: MutableList<String> = mutableListOf()
    lateinit var binding: MedcaltoolMenuPageFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initAdapter()
    }
    private fun initAdapter() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    private fun initData() {
        dataSet = mutableListOf("人类精液变量参考值", "tanner分期(性发育)", "性早熟疾病的辅助检查结果")
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //人类精液变量参考值
                val fragment = Semen_reference_values_fm()
                inflateFragment(fragment)
            }
            1 -> {
                //tanner分期(性发育)
                val fragment = Tanner_Stage_fm()
                inflateFragment(fragment)
            }
            2 -> {
                //性早熟疾病的辅助检查结果
                val fragment = Precocious_Puberty_Auxiliary_Examination_fm()
                inflateFragment(fragment)
            }
        }
    }

    private fun inflateFragment(fragment: Fragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
    }
}