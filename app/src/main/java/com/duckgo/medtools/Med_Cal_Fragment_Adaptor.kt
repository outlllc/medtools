package com.duckgo.medtools

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.databinding.FirstPageMCBinding

class Med_Cal_Fragment_Adaptor(
    private val listener: OnItemClickListener,
    private val dataSet: Array<String>
) : RecyclerView.Adapter<Med_Cal_Fragment_Adaptor.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FirstPageMCBinding.inflate(inflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.tvTitle.text = dataSet[position]
        holder.binding.tvTitle.setOnClickListener {
            listener.onItemClick(position)
        }
    }

    override fun getItemCount() = dataSet.size

    class MyViewHolder(val binding: FirstPageMCBinding) : RecyclerView.ViewHolder(binding.root)

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}
