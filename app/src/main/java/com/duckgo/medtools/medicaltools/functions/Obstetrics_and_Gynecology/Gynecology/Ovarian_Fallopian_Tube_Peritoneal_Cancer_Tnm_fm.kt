package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Ovarian_Fallopian_Tube_Peritoneal_Cancer_Tnm_fm : BaseMedListFragment() {
    override fun getTitle() = "卵巢癌、输卵管癌和腹膜癌分期 (FIGO/TNM, 2014)"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 1f, 4f)),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("TNM", "FIGO分期", "肿瘤表现"),
        MedCalDataBean("T1", "I", "肿瘤局限于卵巢或输卵管"),
        MedCalDataBean("T1a", "IA", "局限于一侧卵巢，包膜完整，表面无肿瘤，腹水无恶性细胞"),
        MedCalDataBean("T1b", "IB", "局限于双侧卵巢，包膜完整，表面无肿瘤，腹水无恶性细胞"),
        MedCalDataBean("T1c", "IC", "局限于单/双侧，包膜破裂/表面肿瘤/腹水恶性细胞"),
        MedCalDataBean("T1c", "IC1", "术中手术导致肿瘤破裂"),
        MedCalDataBean("T1c", "IC2", "术前包膜破裂，或卵巢/输卵管表面肿瘤"),
        MedCalDataBean("T1c", "IC3", "腹水或腹腔冲洗液中出现恶性细胞"),
        MedCalDataBean("T2", "Ⅱ", "累及一/双侧卵巢伴盆腔扩散，或腹膜癌"),
        MedCalDataBean("T2a", "ⅡA", "扩散/种植到子宫 and/or 输卵管；无恶性腹水"),
        MedCalDataBean("T2b", "ⅡB", "扩散到其他盆腔器官；无恶性腹水"),
        MedCalDataBean("T3/N1", "Ⅲ", "盆腔外腹膜转移 and/or 局部淋巴结转移"),
        MedCalDataBean("T3a", "ⅢA", "镜下种植或已扩展到小肠/肠系膜，淋巴结阴性"),
        MedCalDataBean("T3a/T3aN1", "ⅢA1", "仅有腹膜后淋巴结阳性"),
        MedCalDataBean("T3c/T3cN1", "ⅢA2", "骨盆外腹膜微小转移，伴/不伴淋巴结阳性"),
        MedCalDataBean("任何T,N", "ⅢB", "肉眼盆腔外腹膜转移灶 ≤2cm"),
        MedCalDataBean("M1", "ⅢC", "肉眼盆腔外腹膜转移灶 >2cm，和/或淋巴结转移"),
        MedCalDataBean("T3c/T3cN1", "Ⅳ", "超出腹腔外的远处转移"),
        MedCalDataBean("", "ⅣA", "胸水细胞学阳性"),
        MedCalDataBean("", "ⅣB", "转移至腹腔外器官")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "1973年FIGO首次发布分期，本次为第三个版本。"),
        MedCalDataBean("参考来源", "Gynecol Oncol. 2014;133(3):401-4.")
    )
}
