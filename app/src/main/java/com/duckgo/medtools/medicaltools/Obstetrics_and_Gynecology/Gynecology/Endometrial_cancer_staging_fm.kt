package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Endometrial_cancer_staging_fm : BaseMedListFragment() {
    override fun getTitle() = "子宫内膜癌分期（FIGO，2014）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), floatArrayOf(1f, 3f)),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("分期", "肿瘤范围"),
        MedCalDataBean("Ia", "肿瘤局限于子宫体"),
        MedCalDataBean("  IAa", "肿瘤浸润深度<1/2肌层"),
        MedCalDataBean("  IBa", "肿瘤浸润深度>1/2肌层"),
        MedCalDataBean("IIa", "肿瘤侵犯宫颈间质，但无宫体外蔓延"),
        MedCalDataBean("IIIa", "肿瘤局部和（或）区域扩散"),
        MedCalDataBean("  IIIAa", "肿瘤累及浆膜层和（或）附件"),
        MedCalDataBean("  IIIBa", "阴道和（或）宫旁受累"),
        MedCalDataBean("  IIICa", "盆腔和/或腹主动脉旁淋巴结阳性"),
        MedCalDataBean("   IIIC1a", "盆腔淋巴结阳性"),
        MedCalDataBean("   IIIC2a", "腹主动脉旁淋巴结阳性和（或）盆腔淋巴结阳性"),
        MedCalDataBean("IVa", "肿瘤侵及膀胱和（或）直肠黏膜，和（或）远处转移"),
        MedCalDataBean("  IVAa", "肿瘤侵及膀胱或直肠黏膜"),
        MedCalDataBean("  IVBa", "远处转移，包括腹腔内和（或）腹股沟淋巴结转移")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "a：G1、G2或G3；b：宫颈管内膜腺体受累仅限于I期；c：细胞学检查阳性应单独报告，但不影响分期"),
        MedCalDataBean("参考来源", "FIGO Committee on Gynecologic Oncology. 2014.")
    )
}
