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
import com.duckgo.medtools.databinding.FragmentEmergencyContraceptivePillDosageFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Emergency_Contraceptive_Pill_Dosage_fm : BaseFragmentDataBinding<FragmentEmergencyContraceptivePillDosageFmBinding>() {
    override fun getFragmentViewBinding(): FragmentEmergencyContraceptivePillDosageFmBinding {
        return FragmentEmergencyContraceptivePillDosageFmBinding.inflate(layoutInflater)
    }

    override fun initAdaptor() {
        binding.rv1.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rv1.adapter = MedCalAdapterDatabean(initData(), 60)
        binding.rvContentAppendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        binding.rvContentAppendix.adapter = MedCalAdapterDatabean(initData_appendix(), 20)
    }

    override fun initData(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("名称", "成分", "含量（mg）", "每次片数", "服用次数", "给药时间")
        var medCalDataBean2 = MedCalDataBean("左炔诺孕酮片", "LNG", "0.75", "1", "2", "无保护性交后72小时内首剂，12小时后重复1次")
        var medCalDataBean3 = MedCalDataBean("复方左旋18甲短效避孕药", "LNG\n\nEE", "0.015\n\n0.03", "4", "2", "同上")
        var medCalDataBean4 = MedCalDataBean("速效探亲片", "炔诺孕酮或LNG", "3\n1.5", "1/2", "2", "同上")
        var medCalDataBean5 = MedCalDataBean("米非司酮片", "米非司酮", "25\n\n10", "1\n\n1", "1\n\n1", "无保护性交后120小时内\n同上")
        data = listOf(medCalDataBean1, medCalDataBean2, medCalDataBean3, medCalDataBean4, medCalDataBean5)
        return data
    }

    override fun initData_appendix(): List<MedCalDataBean> {
        var medCalDataBean1 = MedCalDataBean("相关解释", "紧急避孕药(morning-after pill )：有甾体激素类和非甾体激素类。应用甾体激素类药物紧急避孕只能对这一次无保护性生活起保护作用；在本周期内不应再有性生活，除非采用避孕套避孕。一般应在无保护性生活后3~5日内口服紧急避孕药。")
        var medCalDataBean2 = MedCalDataBean("参考来源\n\n", "丰有吉、沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        data_appendix = listOf(medCalDataBean1, medCalDataBean2)
        return data_appendix
    }
}