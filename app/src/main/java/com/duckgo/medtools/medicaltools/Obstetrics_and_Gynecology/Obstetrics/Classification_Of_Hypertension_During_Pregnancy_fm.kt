package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Classification_Of_Hypertension_During_Pregnancy_fm : BaseMedListFragment() {
    override fun getTitle() = "妊娠期高血压分类"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "20"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("分类", "临床表现"),
        arrayOf("妊娠期高血压", "BP≥140/90mmHg，妊娠期出现，并于产后12周内恢复正常；尿蛋白（-）；患者可伴有上腹部不适或血小板减少。产后方可确诊"),
        arrayOf("子痫前期", "妊娠20周出现BP≥140/90mmHg，且尿蛋白≥300mg/24h或（+）。可伴有上腹部不适、头痛、视力模糊等症状"),
        arrayOf("子痫", "子痫前期孕产妇抽搐，且不能用其他原因解释"),
        arrayOf("慢性高血压病并发子痫前期", "高血压妇女于妊娠20周以前无蛋白尿，若孕20周后出现尿蛋白≥300mg/24h；或妊娠20周前突然出现尿蛋白增加、血压进一步升高、或血小板减少（＜100×109/L）"),
        arrayOf("妊娠合并慢性高血压病", "妊娠前或妊娠20周前检查发现血压升高，但妊娠期无明显加重；或妊娠20周后首次诊断高血压并持续到产后12周以后")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
