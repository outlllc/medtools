package com.duckgo.medtools.medicaltools.A_Menu_Select.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databinding.FirstPageMCBinding

class MenuSelectAdapter(
    private val dataSet: List<String>,
    private val listener: OnItemClickListener
) : RecyclerView.Adapter<MenuSelectAdapter.ViewHolder>() {

    class ViewHolder(val binding: FirstPageMCBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FirstPageMCBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvTitle.apply {
            text = dataSet[position]
            setOnClickListener { listener.onItemClick(position) }
        }
    }

    override fun getItemCount() = dataSet.size

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}
