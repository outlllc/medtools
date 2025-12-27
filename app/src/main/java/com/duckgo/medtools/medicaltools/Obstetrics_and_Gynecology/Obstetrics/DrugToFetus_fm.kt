package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Obstetrics

import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseMedListFragment
import com.duckgo.medtools.GapAdapter
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class DrugToFetus_fm : BaseMedListFragment() {
    override fun getTitle() = "孕期药物对胎儿的影响"

    override fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>> {
        return listOf(
            MedCalListAdapter(provideData(), "31"),
            GapAdapter(40),
            MedCalListAdapter(provideAppendix(), "20")
        )
    }

    private fun provideData() = mutableListOf(
        arrayOf("药名", "给药孕期", "不良影响"),
        arrayOf("沙立度胺", "早期", "四肢长骨缺损、海豹肢、心眼耳肾受损及锁肛"),
        arrayOf("氨甲喋呤", "早期", "无脑儿、脑积水、腭裂、流产"),
        arrayOf("环磷酰胺", "早期", "四肢及外鼻畸形、腭裂、耳缺如"),
        arrayOf("苯丁酸氮芥", "早期", "肾、输尿管缺损、腭裂"),
        arrayOf("己烯雌酚", "妊娠期", "女胎阴道腺病、男性女性化、睾丸发育不良"),
        arrayOf("雄激素", "早期", "女胎男性化"),
        arrayOf("丙硫氧嘧啶", "妊娠期", "成骨迟缓、智力低下"),
        arrayOf("甲硫咪唑", "早期", "长期应用可致甲状腺机能低下"),
        arrayOf("四环素", "早/后期", "长骨发育不良、乳齿黄染、珐琅质形成不全"),
        arrayOf("肾上腺皮质激素", "早期", "腭裂、无脑儿、并指、死胎、成骨迟缓"),
        arrayOf("苯妥英钠", "妊娠期", "腭裂、唇裂、心脏骨骼发育不全"),
        arrayOf("苯巴比妥", "妊娠期", "四肢畸形、肝、脑缺损"),
        arrayOf("氯丙嗪", "妊娠期", "脑发育不良、视网膜病变"),
        arrayOf("氯氮卓", "早期", "腭裂、唇裂"),
        arrayOf("甲丙氨酯", "早期", "先天性心脏病"),
        arrayOf("水杨酸类", "妊娠期", "肾畸形、发育障碍、新生儿紫癜、死胎"),
        arrayOf("非那西丁", "妊娠期", "肾、骨骼畸形"),
        arrayOf("美可洛嗪", "早期", "唇裂、腭裂、小指症、脑脊髓功能障碍"),
        arrayOf("苯海拉明", "妊娠期", "唇裂"),
        arrayOf("双香豆素", "妊娠期", "软骨发育不良、颅内出血、死胎"),
        arrayOf("华法林", "早期", "小头畸形、大脑发育不良、失明"),
        arrayOf("氯喹", "妊娠期", "耳聋、脑积水、肾畸形、死胎"),
        arrayOf("链霉素", "妊娠期", "耳聋")
    )

    private fun provideAppendix() = mutableListOf(
        arrayOf("相关解释", "分为妊娠前期、受精第1-14日、受精15日至3个月（致畸期）、3个月至分娩。"),
        arrayOf("参考来源", "《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
