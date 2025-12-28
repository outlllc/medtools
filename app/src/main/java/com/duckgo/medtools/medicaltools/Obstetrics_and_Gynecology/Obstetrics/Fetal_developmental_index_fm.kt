package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.LinearLayoutManager
import android.view.View
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentFetalDevelopmentalIndexFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Fetal_developmental_index_fm : BaseFragmentDataBinding<FragmentFetalDevelopmentalIndexFmBinding>() {
    override fun getFragmentViewBinding() = FragmentFetalDevelopmentalIndexFmBinding.inflate(layoutInflater)

    override fun initView() {
        binding.button1.setOnClickListener { calculate() }
    }

    private fun calculate() {
        val high = binding.et1.text.toString().toDoubleOrNull()
        val month = binding.et2.text.toString().toDoubleOrNull()
        
        binding.textView5.text = if (high != null && month != null) {
            "胎儿发育指数 = ${"%.2f".format(high - 3 * (month + 1))}"
        } else {
            "请输入正确的数值"
        }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalAdapterDatabean(data_appendix)
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun initData_appendix() = listOf(
        MedCalDataBean("计算公式："),
        MedCalDataBean("胎儿发育指数=宫高(cm)-3×(孕月+1)"),
        MedCalDataBean("结果正常值范围："),
        MedCalDataBean("指数在-3与﹢3之间为正常儿，低于-3则提示有FGR的可能"),
        MedCalDataBean("说明："),
        MedCalDataBean("胎儿生长受限(FGR)需要连续测定宫高、腹围及体重判断。宫高明显小于孕周是FGR最明显的体征。"),
        MedCalDataBean("参考文献："),
        MedCalDataBean("丰有吉 沈铿主编. 《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    ).also { data_appendix = it }
}
