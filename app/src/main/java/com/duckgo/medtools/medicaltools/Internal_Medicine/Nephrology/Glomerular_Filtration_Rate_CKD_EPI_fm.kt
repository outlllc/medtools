package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentGlomerularFiltrationRateCkdEpiFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Glomerular_Filtration_Rate_CKD_EPI_fm : Fragment() {

    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentGlomerularFiltrationRateCkdEpiFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGlomerularFiltrationRateCkdEpiFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData_appendix()
        initAdaptor()
        calculate()
        binding.rgDisplay.setOnCheckedChangeListener { _, _ -> checkDisplay() }
    }

    fun getInput() :Double{
        val age = binding.etAge.text.toString().toIntOrNull()
        val cr = binding.etCr.text.toString().toDoubleOrNull()
        val gender = if (binding.rbMan.isChecked) "man" else "woman"
        var race = if (binding.rbBlack.isChecked) "black" else "other"
        var index_A = 0
        var index_B = 0.0
        var index_C = 0.0


        if((age != null) and (cr != null)){
            index_C = if(gender == "man"){
                if (cr!! <= 0.7) -0.411 else -1.209
            }else if (gender == "woman"){
                if (cr!! <= 0.7) -0.329 else -1.209
            }else{
                0.0
            }
            if (race == "black"){
                when(gender){
                    "man" -> {
                        index_A = 163
                        index_B = 0.9
                    }
                    "woman" -> {
                        index_A = 166
                        index_B = 0.7
                    }
                    else -> { 0.0 }
                }
            }else if (race == "other"){
                when(gender) {
                    "man" -> {
                        index_A = 141
                        index_B = 0.9
                    }
                    "woman" -> {
                        index_A = 144
                        index_B = 0.7
                    }
                    else -> { 0.0 }
                }
            } else(
                0.0
            )
        }else{
            return 0.0
        }
        var result = index_A * Math.pow((cr!!/index_B), index_C) * Math.pow(0.993, age!!.toDouble())
        return result
    }

    fun calculate() {
        binding.btnCal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                binding.tvResult.text= "肾小球滤过率 = ${ String.format("%.2f",result) } ml/(min*1.73m2)"
            }else{
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }

    fun checkDisplay(){
        val dialysis = if (binding.rbCommon.isChecked) "common" else "universal"
        if (dialysis == "common"){
            binding.tvUniversal.text = "血肌酐浓度(mg/dL):"
        }else if (dialysis == "universal"){
            binding.tvUniversal.text = "血肌酐浓度(mmol/L):"
        }
    }

    private fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("计算公式", "GFR＝a×(血肌酐浓度/b)c×(0.993)年龄\n" +
                "a值根据性别与人种分别采用如下数值：\n" +
                "①黑人：女性 = 166； 男性 = 163\n" +
                "②其他人种：女性 = 144； 男性 = 141\n" +
                "\n" +
                "b值根据性别不同分别采用如下数值：\n" +
                "女性 = 0.7； 男性 = 0.9\n" +
                "\n" +
                "c值根据年龄与血清肌酐值的大小分别采用如下数值：\n" +
                "①女性：血清肌酐 ≤ 0.7 mg/dL = -0.329； 血清肌酐 ＞ 0.7 mg/dL = -1.209\n" +
                "②男性：血清肌酐 ≤ 0.7 mg/dL = -0.411； 血清肌酐 ＞ 0.7 mg/dL = -1.209")
        var subDataSet2 = arrayOf("结果正常值范围", "120~138mL/(min*1.73m2)")
        var subDataSet3 = arrayOf("说明", "2009年刚发表的慢性肾脏病流行病学合作研究(CKD-EPI)公式，较目前普遍应用的MDRD公式评估肾小球滤过率更为精确，尤其是当GFR大于60mL/(min*1.73m2)时。")
        var subDataSet4 = arrayOf("参考文献", "Levey AS, et al. A new equation to estimate glomerular filtration rate. Ann Intern Med. 2009 May 5;150(9):604-12.")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
        dataSet_appendix.add(subDataSet4)
    }
}