package com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.FragmentBishopFmBinding
import com.duckgo.medtools.my_adapter.MedCalAdapterDatabean

class Bishop_fm : Fragment() {
    private var _binding: FragmentBishopFmBinding? = null
    private val binding get() = _binding!!
    private val groupScores = mutableMapOf<Int, Int>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentBishopFmBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdaptor()
        listOf(binding.rgCer1, binding.rgCer2, binding.rgCer3, binding.rgCer4, binding.rgCer5).forEach {
            it.setOnCheckedChangeListener { group, checkedId -> onCheckedChanged(group, checkedId) }
        }
    }

    private fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        val score = when (checkedId) {
            R.id.rb_cer_12, R.id.rb_cer_50, R.id.rb_cer_s2, R.id.rb_cer_medium, R.id.rb_cer_mid -> 1
            R.id.rb_cer_34, R.id.rb_cer_70, R.id.rb_cer_s1, R.id.rb_cer_soft, R.id.rb_cer_front -> 2
            R.id.rb_cer_5, R.id.rb_cer_80, R.id.rb_cer_s_12 -> 3
            else -> 0
        }
        groupScores[group.id] = score
        updateScore()
    }

    private fun updateScore() {
        val total = groupScores.values.sum()
        val checked = groupScores.size
        binding.tvTotalScore.text = "$total 分, （您已选择 $checked 个必选项，还有 ${5 - checked} 个必选项未选）"
    }

    private fun initAdaptor() {
        val data = listOf(
            MedCalDataBean("结果解读", "评分≤4分提示宫颈不成熟，需促宫颈成熟。评分≥7分提示宫颈成熟。"),
            MedCalDataBean("相关解释", "国际上采用Bishop评分判断宫颈成熟度，以估计引产的成功率。评分越高，宫颈越成熟，引产成功率越高。0~3分引产不易成功，4~6分成功率仅50%，7~8分成功率80%，评分≥8分者，引产成功率与阴道分娩自然临产结果相似。"),
            MedCalDataBean("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        )
        binding.rvContentAppendix.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MedCalAdapterDatabean(data, columnWeights = floatArrayOf(1f, 3f))
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
