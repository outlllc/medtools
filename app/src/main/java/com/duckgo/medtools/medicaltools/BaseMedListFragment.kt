package com.duckgo.medtools.medicaltools

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding

/**
 * 医疗列表 Fragment 基类
 */
abstract class BaseMedListFragment : BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
    override fun getFragmentViewBinding() = FragmentTwoRecycleviewModelFmBinding.inflate(layoutInflater)

    abstract fun getTitle(): String
    
    /**
     * 控制列表中每一行内容的对齐方式
     * 默认垂直居中。如果某一列内容较多撑开行高，其它列内容将在此行内纵向居中。
     */
    protected open val itemGravity: Int = Gravity.CENTER_VERTICAL

    abstract fun getAdapters(): List<RecyclerView.Adapter<out RecyclerView.ViewHolder>>

    override fun initView() {
        binding.tv1.text = getTitle()
    }

    override fun initAdaptor() {
        binding.rv1.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ConcatAdapter(getAdapters())
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }
}

/**
 * 优化后的间距适配器
 */
class GapAdapter(
    private val heightDp: Int = 16,
    private val color: Int = android.graphics.Color.TRANSPARENT,
    private val withAnimation: Boolean = true
) : RecyclerView.Adapter<GapAdapter.GapViewHolder>() {

    class GapViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GapViewHolder {
        val view = View(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                (heightDp * resources.displayMetrics.density).toInt()
            )
            setBackgroundColor(color)
        }
        return GapViewHolder(view)
    }

    override fun onBindViewHolder(holder: GapViewHolder, position: Int) {
        if (withAnimation) {
            val animation = AlphaAnimation(0f, 1f).apply {
                duration = 500
                fillAfter = true
            }
            holder.itemView.startAnimation(animation)
        }
    }

    override fun getItemCount() = 1

    override fun onViewDetachedFromWindow(holder: GapViewHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.itemView.clearAnimation()
    }
}
