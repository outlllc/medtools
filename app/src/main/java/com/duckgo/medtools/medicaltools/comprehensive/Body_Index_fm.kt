package com.duckgo.medtools.medicaltools.comprehensive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentBodyIndexFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Body_Index_fm : BaseFragmentDataBinding<FragmentBodyIndexFmBinding>() {
    override fun getFragmentViewBinding(): FragmentBodyIndexFmBinding {
        return FragmentBodyIndexFmBinding.inflate(layoutInflater)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener {  calculate() }
    }

    private fun calculate() {
        if ((binding.et1.text.toString().toDoubleOrNull() != null) and (binding.et2.text.toString().toDoubleOrNull() != null)){ //判斷兩個輸入框是否都有數字
            var High = binding.et1.text.toString().toDouble()
            var Weight = binding.et2.text.toString().toDouble()
            var result = Weight/((High/100)*(High/100))
            binding.textView5.text = "BMI = ${String.format("%.2f",result)}"
        }else{
            binding.textView5.text = "请输入正确的数值"
        }
    }
    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 10)
    }
    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("计算公式：")
        var medCalDataBean2 = MedCalDataBean("BMI=体重/身高2")
        var medCalDataBean3 = MedCalDataBean("说明：")
        var medCalDataBean4 = MedCalDataBean("超重BMI：24-27.9；肥胖：BMI>=28。\n" +
                "过高的体重指数常常会增加相关疾病的发生率和死亡风险。")
        var medCalDataBean5 = MedCalDataBean("参考文献：")
        var medCalDataBean6 = MedCalDataBean("Khosla T, Lowe CR. Indices of obesity derived from body weight and height. Br J Prev Soc Med. 1967; 21: 122-128.")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6)
        return data_appendix
    }

}