package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentClassificationOfHypertensionDuringPregnancyFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Classification_Of_Hypertension_During_Pregnancy_fm : Fragment() {
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentClassificationOfHypertensionDuringPregnancyFmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClassificationOfHypertensionDuringPregnancyFmBinding.inflate(layoutInflater)
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
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "20")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("分类", "临床表现")
        var subDataSet2 = arrayOf("妊娠期高血压", "BP≥140/90mmHg，妊娠期出现，并于产后12周内恢复正常；尿蛋白（-）；患者可伴有上腹部不适或血小板减少。产后方可确诊")
        var subDataSet3 = arrayOf("子痫前期", "妊娠20周出现BP≥140/90mmHg，且尿蛋白≥300mg/24h或（+）。可伴有上腹部不适、头痛、视力模糊等症状")
        var subDataSet4 = arrayOf("子痫", "子痫前期孕产妇抽搐，且不能用其他原因解释")
        var subDataSet5 = arrayOf("慢性高血压病并发子痫前期", "高血压妇女于妊娠20周以前无蛋白尿，若孕20周后出现尿蛋白≥300mg/24h；或妊娠20周前突然出现尿蛋白增加、血压进一步升高、或血小板减少（＜100×109/L）")
        var subDataSet6 = arrayOf("妊娠合并慢性高血压病", "妊娠前或妊娠20周前检查发现血压升高，但妊娠期无明显加重；或妊娠20周后首次诊断高血压并持续到产后12周以后")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
    }
}