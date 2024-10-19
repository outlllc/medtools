package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentRhAndAboHemolysisComparisonFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class RH_And_ABO_Hemolysis_Comparison_fm : Fragment() {

    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet2: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentRhAndAboHemolysisComparisonFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRhAndAboHemolysisComparisonFmBinding.inflate(layoutInflater)
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
        var subDataSet1 = arrayOf(" ", "")
        var subDataSet2 = arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "40")
        binding.rvContent2.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent2.adapter = MedCalListAdapter(dataSet2, "40")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    fun initData() {
        var subDataSet1 = arrayOf("", "", "Rh溶血病 ", "ABO溶血病")
        var subDataSet2 = arrayOf("", "频率", "不常见", "常见")
        var subDataSet3 = arrayOf("", " 苍白", "显著", "轻")
        var subDataSet4 = arrayOf("临", "水肿", "较常见", "罕见")
        var subDataSet5 = arrayOf("床", "黄疸", "重度", "轻~中度")
        var subDataSet6 = arrayOf("特", "肝脾肿大", "显著", "较轻")
        var subDataSet7 = arrayOf("点", "第1胎受累", "很少", "约半数")
        var subDataSet8 = arrayOf("", "下一胎更严重", "大多数", "不一定")
        var subDataSet9 = arrayOf("", "晚期贫血", "可发生", "很少发生")
        var subDataSet10 = arrayOf("", "下一胎更严重", "大多数", "不一定")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
        dataSet.add(subDataSet8)
        dataSet.add(subDataSet9)
        dataSet.add(subDataSet10)
    }
    fun initData2() {
        var subDataSet1 = arrayOf("实", "母血型", "Rh d、e、c ", "O（多数）")
        var subDataSet2 = arrayOf("验", "子血型", "Rh D、E、C", "A或B（多数）")
        var subDataSet3 = arrayOf("室", " 贫血", "显著", "轻")
        var subDataSet4 = arrayOf("检", "抗人球蛋白直接法？", "阳性", "改良法阳性")
        var subDataSet5 = arrayOf("查", "抗人球蛋白直接法？", "阳性", "阳性")
        var subDataSet6 = arrayOf("", "红细胞形态", "有核红细胞增多", "小球形红细胞增多")
        dataSet2= ArrayList()
        dataSet2.add(subDataSet1)
        dataSet2.add(subDataSet2)
        dataSet2.add(subDataSet3)
        dataSet2.add(subDataSet4)
        dataSet2.add(subDataSet5)
        dataSet2.add(subDataSet6)
    }
}