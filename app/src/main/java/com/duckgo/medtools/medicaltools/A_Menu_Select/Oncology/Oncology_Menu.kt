package com.duckgo.medtools.medicaltools.A_Menu_Select.Oncology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Oncology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("肺癌TNM分期", "结直肠癌TNM分期", "胃癌TNM分期", "乳腺癌TNM分期", "食管癌TNM分期",
            "咽部肿瘤TNM分期", "ZPS（体力状况ECOG评分标准）", "唇和口腔肿瘤TNM分期", "KPS法和ZPS法（体能状态评分标准）", "肝癌TNM分期",
            "宫颈癌TNM分期", "甲状腺肿瘤TNM分期", "宫颈癌分期（FIGO,2018）", "宫颈癌分期（FIGO,2014）", "喉部肿瘤TNM分期",
            "鼻腔与鼻窦肿瘤TNM分期", "霍奇金和非霍奇金淋巴瘤TNM分期", "胰腺癌TNM分期", "化疗后骨髓抑制的分度", "卵巢癌TNM分期",
            "腹腔器官肿瘤标志物分类", "子宫体肿瘤TNM分期", "卵巢癌、输卵管癌和腹膜癌的分期系统（FOGO/TNM,2014）", "BCLC分期（巴塞罗那肝癌分级）", "前列腺癌TNM分期",
            "肾癌TNM分期", "Durie-Salmon分期（多发性骨髓瘤MM）", "IPI（国际淋巴瘤预后指数）", "肾盂和输尿管肿瘤TNM分期", "乳腺癌术后复发风险分组及全身辅助治疗选择",
            "胆囊癌TNM分期", "结直肠息肉分类", "急性髓系白血病的危险度分级", "膀胱肿瘤TNM分期", "子宫内膜癌分期（FOGO,2014）",
            "小肠肿瘤TNM分期", "ISS（多发性骨髓瘤MM国际分期系统）", "大唾液腺肿瘤TNM分期", "Dukes分期（大肠癌）", "胃肠道间质瘤TNM分期",
            "Broders分级（结直肠癌组织学）", "Bismuth-Corlette分型（肝门部胆管癌）", "Butchart分期（弥漫型恶性胸膜间皮瘤）", "神经内分泌瘤TNM分期", "肝内胆管癌TNM分期",
            "肝门胆管癌TNM分期", "膀胱癌TNM分期", "阑尾肿瘤TNM分期", "滋养细胞肿瘤改良预后评分系统（FOGO,2000）", "GIST切除术后风险分级（胃肠道间质瘤）",
            "HL国际预后评分（霍奇金淋巴瘤）", "肛管癌TNM分期", "软组织肉瘤TNM分期", "Ann Arbor分期系统（霍奇金淋巴瘤HL分期）", "胰腺内分泌肿瘤PEN类型及相关临床综合征",
            "Vater壶腹癌TNM分期", "睾丸肿瘤TNM分期", "未成熟畸胎瘤的分级方法", "阴茎癌TNM分期", "骨肿瘤TNM分期",
            "外阴癌TNM分期", "阴道癌TNM分期", "胸膜间皮瘤TNM分期", "远端胆管癌TNM分期", "膀胱尿路上皮恶性程度分级系统",
            "原发性皮肤淋巴瘤TNM分期", "皮肤鳞状细胞癌及其它皮肤肿瘤TNM分期", "皮肤黑色素瘤TNM分期", "滋养细胞肿瘤解剖学分期（FOGO,2000）", "子宫肉瘤分期（FIGO,2009）",
            "神经系统副肿瘤综合征PNS诊断标准", "输卵管癌手术病理分期（FOGO,2000）", "妊娠滋养细胞肿瘤TNM分期", "不同因素对膀胱癌复发与进展影响的评分", "肾上腺肿瘤TNM分期",
            "外阴癌分期（FIGO,2014）", "输卵管肿瘤TNM分期", "尿道肿瘤TNM分期", "阴道癌分期（FIGO,UICC）", "Crawford分型（胸腹主动脉瘤）",
            "外阴鳞状上皮内瘤变分类及特征", "NFI和NFII诊断标准（神经纤维瘤病）", "Merkel细胞瘤TNM分期"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //肺癌TNM分期
            }
            1 -> {
                //结直肠癌TNM分期
            }
            2 -> {
                //胃癌TNM分期
            }
            3 -> {
                //乳腺癌TNM分期
            }
            4 -> {
                //食管癌TNM分期
            }
            5 -> {
                //咽部肿瘤TNM分期
            }
            6 -> {
                //ZPS（体力状况ECOG评分标准）
            }
            7 -> {
                //唇和口腔肿瘤TNM分期
            }
            8 -> {
                //KPS法和ZPS法（体能状态评分标准）
            }
            9 -> {
                //肝癌TNM分期
            }
            10 -> {
                //宫颈癌TNM分期
            }
            11 -> {
                //甲状腺肿瘤TNM分期
            }
            12 -> {
                //宫颈癌分期（FIGO,2018）
            }
            13 -> {
                //宫颈癌分期（FIGO,2014）
            }
            14 -> {
                //喉部肿瘤TNM分期
            }
            15 -> {
                //鼻腔与鼻窦肿瘤TNM分期
            }
            16 -> {
                //霍奇金和非霍奇金淋巴瘤TNM分期
            }
            17 -> {
                //胰腺癌TNM分期
            }
            18 -> {
                //化疗后骨髓抑制的分度
            }
            19 -> {
                //卵巢癌TNM分期
            }
            20 -> {
                //腹腔器官肿瘤标志物分类
            }
            21 -> {
                //子宫体肿瘤TNM分期
            }
            22 -> {
                //卵巢癌、输卵管癌和腹膜癌的分期系统（FOGO/TNM,2014）
            }
            23 -> {
                //BCLC分期（巴塞罗那肝癌分级）
            }
            24 -> {
                //前列腺癌TNM分期
            }
            25 -> {
                //肾癌TNM分期
            }
            26 -> {
                //Durie-Salmon分期（多发性骨髓瘤MM）
            }
            27 -> {
                //IPI（国际淋巴瘤预后指数）
            }
            28 -> {
                //肾盂和输尿管肿瘤TNM分期
            }
            29 -> {
                //乳腺癌术后复发风险分组及全身辅助治疗选择
            }
            30 -> {
                //胆囊癌TNM分期
            }
            31 -> {
                //结直肠息肉分类
            }
            32 -> {
                //急性髓系白血病的危险度分级
            }
            33 -> {
                //膀胱肿瘤TNM分期
            }
            34 -> {
                //子宫内膜癌分期（FOGO,2014）
            }
            35 -> {
                //小肠肿瘤TNM分期
            }
            36 -> {
                //ISS（多发性骨髓瘤MM国际分期系统）
            }
            37 -> {
                //大唾液腺肿瘤TNM分期
            }
            38 -> {
                //Dukes分期（大肠癌）
            }
            39 -> {
                //胃肠道间质瘤TNM分期
            }
            40 -> {
                //Broders分级（结直肠癌组织学）
            }
            41 -> {
                //Bismuth-Corlette分型（肝门部胆管癌）
            }
            42 -> {
                //Butchart分期（弥漫型恶性胸膜间皮瘤）
            }
            43 -> {
                //神经内分泌瘤TNM分期
            }
            44 -> {
                //肝内胆管癌TNM分期
            }
            45 -> {
                //肝门胆管癌TNM分期
            }
            46 -> {
                //膀胱癌TNM分期
            }
            47 -> {
                //阑尾肿瘤TNM分期
            }
            48 -> {
                //滋养细胞肿瘤改良预后评分系统（FOGO,2000）
            }
            49 -> {
                //GIST切除术后风险分级（胃肠道间质瘤）
            }
            50 -> {
                //HL国际预后评分（霍奇金淋巴瘤）
            }
            51 -> {
                //肛管癌TNM分期
            }
            52 -> {
                //软组织肉瘤TNM分期
            }
            53 -> {
                //Ann Arbor分期系统（霍奇金淋巴瘤HL分期）
            }
            54 -> {
                //胰腺内分泌肿瘤PEN类型及相关临床综合征
            }
            55 -> {
                //Vater壶腹癌TNM分期
            }
            56 -> {
                //睾丸肿瘤TNM分期
            }
            57 -> {
                //未成熟畸胎瘤的分级方法
            }
            58 -> {
                //阴茎癌TNM分期
            }
            59 -> {
                //骨肿瘤TNM分期
            }
            60 -> {
                //外阴癌TNM分期
            }
            61 -> {
                //阴道癌TNM分期
            }
            62 -> {
                //胸膜间皮瘤TNM分期
            }
            63 -> {
                //远端胆管癌TNM分期
            }
            64 -> {
                //膀胱尿路上皮恶性程度分级系统
            }
            65 -> {
                //原发性皮肤淋巴瘤TNM分期
            }
            66 -> {
                //皮肤鳞状细胞癌及其它皮肤肿瘤TNM分期
            }
            67 -> {
                //皮肤黑色素瘤TNM分期
            }
            68 -> {
                //滋养细胞肿瘤解剖学分期（FOGO,2000）
            }
            69 -> {
                //子宫肉瘤分期（FIGO,2009）
            }
            70 -> {
                //神经系统副肿瘤综合征PNS诊断标准
            }
            71 -> {
                //输卵管癌手术病理分期（FOGO,2000）
            }
            72 -> {
                //妊娠滋养细胞肿瘤TNM分期
            }
            73 -> {
                //不同因素对膀胱癌复发与进展影响的评分
            }
            74 -> {
                //肾上腺肿瘤TNM分期
            }
            75 -> {
                //外阴癌分期（FIGO,2014）
            }
            76 -> {
                //输卵管肿瘤TNM分期
            }
            77 -> {
                //尿道肿瘤TNM分期
            }
            78 -> {
                //阴道癌分期（FIGO,UICC）
            }
            79 -> {
                //Crawford分型（胸腹主动脉瘤）
            }
            80 -> {
                //外阴鳞状上皮内瘤变分类及特征
            }
            81 -> {
                //NFI和NFII诊断标准（神经纤维瘤病）
            }
            82 -> {
                //Merkel细胞瘤TNM分期
            }
        }
    }
}