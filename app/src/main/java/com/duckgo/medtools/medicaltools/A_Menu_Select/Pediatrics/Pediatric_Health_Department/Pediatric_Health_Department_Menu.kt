package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.Pediatric_Health_Department

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Pediatric_Health_Department_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("小儿体重身长计算", "我国0-18岁儿童身高、体重的百分位数标准值", "儿童添加辅食的步骤和方法", "小儿出牙顺序", "小儿体表面积公式",
            "婴儿营养素的需要", "小儿各年龄平均血压", "儿童口服铁制剂的规格及剂量表", "小儿各年龄动作及行为评分", "小儿药物计算公式3（按体重计算）",
            "小儿基础代谢率", "小儿各年龄心率平均值及范围", "小儿囟门和颅缝闭合时间", "小儿药物计算公式1（按体表面积计算）", "tanner分期（性发育）",
            "小儿各年龄呼吸频率平均值", "小儿药物计算公式2（按年龄计算[董氏公式]）", "儿童每日不显性失水量", "小儿身体各部位比例", "Conner's简明症状问卷",
            "性早熟疾病的辅助检查结果", "尿羟脯氨酸指数（蛋白质-能量营养不良）", "餐后血清锌浓度反应试验（锌缺乏）", "相对剂量反应试验（维生素A缺乏）", "儿童各年龄血苯丙氨酸理想浓度控制范围",
            "tanner分期（男性性发育）"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when(position){
            0 -> {
                // 小儿体重身长计算
            }
            1 -> {
                // 我国0-18岁儿童身高、体重的百分位数标准值
            }
            2 -> {
                // 儿童添加辅食的步骤和方法
            }
            3 -> {
                // 小儿出牙顺序
            }
            4 -> {
                // 小儿体表面积公式
            }
            5 -> {
                // 婴儿营养素的需要
            }
            6 -> {
                // 小儿各年龄平均血压
            }
            7 -> {
                // 儿童口服铁制剂的规格及剂量表
            }
            8 -> {
                // 小儿各年龄动作及行为评分
            }
            9 -> {
                // 小儿药物计算公式3（按体重计算）
            }
            10 -> {
                // 小儿基础代谢率
            }
            11 -> {
                // 小儿各年龄心率平均值及范围
            }
            12 -> {
                // 小儿囟门和颅缝闭合时间
            }
            13 -> {
                // 小儿药物计算公式1（按体表面积计算）
            }
            14 -> {
                // tanner分期（性发育）
            }
            15 -> {
                // 小儿各年龄呼吸频率平均值
            }
            16 -> {
                // 小儿药物计算公式2（按年龄计算[董氏公式]）
            }
            17 -> {
                // 儿童每日不显性失水量
            }
            18 -> {
                // 小儿身体各部位比例
            }
            19 -> {
                // Conner's简明症状问卷
            }
            20 -> {
                // 性早熟疾病的辅助检查结果
            }
            21 -> {
                // 尿羟脯氨酸指数（蛋白质-能量营养不良）
            }
            22 -> {
                // 餐后血清锌浓度反应试验（锌缺乏）
            }
            23 -> {
                // 相对剂量反应试验（维生素A缺乏）
            }
            24 -> {
                // 儿童各年龄血苯丙氨酸理想浓度控制范围
            }
            25 -> {
                // tanner分期（男性性发育）
            }
        }
    }
}