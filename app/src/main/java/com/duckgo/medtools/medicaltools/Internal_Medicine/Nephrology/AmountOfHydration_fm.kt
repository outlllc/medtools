package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentAmountOfHydrationFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class AmountOfHydration_fm : Fragment() {

    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentAmountOfHydrationFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAmountOfHydrationFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData_appendix()
        initAdaptor()
        calculate()
    }

    fun getInput() :Double{
        val sodium = binding.etSodium.text.toString().toDoubleOrNull()
        val weight = binding.etBodyWeight.text.toString().toDoubleOrNull()
        var result = if((weight != null) and (sodium != null)){
            ( sodium!! - 142 ) * weight!! * 4
        }else{
            0.0
        }
        return result
    }
    fun calculate() {
        binding.btnCal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                binding.tvResult.text= "补液量 = ${ String.format("%.2f",result) } ml)"
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

        var subDataSet2 = arrayOf("计算公式", "补水量=（血清钠浓度-142）*体重*4，补液时还应加上每日正常需要量2000ml")
        var subDataSet3 = arrayOf("说明", "为避免输入过量而导致血容量过分扩张及水中毒，计算所得的补水量不宜一次性输入，一般分2天补给。")
        var subDataSet4 = arrayOf("参考文献", "陈孝平主编. 外科学（八年制）（第2版）. 人民卫生出版社. 2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
        dataSet_appendix.add(subDataSet4)
    }
}