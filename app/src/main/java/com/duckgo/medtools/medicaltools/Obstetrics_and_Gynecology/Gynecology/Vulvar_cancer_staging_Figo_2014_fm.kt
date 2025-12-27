package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vulvar_cancer_staging_Figo_2014_fm : BaseMedListFragment() {
    override fun getTitle() = "外阴癌分期（FIGO，2014）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 22),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("FIGO", "癌肿累及范围"),
        MedCalDataBean("Ⅰ期", "肿瘤局限于外阴"),
        MedCalDataBean("  ⅠA期", "局限于外阴/会阴，≤2cm，间质浸润≤1.0mm，无淋巴结转移"),
        MedCalDataBean("  ⅠB期", "局限于外阴/会阴，>2cm或间质浸润>1.0mm，无淋巴结转移"),
        MedCalDataBean("Ⅱ期", "肿瘤有或无侵犯：下1/3尿道、下1/3阴道、肛门，但无淋巴结转移"),
        MedCalDataBean("Ⅲ期", "肿瘤有或无侵犯：下1/3尿道、下1/3阴道、肛门，有腹股沟-股淋巴结转移"),
        MedCalDataBean("  ⅢA期", "(1)1个淋巴结转移(≥5mm)\n(2)1-2个淋巴结转移(<5mm)"),
        MedCalDataBean("  ⅢB期", "(1)2个或以上淋巴结转移(≥5mm)\n(2)3个或以上淋巴结转移(<5mm)"),
        MedCalDataBean("ⅢC期", "淋巴结阳性伴淋巴结包膜外转移"),
        MedCalDataBean("Ⅳ期", "肿瘤侵犯其他区域（上2/3尿道，上2/3阴道）或远处转移"),
        MedCalDataBean("Ⅳa期", "肿瘤累及：(1)上尿道/阴道黏膜，膀胱/直肠黏膜，或达盆壁 (2)腹股沟-股淋巴结固定或溃疡"),
        MedCalDataBean("Ⅳb期", "任何远处转移，包括盆腔淋巴结转移")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "a: 浸润深度指从最表浅真皮乳头的表皮-间质连接处至浸润最深处。"),
        MedCalDataBean("参考来源", "FIGO Committee on Gynecologic Oncology. 2014.")
    )
}
