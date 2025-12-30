package com.duckgo.medtools.my_adapter

import android.graphics.Color
import android.graphics.Typeface
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.ListItemDynamicBinding

/**
 * 动态列数适配器，支持 1-N 列显示
 * 优化了显示效果：支持表头样式、隔行换色、纵向网格线，提升医疗数据的阅读体验
 * @param data 数据源
 * @param columnWeights 每列的宽度比例
 * @param contentGravity 内容对齐方式
 * @param isFirstRowHeader 是否将第一行视为表头
 */
class MedCalAdapterDatabean(
    private val data: List<MedCalDataBean>,
    private val columnWeights: FloatArray? = null,
    private val contentGravity: Int = Gravity.CENTER_VERTICAL,
    private val isFirstRowHeader: Boolean = true
) : RecyclerView.Adapter<MedCalAdapterDatabean.DynamicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DynamicViewHolder {
        val binding = ListItemDynamicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DynamicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DynamicViewHolder, position: Int) {
        val bean = data[position]
        val contents = bean.items
        val context = holder.itemView.context

        // 1. 设置行背景色：表头使用浅蓝色背景，普通行使用隔行换色
        val backgroundColor = when {
            position == 0 && isFirstRowHeader -> ContextCompat.getColor(context, R.color.lightcyan)
            position % 2 == 1 -> ContextCompat.getColor(context, R.color.skywhite)
            else -> ContextCompat.getColor(context, R.color.white)
        }
        holder.binding.container.setBackgroundColor(backgroundColor)

        holder.binding.container.removeAllViews()

        // 2. 动态添加列内容及垂直分隔线
        contents.forEachIndexed { index, text ->
            // 添加垂直分隔线（第一列前不添加）
            if (index > 0) {
                val divider = View(context).apply {
                    val width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1f, resources.displayMetrics).toInt()
                    layoutParams = LinearLayout.LayoutParams(width, ViewGroup.LayoutParams.MATCH_PARENT)
                    setBackgroundColor("#E0E0E0".toColorInt())
                }
                holder.binding.container.addView(divider)
            }

            // 添加内容文本
            val textView = TextView(context).apply {
                this.text = text
                this.gravity = contentGravity
                // 设置较大的内边距，增加易读性
                val paddingH = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 12f, resources.displayMetrics).toInt()
                val paddingV = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10f, resources.displayMetrics).toInt()
                this.setPadding(paddingH, paddingV, paddingH, paddingV)
                
                // 基础字体设置
                this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
                this.setTextColor("#333333".toColorInt())
                this.setLineSpacing(0f, 1.15f) // 增加行间距

                // 表头样式特殊处理
                if (position == 0 && isFirstRowHeader) {
                    this.typeface = Typeface.DEFAULT_BOLD
                    this.setTextColor(Color.BLACK)
                    this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15f)
                }

                // 获取对应列的权重
                val weight = columnWeights?.getOrNull(index) ?: 1f
                layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, weight)
            }
            holder.binding.container.addView(textView)
        }
    }

    override fun getItemCount() = data.size

    class DynamicViewHolder(val binding: ListItemDynamicBinding) : RecyclerView.ViewHolder(binding.root)
}
