package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Cardiovascular_Medicine

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Cardiovascular_Medicine_Menu : Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {

    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf(
            "CRUSADE评分（出血风险评分量表）", "高血压病分级、预后影响因素及危险分层", "CHADS2 score for AF（房颤患者卒中风险评分）", "GRACE风险评分（急性冠脉综合征）", "HAS-BLED评分（口服抗凝出血风险评估）",
            "CHA2DS2-VASc score for AF（房颤患者卒中风险评分）", "华法林出血风险评分-老年患者", "NYHA心功能分级（慢性心衰）", "六分钟步行试验", "Framingham心脏危险评分-男性",
            "COS-SAF symptom score for AF（房颤症状评分）", "SYNTAX积分", "平均动脉压", "EHRA评分（房颤相关症状分级）", "心脏射血分数",
            "TIMI血流分级", "TIMI评分（非ST段抬高型心肌梗死评分）", "心指数", "TIMI评分（ST段抬高型心肌梗死评分）", "EuroSCORE（欧洲心脏危险评估系统）",
            "稳定性心绞痛分级", "Bazett公式（校正QT间期公式）", "Levine6级分级法（心脏杂音）", "OBRI（华法林出血风险评估-门诊病人出血风险指数）", "Framingham心脏危险评分-女性",
            "Mayo系统（PCI并发症风险评分）", "慢性心衰分期", "左心室收缩/舒张末期容积指数", "系统性冠状动脉风险评估量表", "每搏输出量",
            "Framingham诊断标准（慢性充血性心力衰竭）", "MUSIC危险评分（慢性充血性心力衰竭）", "心输出量（超声）", "脉压-补液试验反应预测", "国人缺血性心血管病（ICVD）十年发病危险度评估表-女性",
            "Duke评分（平板运动试验）", "VALIANT风险评分（心衰）", "Gorlin公式（心瓣膜面积）", "高脂血症的钠浓度校正", "体循环阻力",
            "WHO-FC肺动脉高压功能分级", "DeBakey分型（主动脉夹层）", "Stanford（主动脉夹层）", "脐动脉血流阻力指数和收缩期/舒张期比值", "体循环至肺循环分流型先心病推荐手术安全性的无创评估及心导管评估表"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 可在此处实现具体详情页跳转
        }
    }
}