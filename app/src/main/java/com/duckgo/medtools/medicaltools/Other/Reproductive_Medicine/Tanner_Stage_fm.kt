package com.duckgo.medtools.medicaltools.Other.Reproductive_Medicine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentTannerStageFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Tanner_Stage_fm : Fragment() {
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentTannerStageFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTannerStageFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalListAdapter(dataSet,"30")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix,"20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释", "青春期为第二性征开始发育和获得性生殖能力的时期。女性第二性征发育以乳房发育为先，继而出现阴毛、腋毛。月经初潮通常晚于第二性征发育，此时已具有生育能力。")
        var subDataSet2 = arrayOf("参考来源", "1、Marshall WA, Tanner JM.Variations in the pattern ofpubertal changes in boys. Arch DisChild. 1970;45(239):13-23.\n" +
                "2、Marshall WA, Tanner JM. Variations in pattern of pubertal changes in girls. Arch Dis Child. 1969;44(235):291-303.")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("", "乳房", "阴毛")
        var subDataSet2 = arrayOf("Ⅰ期(青春期前)", "仅乳头凸出", "无")
        var subDataSet3 = arrayOf("Ⅱ期", "乳房、乳头凸起，乳晕直径扩大\n" + "平均年龄：9.8岁", "长而稀疏，黑色，分布于大阴唇\n" + "平均年龄：10.5岁")
        var subDataSet4 = arrayOf("Ⅲ期", " 乳房及乳晕继续增大，两者无界限\n" + "平均年龄：11.2岁", "增粗、卷曲、颜色加深，阴阜出现稀疏毛发\n" + "平均年龄：11.4岁")
        var subDataSet5 = arrayOf("Ⅳ期", "乳头进一步凸起于乳房表面\n" + "平均年龄：12.1岁", "成年人毛发，浓密，但仅限于阴阜\n" + "平均年龄：12岁")
        var subDataSet6 = arrayOf("Ⅴ期", "乳晕回降，与乳房弧度连续\n" + "平均年龄：14.6岁", "成年人毛发及分布\n" + "平均年龄：13.7岁")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
    }
}