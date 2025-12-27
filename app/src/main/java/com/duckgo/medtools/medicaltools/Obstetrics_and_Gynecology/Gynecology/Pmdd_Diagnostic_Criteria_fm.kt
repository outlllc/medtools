package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Pmdd_Diagnostic_Criteria_fm : BaseMedListFragment() {
    override fun getTitle() = "经前焦虑障碍PMDD诊断标准"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData(), 20),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), 20)
        )
    }

    override fun initData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("黄体期最后一个星期存在5种(或更多)症状，经后消失，且至少包含1-4中之一："),
        MedCalDataBean("1. 明显的抑郁情绪，自我否定，感到失望"),
        MedCalDataBean("2. 明显焦虑、紧张，感到“激动”或“不安”"),
        MedCalDataBean("3. 情感不稳定，如突然伤感、哭泣或敏感"),
        MedCalDataBean("4. 持续和明显易怒或发怒，争吵增加"),
        MedCalDataBean("5. 对平时活动兴趣降低"),
        MedCalDataBean("6. 注意力集中困难"),
        MedCalDataBean("7. 嗜睡、易疲劳或能量缺乏"),
        MedCalDataBean("8. 食欲明显改变，过度摄食或特殊嗜好"),
        MedCalDataBean("9. 失眠"),
        MedCalDataBean("10. 主观感觉不安或失控"),
        MedCalDataBean("11. 其他躯体症状，如乳房触痛、头痛、关节痛、体重增加")
    )

    override fun initData_appendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("结果解读", "要求连续3次月经前具有11种症状中的5种，月经来潮4日内缓解。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
