package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean
import com.duckgo.medtools.databean.MedCalDataBean

class Diagnosis_Postnatal_Depression_fm : BaseMedListFragment() {

    override fun getTitle() = "产褥期抑郁症诊断标准"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(initData()),
            GapAdapter(40),
            MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
        )
    }

    override fun initData(): List<MedCalDataBean> = listOf(
        MedCalDataBean("1.在产后4周内出现下列5项或以上症状，且必含(1)(2)："),
        MedCalDataBean("(1)情绪抑郁"),
        MedCalDataBean("(2)缺乏兴趣或愉悦"),
        MedCalDataBean("(3)体重显著下降或增加"),
        MedCalDataBean("(4)失眠或睡眠过度"),
        MedCalDataBean("(5)精神运动性兴奋或阻滞"),
        MedCalDataBean("(6)疲劳或乏力"),
        MedCalDataBean("(7)遇事感毫无意义或自罪感"),
        MedCalDataBean("(8)思维力减退或注意力涣散"),
        MedCalDataBean("(9)反复出现死亡想法"),
        MedCalDataBean("2.在产后4周内发病")
    )

    override fun initData_appendix(): List<MedCalDataBean> = listOf(
        MedCalDataBean("相关解释", "该诊断标准中许多指标具有一定的主观性，可能影响正确诊断。"),
        MedCalDataBean("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
