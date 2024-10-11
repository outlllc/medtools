package com.duckgo.medtools

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyRecycleViewAdaptor(val dataSet: Array<String>) :
    RecyclerView.Adapter<MyRecycleViewAdaptor.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyRecycleViewAdaptor.MyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.first_page_m_c, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyRecycleViewAdaptor.MyViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class MyViewHolder(view: View) : ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tv_title)
    }


}