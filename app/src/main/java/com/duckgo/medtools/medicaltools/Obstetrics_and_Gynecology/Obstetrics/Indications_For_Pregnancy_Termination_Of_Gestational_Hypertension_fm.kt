package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Indications_For_Pregnancy_Termination_Of_Gestational_Hypertension_fm : BaseMedListFragment() {
    override fun getTitle() = "妊娠高血压终止妊娠的指征"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData()),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), floatArrayOf(1f, 3f))
        )
    }

    private fun provideData() = listOf(
        MedCalDataBean("1.重度子痫前期患者经积极治疗24-48小时仍无明显好转者"),
        MedCalDataBean("2.重度子痫前期患者孕周已超过34周"),
        MedCalDataBean("3.重度子痫前期患者孕龄不足34周，但胎盘功能减退，胎儿已成熟"),
        MedCalDataBean("4.重度子痫前期患者，孕龄不足34周，胎盘功能减退，胎儿尚未成熟者，可用地塞米松促胎肺成熟后终止妊娠"),
        MedCalDataBean("5.子痫控制后2小时可考虑终止妊娠")
    )

    private fun provideAppendix() = listOf(
        MedCalDataBean("相关解释", "终止妊娠是治疗妊娠期高血压疾病的有效措施"),
        MedCalDataBean("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
