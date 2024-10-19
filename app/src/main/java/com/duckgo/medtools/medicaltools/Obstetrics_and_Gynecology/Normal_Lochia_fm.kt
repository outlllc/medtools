package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentNormalLochiaFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Normal_Lochia_fm : Fragment() {

    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentNormalLochiaFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNormalLochiaFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initData_appendix()
        initAdaptor()
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读 ", "恶露在产后随子宫蜕膜脱落，含有血液及坏死蜕膜等组织经阴道排出。根据其颜色及内容物分为血性恶露、浆液性恶露、白色恶露。正常恶露有血腥味，但无臭味，一般持续4～6周，总量可达500ml。若有胎盘、胎膜残留或感染，可使恶露时间延长，并有臭味。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initAdaptor() {
        binding.rvNormalLochia.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvNormalLochia.adapter = MedCalListAdapter(dataSet, "40")
        binding.rvNormalLochia2.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvNormalLochia2.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    fun initData() {
        var subDataSet1 = arrayOf("", "血性恶露", "浆液性恶露", "白色恶露")
        var subDataSet2 = arrayOf("持续时间", "产后最初3日", "产后4-14日", "产后14日以后")
        var subDataSet3 = arrayOf("颜色", "红色", "淡红色", "白色")
        var subDataSet4 = arrayOf("内容物", "大量血液、少量胎膜、坏死蜕膜", "少量血液、坏死蜕膜、宫颈粘液、细菌", "坏死退化蜕膜、表皮细胞、大量白细胞和细菌等")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
    }
}