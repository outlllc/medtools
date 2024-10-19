package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.databinding.FragmentDrugToFetusFmBinding
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class DrugToFetus_fm : Fragment() {

    lateinit var dataSet: MutableList<Array<String>>
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var binding: FragmentDrugToFetusFmBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDrugToFetusFmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initData_appendix()
        initAdaptor()
    }

    private fun initAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalListAdapter(dataSet, "31")
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("相关解释", "药物对胚胎影响大致可分为以下几个时期：" +
                "妊娠前期从女性发育成熟到卵子受精时期，在这段期间内，使用药物一般比较安全，但要注意在体内半衰期较长的药物。" +
                "受精第1日~第14日受精卵发育到胚泡形成，这段期间如果药物导致大量胚囊细胞受损，会导致胚胎的死亡。如果只有少量细胞受损，不会影响其他胚囊细胞最终分化发育成正常个体。" +
                "受精15日到妊娠3个月左右该期是经典的致畸期。在这段时间内，首先是心脏、脑开始分化发育，继而是眼、四肢、性腺与生殖器官等。由于各种器官、躯干、四肢在短时间内迅速分化，所以极易受到包括药物毒性在内的各种致畸因素影响。一旦正在分化器官受到影响，就可能形成畸形，这段期间内，药物毒性作用越早，发生畸形可能越严重。" +
                "妊娠3个月至分娩这段期间药物致畸可能性大大下降，但有些药物仍可能影响胎儿正常发育。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("药名", "给药孕期", "不良影响")
        var subDataSet2 = arrayOf("沙立度胺", "早期", "四肢长骨多处缺损，指趾畸形、短肢或无肢海豹肢体畸形，心、眼、耳、肾受损及锁肛")
        var subDataSet3 = arrayOf("氨甲喋呤", "早期", "淡红色", "无脑儿、脑积水、腭裂、流产")
        var subDataSet4 = arrayOf("环磷酰胺", "早期", "四肢及外鼻畸形、腭裂、耳缺如")
        var subDataSet5 = arrayOf("苯丁酸氦芥", "早期", "肾、输尿管缺损、腭裂")
        var subDataSet6 = arrayOf("己烯雌酚", "妊娠期", "女胎青春期患阴道腺病、男性女性化、睾丸发育不良")
        var subDataSet7 = arrayOf("雄激素", "早期", "女胎男性化")
        var subDataSet8 = arrayOf("丙硫氧嘧啶", "妊娠期", "成骨迟缓、智力低下、妊娠期")
        var subDataSet9 = arrayOf("甲硫咪唑", "早期", "长期应用甲状腺机能低下")
        var subDataSet10 = arrayOf("四环素", "早期\n后期", "手指畸形、先天性白内障、长骨发育不良\n乳齿黄染、珐琅质形成不全")
        var subDataSet11 = arrayOf("肾上腺皮质激素", "早期", "腭裂、无脑儿、并指畸形、死胎、成骨迟缓")
        var subDataSet12 = arrayOf("苯妥英钠", "妊娠期", "腭裂、唇裂、心脏、骨骼发育不全")
        var subDataSet13 = arrayOf("苯巴比妥", "妊娠期", "四肢畸形、肝、脑缺损")
        var subDataSet14 = arrayOf("氯丙嗪", "妊娠期", "脑发育不良、视网膜病变")
        var subDataSet15 = arrayOf("氯氮", "早期", "腭裂、唇裂")
        var subDataSet16 = arrayOf("甲丙氨酯", "早期", "先天性心脏病")
        var subDataSet17 = arrayOf("水杨酸类", "妊娠期", "肾畸形、中枢神经损伤、发育障碍、新生儿紫癜、死胎")
        var subDataSet18 = arrayOf("非那西丁", "妊娠期", "肾、骨骼畸形")
        var subDataSet19 = arrayOf("美可洛嗪", "早期", "唇裂、腭裂、小指症、脑脊髓功能障碍")
        var subDataSet20 = arrayOf("苯海拉明", "妊娠期", "唇裂")
        var subDataSet21 = arrayOf("双香豆素", "妊娠期", "软骨发育不良、颅内出血、死胎")
        var subDataSet22 = arrayOf("华法林", "早期", "小头畸形、大脑发育不良、先天性失明")
        var subDataSet23 = arrayOf("氯喹", "妊娠期", "耳聋、脑积水、肾畸形、死胎")
        var subDataSet24 = arrayOf("链霉素", "妊娠期", "耳聋")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
        dataSet.add(subDataSet8)
        dataSet.add(subDataSet9)
        dataSet.add(subDataSet10)
        dataSet.add(subDataSet11)
        dataSet.add(subDataSet12)
        dataSet.add(subDataSet13)
        dataSet.add(subDataSet14)
        dataSet.add(subDataSet15)
        dataSet.add(subDataSet16)
        dataSet.add(subDataSet17)
        dataSet.add(subDataSet18)
        dataSet.add(subDataSet19)
        dataSet.add(subDataSet20)
        dataSet.add(subDataSet21)
        dataSet.add(subDataSet22)
        dataSet.add(subDataSet23)
        dataSet.add(subDataSet24)
    }
}