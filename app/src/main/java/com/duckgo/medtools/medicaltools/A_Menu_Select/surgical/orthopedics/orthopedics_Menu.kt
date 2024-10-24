package com.duckgo.medtools.medicaltools.A_Menu_Select.surgical.orthopedics

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class orthopedics_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("亚洲人骨质疏松自我筛查工具", "Denis分型（爆裂骨折）", "骨质疏松风险一分钟测试题", "Delee分型（尺骨鹰嘴骨折）", "改良Evans分类（股骨转子间骨折）",
            "Amor诊断标准（脊柱关节病诊断标准）", "AO分类（肱骨近端骨折）", "Frankel功能分级/ASIA分级（脊髓损伤严重程度）", "腰间盘突出症的症状和体征", "Sanders分类（根骨骨折）",
            "腕管综合征功能评定表", "Frankel脊髓损伤分级法", "Schatzker分型（胫骨平台骨折）", "Lauge-Hansen分类（踝关节骨折）", "Denis分类（脊柱骨折）",
            "Green分类法（第一掌骨基底部骨折）", "HSS评分（美国特种外科医院膝关节评分）", "骨肿瘤TNM分期", "Neer分类（肱骨近端骨折）", "脊髓型颈椎病JOA评分（17分法）",
            "Tile分型（骨盆骨折）", "Weber-Cech分类（骨折不愈合和延迟愈合）", "TLICS评分系统（胸腰椎损伤）", "腰背痛手术评分标准", "颈神经根受累的症状和体征",
            "Codman分类（肱骨近端骨折）", "颈性眩晕症状与功能评估量表", "改良Ellis分类（胫骨骨折）", "Anderson分类（开放性骨折）", "锁骨骨折分类",
            "肱骨髁上骨折分类", "AO分型（髋臼骨折）", "颈椎病患者脊髓功能状态评定", "肩关节后脱位分型", "JOA腰背痛疾病治疗成绩标准评分",
            "Gustilo-Anderson分类（开放性骨折）", "Danis-Weber分类（髁关节骨折）", "Bado分型（孟氏骨折Monteggia骨折）", "AO分型（舟骨骨折）", "Young/Burgress分型（骨盆骨折）",
            "HSS评分（肘关节）", "Rockwood分类（复发性肩关节半脱位）", "Fernanda分类（桡骨远端骨折）", "Smith骨折分类（桡骨远端骨折）", "肱骨外髁骨折分型（北京积水潭医院）",
            "Allman分类法（肩锁关节脱位）", "Fryman分类（桡骨远端骨折）", "漏斗胸指数", "Gartland分型（肱骨髁上骨折）", "腕舟骨骨折",
            "舟月不稳定分级", "肱骨内上髁骨折分度", "Kocher分类（肱骨近端骨折）", "肱骨髁间骨折机制分型", "朱通伯分类（开放性骨折）",
            "王亦璁分类（开放性骨折）", "Lindstrom分度（桡骨远端骨折）", "Roland-Morris腰椎功能障碍问卷", "Hotchkiss分类（桡骨头骨折）", "Rockwood分类法（肩锁关节脱位）",
            "Herbert分型（舟骨骨折）", "Mason分类（桡骨头骨折）", "Neer分型（锁骨远端骨折）", "Cassebaum评分系统（肘关节）", "Watson-Jones分类（肱骨近端骨折）",
            "Miller分类（肩胛骨骨折）", "Enneking外科分期（肌肉骨骼肿瘤）", "Ideberg分型（关节盂软骨内骨折）", "Tossy分型（肩锁关节脱位分型）", "Riseborough分型（肱骨髁间骨折）",
            "Pavlov比值测定", "Letournel-Judet分型（髋臼骨折）", "桡骨远端骨折按关节面情况的分级", "肩关节疾患治疗成绩判定标准", "Regan分型（肘关节尺骨冠状突骨折）",
            "美国肩肘外科评分", "Mehdian分型标准（肱骨小头骨折Kocher骨折）", "Karlsson术后疗效评分标准", "Mcintyre肱骨髁上骨折分类表", "Thomas分类（肩关节不稳定）",
            "Ferguson分型（屈曲压缩骨折）", "Silliman分类（肩关节不稳定）", "Lazzcano术后疗效评分标准", "月骨周围脱位分期", "Ishida-Ikuta评分系统（近指间关节骨折脱位）",
            "月骨周围脱位根据损伤程度与位置分型", "Zdravkovic-Damholt分型（肩胛骨）", "PSI分类（肩关节后方不稳定）", "Eyres-Brooks分型（肩胛骨喙突骨折）"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //亚洲人骨质疏松自我筛查工具
            }
            1 -> {
                //Denis分型（爆裂骨折）
            }
            2 -> {
                //骨质疏松风险一分钟测试题
            }
            3 -> {
                //Delee分型（尺骨鹰嘴骨折）
            }
            4 -> {
                //改良Evans分类（股骨转子间骨折）
            }
            5 -> {
                //Amor诊断标准（脊柱关节病诊断标准）
            }
            6 -> {
                //AO分类（肱骨近端骨折）
            }
            7 -> {
                //Frankel功能分级/ASIA分级（脊髓损伤严重程度）
            }
            8 -> {
                //腰间盘突出症的症状和体征
            }
            9 -> {
                //Sanders分类（根骨骨折）
            }
            10 -> {
                //腕管综合征功能评定表
            }
            11 -> {
                //Frankel脊髓损伤分级法
            }
            12 -> {
                //Schatzker分型（胫骨平台骨折）
            }
            13 -> {
                //Lauge-Hansen分类（踝关节骨折）
            }
            14 -> {
                //Denis分类（脊柱骨折）
            }
            15 -> {
                //Green分类法（第一掌骨基底部骨折）
            }
            16 -> {
                //HSS评分（美国特种外科医院膝关节评分）
            }
            17 -> {
                //骨肿瘤TNM分期
            }
            18 -> {
                //Neer分类（肱骨近端骨折）
            }
            19 -> {
                //脊髓型颈椎病JOA评分（17分法）
            }
            20 -> {
                //Tile分型（骨盆骨折）
            }
            21 -> {
                //Weber-Cech分类（骨折不愈合和延迟愈合）
            }
            22 -> {
                //TLICS评分系统（胸腰椎损伤）
            }
            23 -> {
                //腰背痛手术评分标准
            }
            24 -> {
                //颈神经根受累的症状和体征
            }
            25 -> {
                //Codman分类（肱骨近端骨折）
            }
            26 -> {
                //颈性眩晕症状与功能评估量表
            }
            27 -> {
                //改良Ellis分类（胫骨骨折）
            }
            28 -> {
                //Anderson分类（开放性骨折）
            }
            29 -> {
                //锁骨骨折分类
            }
            30 -> {
                //肱骨髁上骨折分类
            }
            31 -> {
                //AO分型（髋臼骨折）
            }
            32 -> {
                //颈椎病患者脊髓功能状态评定
            }
            33 -> {
                //肩关节后脱位分型
            }
            34 -> {
                //JOA腰背痛疾病治疗成绩标准评分
            }
            35 -> {
                //Gustilo-Anderson分类（开放性骨折）
            }
            36 -> {
                //Danis-Weber分类（髁关节骨折）
            }
            37 -> {
                //Bado分型（孟氏骨折Monteggia骨折）
            }
            38 -> {
                //AO分型（舟骨骨折）
            }
            39 -> {
                //Young/Burgress分型（骨盆骨折）
            }
            40 -> {
                //HSS评分（肘关节）
            }
            41 -> {
                //Rockwood分类（复发性肩关节半脱位）
            }
            42 -> {
                //Fernanda分类（桡骨远端骨折）
            }
            43 -> {
                //Smith骨折分类（桡骨远端骨折）
            }
            44 -> {
                //肱骨外髁骨折分型（北京积水潭医院）
            }
            45 -> {
                //Allman分类法（肩锁关节脱位）
            }
            46 -> {
                //Fryman分类（桡骨远端骨折）
            }
            47 -> {
                //漏斗胸指数
            }
            48 -> {
                //Gartland分型（肱骨髁上骨折）
            }
            49 -> {
                //腕舟骨骨折
            }
            50 -> {
                //舟月不稳定分级
            }
            51 -> {
                //肱骨内上髁骨折分度
            }
            52 -> {
                //Kocher分类（肱骨近端骨折）
            }
            53 -> {
                //肱骨髁间骨折机制分型
            }
            54 -> {
                //朱通伯分类（开放性骨折）
            }
            55 -> {
                //王亦璁分类（开放性骨折）
            }
            56 -> {
                //Lindstrom分度（桡骨远端骨折）
            }
            57 -> {
                //Roland-Morris腰椎功能障碍问卷
            }
            58 -> {
                //Hotchkiss分类（桡骨头骨折）
            }
            59 -> {
                //Rockwood分类法（肩锁关节脱位）
            }
            60 -> {
                //Herbert分型（舟骨骨折）
            }
            61 -> {
                //Mason分类（桡骨头骨折）
            }
            62 -> {
                //Neer分型（锁骨远端骨折）
            }
            63 -> {
                //Cassebaum评分系统（肘关节）
            }
            64 -> {
                //Watson-Jones分类（肱骨近端骨折）
            }
            65 -> {
                //Miller分类（肩胛骨骨折）
            }
            66 -> {
                //Enneking外科分期（肌肉骨骼肿瘤）
            }
            67 -> {
                //Ideberg分型（关节盂软骨内骨折）
            }
            68 -> {
                //Tossy分型（肩锁关节脱位分型）
            }
            69 -> {
                //Riseborough分型（肱骨髁间骨折）
            }
            70 -> {
                //Pavlov比值测定
            }
            71 -> {
                //Letournel-Judet分型（髋臼骨折）
            }
            72 -> {
                //桡骨远端骨折按关节面情况的分级
            }
            73 -> {
                //肩关节疾患治疗成绩判定标准
            }
            74 -> {
                //Regan分型（肘关节尺骨冠状突骨折）
            }
            75 -> {
                //美国肩肘外科评分
            }
            76 -> {
                //Mehdian分型标准（肱骨小头骨折Kocher骨折）
            }
            77 -> {
                //Karlsson术后疗效评分标准
            }
            78 -> {
                //Mcintyre肱骨髁上骨折分类表
            }
            79 -> {
                //Thomas分类（肩关节不稳定）
            }
            80 -> {
                //Ferguson分型（屈曲压缩骨折）
            }
            81 -> {
                //Silliman分类（肩关节不稳定）
            }
            82 -> {
                //Lazzcano术后疗效评分标准
            }
            83 -> {
                //月骨周围脱位分期
            }
            84 -> {
                //Ishida-Ikuta评分系统（近指间关节骨折脱位）
            }
            85 -> {
                //月骨周围脱位根据损伤程度与位置分型
            }
            86 -> {
                //Zdravkovic-Damholt分型（肩胛骨）
            }
            87 -> {
                //PSI分类（肩关节后方不稳定）
            }
            88 -> {
                //Eyres-Brooks分型（肩胛骨喙突骨折）
            }
        }
    }
}