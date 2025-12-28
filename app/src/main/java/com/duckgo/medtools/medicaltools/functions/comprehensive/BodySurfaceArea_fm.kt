package com.duckgo.medtools.medicaltools.functions.comprehensive

import androidx.recyclerview.widget.LinearLayoutManager
import android.view.View
import com.duckgo.medtools.medicaltools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentBodySurfaceAreaBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class BodySurfaceArea_fm : BaseFragmentDataBinding<FragmentBodySurfaceAreaBinding>() {

    override fun getFragmentViewBinding() = FragmentBodySurfaceAreaBinding.inflate(layoutInflater)

    override fun initView() {
        binding.btnCal.setOnClickListener { calculate() }
    }

    private fun calculate() {
        val height = binding.etHeight.text.toString().toDoubleOrNull()
        val weight = binding.etBodyWeight.text.toString().toDoubleOrNull()

        if (height != null && weight != null) {
            val bsa = if (binding.rbMan.isChecked) {
                0.00607 * height + 0.0127 * weight - 0.0698
            } else {
                0.00586 * height + 0.0126 * weight - 0.0461
            }
            binding.tvResult.text = "体表面积BSA = ${"%.2f".format(bsa)} m2"
        } else {
            binding.tvResult.text = "请输入正确数据"
        }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MedCalAdapterDatabean(initData_appendix())
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        return listOf(
            MedCalDataBean("公式英文名称"),
            MedCalDataBean("Body Surface Area, BSA"),
            MedCalDataBean("计算公式"),
            MedCalDataBean("男性：BSA=0.00607*身高+0.0127*体重-0.0698\n女性：0.00586*身高+0.0126*体重-0.0461"),
            MedCalDataBean("说明"),
            MedCalDataBean("通过身高、体重估算体表面积，进而调整化疗药的给药剂量。也常用于评价心脏指数和基础代谢率等临床指标"),
            MedCalDataBean("参考文献"),
            MedCalDataBean("1.赵松山，刘友梅，姚家邦等.中国成年男子体表面积的测量.营养学报.1984;02:3-11.\n2.赵松山，刘友梅，姚家邦等.中国成年女子体表面积的测量.营养学报.1987;03:10-17.")
        )
    }
}
