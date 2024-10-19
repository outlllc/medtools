package com.duckgo.medtools.my_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R

class MedCalListAdapter(var dataSet: MutableList<Array<String>>, var subType:String) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var mViewType = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            10 -> {
                mViewType = viewType
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_1,parent,false)
                return ViewHolder10(itemView)
            }
            20 -> {
                mViewType = viewType
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_2,parent,false)
                return ViewHolder20(itemView)
            }
            21 -> {
                mViewType = viewType
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_2_1,parent,false)
                return ViewHolder21(itemView)
            }
            30 -> {
                mViewType = viewType
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_3,parent,false)
                return ViewHolder30(itemView)
            }
            31 -> {
                mViewType = viewType
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_3_1, parent, false)
                return ViewHolder31(itemView)
            }
            32 -> {
                mViewType = viewType
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_3_2, parent, false)
                return ViewHolder32(itemView)
            }
            40 -> {
                mViewType = viewType
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_4,parent,false)
                return ViewHolder40(itemView)
            }
            70 -> {
                mViewType = viewType
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_7,parent,false)
                return ViewHolder70(itemView)
            }
        }

        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_modle_2,parent,false)
        return ViewHolder21(itemView)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (mViewType){
            10 -> {
                (holder as ViewHolder10).tv_content_title.text = dataSet[position][0]
            }
            20 -> {
                (holder as ViewHolder20).tv_content_title.text = dataSet[position][0]
                holder.tv_content.text = dataSet[position][1]
            }
            21 -> {
                (holder as ViewHolder21).tv_content_title.text = dataSet[position][0]
                holder.tv_content.text = dataSet[position][1]
            }
            30 -> {
                (holder as ViewHolder30).tv_content_title.text = dataSet[position][0]
                holder.tv_content1.text = dataSet[position][1]
                holder.tv_content2.text = dataSet[position][2]
            }
            31 -> {
                (holder as ViewHolder31).tv_content_title.text = dataSet[position][0]
                holder.tv_content1.text = dataSet[position][1]
                holder.tv_content2.text = dataSet[position][2]
            }
            32 -> {
                (holder as ViewHolder32).tv_content_title.text = dataSet[position][0]
                holder.tv_content1.text = dataSet[position][1]
                holder.tv_content2.text = dataSet[position][2]
            }
            40 -> {
                (holder as ViewHolder40).tv_content_title.text = dataSet[position][0]
                holder.tv_content1.text = dataSet[position][1]
                holder.tv_content2.text = dataSet[position][2]
                holder.tv_content3.text = dataSet[position][3]
            }
            70 -> {
                (holder as ViewHolder70).tv_content_title.text = dataSet[position][0]
                holder.tv_content1.text = dataSet[position][1]
                holder.tv_content2.text = dataSet[position][2]
                holder.tv_content3.text = dataSet[position][3]
                holder.tv_content4.text = dataSet[position][4]
                holder.tv_content5.text = dataSet[position][5]
                holder.tv_content6.text = dataSet[position][6]
            }
            else ->{}
        }
    }

    override fun getItemViewType(position: Int): Int {
        when (dataSet[0].size) {
            1 -> {
                if (subType == "10") {
                    return 10
                } else if (subType == "11") {
                    return 11
                }
            }
            2 -> {
                if (subType == "20") {
                    return 20
                } else if (subType == "21") {
                    return 21
                }
            }
            3 -> {
                if (subType == "30") {
                    return 30
                } else if (subType == "31") {
                    return 31
                } else if (subType == "32"){
                    return 32
                }
            }
            4 -> return 40
            5 -> return 50
            6 -> return 60
            7 -> return 70
            else -> return 0
        }
        return 0
    }
    class ViewHolder20(itemView: View): RecyclerView.ViewHolder(itemView){
        var tv_content_title = itemView.findViewById<TextView>(R.id.tv_content_title)
        var tv_content = itemView.findViewById<TextView>(R.id.tv_content)
    }
    class ViewHolder21(itemView: View): RecyclerView.ViewHolder(itemView){
        var tv_content_title = itemView.findViewById<TextView>(R.id.tv_content_title)
        var tv_content = itemView.findViewById<TextView>(R.id.tv_content)
    }
    class ViewHolder30(val view: View) : RecyclerView.ViewHolder(view){
        var tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        var tv_content1: TextView = view.findViewById(R.id.tv_content1)
        var tv_content2: TextView = view.findViewById(R.id.tv_content2)
    }
    class ViewHolder31(val view: View) : RecyclerView.ViewHolder(view){
        var tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        var tv_content1: TextView = view.findViewById(R.id.tv_content1)
        var tv_content2: TextView = view.findViewById(R.id.tv_content2)
    }
    class ViewHolder32(val view: View) : RecyclerView.ViewHolder(view){
        var tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        var tv_content1: TextView = view.findViewById(R.id.tv_content1)
        var tv_content2: TextView = view.findViewById(R.id.tv_content2)
    }
    class ViewHolder40(val view: View) : RecyclerView.ViewHolder(view){
        var tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        var tv_content1: TextView = view.findViewById(R.id.tv_content1)
        var tv_content2: TextView = view.findViewById(R.id.tv_content2)
        var tv_content3: TextView = view.findViewById(R.id.tv_content3)
    }
    class ViewHolder70(val view: View) : RecyclerView.ViewHolder(view){
        var tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        var tv_content1: TextView = view.findViewById(R.id.tv_content1)
        var tv_content2: TextView = view.findViewById(R.id.tv_content2)
        var tv_content3: TextView = view.findViewById(R.id.tv_content3)
        var tv_content4: TextView = view.findViewById(R.id.tv_content4)
        var tv_content5: TextView = view.findViewById(R.id.tv_content5)
        var tv_content6: TextView = view.findViewById(R.id.tv_content6)
    }
    class ViewHolder10(itemView: View): RecyclerView.ViewHolder(itemView){
        var tv_content_title: TextView = itemView.findViewById(R.id.tv_content_title)
    }
}