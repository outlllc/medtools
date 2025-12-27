package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Thyroid_Function_Of_Pregnancy_fm : BaseMedListFragment() {
    override fun getTitle() = "妊娠期甲状腺功能实验室检查"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "40"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("检查项目", "正常妇女", "孕妇", "妊娠合并甲亢"),
        arrayOf("基础代谢率(BMR)%", "＜+15", "+20~+30", "＞+30"),
        arrayOf("血清总甲状腺激素TT4(nmol/L)", " 64~167", "轻度增高", "明显增高"),
        arrayOf("血清三碘甲状腺原氨酸TT3(nmol/L)", "1.8~2.9", "轻度增高", "明显增高"),
        arrayOf("甲状腺素结合球蛋白TBG(mg/L)", "13~25", "轻度增高", "明显增高"),
        arrayOf("血清游离T3(pmol/L)", "6.0~11.4", "轻度增高", "明显增高"),
        arrayOf("血清游离T4(pmol/L)", "18~38", "轻度增高", "明显增高"),
        arrayOf("促甲状腺激素TSH(mU/L)", "2~20", "正常", "明显减低")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("相关解释", "甲亢的临床症状及体征有：心悸，休息时心率超过100次/分，食欲很好、体重不能按孕周增加，脉压增大>50mmHg等。"),
        arrayOf("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
