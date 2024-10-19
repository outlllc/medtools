package com.duckgo.medtools.medicaltools.comprehensive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentPostpartumHemorrhageEstimationByShockIndexBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentPostpartumHemorrhageEstimationByShockIndexBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPostpartumHemorrhageEstimationByShockIndexBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData_appendix()
        initAdaptor()
        binding.btnResult.setOnClickListener{ calculate_shock_index() }

    }

    private fun calculate_shock_index() {
        val HR = binding.etHR.text.toString().toDoubleOrNull()
        val SBP = binding.etSBP.text.toString().toDoubleOrNull()
        if (HR != null && SBP != null) {
            val result = HR / SBP
            if (result <= 0.5 && result > 0.0){
                binding.tvShowResult.text = "休克指数: ${String.format("%.2f" , result)} , 血容量正常"
            } else if (result > 0.5 && result <= 1) {
                binding.tvShowResult.text = "休克指数: ${String.format("%.2f" , result)} , SI=1时估计失血量500ml~1500ml(<10%~30%)"
            }else if (result > 1 && result <= 1.5) {
                binding.tvShowResult.text = "休克指数: ${String.format("%.2f" , result)} , SI=1.5时估计失血量1500-2500ml(30-50%)"
            }else if (result > 1.5 && result <= 2.0) {
                binding.tvShowResult.text = "休克指数: ${String.format("%.2f" , result)} , SI=2.0时估计失血量2500-3500ml(50-70%)"
            }else if (result >= 2) {
                binding.tvShowResult.text = "休克指数: ${String.format("%.2f" , result)}"
            }else {
                binding.tvShowResult.text = "请输入正确的数值"
            }
        }else {
            binding.tvShowResult.text = "请输入正确的数值"
        }
    }

    private fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "10")
    }

    private fun initData_appendix() {
        var subDataSet_appendix1 = arrayOf("计算公式")
        var subDataSet_appendix2 = arrayOf("休克指数=心率（次/分）/收缩压（mmHg）")
        var subDataSet_appendix3 = arrayOf("结果正常值范围：")
        var subDataSet_appendix4 = arrayOf("正常为0.5")
        var subDataSet_appendix5 = arrayOf("说明")
        var subDataSet_appendix6 = arrayOf("＜0.9：估计失血量＜500ml（＜20%）\n" +
                "1~1.5：估计失血量1000~1500ml（20%~30%）\n" +
                "≥2：估计失血量≥2500ml（≥50%）\n\n" +
                "当SI = 0.5时，血容量正常；\n" +
                "当SI = 1时，失血量为10%-30%（500-1500ml）\n" +
                "当SI = 1.5时，失血量为30%-50%（1500-2500ml）\n" +
                "当SI = 2时，失血量为50%-70%（2500-3500ml）" )
        var subDataSet_appendix7 = arrayOf("参考文献")
        var subDataSet_appendix8 = arrayOf("1.赵松山，刘友梅，姚家邦等.中国成年男子体表面积的测量.营养学报.1984;02:3-11.\n2.赵松山，刘友梅，姚家邦等.中国成年女子体表面积的测量.营养学报.1987;03:10-17.\n" +
                "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix = ArrayList()
        dataSet_appendix.add(subDataSet_appendix1)
        dataSet_appendix.add(subDataSet_appendix2)
        dataSet_appendix.add(subDataSet_appendix3)
        dataSet_appendix.add(subDataSet_appendix4)
        dataSet_appendix.add(subDataSet_appendix5)
        dataSet_appendix.add(subDataSet_appendix6)
        dataSet_appendix.add(subDataSet_appendix7)
        dataSet_appendix.add(subDataSet_appendix8)
    }
}