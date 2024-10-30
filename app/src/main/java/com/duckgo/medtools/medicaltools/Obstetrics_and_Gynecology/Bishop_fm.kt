package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentBishopFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Bishop_fm : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    lateinit var binding: FragmentBishopFmBinding
    lateinit var dataSet_appendix: MutableList<Array<String>>
    var uncheckedItem :Int = 5
    var totalScore :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBishopFmBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Bishop_fm().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData_appendix()
        initAdaptor()
        binding.rgCer1.setOnCheckedChangeListener { _, _ -> calculate() }
        binding.rgCer2.setOnCheckedChangeListener { _, _ -> calculate() }
        binding.rgCer3.setOnCheckedChangeListener { _, _ -> calculate() }
        binding.rgCer4.setOnCheckedChangeListener { _, _ -> calculate() }
        binding.rgCer5.setOnCheckedChangeListener { _, _ -> calculate() }
    }
    fun calculate() {
        if (binding.rbCer0.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (binding.rbCer12.isChecked) {
            totalScore += 1
            uncheckedItem -=1
        } else if (binding.rbCer34.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if (binding.rbCer5.isChecked) {
            totalScore += 3
            uncheckedItem -=1
        }
        if (binding.rbCer30.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (binding.rbCer50.isChecked) {
            totalScore += 1
            uncheckedItem -=1
        } else if (binding.rbCer70.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if (binding.rbCer80.isChecked) {
            totalScore += 3
            uncheckedItem -=1
        }
        if (binding.rbCerS3.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (binding.rbCerS2.isChecked) {
            totalScore += 1
            uncheckedItem -=1
        } else if (binding.rbCerS1.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if (binding.rbCerS12.isChecked) {
            totalScore += 3
            uncheckedItem -=1
        }
        if (binding.rbCerHard.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (binding.rbCerMedium.isChecked){
            totalScore += 1
            uncheckedItem -=1
        }else if (binding.rbCerSoft.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        }
        if (binding.rbCerBack.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (binding.rbCerMid.isChecked) {
            totalScore += 1
            uncheckedItem -=1
        } else if (binding.rbCerFront.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        }
        binding.tvTotalScore.text = "${totalScore}分 , （您已选择${5-uncheckedItem}个必选项，还有${uncheckedItem}个必选项未选） "
        totalScore = 0
        uncheckedItem = 5
    }
    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "评分≤4分提示官颈不成熟，需促宫颈成熟。评分≥7分提示宫颈成熟。")
        var subDataSet2 = arrayOf("相关解释", "国际上采用Bishop评分判断宫颈成熟度，以估计引产的成功率。评分越高，宫颈越成熟，引产成功率越高。0~3分引产不易成功，4~6分成功率仅50%，7~8分成功率80%，评分≥8分者，引产成功率与阴道分娩自然临产结果相似。")
        var subDataSet3 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
    }
    private fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }
}