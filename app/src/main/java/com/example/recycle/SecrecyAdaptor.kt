package com.example.recycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class SecrecyAdaptor(var list :List<String>) : RecyclerView.Adapter<SecrecyAdaptor.VH>() {
//    class VH(view:View) : RecyclerView.ViewHolder(view){
//        var tvtext:TextView
//        init {
//            tvtext=view.findViewById<TextView>(R.id.textview1)
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
//        var view :View= LayoutInflater.from(parent.context).inflate(R.layout.second,parent,false)
//        return VH(view)
//    }
//
//    override fun getItemCount(): Int {
//        return list.size
//    }
//
//    override fun onBindViewHolder(holder: VH, position: Int) {
//        holder.tvtext.setText(list[position])
//    }
//
//}