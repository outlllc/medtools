package com.duckgo.medtools.medicaltools.expandtabviewmenu.Internal_Medicine.Neurology

import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Neurology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>() {
    override fun getFragmentViewBinding() = MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)

    override fun initData() {
        addMenuItem("NIHSS（美国国立卫生院卒中量表）") { TODO("Wait for Fragment") } // { NIHSS_fm() }
        addMenuItem("GCS（格拉斯哥昏迷评分）") { TODO("Wait for Fragment") } // { GCS_fm() }
        addMenuItem("华法林出血风险评分-老年患者") { TODO("Wait for Fragment") } // { Warfarin_Risk_Elderly_fm() }
        addMenuItem("ABCD评分系统（短暂性脑缺血发作TIA）") { TODO("Wait for Fragment") } // { ABCD_Score_fm() }
        addMenuItem("肝性脑病分期") { TODO("Wait for Fragment") } // { Hepatic_Encephalopathy_Staging_fm() }
        addMenuItem("ESRS（Essen卒中风险评分量表）") { TODO("Wait for Fragment") } // { ESRS_fm() }
        addMenuItem("颅内出血体积计算") { TODO("Wait for Fragment") } // { Ich_Volume_fm() }
        addMenuItem("阿尔兹海默病临床诊断标准") { TODO("Wait for Fragment") } // { Alzheimer_Criteria_fm() }
        addMenuItem("痴呆的诊断标准") { TODO("Wait for Fragment") } // { Dementia_Criteria_fm() }
        addMenuItem("中国脑卒中患者临床神经功能缺损评分") { TODO("Wait for Fragment") } // { Chinese_Stroke_Scale_fm() }
        addMenuItem("Brunnstrom分期（肌力评定）") { TODO("Wait for Fragment") } // { Brunnstrom_Staging_fm() }
        addMenuItem("ABCD2评分（短暂性脑缺血发作评分）") { TODO("Wait for Fragment") } // { ABCD2_Score_fm() }
        addMenuItem("TOAST分型（急性缺血性脑卒中）") { TODO("Wait for Fragment") } // { Toast_Classification_fm() }
        addMenuItem("骨骼肌肌力检查办法") { TODO("Wait for Fragment") } // { Muscle_Strength_Check_fm() }
        addMenuItem("吞咽功能障碍饮水实验") { TODO("Wait for Fragment") } // { Water_Swallow_Test_fm() }
        addMenuItem("丛集性头痛诊断标准") { TODO("Wait for Fragment") } // { Cluster_Headache_Criteria_fm() }
        addMenuItem("OBRI（华法林出血风险评估-门诊病人出血风险指数）") { TODO("Wait for Fragment") } // { OBRI_fm() }
        addMenuItem("真性球性麻痹和假性球麻痹的鉴别") { TODO("Wait for Fragment") } // { Bulbar_Palsy_Differential_fm() }
        addMenuItem("改良Rankin量表") { TODO("Wait for Fragment") } // { Mrs_Scale_fm() }
        addMenuItem("帕金森病分级标准") { TODO("Wait for Fragment") } // { Parkinson_Grading_fm() }
        addMenuItem("HUNT-HESS分级（蛛网膜下腔出血）") { TODO("Wait for Fragment") } // { Hunt_Hess_Grading_fm() }
        addMenuItem("多发性硬化的临床分型") { TODO("Wait for Fragment") } // { Ms_Clinical_Types_fm() }
        addMenuItem("昏迷、植物状态、最低意识状态和闭锁综合征的临床特征比较") { TODO("Wait for Fragment") } // { Consciousness_Comparison_fm() }
        addMenuItem("HIS（Hachinski缺血指数量表）") { TODO("Wait for Fragment") } // { HIS_Score_fm() }
        addMenuItem("吞咽障碍的饮食分级") { TODO("Wait for Fragment") } // { Dysphagia_Diet_Grading_fm() }
        addMenuItem("前庭周围性眩晕及前庭中枢性眩晕的鉴别") { TODO("Wait for Fragment") } // { Vertigo_Differential_fm() }
        addMenuItem("不同部位脊髓疾病的好发部位及损坏表现") { TODO("Wait for Fragment") } // { Spinal_Cord_Damage_fm() }
        addMenuItem("血管性痴呆诊断标准草案要点") { TODO("Wait for Fragment") } // { Vascular_Dementia_Criteria_fm() }
        addMenuItem("脑灌注压") { TODO("Wait for Fragment") } // { Cpp_Calculation_fm() }
        addMenuItem("ICHD-II R1诊断标准（偏头痛）") { TODO("Wait for Fragment") } // { Migraine_Criteria_fm() }
        addMenuItem("运动瘫痪类型的鉴别") { TODO("Wait for Fragment") } // { Motor_Paralysis_Differential_fm() }
        addMenuItem("改良Ashworth分级评定标准") { TODO("Wait for Fragment") } // { Modified_Ashworth_Scale_fm() }
        addMenuItem("Fugl-Meyer平衡功能评定") { TODO("Wait for Fragment") } // { Fugl_Meyer_Balance_fm() }
        addMenuItem("雷诺病和雷诺现象鉴别") { TODO("Wait for Fragment") } // { Raynaud_Differential_fm() }
        addMenuItem("SFSR定律（旧金山晕厥定律）") { TODO("Wait for Fragment") } // { Sfsr_Syncope_Rule_fm() }
        addMenuItem("血性脑脊液白细胞校正") { TODO("Wait for Fragment") } // { Csf_Wbc_Correction_fm() }
        addMenuItem("脊髓休克和脊髓震荡的鉴别") { TODO("Wait for Fragment") } // { Spinal_Shock_Differential_fm() }
        addMenuItem("多发性硬化McDonald诊断标准") { TODO("Wait for Fragment") } // { Mcdonald_Criteria_fm() }
        addMenuItem("持续性植物状态中美临床诊断标准") { TODO("Wait for Fragment") } // { Pvs_Criteria_fm() }
        addMenuItem("托吡酯加量方法（日剂量）") { TODO("Wait for Fragment") } // { Topiramate_Dosage_fm() }
        addMenuItem("慢性紧张型头痛CTTH诊断标准") { TODO("Wait for Fragment") } // { CTTH_Criteria_fm() }
        addMenuItem("癫痫持续性状态分类（国际抗癫痫联盟-新）") { TODO("Wait for Fragment") } // { Status_Epilepticus_Classification_fm() }
        addMenuItem("改良Ashworth量表（肌痉挛评定）") { TODO("Wait for Fragment") } // { Ashworth_Spasticity_fm() }
        addMenuItem("匹兹堡脑干评定") { TODO("Wait for Fragment") } // { Pittsburgh_Brainstem_Score_fm() }
        addMenuItem("Wingerchuk推荐视神经脊髓炎诊断标准") { TODO("Wait for Fragment") } // { Nmo_Criteria_fm() }
        addMenuItem("Barnett分型（脊髓空洞症）") { TODO("Wait for Fragment") } // { Syringomyelia_Barnett_fm() }
        addMenuItem("Chiari畸形CT/MRI表现（小脑扁桃体下疝畸形）") { TODO("Wait for Fragment") } // { Chiari_Imaging_fm() }
        addMenuItem("压迫性脊髓病的横向定位诊断") { TODO("Wait for Fragment") } // { Spinal_Cord_Compression_fm() }
        addMenuItem("Chiari畸形分型（小脑扁桃体下疝畸形）") { TODO("Wait for Fragment") } // { Chiari_Classification_fm() }
        addMenuItem("PVS表（持续性植物状态评分表）") { TODO("Wait for Fragment") } // { Pvs_Score_fm() }
        addMenuItem("神经系统副肿瘤综合征PNS诊断标准") { TODO("Wait for Fragment") } // { PNS_Criteria_fm() }
        addMenuItem("Taylor-Pelmear分期（雷诺现象）") { TODO("Wait for Fragment") } // { Taylor_Pelmear_Staging_fm() }
        addMenuItem("ICHD-II R1诊断标准（药物过度使用性头痛）") { TODO("Wait for Fragment") } // { Moh_Criteria_fm() }
        addMenuItem("频发复发性紧张型头痛FETTH诊断标准") { TODO("Wait for Fragment") } // { FETTH_Criteria_fm() }
        addMenuItem("进行性肌营养不良的功能分组") { TODO("Wait for Fragment") } // { Muscular_Dystrophy_Grouping_fm() }
        addMenuItem("Poser诊断标准（多发性硬化）") { TODO("Wait for Fragment") } // { Poser_Criteria_fm() }
        addMenuItem("NFI和NFII诊断标准（神经纤维瘤病）") { TODO("Wait for Fragment") } // { Nf_Criteria_fm() }
        addMenuItem("少发复发性紧张型头痛IETTH诊断标准") { TODO("Wait for Fragment") } // { IETTH_Criteria_fm() }
    }
}
