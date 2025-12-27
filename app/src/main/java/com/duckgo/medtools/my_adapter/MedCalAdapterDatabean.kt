package com.duckgo.medtools.my_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.*

class MedCalAdapterDatabean(var data: List<MedCalDataBean>, var subType: Int) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount() = data.size

    override fun getItemViewType(position: Int): Int {
        if (data.isEmpty()) return 0
        val item = data[0]
        return when {
            item.content1 == "" -> 10
            item.content2 == "" -> if (subType in 20..22) subType else 0
            item.content3 == "" -> if (subType in 30..33) subType else 0
            item.content4 == "" -> if (subType == 40) 40 else 0
            item.content5 == "" -> 5
            item.content6 == "" -> if (subType == 60) 60 else 0
            item.content7 == "" -> if (subType == 70) 70 else 0
            else -> 0
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            10 -> ViewHolder10(ListModle1DatabindingBinding.inflate(inflater, parent, false))
            20 -> ViewHolder20(ListModle2DatabingBinding.inflate(inflater, parent, false))
            21 -> ViewHolder21(ListModle21DatabindingBinding.inflate(inflater, parent, false))
            22 -> ViewHolder22(ListModle22DatabindingBinding.inflate(inflater, parent, false))
            30 -> ViewHolder30(ListModle3DatabindingBinding.inflate(inflater, parent, false))
            31 -> ViewHolder31(ListModle31DatabindingBinding.inflate(inflater, parent, false))
            32 -> ViewHolder32(ListModle32DatabindingBinding.inflate(inflater, parent, false))
            33 -> ViewHolder33(ListModle33DatabindingBinding.inflate(inflater, parent, false))
            40 -> ViewHolder40(ListModle4DatabindingBinding.inflate(inflater, parent, false))
            60 -> ViewHolder60(ListModle6DatabindingBinding.inflate(inflater, parent, false))
            70 -> ViewHolder70(ListModle7DatabindingBinding.inflate(inflater, parent, false))
            else -> ViewHolder20(ListModle2DatabingBinding.inflate(inflater, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = data[position]
        when (holder) {
            is ViewHolder10 -> holder.binding.tvContentTitle.text = item.title
            is ViewHolder20 -> {
                holder.binding.tvContentTitle.text = item.title
                holder.binding.tvContent.text = item.content1
            }
            is ViewHolder21 -> {
                holder.binding.tvContentTitle.text = item.title
                holder.binding.tvContent.text = item.content1
            }
            is ViewHolder22 -> {
                holder.binding.tvContentTitle.text = item.title
                holder.binding.tvContent.text = item.content1
            }
            is ViewHolder30 -> holder.binding.apply {
                tvContentTitle.text = item.title
                tvContent1.text = item.content1
                tvContent2.text = item.content2
            }
            is ViewHolder31 -> holder.binding.apply {
                tvContentTitle.text = item.title
                tvContent1.text = item.content1
                tvContent2.text = item.content2
            }
            is ViewHolder32 -> holder.binding.apply {
                tvContentTitle.text = item.title
                tvContent1.text = item.content1
                tvContent2.text = item.content2
            }
            is ViewHolder33 -> holder.binding.apply {
                tvContentTitle.text = item.title
                tvContent1.text = item.content1
                tvContent2.text = item.content2
            }
            is ViewHolder40 -> holder.binding.apply {
                tvContentTitle.text = item.title
                tvContent1.text = item.content1
                tvContent2.text = item.content2
                tvContent3.text = item.content3
            }
            is ViewHolder60 -> holder.binding.apply {
                tvContentTitle.text = item.title
                tvContent1.text = item.content1
                tvContent2.text = item.content2
                tvContent3.text = item.content3
                tvContent4.text = item.content4
                tvContent5.text = item.content5
            }
            is ViewHolder70 -> holder.binding.apply {
                tvContentTitle.text = item.title
                tvContent1.text = item.content1
                tvContent2.text = item.content2
                tvContent3.text = item.content3
                tvContent4.text = item.content4
                tvContent5.text = item.content5
                tvContent6.text = item.content6
            }
        }
    }

    class ViewHolder10(val binding: ListModle1DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder20(val binding: ListModle2DatabingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder21(val binding: ListModle21DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder22(val binding: ListModle22DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder30(val binding: ListModle3DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder31(val binding: ListModle31DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder32(val binding: ListModle32DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder33(val binding: ListModle33DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder40(val binding: ListModle4DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder60(val binding: ListModle6DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
    class ViewHolder70(val binding: ListModle7DatabindingBinding) : RecyclerView.ViewHolder(binding.root)
}
