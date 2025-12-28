package com.duckgo.medtools.medicaltools.comprehensive

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentBodyIndexFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Body_Index_fm : BaseFragmentDataBinding<FragmentBodyIndexFmBinding>() {
    override fun getFragmentViewBinding() = FragmentBodyIndexFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener { calculate() }
    }

    private fun calculate() {
        val high = binding.et1.text.toString().toDoubleOrNull()
        val weight = binding.et2.text.toString().toDoubleOrNull()

        if (high != null && weight != null) {
            val result = weight / ((high / 100) * (high / 100))
            binding.textView5.text = "BMI = ${String.format("%.2f", result)}"
        } else {
            binding.textView5.text = "请输入正确的数值"
        }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(requireContext())
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix())
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        data_appendix = listOf(
            MedCalDataBean("计算公式："),
            MedCalDataBean("BMI=体重/身高²"),
            MedCalDataBean("说明："),
            MedCalDataBean("超重BMI：24-27.9；肥胖：BMI>=28。\n过高的体重指数常常会增加相关疾病的发生率和死亡风险。"),
            MedCalDataBean("参考文献："),
            MedCalDataBean("Khosla T, Lowe CR. Indices of obesity derived from body weight and height. Br J Prev Soc Med. 1967; 21: 122-128.")
        )
        return data_appendix
    }
}