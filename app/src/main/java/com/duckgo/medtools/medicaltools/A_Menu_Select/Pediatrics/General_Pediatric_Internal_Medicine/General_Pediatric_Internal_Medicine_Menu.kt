package com.duckgo.medtools.medicaltools.A_Menu_Select.Pediatrics.General_Pediatric_Internal_Medicine

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class General_Pediatric_Internal_Medicine_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("小儿体重身长计算", "儿童补液", "我国0-18岁儿童身高、体重的百分位数标准值", "临床常用液体成分及张力", "婴儿添加辅食的步骤和方法",
            "理想身高", "小儿出牙顺序", "小儿肠外营养TPN推荐用量表", "小儿体表面积公式", "婴儿营养素的需要",
            "小儿各年龄平均血压", "儿童口服铁制剂的规格及剂量表", "小儿各年龄动作及行为评分", "小儿药物计算公式3（按体重计算）", "小儿基础代谢率",
            "小儿各年龄心率平均值及范围", "FLACC评分（婴儿和儿童疼痛行为评估量表）", "小儿囟门和颅缝闭合时间", "小儿药物计算公式1（按体表面积计算）", "小儿各年龄呼吸频率平均值",
            "小儿药物计算公式2（按年龄计算[董氏公式]）", "儿童每日不显性失水量", "小儿身体各部位比例", "Conner's简明症状问卷", "尿羟脯氨酸指数（蛋白质-能量营养不良）",
            "儿童铅中毒诊断标准（血铅水平测定）", "餐后血清锌浓度反应试验（锌缺乏）", "相对剂量反应试验（维生素A缺乏）", "儿童碘缺乏诊断标准（尿碘浓度测定）", "儿童各年龄血苯丙氨酸理想浓度控制范围"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                // 小儿体重身长计算
            }

            1 -> {
                // 儿童补液
            }

            2 -> {
                // 我国0-18岁儿童身高、体重的百分位数标准值
            }

            3 -> {
                // 临床常用液体成分及张力
            }

            4 -> {
                // 婴儿添加辅食的步骤和方法
            }

            5 -> {
                // 理想身高
            }

            6 -> {
                // 小儿出牙顺序
            }

            7 -> {
                // 小儿肠外营养TPN推荐用量表
            }

            8 -> {
                // 小儿体表面积公式
            }

            9 -> {
                // 婴儿营养素的需要
            }

            10 -> {
                // 小儿各年龄平均血压
            }

            11 -> {
                // 儿童口服铁制剂的规格及剂量表
            }

            12 -> {
                // 小儿各年龄动作及行为评分
            }

            13 -> {
                // 小儿药物计算公式3（按体重计算）
            }

            14 -> {
                // 小儿基础代谢率
            }

            15 -> {
                // 小儿各年龄心率平均值及范围
            }

            16 -> {
                // FLACC评分（婴儿和儿童疼痛行为评估量表）
            }

            17 -> {
                // 小儿囟门和颅缝闭合时间
            }
            18 -> {
                // 小儿药物计算公式1（按体表面积计算）
            }
            19 -> {
                // 小儿各年龄呼吸频率平均值
            }
            20 -> {
                // 小儿药物计算公式2（按年龄计算[董氏公式]）
            }
            21 -> {
                // 儿童每日不显性失水量
            }
            22 -> {
                // 小儿身体各部位比例
            }
            23 -> {
                // Conner's简明症状问卷
            }
            24 -> {
                // 尿羟脯氨酸指数（蛋白质-能量营养不良）
            }
            25 -> {
                // 儿童铅中毒诊断标准（血铅水平测定）
            }
            26 -> {
                // 餐后血清锌浓度反应试验（锌缺乏）
            }
            27 -> {
                // 相对剂量反应试验（维生素A缺乏）
            }
            28 -> {
                // 儿童碘缺乏诊断标准（尿碘浓度测定）
            }
            29 -> {
                // 儿童各年龄血苯丙氨酸理想浓度控制范围
            }
        }
    }
}