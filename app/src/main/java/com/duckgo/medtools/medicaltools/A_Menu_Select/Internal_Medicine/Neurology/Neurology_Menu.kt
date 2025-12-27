package com.duckgo.medtools.medicaltools.A_Menu_Select.Internal_Medicine.Neurology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Neurology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        dataSet = mutableListOf("NIHSS（美国国立卫生院卒中量表）", "GCS（格拉斯哥昏迷评分）", "华法林出血风险评分-老年患者", "ABCD评分系统（短暂性脑缺血发作TIA）", "肝性脑病分期",
            "ESRS（Essen卒中风险评分量表）", "颅内出血体积计算", "阿尔兹海默病临床诊断标准", "痴呆的诊断标准", "中国脑卒中患者临床神经功能缺损评分",
            "Brunnstrom分期（肌力评定）", "ABCD2评分（短暂性脑缺血发作评分）", "TOAST分型（急性缺血性脑卒中）", "骨骼肌肌力检查办法", "吞咽功能障碍饮水实验",
            "丛集性头痛诊断标准", "OBRI（华法林出血风险评估-门诊病人出血风险指数）", "真性球性麻痹和假性球麻痹的鉴别", "改良Rankin量表", "帕金森病分级标准",
            "HUNT-HESS分级（蛛网膜下腔出血）", "多发性硬化的临床分型", "昏迷、植物状态、最低意识状态和闭锁综合征的临床特征比较", "HIS（Hachinski缺血指数量表）", "吞咽障碍的饮食分级",
            "前庭周围性眩晕及前庭中枢性眩晕的鉴别", "不同部位脊髓疾病的好发部位及损坏表现", "血管性痴呆诊断标准草案要点", "脑灌注压", "ICHD-II R1诊断标准（偏头痛）",
            "运动瘫痪类型的鉴别", "改良Ashworth分级评定标准", "Fugl-Meyer平衡功能评定", "雷诺病和雷诺现象鉴别", "SFSR定律（旧金山晕厥定律）",
            "血性脑脊液白细胞校正", "脊髓休克和脊髓震荡的鉴别", "多发性硬化McDonald诊断标准", "持续性植物状态中美临床诊断标准", "托吡酯加量方法（日计量）",
            "慢性紧张型头痛CTTH诊断标准", "癫痫持续性状态分类（国际抗癫痫联盟-新）", "改良Ashworth量表（肌痉挛评定）", "匹兹堡脑干评定", "Wingerchuk推荐视神经脊髓炎诊断标准",
            "Barnett分型（脊髓空洞症）", "Chiari畸形CT/MRI表现（小脑扁桃体下疝畸形）", "压迫性脊髓病的横向定位诊断", "Chiari畸形分型（小脑扁桃体下疝畸形）", "PVS表（持续性植物状态评分表）",
            "神经系统副肿瘤综合征PNS诊断标准", "Taylor-Pelmear分期（雷诺现象）", "ICHD-II R1诊断标准（药物过度使用性头痛）", "频发复发性紧张型头痛FETTH诊断标准", "进行性肌营养不良的功能分组",
            "Poser诊断标准（多发性硬化）", "NFI和NFII诊断标准（神经纤维瘤病）", "少发复发性紧张型头痛IETTH诊断标准"
        )
    }

    override fun onItemClick(position: Int) {
        when (position) {
            // 实现具体跳转逻辑
        }
    }
}
