package com.duckgo.medtools

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Med_Cal_Fragment_Adaptor(var context: Context, var listener: onItemClickListener, val dataSet: Array<String>) : RecyclerView.Adapter<Med_Cal_Fragment_Adaptor.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Med_Cal_Fragment_Adaptor.MyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.first_page_m_c, parent, false)
        var holder = MyViewHolder(itemView)

        return holder
    }

    override fun onBindViewHolder(holder: Med_Cal_Fragment_Adaptor.MyViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
        holder.textView.setOnClickListener {
            listener.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class MyViewHolder(view: View) : ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tv_title)
    }

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }
}