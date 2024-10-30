package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragment
import com.duckgo.medtools.Med_Cal_Fragment_Adaptor
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentPopqstageBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class POPQStage: BaseFragment<FragmentPopqstageBinding>() {
    override fun getFragmentViewBinding(): FragmentPopqstageBinding {
        return FragmentPopqstageBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        minitAdaptor()
    }

    fun minitAdaptor() {
        binding.rvContent.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContent.adapter = MedCalAdapterDatabean(minitData(), 20)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(minitData_appendix(), 20)
    }

    fun minitData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("分度", "内容")
        var medCalDataBean2 = MedCalDataBean("0", "无脱垂，Aa、Ap、Ba、Bp均在-3cm处，C、D两点在阴道总长度和阴道总长度-2cm之间，即C或D点量化值<[TVL-2]cm")
        var medCalDataBean3 = MedCalDataBean("Ⅰ", "脱垂最远端在处女膜平面上>1cm，即量化值<-1cm")
        var medCalDataBean4 = MedCalDataBean("Ⅱ", "脱垂最远端在处女膜平面上<1cm，即量化值>-1cm，但<+1cm")
        var medCalDataBean5 = MedCalDataBean("Ⅲ", "脱垂最远端超过处女膜平面>1cm，但<阴道总长度-2cm，即量化值>+1 cm，但<[TVL-2]cm")
        var medCalDataBean6 = MedCalDataBean("Ⅳ", "下生殖道呈全长外翻，脱垂最远端即宫颈或阴道残端脱垂超过阴道总长度-2cm，即量化值>[TVL-2]cm")
        var list = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5, medCalDataBean6)

        return list
    }

    fun minitData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "POP-Q分期应在向下用力屏气时，以脱垂完全呈现出来时的最远端部位计算。应针对每个个体先用3×3表格量化描述，再进行分期。为了补偿阴道的伸展性及内在测量上的误差，在0和Ⅳ度中的TVL值允许有2cm的误差。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        var list = listOf(medCalDataBean1, medCalDataBean2)
        return list
    }
}