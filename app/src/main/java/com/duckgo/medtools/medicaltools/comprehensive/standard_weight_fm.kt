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
import com.duckgo.medtools.databinding.FragmentStandardWeightFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class standard_weight_fm : BaseFragmentDataBinding<FragmentStandardWeightFmBinding>() {
    override fun getFragmentViewBinding(): FragmentStandardWeightFmBinding {
        return FragmentStandardWeightFmBinding.inflate(layoutInflater)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener {  calculate() }
    }

    private fun calculate() {
        val gender = if (binding.man.isChecked) "man" else "woman"
        if (binding.et1.text.toString().toDoubleOrNull() != null){ //判斷輸入框是否都有數字
            var result = when(gender){
                "man" -> {
                    50 + 0.9 * (binding.et1.text.toString().toDouble() - 150)
                }
                "woman" -> {
                    45.5 + 0.9 * (binding.et1.text.toString().toDouble() - 150)
                }
                else -> {
                    binding.textView5.text = "请选择性别"
                    0.0
                }
            }
            binding.textView5.text = "标准体重IBW = ${String.format("%.2f",result)}"
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
        var medCalDataBean2 = MedCalDataBean("男性，IBW=50+0.9*（身高-150）\n" +
                "女性，IBW=45.5+0.9*（身高-150）")
        var medCalDataBean3 = MedCalDataBean("说明：")
        var medCalDataBean4 = MedCalDataBean("标准体重也称理想体重，可用来判断肥胖等。")
        var medCalDataBean5 = MedCalDataBean("参考文献：")
        var medCalDataBean6 = MedCalDataBean("李剑，吴东主编. 协和内科住院医师手册[M]. 中国协和医科大学出版社.2008年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6)
        return data_appendix
    }

}