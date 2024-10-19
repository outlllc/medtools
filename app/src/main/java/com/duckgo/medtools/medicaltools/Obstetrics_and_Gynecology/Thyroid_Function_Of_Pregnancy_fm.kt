package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentThyroidFunctionOfPregnancyFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Thyroid_Function_Of_Pregnancy_fm : Fragment() {
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentThyroidFunctionOfPregnancyFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThyroidFunctionOfPregnancyFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释 ", "甲亢的临床症状及体征有：心悸，休息时心率超过100次/分，食欲很好、进食多的情况下孕妇体重不能按孕周增加，脉压增大>50mmHg，怕热多汗，皮肤潮红，皮温升高，突眼，手震颤，腹泻。实验室检查是诊断甲亢的重要方法。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "40")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    fun initData() {
        var subDataSet1 = arrayOf("检查项目", "正常妇女", "孕妇", "妊娠合并甲亢")
        var subDataSet2 = arrayOf("基础代谢率(BMR)%", "＜+15", "+20~+30", "＞+30")
        var subDataSet3 = arrayOf("血清总甲状腺激素TT4(nmol/L)", " 64~167", "轻度增高", "明显增高")
        var subDataSet4 = arrayOf("血清三碘甲状腺原氨酸TT3(nmol/L)", "1.8~2.9", "轻度增高", "明显增高")
        var subDataSet5 = arrayOf("甲状腺素结合球蛋白TBG(mg/L)", "13~25", "轻度增高", "明显增高")
        var subDataSet6 = arrayOf("血清游离T3(pmol/L)", "6.0~11.4", "轻度增高", "明显增高")
        var subDataSet7 = arrayOf("血清游离T4(pmol/L)", "18~38", "轻度增高", "明显增高")
        var subDataSet8 = arrayOf("促甲状腺激素TSH(mU/L)", "2~20", "正常", "明显减低")
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
}