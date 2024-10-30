package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentVulvarSquamousIntraepithelialNeoplasiaClassificationCharacteristicsFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean


class Vulvar_squamous_intraepithelial_neoplasia_Classification_characteristics_fm : BaseFragmentDataBinding<FragmentVulvarSquamousIntraepithelialNeoplasiaClassificationCharacteristicsFmBinding>() {
    override fun getFragmentViewBinding(): FragmentVulvarSquamousIntraepithelialNeoplasiaClassificationCharacteristicsFmBinding {
        return FragmentVulvarSquamousIntraepithelialNeoplasiaClassificationCharacteristicsFmBinding.inflate(layoutInflater)
    }
    override fun initAdaptor() {
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }
    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "2004年VIN新的定义仅指高级别VIN病变（即原VINⅡ及VINⅢ）。依据病理形态学、生物学及临床特点将VIN分为两类。\n" +
                "1.普通型VIN    与高危型HPV感染相关，多发生于年轻女性，超过30%的病例合并下生殖道其他部位瘤变（以CIN最常见），与外阴浸润性疣状癌及基底细胞癌有关。普通型VIN包括以下3种亚型：疣型VIN、基底细胞型VIN、混合型VIN。\n" +
                "2.分化型VIN    与HPV感染无关，病变在苔藓硬化基础上发生，形态主要为溃疡、疣状丘疹或过度角化斑片。多发生于绝经后女性，多不伴其他部位病变，与外阴角化性鳞状细胞癌有关。此外，外阴Paget病等其他不能归入上述两类的VIN病变归入未分类型VIN。")
        var medCalDataBean2 = MedCalDataBean("参考来源", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }

}