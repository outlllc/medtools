package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Fetal_Maturity_fm : BaseMedListFragment() {
    override fun getTitle() = "胎儿成熟度监测"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData(), columnWeights = floatArrayOf(2f, 3f)),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), columnWeights = floatArrayOf(1f, 3f))
        )
    }

    private fun provideData() = listOf(
        MedCalDataBean("检测项目", "结果意义"),
        MedCalDataBean("L/S比值", "若 >2，表示胎肺已成熟"),
        MedCalDataBean("磷脂酰甘油(PG)", "测出 PG 表示胎肺成熟"),
        MedCalDataBean("泡沫试验", "两管均有完整泡沫环，提示胎肺成熟"),
        MedCalDataBean("肌酐", "≥176.8μmol/L，表示胎肾已成熟"),
        MedCalDataBean("胆红素类物质", "△OD450 < 0.02，表示胎肝已成熟"),
        MedCalDataBean("淀粉酶值", "≥450U/L，表示胎儿唾液腺已成熟"),
        MedCalDataBean("含脂肪细胞率", "达 20% 表示胎儿皮肤已成熟")
    )

    private fun provideAppendix() = listOf(
        MedCalDataBean("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
