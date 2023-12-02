package com.example.recycle

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


//class RecyAdaptor(var List:List<String>) : RecyclerView.Adapter<RecyAdaptor.ViewHolder>() {
//    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val tvText:TextView
////        fun ViewHolder(itemView:View){
//        init{tvText=itemView.findViewById<TextView>(R.id.textview1)}
////        }
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        var view=LayoutInflater.from(parent.context).inflate(R.layout.second,parent,false)
//        return ViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return List.size
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        var tvText=holder.itemView.findViewById<TextView>(R.id.textview1)
//        holder.tvText.setText(List[position])
//    }
//}