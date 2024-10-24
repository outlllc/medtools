package com.duckgo.medtools.medicaltools.A_Menu_Select.Obstetrics_and_Gynecology

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.MedcaltoolMenuPageFragmentBinding
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.medicaltools.basefragment.Med_Tool_Menu_BaseFragment

class Gynecology_Menu: Med_Tool_Menu_BaseFragment<MedcaltoolMenuPageFragmentBinding>(), MenuSelectAdapter.OnItemClickListener {
    override fun getFragmentViewBinding(): MedcaltoolMenuPageFragmentBinding {
        return MedcaltoolMenuPageFragmentBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rvMedicalCalculator.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvMedicalCalculator.adapter = MenuSelectAdapter(activity as Context, dataSet, this)
    }

    override fun initData(): MutableList<String> {
        dataSet = mutableListOf("宫颈癌TNM分期", "宫颈癌分期（FIGO,2018）", "宫颈癌分期（FIGO,2014）", "紧急避孕药物剂量与方案", "卵巢癌TNM分期",
            "子宫体肿瘤TNM分期", "卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）", "POP-Q分期法（盆腔器官脱垂分期）", "改良Kupperman指数（妇女更年期症状评分标准）", "子宫内膜癌分期（FOGO,2014）",
            "halfway系统分级法（Baden-Walker盆底器官膨出的阴道半程系统分级法）", "MRS评分（更年期评定量表）", "TBS分类（宫颈细胞学检查）", "卵巢过度刺激综合征OHSS的分度与分级（Golan分类）", "子宫内膜异位症的分期（R-AFS分期，1985）",
            "POP-Q分期（盆腔器官脱垂评估指示点）", "滋养细胞肿瘤改良预后评分系统（FOGO,2000）", "盆腔炎性疾病PID诊断标准", "Insler评分（宫颈雌激素作用程度评分法）", "未成熟畸胎瘤的分级方法",
            "外阴癌TNM分期", "外阴阴道假丝酵母菌VVC临床分类", "阴道癌TNM分期", "RCI（Reid阴道镜评分标准）", "经前焦虑障碍PMDD诊断标准",
            "外阴阴道假丝酵母菌VVC临床表现评分标准", "滋养细胞肿瘤解剖学分期（FOGO,2000）", "子宫肉瘤分期（FOGO,2009）", "Julian分级法（阴道穹窿膨出）", "输卵管癌手术病理分期",
            "妊娠滋养细胞肿瘤TNM分期", "Nugent评分标准（阴道分泌物革兰染色）", "外阴癌分期（FOGO,2014）", "输卵管肿瘤TNM分期", "外阴皮肤疾病分类法",
            "阴道癌分期（FOGO/UICC）", "外阴鳞状上皮内瘤变分类及特征"
        )

        return dataSet
    }

    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                //宫颈癌TNM分期
            }
            1 -> {
                //宫颈癌分期（FIGO,2018）
            }
            2 -> {
                //宫颈癌分期（FIGO,2014）
            }
            3 -> {
                //紧急避孕药物剂量与方案
            }
            4 -> {
                //卵巢癌TNM分期
            }
            5 -> {
                //子宫体肿瘤TNM分期
            }
            6 -> {
                //卵巢癌、输卵管癌和腹膜癌的分期系统（FIGO/TNM,2014）
            }
            7 -> {
                //POP-Q分期法（盆腔器官脱垂分期）
            }
            8 -> {
                //改良Kupperman指数（妇女更年期症状评分标准）
            }
            9 -> {
                //子宫内膜癌分期（FOGO,2014）
            }
            10 -> {
                //halfway系统分级法（Baden-Walker盆底器官膨出的阴道半程系统分级法）
            }
            11 -> {
                //MRS评分（更年期评定量表）
            }
            12 -> {
                //TBS分类（宫颈细胞学检查）
            }
            13 -> {
                //卵巢过度刺激综合征OHSS的分度与分级（Golan分类）
            }
            14 -> {
                //子宫内膜异位症的分期（R-AFS分期，1985）
            }
            15 -> {
                //POP-Q分期（盆腔器官脱垂评估指示点）
            }
            16 -> {
                //滋养细胞肿瘤改良预后评分系统（FOGO,2000）
            }
            17 -> {
                //盆腔炎性疾病PID诊断标准
            }
            18 -> {
                //Insler评分（宫颈雌激素作用程度评分法）
            }
            19 -> {
                //未成熟畸胎瘤的分级方法
            }
            20 -> {
                //外阴癌TNM分期
            }
            21 -> {
                //外阴阴道假丝酵母菌VVC临床分类
            }
            22 -> {
                //阴道癌TNM分期
            }
            23 -> {
                //RCI（Reid阴道镜评分标准）
            }
            24 -> {
                //经前焦虑障碍PMDD诊断标准
            }
            25 -> {
                //外阴阴道假丝酵母菌VVC临床表现评分标准
            }
            26 -> {
                //滋养细胞肿瘤解剖学分期（FOGO,2000）
            }
            27 -> {
                //子宫肉瘤分期（FOGO,2009）
            }
            28 -> {
                //Julian分级法（阴道穹窿膨出）
            }
            29 -> {
                //输卵管癌手术病理分期
            }
            30 -> {
                //妊娠滋养细胞肿瘤TNM分期
            }
            31 -> {
                //Nugent评分标准（阴道分泌物革兰染色）
            }
            32 -> {
                //外阴癌分期（FOGO,2014）
            }
            33 -> {
                //输卵管肿瘤TNM分期
            }
            34 -> {
                //外阴皮肤疾病分类法
            }
            35 -> {
                //阴道癌分期（FOGO/UICC）
            }
            36 -> {
                //外阴鳞状上皮内瘤变分类及特征
            }
        }
    }
}