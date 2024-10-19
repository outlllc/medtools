package com.duckgo.medtools

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.duckgo.medtools.databinding.FirstPageMCBinding

class Med_Cal_Fragment_Adaptor(var context: Context, var listener: onItemClickListener, val dataSet: Array<String>) : RecyclerView.Adapter<Med_Cal_Fragment_Adaptor.MyViewHolder>() {

    lateinit var binding: FirstPageMCBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Med_Cal_Fragment_Adaptor.MyViewHolder {
//        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.first_page_m_c, parent, false)
//        var holder = MyViewHolder(itemView)
        val inflater = LayoutInflater.from(parent.context)
        binding = FirstPageMCBinding.inflate(inflater, parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Med_Cal_Fragment_Adaptor.MyViewHolder, position: Int) {
        holder.binding.tvTitle.text = dataSet[position]
        holder.binding.tvTitle.setOnClickListener {
            listener.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
//    实用var binding 则binding成为MyViewHolder的属性，可以在onBindViewHolder中直接引用
    class MyViewHolder(var binding: FirstPageMCBinding) : ViewHolder(binding.root) {

    }

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }
}