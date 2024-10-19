package com.duckgo.medtools.medicaltools.A_Menu_Select.common_use

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.comprehensive.BodySurfaceArea_fm
import com.duckgo.medtools.medicaltools.comprehensive.Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm
import com.duckgo.medtools.medicaltools.comprehensive.Unit_Conversion_fm

class Common_Use: Fragment(), MenuSelectAdapter.OnItemClickListener {

    lateinit var rv_medical_calculator: RecyclerView
    var dataSet: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?    ): View? {
        var view = inflater.inflate(R.layout.medcaltool_menu_page_fragment, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
        initData()
        initAdapter()
    }

    private fun initAdapter() {
        rv_medical_calculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        rv_medical_calculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    private fun initData() {
        dataSet = mutableListOf("体表面积", "体重指数", "标准体重", "常用单位换算", "低钠血症时补氯化钠值",
            "补水量", "卡铂计量", "体表面积简易公式", "低钠血症时补钠值", "标准体重简易公式",
            "输液计算器", "血浆渗透压", "低钠血症时补生理盐水", "低白蛋白血症钙浓度校正", "酸碱平衡紊乱判断",
            "产后出血量估计与休克指数", "激素剂量换算", "氧合指数", "病人合作评分", "APACHE II评分(急性生理合慢性健康评分)",
            "动脉血气分析、肺最大通气量与肺功能关系", "Harris-Benedict公式(基础能耗公式)", "不同给氧方法的氧流量和FiO2的关系", "贫血的分类", "去脂体重",
            "动脉血氧分压预测值", "高血糖的钠浓度校正", "血浆容量", "Brunnstrom分期(肌力评定)", "不同给氧方式与氧气浓度的关系",
            "Shizgal-Rosa公式(基础能耗公式)", "阴离子间隙", "肺龄", "HAD(医院焦虑抑郁情绪测量表)", "MRC肌力分级",
            "SF-36健康调查简表", "跨管钾梯度", "校正阴离子间隙", "Barthel指数评定", "校正网织红细胞计数",
            "尿阴离子间隙", "高脂血症的钠浓度校正", "FIM评定量表(功能独立性评定量表)")
    }

    private fun initView(view: View) {
        rv_medical_calculator = view.findViewById(R.id.rv_medical_calculator)
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //体表面积
                val fragment = BodySurfaceArea_fm()
                inflateFragment(fragment)
            }
            1 -> {
                //体重指数

            }
            2 -> {
                //标准体重
            }
            3 -> {
                //常用单位换算
                val fragment = Unit_Conversion_fm()
                inflateFragment(fragment)
            }
            4 -> {
                //低钠血症时补氯化钠值
            }
            5 -> {
                //补水量
            }
            6 -> {
                //卡铂计量
            }
            7 -> {
                //体表面积简易公式
            }
            8 -> {
                //低钠血症时补钠值
            }
            9 -> {
                //标准体重简易公式
            }
            10 -> {
                //输液计算器
            }
            11 -> {
                //血浆渗透压
            }
            12 -> {
                //低钠血症时补生理盐水
            }
            13 -> {
                //低白蛋白血症钙浓度校正
            }
            14 -> {
                //酸碱平衡紊乱判断
            }
            15 -> {
                //产后出血量估计与休克指数
                val fragment = Postpartum_Hemorrhage_Estimation_By_Shock_Index_fm()
                inflateFragment(fragment)
            }
            16 -> {
                //激素剂量换算
            }
            17 -> {
                //氧合指数
            }
            18 -> {
                //病人合作评分
            }
            19 -> {
                //APACHE II评分(急性生理合慢性健康评分)
            }
            20 -> {
                //动脉血气分析、肺最大通气量与肺功能关系
            }
            21 -> {
                //Harris-Benedict公式(基础能耗公式)
            }
            22 -> {
                //不同给氧方法的氧流量和FiO2的关系
            }
            23 -> {
                //贫血的分类
            }
            24 -> {
                //去脂体重
            }
            25 -> {
                //动脉血氧分压预测值
            }
            26 -> {
                //高血糖的钠浓度校正
            }
            27 -> {
                //血浆容量
            }
            28 -> {
                //Brunnstrom分期(肌力评定)
            }
            29 -> {
                //不同给氧方式与氧气浓度的关系
            }
            30 -> {
                //Shizgal-Rosa公式(基础能耗公式)
            }
            31 -> {
                //阴离子间隙
            }
            32 -> {
                //肺龄
            }
            33 -> {
                //HAD(医院焦虑抑郁情绪测量表)
            }
            34 -> {
                //MRC肌力分级
            }
            35 -> {
                //SF-36健康调查简表
            }
            36 -> {
                //跨管钾梯度
            }
            37 -> {
                //校正阴离子间隙
            }
            38 -> {
                //Barthel指数评定
            }
            39 -> {
                //校正网织红细胞计数
            }
            40 -> {
                //尿阴离子间隙
            }
            41 -> {
                //高脂血症的钠浓度校正
            }
            42 -> {
                //FIM评定量表(功能独立性评定量表)
                }
        }
    }
    private fun inflateFragment(fragment: Fragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
    }

}