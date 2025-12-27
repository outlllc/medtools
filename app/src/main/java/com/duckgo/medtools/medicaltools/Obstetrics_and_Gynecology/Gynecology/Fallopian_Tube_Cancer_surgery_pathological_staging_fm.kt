package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Fallopian_Tube_Cancer_surgery_pathological_staging_fm : BaseMedListFragment() {
    override fun getTitle() = "输卵管癌手术-病理分期（FIGO, 2000）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 22),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("0期", "原位癌（浸润前癌）"),
        MedCalDataBean("Ⅰ期", "肿瘤局限于输卵管"),
        MedCalDataBean("  ⅠA", "局限于一侧输卵管，未穿透浆膜层；无腹水"),
        MedCalDataBean("  ⅠB", "局限于双侧输卵管，未穿透浆膜层；无腹水"),
        MedCalDataBean("  ⅠC", "局限于一侧或双侧输卵管，达到或穿透浆膜层，或发现癌细胞"),
        MedCalDataBean("Ⅱ期", "肿瘤累及一侧或双侧输卵管，伴盆腔内扩散"),
        MedCalDataBean("  ⅡA", "扩散和/或转移到子宫和/或卵巢"),
        MedCalDataBean("  ⅡB", "扩散到盆腔其他组织"),
        MedCalDataBean("  ⅡC", "盆腔内扩散（ⅡA或ⅡB）伴腹水或发现癌细胞"),
        MedCalDataBean("Ⅲ期", "累及一侧或双侧输卵管，伴盆腔外腹腔内种植和/或区域淋巴结阳性"),
        MedCalDataBean("  ⅢA", "显微镜下的盆腔外腹膜转移"),
        MedCalDataBean("  ⅢB", "肉眼见盆腔外腹膜转移灶，最大直径≤2cm"),
        MedCalDataBean("  ⅢC", "盆腔外腹膜转移的最大直径＞2cm，和/或淋巴结阳性"),
        MedCalDataBean("Ⅳ期", "远处转移（不包括腹膜转移）")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
