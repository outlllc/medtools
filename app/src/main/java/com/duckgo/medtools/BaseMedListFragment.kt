package com.duckgo.medtools

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databinding.FragmentTwoRecycleviewModelFmBinding

abstract class BaseMedListFragment : BaseFragmentDataBinding<FragmentTwoRecycleviewModelFmBinding>() {
    override fun getFragmentViewBinding() = FragmentTwoRecycleviewModelFmBinding.inflate(layoutInflater)

    abstract fun getTitle(): String
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
 * 通用的间距适配器，用于在 ConcatAdapter 中增加空白行
 * @param heightDp 间距高度，单位为 dp
 */
class GapAdapter(private val heightDp: Int = 16) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = View(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                (heightDp * resources.displayMetrics.density).toInt()
            )
        }
        return object : RecyclerView.ViewHolder(view) {}
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = 1
}
