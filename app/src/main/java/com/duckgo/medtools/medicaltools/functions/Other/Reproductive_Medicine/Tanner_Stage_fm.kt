package com.duckgo.medtools.medicaltools.functions.Other.Reproductive_Medicine

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.medicaltools.BaseMedListFragment
import com.duckgo.medtools.medicaltools.GapAdapter
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Tanner_Stage_fm : BaseMedListFragment() {
    override fun getTitle() = "Tanner分期（女性性发育）"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalAdapterDatabean(provideData(), columnWeights = floatArrayOf(1f, 2f, 2f)),
            GapAdapter(40),
            MedCalAdapterDatabean(provideAppendix(), columnWeights = floatArrayOf(1f, 3f))
        )
    }

    private fun provideData() = listOf(
        MedCalDataBean("", "乳房", "阴毛"),
        MedCalDataBean("Ⅰ期(青春期前)", "仅乳头凸出", "无"),
        MedCalDataBean("Ⅱ期", "乳房、乳头凸起，乳晕直径扩大\n平均年龄：9.8岁", "长而稀疏，黑色，分布于大阴唇\n平均年龄：10.5岁"),
        MedCalDataBean("Ⅲ期", "乳房及乳晕继续增大，两者无界限\n平均年龄：11.2岁", "增粗、卷曲、颜色加深，阴阜出现稀疏毛发\n平均年龄：11.4岁"),
        MedCalDataBean("Ⅳ期", "乳头进一步凸起于乳房表面\n平均年龄：12.1岁", "成年人毛发，浓密，但仅限于阴阜\n平均年龄：12岁"),
        MedCalDataBean("Ⅴ期", "乳晕回降，与乳房弧度连续\n平均年龄：14.6岁", "成年人毛发及分布\n平均年龄：13.7岁")
    )

    private fun provideAppendix() = listOf(
        MedCalDataBean("相关解释", "青春期为第二性征开始发育和获得性生殖能力的时期。女性第二性征发育以乳房发育为先，继而出现阴毛、腋毛。月经初潮通常晚于第二性征发育，此时已具有生育能力。"),
        MedCalDataBean("参考来源", "1、Marshall WA, Tanner JM. Variations in the pattern of pubertal changes in boys. Arch Dis Child. 1970;45(239):13-23.\n2、Marshall WA, Tanner JM. Variations in pattern of pubertal changes in girls. Arch Dis Child. 1969;44(235):291-303.")
    )
}
