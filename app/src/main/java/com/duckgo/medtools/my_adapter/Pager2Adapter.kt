package com.duckgo.medtools.my_adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Pager2Adapter(var mContext: Context, var dataSet: MutableList<String>): RecyclerView.Adapter<Pager2Adapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(View(mContext))
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }
}