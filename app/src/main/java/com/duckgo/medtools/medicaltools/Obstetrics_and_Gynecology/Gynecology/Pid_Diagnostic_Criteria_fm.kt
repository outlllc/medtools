package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Pid_Diagnostic_Criteria_fm : BaseMedListFragment() {
    override fun getTitle() = "盆腔炎性疾病（PID）诊断标准（CDC）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 10),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData() = listOf(
        MedCalDataBean("最低标准"),
        MedCalDataBean("宫颈举痛或子宫压痛或附件区压痛"),
        MedCalDataBean("附加标准"),
        MedCalDataBean("体温 > 38.3℃\n宫颈或阴道异常黏液脓性分泌物\n阴道分泌物见到大量白细胞\nESR升高\nCRP升高\n淋病奈瑟菌或衣原体阳性"),
        MedCalDataBean("特异标准"),
        MedCalDataBean("子宫内膜活检证实子宫内膜炎\n影像学检查显示输卵管增粗、积液等\n腹腔镜检查发现PID征象")
    )

    override fun initData_appendix() = listOf(
        MedCalDataBean("结果解读", "最低标准提示若出现下腹痛并排除其他原因, 符合即可给予经验性治疗。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
