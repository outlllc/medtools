package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentEdinburghPostnatalDepressionScaleFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Edinburgh_Postnatal_Depression_Scale_fm : Fragment() {

    lateinit var dataSet_appendix: MutableList<Array<String>>

    var uncheckedItem :Int = 10
    var totalScore :Int = 0

    lateinit var binding: FragmentEdinburghPostnatalDepressionScaleFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEdinburghPostnatalDepressionScaleFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData_appendix()
        initAdaptor()
        binding.rg1.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg2.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg3.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg4.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg5.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg6.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg7.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg8.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg9.setOnCheckedChangeListener { group, checkedId ->  calculate()}
        binding.rg10.setOnCheckedChangeListener { group, checkedId ->  calculate()}
    }
    fun calculate() {
        var score = 0
        if (binding.rb10.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb11.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb12.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb13.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb20.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb21.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb22.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb23.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb30.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb31.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb32.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb33.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb40.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb41.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb42.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb43.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb50.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb51.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb52.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb53.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb60.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb61.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb62.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb63.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb70.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb71.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb72.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb73.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb80.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb81.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb82.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb83.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb90.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb91.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb92.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb93.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        if (binding.rb100.isChecked) {
            score += 0
            uncheckedItem -=1
        } else if (binding.rb101.isChecked) {
            score += 1
            uncheckedItem -=1
        } else if (binding.rb102.isChecked) {
            score += 2
            uncheckedItem -=1
        } else if (binding.rb103.isChecked) {
            score += 3
            uncheckedItem -=1
        }
        totalScore = score
        binding.tvTotalScore.text = "${totalScore}分 , （您已选择${10-uncheckedItem}个必选项，还有${uncheckedItem}个必选项未选） "
        totalScore = 0
        uncheckedItem = 10
    }

    private fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释", "爱丁堡产后抑郁量表(Edinburgh postnatal depression scale, EPDS )。目前多采用的诊断标准。该表包括10项内容，于产后6周进行调查。每项内容分4级评分(0～3分)，总分相加≥13分者可诊断为产褥期抑郁症。")
        var subDataSet2 = arrayOf("参考来源", "1、JL Cox, et al. Detection of Postnatal Depression: Development of the 10-item Edinburgh Postnatal Depression Scale. Br J Psychiatry. 1987;150:782-6.\n" +
                "2、KL Wisner, et al. Clinical practice. Postpartum depression. N Engl J Med. 2002;347(3):194-9.")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }
}