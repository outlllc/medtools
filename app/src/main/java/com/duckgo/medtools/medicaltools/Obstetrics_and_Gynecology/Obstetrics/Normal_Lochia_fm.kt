package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Normal_Lochia_fm : BaseMedListFragment() {
    override fun getTitle() = "正常恶露性状"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "40"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("", "血性恶露", "浆液性恶露", "白色恶露"),
        arrayOf("持续时间", "产后最初3日", "产后4-14日", "产后14日以后"),
        arrayOf("颜色", "红色", "淡红色", "白色"),
        arrayOf("内容物", "大量血液、少量胎膜、坏死蜕膜", "少量血液、坏死蜕膜、宫颈粘液、细菌", "坏死退化蜕膜、表皮细胞、大量白细胞和细菌等")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("结果解读", "恶露在产后随子宫蜕膜脱落，含有血液及坏死蜕膜等组织经阴道排出。一般持续4～6周，总量可达500ml。"),
        arrayOf("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
