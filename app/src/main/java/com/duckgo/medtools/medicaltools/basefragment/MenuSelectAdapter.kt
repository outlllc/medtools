package com.duckgo.medtools.medicaltools.basefragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databinding.ListItemForMenuRvBinding

/**
 * 优化后的菜单适配器
 * 1. 使用 ListAdapter 自动处理 Diff，提高性能
 * 2. 添加了 Item 入场动画
 */
class MenuSelectAdapter(
    private val listener: OnItemClickListener
) : ListAdapter<String, MenuSelectAdapter.ViewHolder>(DiffCallback()) {

    private var lastPosition = -1

    class ViewHolder(val binding: ListItemForMenuRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemForMenuRvBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val title = getItem(position)
        holder.binding.tvTitle.apply {
            text = title
            // 添加点击防抖处理
            setOnClickListener {
                it.isEnabled = false
                listener.onItemClick(holder.bindingAdapterPosition)
                it.postDelayed({ it.isEnabled = true }, 500)
            }
        }
        
        // 应用入场动画
        setAnimation(holder.itemView, position)
    }

    /**
     * 设置 Item 入场动画（淡入效果）
     */
    private fun setAnimation(viewToAnimate: View, position: Int) {
        if (position > lastPosition) {
            val animation = AnimationUtils.loadAnimation(
                viewToAnimate.context, 
                android.R.anim.fade_in
            )
            viewToAnimate.startAnimation(animation)
            lastPosition = position
        }
    }

    override fun onViewDetachedFromWindow(holder: ViewHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.itemView.clearAnimation()
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    /**
     * 差异计算回调，用于性能优化
     */
    private class DiffCallback : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean = 
            oldItem == newItem
        
        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean = 
            oldItem == newItem
    }
}
