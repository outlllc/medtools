package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentManningScoreFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Manning_Score_fm : Fragment() {
    var uncheckedItem :Int = 5
    var totalScore :Int = 0
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentManningScoreFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentManningScoreFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initData_appendix()
        initAdaptor()
        binding.rgCer1.setOnCheckedChangeListener { _, _ -> calculate() }
        binding.rgCer2.setOnCheckedChangeListener { _, _ -> calculate() }
        binding.rgCer3.setOnCheckedChangeListener { _, _ -> calculate() }
        binding.rgCer4.setOnCheckedChangeListener { _, _ -> calculate() }
        binding.rgCer5.setOnCheckedChangeListener { _, _ -> calculate() }
    }

    fun calculate() {
            totalScore = 0
        if (binding.rbCer0.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(binding.rbCer12.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        if (binding.rbCer30.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(binding.rbCer50.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        if (binding.rbCerS3.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(binding.rbCerS2.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        if (binding.rbCerHard.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(binding.rbCerMedium.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        if (binding.rbCerBack.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if(binding.rbCerMid.isChecked){
            totalScore += 0
            uncheckedItem -=1
        }
        binding.tvTotalScore.text = "${totalScore}分 , （您已选择${5-uncheckedItem}个必选项，还有${uncheckedItem}个必选项未选） "
        totalScore = 0
        uncheckedItem = 5
    }
    private fun initAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "32")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释", "5项指标包括：无应激实验（NST）、胎儿呼吸样运动（FBM）、胎动（FM）、胎儿肌张力（FT）及羊水容量（AFV）。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("评分", "胎儿情况", "处理原则")
        var subDataSet2 = arrayOf("10分", "无急、慢性缺氧", "每周复查1次，高危妊娠每周复查2次")
        var subDataSet3 = arrayOf("8分", "急、慢性缺氧可能性小", "每周复查1次，高危妊娠每周复查2次，羊水过少可终止妊娠")
        var subDataSet4 = arrayOf("6分", " 可疑急、慢性缺氧", "24小时内复查，仍≤6或羊水过少，可终止妊娠")
        var subDataSet5 = arrayOf("4分", "可有急或慢性缺氧", "24小时内复查，仍≤6或羊水过少，可终止妊娠")
        var subDataSet6 = arrayOf("2分", "急性缺氧或伴慢性缺氧", "若胎肺成熟，终止妊娠；胎肺不成熟给予激素治疗48小时内终止妊娠")
        var subDataSet7 = arrayOf("0分", "急、慢性缺氧", "终止妊娠，胎肺不成熟，同时激素治疗")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
    }
}