package com.duckgo.medtools.medicaltools.comprehensive

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentStandardWeightFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class standard_weight_fm : BaseFragmentDataBinding<FragmentStandardWeightFmBinding>() {
    override fun getFragmentViewBinding() = FragmentStandardWeightFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener { calculate() }
    }

    private fun calculate() {
        val height = binding.et1.text.toString().toDoubleOrNull()
        if (height != null) {
            val base = if (binding.man.isChecked) 50.0 else 45.5
            val result = base + 0.9 * (height - 150)
            binding.textView5.text = "标准体重IBW = ${"%.2f".format(result)}"
        } else {
            binding.textView5.text = "请输入正确的数值"
        }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = MedCalAdapterDatabean(initData_appendix(), 10)
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        data_appendix = listOf(
            MedCalDataBean("计算公式："),
            MedCalDataBean("男性，IBW=50+0.9*（身高-150）\n女性，IBW=45.5+0.9*（身高-150）"),
            MedCalDataBean("说明："),
            MedCalDataBean("标准体重也称理想体重，可用来判断肥胖等。"),
            MedCalDataBean("参考文献："),
            MedCalDataBean("李剑，吴东主编. 协和内科住院医师手册[M]. 中国协和医科大学出版社.2008年")
        )
        return data_appendix
    }
}
