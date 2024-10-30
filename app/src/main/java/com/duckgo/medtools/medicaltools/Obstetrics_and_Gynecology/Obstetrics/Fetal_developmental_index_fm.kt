package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentFetalDevelopmentalIndexFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean
import com.duckgo.medtools.test.Datecalculator_test

class Fetal_developmental_index_fm : BaseFragmentDataBinding<FragmentFetalDevelopmentalIndexFmBinding>() {
    override fun getFragmentViewBinding(): FragmentFetalDevelopmentalIndexFmBinding {
        return FragmentFetalDevelopmentalIndexFmBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener {  calculate() }
    }

    private fun calculate() {
        if ((binding.et1.text.toString().toDoubleOrNull() != null) and (binding.et2.text.toString().toDoubleOrNull() != null)){ //判斷兩個輸入框是否都有數字
            var High = binding.et1.text.toString().toDouble()
            var Month = binding.et2.text.toString().toDouble()
            var result = High - 3*(Month+1)
            binding.textView5.text = "胎儿发育指数 = $result"
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
        var medCalDataBean2 = MedCalDataBean("胎儿发育指数=宫高(cm)-3×(孕月+1)")
        var medCalDataBean3 = MedCalDataBean("结果正常值范围：")
        var medCalDataBean4 = MedCalDataBean("指数在-3与﹢3之间为正常儿，低于-3则提示有FGR的可能")
        var medCalDataBean5 = MedCalDataBean("说明：")
        var medCalDataBean6 = MedCalDataBean("胎儿生长受限(fetal growth restriction, FGR)需要连续测定宫高、腹围及孕妇体重判断胎儿宫内发育状况。宫高明显小于相应孕周是FGR最明显、最容易识别的体征，宫高测定是筛选FGR的基本方法。孕18~30周时，宫底高度与孕周有明确相关性。\n" +
                "动态检测宫底高度增长曲线的变化，若低于正常宫高平均值2个标准差，则考虑FGR；妊娠晚期孕妇体重增加缓慢或停滞则有FGR可能。")
        var medCalDataBean7 = MedCalDataBean("参考文献：")
        var medCalDataBean8 = MedCalDataBean("丰有吉 沈铿主编. 《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6, medCalDataBean7, medCalDataBean8)
        return data_appendix
    }
}