package com.duckgo.medtools.medicaltools.A_Menu_Select.emergency_department

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Emergency_department_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("CHADS2 score for AF（房颤患者卒中风险评分）", "GRACE风险评分（急性冠脉综合征）", "NIHSS（美国国立卫生院卒中量表）", "GCS（格拉斯哥昏迷评分）", "产后出血量估计与休克指数",
            "CHA2DS-VASc score for AF（房颤卒中风险评分）", "APACHE II评分系统（急性生理和慢性健康评分）", "ABCD评分系统（短暂性脑缺血发作TIA）", "MODS评分", "ESRS（Essen卒中风险评分量表）",
            "COS-SAF symptom score for AF（房颤症状评分）", "上消化道出血病情严重程度分级", "EHRA评分（房颤相关症状分级）", "Alvarado评分（急性阑尾炎）", "TIMI评分（非ST段抬高型心肌梗死评分）",
            "Killip心功能分级（急性心梗）", "SOFA脓毒症评分（序贯性器官功能衰竭评分）", "创伤失血量的判定", "重度子痫前期的诊断", "中国脑卒中患者临床神经功能缺损评分",
            "Ranson标准（急性胰腺炎评分）", "CTSI（急性胰腺炎CT严重程度指数）", "TIMI评分（ST段抬高型心肌梗死评分）", "ABCD2评分（短暂性脑缺血发作评分）", "TOAST分型（急性缺血性脑卒中）",
            "Wells评分（肺栓塞）", "PERC（肺栓塞排除标准）", "Glasgow-Blatchford评分（上消化道出血评分）", "SAPS II（简化的急性生理功能评分系统）", "改良Rankin量表",
            "Forrest分级（消化道出血）", "Rockall评分（急性上消化道出血）", "喉梗阻分度", "新九分法（烧伤面积估计）", "Brooke公式（烧伤补液）",
            "HUNT-HESS分级（蛛网膜下腔出血）", "Geneva预后评分（肺栓塞）", "急性肾损伤AKI诊断和分期标准", "烧伤补液公式（第三军医大学）", "RASS（Richmond躁动-镇静评分）",
            "气胸肺压缩程度估算（三线法）", "Parkland公式（烧伤补液）", "预期肺栓塞早期死亡率的风险分级", "烧伤严重程度分类", "创伤时基础能耗估计",
            "三度四分法（烧伤深度分级）", "气管插管时肌松程度分级", "SFSR定律（旧金山晕厥定律）", "烧伤热量供应公式（第三军医大学）", "急性下肢缺血分级",
            "斯堪地那维亚卒中量表", "DeBakey分型（主动脉夹层）", "急性移植物抗宿主反应GVHD分级", "Stanford分型（主动脉夹层）"

        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //CHADS2 score for AF（房颤患者卒中风险评分）
            }
            1 -> {
                //GRACE风险评分（急性冠脉综合征）
            }
            2 -> {
                //NIHSS（美国国立卫生院卒中量表）
            }
            3 -> {
                //GCS（格拉斯哥昏迷评分）
            }
            4 -> {
                //产后出血量估计与休克指数
            }
            5 -> {
                //CHA2DS-VASc score for AF（房颤卒中风险评分）
            }
            6 -> {
                //APACHE II评分系统（急性生理和慢性健康评分）
            }
            7 -> {
                //ABCD评分系统（短暂性脑缺血发作TIA）
            }
            8 -> {
                //MODS评分
            }
            9 -> {
                //ESRS（Essen卒中风险评分量表）
            }
            10 -> {
                //COS-SAF symptom score for AF（房颤症状评分）
            }
            11 -> {
                //上消化道出血病情严重程度分级
            }
            12 -> {
                //EHRA评分（房颤相关症状分级）
            }
            13 -> {
                //Alvarado评分（急性阑尾炎）
            }
            14 -> {
                //TIMI评分（非ST段抬高型心肌梗死评分）
            }
            15 -> {
                //Killip心功能分级（急性心梗）
            }
            16 -> {
                //SOFA脓毒症评分（序贯性器官功能衰竭评分）
            }
            17 -> {
                //创伤失血量的判定
            }
            18 -> {
                //重度子痫前期的诊断
            }
            19 -> {
                //中国脑卒中患者临床神经功能缺损评分
            }
            20 -> {
                //Ranson标准（急性胰腺炎评分）
            }
            21 -> {
                //CTSI（急性胰腺炎CT严重程度指数）
            }
            22 -> {
                //TIMI评分（ST段抬高型心肌梗死评分）
            }
            23 -> {
                //ABCD2评分（短暂性脑缺血发作评分）
            }
            24 -> {
                //TOAST分型（急性缺血性脑卒中）
            }
            25 -> {
                //Wells评分（肺栓塞）
            }
            26 -> {
                //PERC（肺栓塞排除标准）
            }
            27 -> {
                //Glasgow-Blatchford评分（上消化道出血评分）
            }
            28 -> {
                //SAPS II（简化的急性生理功能评分系统）
            }
            29 -> {
                //改良Rankin量表
            }
            30 -> {
                //Forrest分级（消化道出血）
            }
            31 -> {
                //Rockall评分（急性上消化道出血）
            }
            32 -> {
                //喉梗阻分度
            }
            33 -> {
                //新九分法（烧伤面积估计）
            }
            34 -> {
                //Brooke公式（烧伤补液）
            }
            35 -> {
                //HUNT-HESS分级（蛛网膜下腔出血）
            }
            36 -> {
                //Geneva预后评分（肺栓塞）
            }
            37 -> {
                //急性肾损伤AKI诊断和分期标准
            }
            38 -> {
                //烧伤补液公式（第三军医大学）
            }
            39 -> {
                //RASS（Richmond躁动-镇静评分）
            }
            40 -> {
                //气胸肺压缩程度估算（三线法）
            }
            41 -> {
                //Parkland公式（烧伤补液）
            }
            42 -> {
                //预期肺栓塞早期死亡率的风险分级
            }
            43 -> {
                //烧伤严重程度分类
            }
            44 -> {
                //创伤时基础能耗估计
            }
            45 -> {
                //三度四分法（烧伤深度分级）
            }
            46 -> {
                //气管插管时肌松程度分级
            }
            47 -> {
                //SFSR定律（旧金山晕厥定律）
            }
            48 -> {
                //烧伤热量供应公式（第三军医大学）
            }
            49 -> {
                //急性下肢缺血分级
            }
            50 -> {
                //斯堪地那维亚卒中量表
            }
            51 -> {
                //DeBakey分型（主动脉夹层）
            }
            52 -> {
                //急性移植物抗宿主反应GVHD分级
            }
            53 -> {
                //Stanford分型（主动脉夹层）
            }
        }
    }
}