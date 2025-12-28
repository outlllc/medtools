package com.duckgo.medtools.babyweight

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databinding.FragmentBabyweightUserItemRecycleviewBinding
import java.util.Locale

/**
 * 优化后的用户对比报告适配器
 * 1. 集成 DataBinding 提高性能
 * 2. 使用 ListAdapter 实现自动差异计算和流畅动画
 */
class UserCompareAdapter : ListAdapter<UserCompareReport, UserCompareAdapter.VH>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = FragmentBabyweightUserItemRecycleviewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(getItem(position))
    }

    /**
     * 兼容旧代码的 updateData 方法
     */
    fun updateData(newItems: List<UserCompareReport>) {
        submitList(newItems)
    }

    class VH(private val binding: FragmentBabyweightUserItemRecycleviewBinding) : 
        RecyclerView.ViewHolder(binding.root) {

        fun bind(r: UserCompareReport) {
            binding.tvMeasureName.text = r.measure
            
            val fmt: (Double) -> String = { String.format(Locale.getDefault(), "%.1f", it) }

            binding.tvOriginal.text = "P5=${fmt(r.original.p5)}  P50=${fmt(r.original.p50)}  P95=${fmt(r.original.p95)}"
            binding.tvP50.text = "中位数(P50): ${fmt(r.original.p50)}"

            if (r.userValue == null) {
                binding.tvUserValue.text = "用户值: —"
                binding.tvUserPercent.text = "占中位数: —"
            } else {
                binding.tvUserValue.text = "用户值(mm): ${fmt(r.userValue)}"
                val pctText = r.userPercentOfP50?.let { String.format(Locale.getDefault(), "%.1f%%", it) } ?: "—"
                binding.tvUserPercent.text = "占P50的比例: $pctText"
            }

            binding.tvInterpretation.text = "结论: ${r.interpretation}"

            // 设置背景色逻辑
            applyCardStyle(r)
            
            // 立即执行绑定，防止闪烁
            binding.executePendingBindings()
        }

        private fun applyCardStyle(r: UserCompareReport) {
            val color = when (r.interpretation) {
                "未输入" -> "#FAFAFA"
                "参考数据缺失" -> "#F5F5F5"
                "正常" -> "#E8F5E9"
                "偏小" -> if ((r.userPercentOfP50 ?: 100.0) < 80.0) "#FFCDD2" else "#FFE0B2"
                "偏大" -> if ((r.userPercentOfP50 ?: 100.0) > 120.0) "#FFCDD2" else "#FFE0B2"
                else -> "#FFFFFF"
            }
            binding.root.setBackgroundColor(Color.parseColor(color))
        }
    }

    private class DiffCallback : DiffUtil.ItemCallback<UserCompareReport>() {
        override fun areItemsTheSame(oldItem: UserCompareReport, newItem: UserCompareReport): Boolean =
            oldItem.measure == newItem.measure

        override fun areContentsTheSame(oldItem: UserCompareReport, newItem: UserCompareReport): Boolean =
            oldItem == newItem
    }
}
