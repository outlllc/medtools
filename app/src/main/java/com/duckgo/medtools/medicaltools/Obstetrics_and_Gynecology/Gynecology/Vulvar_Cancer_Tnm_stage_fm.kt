package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vulvar_Cancer_Tnm_stage_fm : BaseMedListFragment() {
    override fun getTitle() = "外阴癌TNM分期"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(listOf(MedCalDataBean("原发灶")), 10),
            MedCalAdapterDatabean(initData(), 33),
            MedCalAdapterDatabean(listOf(MedCalDataBean("区域淋巴结 (N)")), 10),
            MedCalAdapterDatabean(initData2(), 30),
            MedCalAdapterDatabean(listOf(MedCalDataBean("远处转移 (M)")), 10),
            MedCalAdapterDatabean(initData3(), 30),
            MedCalAdapterDatabean(listOf(MedCalDataBean("解剖分期/预后分组")), 10),
            MedCalAdapterDatabean(initData4(), 40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("TNM分期", "FIGO分期", " "),
        MedCalDataBean("Tx", " ", "原发肿瘤无法评估"),
        MedCalDataBean("T0", " ", "无原发肿瘤的证据"),
        MedCalDataBean("Tis", " ", "原位癌"),
        MedCalDataBean("T1a", "ⅠA", "病灶≤2cm，局限于外阴或会阴，间质浸润≤1.0mm"),
        MedCalDataBean("T1b", "ⅠB", "病灶>2cm，或不论大小间质浸润>1.0mm"),
        MedCalDataBean("T2", "Ⅱ", "不论大小，侵及会阴邻近结构（尿道、阴道远端1/3或肛管)"),
        MedCalDataBean("T3", "ⅣA", "不论大小，侵及尿道、阴道近端2/3，膀胱、直肠粘膜或固定于盆骨")
    )

    private fun initData2() = listOf(
        MedCalDataBean("Nx", " ", "区域淋巴结无法评估"),
        MedCalDataBean("N0", " ", "无区域淋巴结转移"),
        MedCalDataBean("N1", " ", "1-2个区域淋巴结，特征如下："),
        MedCalDataBean("N1a", "ⅢA", "1-2个淋巴结，均≤5mm"),
        MedCalDataBean("N1b", "ⅢA", "单个淋巴结，>5mm"),
        MedCalDataBean("N2", " ", "区域淋巴结转移，特征如下："),
        MedCalDataBean("N2a", "ⅢB", "3个或更多淋巴结，均<5mm"),
        MedCalDataBean("N2b", "ⅢB", "2个或更多淋巴结，≥5mm"),
        MedCalDataBean("N2c", "ⅢC", "淋巴结转移伴包膜外浸润"),
        MedCalDataBean("N3", "ⅣA", "转移淋巴结固定或溃疡")
    )

    private fun initData3() = listOf(
        MedCalDataBean("M0", " ", "无远处转移"),
        MedCalDataBean("M1", "ⅣB", "远处转移")
    )

    private fun initData4() = listOf(
        MedCalDataBean("Stage", "T", "N", "M"),
        MedCalDataBean("0", "Tis", "N0", "M0"),
        MedCalDataBean("Ⅰ", "T1", "N0", "M0"),
        MedCalDataBean("ⅠA", "T1a", "N0", "M0"),
        MedCalDataBean("ⅠB ", "T1b", "N0", "M0"),
        MedCalDataBean("Ⅱ", "T2", "N0", "M0"),
        MedCalDataBean("ⅢA", "T1,T2", "N1a,N1b", "M0"),
        MedCalDataBean("ⅢB", "T1,T2", "N2a,N2b", "M0"),
        MedCalDataBean("ⅢC", "T1,T2", "N2c", "M0"),
        MedCalDataBean("ⅣA", "T1,T2", "N3", "M0"),
        MedCalDataBean("ⅣA", "T3", "any N", "M0"),
        MedCalDataBean("ⅣB", "any T", "any N", "M1")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("参考来源", "第七版AJCC癌症分期手册 (2012).")
    )
}
