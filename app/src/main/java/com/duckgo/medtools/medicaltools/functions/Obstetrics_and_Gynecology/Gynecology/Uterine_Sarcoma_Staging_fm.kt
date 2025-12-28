package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Uterine_Sarcoma_Staging_fm : BaseMedListFragment() {
    override fun getTitle() = "子宫肉瘤分期（FIGO, 2009）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 4f)),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("(1)子宫平滑肌肉瘤FIGO分期"),
        MedCalDataBean("Ⅰ期", "肿瘤局限于子宫"),
        MedCalDataBean("ⅠA", "＜5cm"),
        MedCalDataBean("ⅠB", "＞5cm"),
        MedCalDataBean("Ⅱ期", "肿瘤扩散到盆腔"),
        MedCalDataBean("ⅡA", "附件受累"),
        MedCalDataBean("ⅡB", "扩散到其他盆腔组织"),
        MedCalDataBean("Ⅲ期", "肿瘤扩散到腹腔"),
        MedCalDataBean("ⅢA", "1处"),
        MedCalDataBean("ⅢB", "1处以上"),
        MedCalDataBean("ⅢC", "盆腔或腹主动脉旁淋巴结转移"),
        MedCalDataBean("Ⅳ期", "膀胱和（或）直肠转移，和（或）远隔转移"),
        MedCalDataBean("ⅣA", "膀胱和（或）直肠转移"),
        MedCalDataBean("ⅣB", "远隔转移"),
        MedCalDataBean(""),
        MedCalDataBean("(2)子宫内膜间质肉瘤和腺肉瘤FIGO分期"),
        MedCalDataBean("Ⅰ期", "肿瘤局限于子宫"),
        MedCalDataBean("ⅠA", "肿瘤局限在内膜或宫颈管，无肌层浸润"),
        MedCalDataBean("ⅠB", "≤1/2肌层浸润"),
        MedCalDataBean("ⅠC", "＞1/2肌层浸润"),
        MedCalDataBean("Ⅱ期", "同平滑肌肉瘤"),
        MedCalDataBean("Ⅲ期", "同平滑肌肉瘤"),
        MedCalDataBean("Ⅳ期", "同平滑肌肉瘤"),
        MedCalDataBean(""),
        MedCalDataBean("(3)癌肉瘤（MMMT）FIGO分期"),
        MedCalDataBean("", "按照子宫内膜癌分期")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
