package com.duckgo.medtools.medicaltools.A_Menu_Select.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R

class MenuSelectAdapter(var context: Context,  var dataSet: MutableList<String>, var listener: OnItemClickListener):RecyclerView.Adapter<MenuSelectAdapter.ViewHolder>() {

    class ViewHolder(val itemView: View):RecyclerView.ViewHolder(itemView){
        var tv_title:TextView = itemView.findViewById(R.id.tv_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.first_page_m_c,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tv_title.text = dataSet[position]
        holder.tv_title.setOnClickListener {
        listener.onItemClick(position)
        }
    }
    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }
}