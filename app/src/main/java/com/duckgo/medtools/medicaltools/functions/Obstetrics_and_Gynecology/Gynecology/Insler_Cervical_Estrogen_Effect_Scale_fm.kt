package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Gynecology

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.medicaltools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.InslerCervicalEstrogenEffectScaleFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Insler_Cervical_Estrogen_Effect_Scale_fm : BaseFragmentDataBinding<InslerCervicalEstrogenEffectScaleFmBinding>(), RadioGroup.OnCheckedChangeListener {
    
    private val scores = mutableMapOf<Int, Int>()
    private val totalItems = 4

    override fun getFragmentViewBinding() = InslerCervicalEstrogenEffectScaleFmBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(binding.Rgroup1, binding.Rgroup2, binding.Rgroup3, binding.Rgroup4).forEach {
            it.setOnCheckedChangeListener(this)
        }
    }

    override fun initAdaptor() {
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalAdapterDatabean(initData_appendix(), floatArrayOf(1f, 3f))
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun initData_appendix() = listOf(
        MedCalDataBean("结果解读", "宫颈评分与卵泡的发育及血雌激素水平呈正相关，达10-12分时，预示排卵即将发生。0-3分，功能不全；4-7分，功能不良；8-10分，功能良好；10-12分，功能优秀。"),
        MedCalDataBean("相关解释", "宫颈粘液可以作为一种间接评估体内雌激素水平的半定量检测指标。"),
        MedCalDataBean("参考来源", "1. FIGO 2002 Staging.\n2. 《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
    )

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val score = when (checkedId) {
            R.id.rb10, R.id.rb20, R.id.rb30, R.id.rb40 -> 0
            R.id.rb11, R.id.rb21, R.id.rb31, R.id.rb41 -> 1
            R.id.rb12, R.id.rb22, R.id.rb32, R.id.rb42 -> 2
            R.id.rb13, R.id.rb23, R.id.rb33, R.id.rb43 -> 3
            else -> 0
        }
        scores[group.id] = score
        updateResult()
    }

    private fun updateResult() {
        val totalScore = scores.values.sum()
        val checkedCount = scores.size
        binding.tv141.text = "$totalScore 分（已选 $checkedCount 个，还剩 ${totalItems - checkedCount} 个未选）"
    }
}
