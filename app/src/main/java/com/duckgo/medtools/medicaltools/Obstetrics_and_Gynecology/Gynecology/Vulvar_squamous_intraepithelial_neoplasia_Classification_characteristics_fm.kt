package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentVulvarSquamousIntraepithelialNeoplasiaClassificationCharacteristicsFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm : BaseFragmentDataBinding<FragmentVulvarSquamousIntraepithelialNeoplasiaClassificationCharacteristicsFmBinding>() {
    override fun getFragmentViewBinding() = FragmentVulvarSquamousIntraepithelialNeoplasiaClassificationCharacteristicsFmBinding.inflate(layoutInflater)

    override fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalAdapterDatabean(initData_appendix(), 20)
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun initData_appendix() = listOf(
        MedCalDataBean("相关解释", "2004年VIN新的定义仅指高级别VIN病变（即原VINⅡ及VINⅢ）。依据病理形态学、生物学及临床特点将VIN分为两类：\n1.普通型VIN：与高危型HPV相关，多见于年轻女性，常合并下生殖道其他部位瘤变。\n2.分化型VIN：与HPV无关，病变在苔藓硬化基础上发生，多见于绝经后女性。"),
        MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )
}
