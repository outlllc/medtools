package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentGdmGradingAndStagingBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class GDM_Grading_And_Staging_fm : Fragment() {
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentGdmGradingAndStagingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGdmGradingAndStagingBinding.inflate(layoutInflater)
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
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "10")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "此外，根据母体血糖控制情况进一步将妊娠期糖尿病(GDM)分为A1与A2两级：\n" +
                "A1级：空腹血糖(FBG) ＜5.8mmol/L，经饮食控制，餐后2小时血糖＜6.7mmol/L。 A1级GDM母儿合并症较少，产后糖代谢异常多能恢复正常。\n" +
                "A2级：经饮食控制，FBG＞5.8mmol/L，餐后2小时血糖≥6.7mmol/L，妊娠期需加用胰岛素控制血糖。A2级GDM母儿合并症较多，胎儿畸形发生率增加。")
        var subDataSet2 = arrayOf("相关解释", "目前采用1994年美国妇产科医师协会(American College of Obstetrecian&Gynecologist，ACOG )推荐的分类，其中B-H分类按照普遍使用White分类法。根据糖尿病的发病年龄、病程、是否存在血管合并症、器官受累等情况进行分期，有助于估计病情的严重程度及预后。" )
        var subDataSet3 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
        dataSet_appendix.add(subDataSet3)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("A级：妊娠期出现或发现的糖尿病。")
        var subDataSet2 = arrayOf("B级：显性糖尿病，20岁以后发病，病程小于10年，无血管病变。")
        var subDataSet3 = arrayOf("C级：发病年龄在10~19岁，或病程达10~19年，无血管病变。")
        var subDataSet4 = arrayOf("D级：10岁以前发病，或病程≥20年，或者合并单纯性视网膜病。")
        var subDataSet5 = arrayOf("F级：糖尿病性肾病。")
        var subDataSet6 = arrayOf("R级：有增生性视网膜病变。")
        var subDataSet7 = arrayOf("H级：糖尿病性心脏病。")
        dataSet = ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
    }
}