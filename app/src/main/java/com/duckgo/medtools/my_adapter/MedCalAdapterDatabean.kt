package com.duckgo.medtools.my_adapter

import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.ListItemDynamicBinding

/**
 * 动态列数适配器，支持 1-N 列显示
 * @param data 数据源
 * @param columnWeights 每列的宽度比例，例如 floatArrayOf(2f, 5f, 3f) 表示 2:5:3
 */
class MedCalAdapterDatabean(
    private var data: List<MedCalDataBean>,
    private val columnWeights: FloatArray? = null
) : RecyclerView.Adapter<MedCalAdapterDatabean.DynamicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DynamicViewHolder {
        val binding = ListItemDynamicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DynamicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DynamicViewHolder, position: Int) {
        val bean = data[position]
        // 直接使用 MedCalDataBean 中的 items 数组，有多少数据就展示多少列
        val contents = bean.items

        holder.binding.container.removeAllViews()

        contents.forEachIndexed { index, text ->
            val textView = TextView(holder.itemView.context).apply {
                this.text = text
                this.gravity = Gravity.CENTER_VERTICAL
                this.setPadding(12, 12, 12, 12)
                
                // 获取对应列的权重，若未设置则默认为 1f (等宽)
                val weight = columnWeights?.getOrNull(index) ?: 1f
                layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, weight)
            }
            holder.binding.container.addView(textView)
        }
    }

    override fun getItemCount() = data.size

    class DynamicViewHolder(val binding: ListItemDynamicBinding) : RecyclerView.ViewHolder(binding.root)
}
