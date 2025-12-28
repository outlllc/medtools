package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Severe_Preeclampsia_Diagnosis_fm : BaseMedListFragment() {
    override fun getTitle() = "重度子痫前期诊断标准"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData()),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), columnWeights = floatArrayOf(1f, 3f))
        )
    }

    private fun provideData() = listOf(
        MedCalDataBean("下列标准至少一条符合者可诊断为重度子痫前期"),
        MedCalDataBean("1.中枢神经系统异常表现：视力模糊、头痛、头晕；严重者神志不清、昏迷等"),
        MedCalDataBean("2.肝包膜下血肿或肝破裂的症状：包括上腹部不适或右上腹持续性疼痛等"),
        MedCalDataBean("3.肝细胞损伤表现：血清转氨酶升高"),
        MedCalDataBean("4.血压改变：收缩压≥160mmHg，或舒张压≥110mmHg"),
        MedCalDataBean("5.血小板减少：＜100×109/L"),
        MedCalDataBean("6.蛋白尿：≥5g/24h，或间隔4小时两次尿蛋白（+++）"),
        MedCalDataBean("7.少尿：24小时尿量＜500ml"),
        MedCalDataBean("8.肺水肿"),
        MedCalDataBean("9.脑血管意外"),
        MedCalDataBean("10.血管内溶血：贫血、黄疸、或乳酸脱氢酶升高"),
        MedCalDataBean("11.凝血功能障碍"),
        MedCalDataBean("12.胎儿生长受限或羊水过少")
    )

    private fun provideAppendix() = listOf(
        MedCalDataBean("结果解读", "高血压加重，尿蛋白增加，或者肾、肝、血液系统的实验室指标异常，或者子痫发作前的症状均表明病情加重。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
