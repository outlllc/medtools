package com.duckgo.medtools.medicaltools.Internal_Medicine.Endocrinology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentHbA1cValuesBloodGlucoseFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class HbA1cValuesBloodGlucose_fm : Fragment() {
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentHbA1cValuesBloodGlucoseFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHbA1cValuesBloodGlucoseFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData_appendix()
        initAdaptor()
        calculate()
    }
    fun getInput() :Double{
        val hba1c = binding.etHba1c.text.toString().toDoubleOrNull()
        var result = if(hba1c != null){
            (28.7 * hba1c!! - 46.7) / 18
        }else{
            0.0
        }
        return result
    }
    fun calculate() {
        binding.btnCal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                binding.tvResult.text= "平均血糖水平 = ${ String.format("%.2f",result) } mmol/L)"
            }else{
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }

    private fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("计算公式", "平均血糖=(28.7*HbA1c-46.7)/18")
        var subDataSet2 = arrayOf("结果正常值范围", "空腹血糖正常值为3.9~6.1mmol/L")
        var subDataSet3 = arrayOf("说明", "糖化血红蛋白被视为血糖控制的金标准，与糖尿病的微血管及大血管病变相关，它反应了过去2~3个月的平均血糖水平。")
        var subDataSet4 = arrayOf("参考来源", "http://professional.diabetes.org/glucosecalculator.aspx")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
        dataSet_appendix.add(subDataSet4)
    }
}