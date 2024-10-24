package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Cardiovascular_Medicine

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Cardiovascular_Medicine_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener{
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("CRUSADE评分（出血风险评分量表）", "高血压病分级、预后影响因素及危险分层", "CHADS2 score for AF（房颤患者卒中风险评分）", "GRACE风险评分（急性冠脉综合征）", "HAS-BLED评分（口服抗凝出血风险评估）",
            "CHA2DS2-VASc score for AF（房颤患者卒中风险评分）", "华法林出血风险评分-老年患者", "NYHA心功能分级（慢性心衰）", "六分钟步行试验", "Framingham心脏危险评分-男性",
            "COS-SAF symptom score for AF（房颤症状评分）", "SYNTAX积分", "平均动脉压", "EHRA评分（房颤相关症状分级）", "心脏射血分数",
            "TIMI血流分级", "TIMI评分（非ST段抬高型心肌梗死评分）", "心指数", "TIMI评分（ST段抬高型心肌梗死评分）", "EuroSCORE（欧洲心脏危险评估系统）",
            "稳定性心绞痛分级", "Bazett公式（校正QT间期公式）", "Levine6级分级法（心脏杂音）", "OBRI（华法林出血风险评估-门诊病人出血风险指数）", "Framingham心脏危险评分-女性",
            "Mayo系统（PCI并发症风险评分）", "慢性心衰分期", "左心室收缩/舒张末期容积指数", "系统性冠状动脉风险评估量表", "每搏输出量",
            "Framingham诊断标准（慢性充血性心力衰竭）", "MUSIC危险评分（慢性充血性心力衰竭）", "心输出量（超声）", "脉压-补液试验反应预测", "国人缺血性心血管病（ICVD）十年发病危险度评估表-女性",
            "Duke评分（平板运动试验）", "VALIANT风险评分（心衰）", "Gorlin公式（心瓣膜面积）", "高脂血症的钠浓度校正", "体循环阻力",
            "WHO-FC肺动脉高压功能分级", "DeBakey分型（主动脉夹层）", "Stanford（主动脉夹层）", "脐动脉血流阻力指数和收缩期/舒张期比值", "体循环至肺循环分流型先心病推荐手术安全性的无创评估及心导管评估表"
        )

        return dataSet
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //CRUSADE评分（出血风险评分量表）
            }
            1 -> {
                //高血压病分级、预后影响因素及危险分层
            }
            2 -> {
                //CHADS2 score for AF（房颤患者卒中风险评分）
            }
            3 -> {
                //GRACE风险评分（急性冠脉综合征）
            }
            4 -> {
                //HAS-BLED评分（口服抗凝出血风险评估）
            }
            5 -> {
                //CHA2DS2-VASc score for AF（房颤患者卒中风险评分）
            }
            6 -> {
                //华法林出血风险评分-老年患者
            }
            7 -> {
                //NYHA心功能分级（慢性心衰）
            }
            8 -> {
                //六分钟步行试验
            }
            9 -> {
                //Framingham心脏危险评分-男性
            }
            10 -> {
                //COS-SAF symptom score for AF（房颤症状评分）
            }
            11 -> {
                //SYNTAX积分
            }
            12 -> {
                //平均动脉压
            }
            13 -> {
                //EHRA评分（房颤相关症状分级）
            }
            14 -> {
                //心脏射血分数
            }
            15 -> {
                //TIMI血流分级
            }
            16 -> {
                //TIMI评分（非ST段抬高型心肌梗死评分）
            }
            17 -> {
                //心指数
            }
            18 -> {
                //TIMI评分（ST段抬高型心肌梗死评分）
            }
            19 -> {
                //EuroSCORE（欧洲心脏危险评估系统）
            }
            20 -> {
                //稳定性心绞痛分级
            }
            21 -> {
                //Bazett公式（校正QT间期公式）
            }
            22 -> {
                //Levine6级分级法（心脏杂音）
            }
            23 -> {
                //OBRI（华法林出血风险评估-门诊病人出血风险指数）
            }
            24 -> {
                //Framingham心脏危险评分-女性
            }
            25 -> {
                //Mayo系统（PCI并发症风险评分）
            }
            26 -> {
                //慢性心衰分期
            }
            27 -> {
                //左心室收缩/舒张末期容积指数
            }
            28 -> {
                //系统性冠状动脉风险评估量表
            }
            29 -> {
                //每搏输出量
            }
            30 -> {
                //Framingham诊断标准（慢性充血性心力衰竭）
            }
            31 -> {
                //MUSIC危险评分（慢性充血性心力衰竭）
            }
            32 -> {
                //心输出量（超声）
            }
            33 -> {
                //脉压-补液试验反应预测
            }
            34 -> {
                //国人缺血性心血管病（ICVD）十年发病危险度评估表-女性
            }
            35 -> {
                //Duke评分（平板运动试验）
            }
            36 -> {
                //VALIANT风险评分（心衰）
            }
            37 -> {
                //Gorlin公式（心瓣膜面积）
            }
            38 -> {
                //高脂血症的钠浓度校正
            }
            39 -> {
                //体循环阻力
            }
            40 -> {
                //WHO-FC肺动脉高压功能分级
            }
            41 -> {
                //DeBakey分型（主动脉夹层）
            }
            42 -> {
                //Stanford（主动脉夹层）
            }
            43 -> {
                //脐动脉血流阻力指数和收缩期/舒张期比值
            }
            44 -> {
                //体循环至肺循环分流型先心病推荐手术安全性的无创评估及心导管评估表
            }
        }
    }
}