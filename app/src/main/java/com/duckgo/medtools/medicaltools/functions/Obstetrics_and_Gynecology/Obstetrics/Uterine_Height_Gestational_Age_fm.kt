package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Uterine_Height_Gestational_Age_fm : BaseMedListFragment() {
    override fun getTitle() = "手测宫底高度及尺测子宫长度判断妊娠周数"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData(), columnWeights = floatArrayOf(1f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), columnWeights = floatArrayOf(1f, 3f))
        )
    }

    private fun provideData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("妊娠周数", "手测宫底高度", "尺测耻上长度(cm)"),
        MedCalDataBean("12周末", "耻骨联合上2-3横指", ""),
        MedCalDataBean("16周末", "脐耻之间", ""),
        MedCalDataBean("20周末", "脐下1横指", "18(15.3~21.4)"),
        MedCalDataBean("24周末", "脐上1横指", "24(22.0~25.1)"),
        MedCalDataBean("28周末", "脐上3横指", "26(22.4~29.0)"),
        MedCalDataBean("32周末", "脐与剑突之间", "29(25.3~32.0)"),
        MedCalDataBean("36周末", "剑突下2横指", "32(29.8~34.5)"),
        MedCalDataBean("40周末", "脐与剑突之间或略高", "33(30.0~35.3)")
    )

    private fun provideAppendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("结果解读", "子宫随妊娠进展逐渐增大，以此可判断妊娠周数。"),
        MedCalDataBean("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
