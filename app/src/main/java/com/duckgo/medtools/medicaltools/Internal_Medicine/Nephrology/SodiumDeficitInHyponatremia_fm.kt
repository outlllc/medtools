package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentSodiumDeficitInHyponatremiaFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class SodiumDeficitInHyponatremia_fm : Fragment() {

    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentSodiumDeficitInHyponatremiaFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSodiumDeficitInHyponatremiaFmBinding.inflate(layoutInflater)
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
        val gender = if (binding.rbMan.isChecked) "man" else "woman"
        var result = 0.0
        if((weight != null) and (sodium != null)) {
            when(gender){
                "man" ->
                    result = (142 - sodium!!) * weight!! * 0.035
                "woman" ->
                    result = (142 - sodium!!) * weight!! * 0.03
                else -> 0.0
            }
        }else{
            result = 0.0
        }
        return result
    }
    fun calculate() {
        binding.btnCal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                binding.tvResult.text= "补氯化钠值 = ${ String.format("%.2f",result) } g)"
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
        var subDataSet1 = arrayOf("公式英文名称", "Sodium Deficit in Hyponatremia" )
        var subDataSet2 = arrayOf("计算公式", "男性：补氯化钠值=（142-血清钠浓度）*体重*0.035\n女性：补氯化钠值=（142-血清钠浓度）*体重*0.03")
        var subDataSet3 = arrayOf("说明", "公式以17mmolNa+相当于1g钠盐计算，当天先补1/2量，还需要加每日需要量4.5g，此为第一日补充量；其余一半钠可以在第2天补给。\n临床上应该注意，绝对依靠任何公式决定补钠量是不可取的，公式仅作为补钠安全剂量的估计。一般总是先补充缺钠量的一部分以解除急性症状，使血容量有所纠正。并且补液过程中要提防血容量过高，对心功能不全者将非常危险。\n" +
                "纠正低钠血症的最大纠正速度：8-10mmol/L/d；如果有症状，按照1-2mmol/L/h纠正直到症状消失，24小时纠正速度不超过12mmol/L。1升3%NaCl含513mmol Na+，1升0.9%NaCl（NS）含154mmol Na+。")
        var subDataSet4 = arrayOf("参考文献", "陈孝平主编. 外科学（八年制）（第2版）. 人民卫生出版社. 2010年. p40.")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
        dataSet_appendix.add(subDataSet4)
    }
}