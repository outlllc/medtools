package com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentSemenReferenceValuesFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Semen_reference_values_fm : Fragment() {

    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet2: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentSemenReferenceValuesFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSemenReferenceValuesFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initData2()
        initData_appendix()
        initAdaptor()
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "根据精液常规检查的结果，如精子密度少于20×10^6/ml，称少精子症(oligospermia)；精液中无精子，称无精子症(azoospermia)；前向运动(a+b)精子少于50%，或快速前向运动(a)精子少于25%，称弱精子症(asthenospermia)。\n" +
                "相关解释 精液收集注意事项：禁欲3~7天，尽可能在实验室采用手淫法取精液，全部收集到干净玻璃容器内，不要采用性交中断法、避孕套和塑料瓶。精液取出后应立即送检，天冷时注意保温，检查时间最好在30分钟内，不超过60分钟内进行。")
        var subDataSet2 = arrayOf("结果分析说明", "一次检查结果不一定能完全准确反应精液情况，应间隔1~2周、重复检查2~3次。如近期有发热等影响精液检查的因素，应在3个月后复查。")
        var subDataSet3 = arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "30")
        binding.rvContent2.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent2.adapter = MedCalListAdapter(dataSet2, "30")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    fun initData() {
        var subDataSet1 = arrayOf("参考值", "参考值下限", "第四版相关参数 ")
        var subDataSet2 = arrayOf("量", "1.5 ml(1.4-1.7 ml)", "≥2.0 ml")
        var subDataSet3 = arrayOf("总精子数", " 39×106（33-46）/一次射精", "≥40×106 /一次射精")
        var subDataSet4 = arrayOf("精子密度", "15×106（12-16）/ml", "≥20×106/ml")
        var subDataSet5 = arrayOf("总活力(快速前向运动+非快速前向运动)", "40%（38-42%）", "a+b≥50%或a≥25%")
        var subDataSet6 = arrayOf("快速前向运动", "32%", "（31-34%）")
        var subDataSet7 = arrayOf("存活率(活精子)", "58%（55-63%）", "≥50%")
        var subDataSet8 = arrayOf("形态(正常形态)", "4%（3-4%）", "≥15%")

        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
        dataSet.add(subDataSet8)
    }
    fun initData2() {
        var subDataSet1 = arrayOf("PH", "≥7.2", "≥7.2")
        var subDataSet2 = arrayOf("圆形细胞", "≤5×106/ml", "≤5×106/ml")
        var subDataSet3 = arrayOf("白细胞(过氧化物酶染色阳性)", " <1.0×106/ml", "<1.0×106/ml")
        var subDataSet4 = arrayOf("MAR试验(与颗粒结合的活动精子)", "<50%", "")
        var subDataSet5 = arrayOf("免疫珠试验(与免疫珠结合的活动精子)", "<50%", "")
        var subDataSet6 = arrayOf("精浆锌", "≥2.4μmol/一次射精", "")
        var subDataSet7 = arrayOf("精浆果糖", "≥13μmol/一次射精", "")
        var subDataSet8 = arrayOf("精浆中性葡萄糖苷酶", "≥20mU/一次射精", "")

        dataSet2= ArrayList()
        dataSet2.add(subDataSet1)
        dataSet2.add(subDataSet2)
        dataSet2.add(subDataSet3)
        dataSet2.add(subDataSet4)
        dataSet2.add(subDataSet5)
        dataSet2.add(subDataSet6)
        dataSet2.add(subDataSet7)
        dataSet2.add(subDataSet8)
    }
}