package com.duckgo.medtools.my_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R

class MedCalListAdapter(var dataSet: MutableList<Array<String>>, var subType: String) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutRes = when (viewType) {
            10 -> R.layout.list_modle_1
            20 -> R.layout.list_modle_2
            21 -> R.layout.list_modle_2_1
            30 -> R.layout.list_modle_3
            31 -> R.layout.list_modle_3_1
            32 -> R.layout.list_modle_3_2
            40 -> R.layout.list_modle_4
            70 -> R.layout.list_modle_7
            else -> R.layout.list_modle_2
        }
        val itemView = LayoutInflater.from(parent.context).inflate(layoutRes, parent, false)
        return when (viewType) {
            10 -> ViewHolder10(itemView)
            20 -> ViewHolder20(itemView)
            21 -> ViewHolder21(itemView)
            30 -> ViewHolder30(itemView)
            31 -> ViewHolder31(itemView)
            32 -> ViewHolder32(itemView)
            40 -> ViewHolder40(itemView)
            70 -> ViewHolder70(itemView)
            else -> ViewHolder21(itemView)
        }
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val data = dataSet[position]
        when (holder) {
            is ViewHolder10 -> holder.tv_content_title.text = data[0]
            is ViewHolder20 -> {
                holder.tv_content_title.text = data[0]
                holder.tv_content.text = if (data.size > 1) data[1] else ""
            }
            is ViewHolder21 -> {
                holder.tv_content_title.text = data[0]
                holder.tv_content.text = if (data.size > 1) data[1] else ""
            }
            is ViewHolder30 -> {
                holder.tv_content_title.text = data[0]
                holder.tv_content1.text = if (data.size > 1) data[1] else ""
                holder.tv_content2.text = if (data.size > 2) data[2] else ""
            }
            is ViewHolder31 -> {
                holder.tv_content_title.text = data[0]
                holder.tv_content1.text = if (data.size > 1) data[1] else ""
                holder.tv_content2.text = if (data.size > 2) data[2] else ""
            }
            is ViewHolder32 -> {
                holder.tv_content_title.text = data[0]
                holder.tv_content1.text = if (data.size > 1) data[1] else ""
                holder.tv_content2.text = if (data.size > 2) data[2] else ""
            }
            is ViewHolder40 -> {
                holder.tv_content_title.text = data[0]
                holder.tv_content1.text = if (data.size > 1) data[1] else ""
                holder.tv_content2.text = if (data.size > 2) data[2] else ""
                holder.tv_content3.text = if (data.size > 3) data[3] else ""
            }
            is ViewHolder70 -> {
                holder.tv_content_title.text = data[0]
                holder.tv_content1.text = if (data.size > 1) data[1] else ""
                holder.tv_content2.text = if (data.size > 2) data[2] else ""
                holder.tv_content3.text = if (data.size > 3) data[3] else ""
                holder.tv_content4.text = if (data.size > 4) data[4] else ""
                holder.tv_content5.text = if (data.size > 5) data[5] else ""
                holder.tv_content6.text = if (data.size > 6) data[6] else ""
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        val size = dataSet[position].size
        return when (size) {
            1 -> if (subType == "10") 10 else 11
            2 -> if (subType == "20") 20 else 21
            3 -> when (subType) {
                "30" -> 30
                "31" -> 31
                "32" -> 32
                else -> 30
            }
            4 -> 40
            7 -> 70
            else -> 0
        }
    }

    class ViewHolder10(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_content_title: TextView = itemView.findViewById(R.id.tv_content_title)
    }
    class ViewHolder20(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_content_title: TextView = itemView.findViewById(R.id.tv_content_title)
        val tv_content: TextView = itemView.findViewById(R.id.tv_content)
    }
    class ViewHolder21(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_content_title: TextView = itemView.findViewById(R.id.tv_content_title)
        val tv_content: TextView = itemView.findViewById(R.id.tv_content)
    }
    class ViewHolder30(view: View) : RecyclerView.ViewHolder(view) {
        val tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        val tv_content1: TextView = view.findViewById(R.id.tv_content1)
        val tv_content2: TextView = view.findViewById(R.id.tv_content2)
    }
    class ViewHolder31(view: View) : RecyclerView.ViewHolder(view) {
        val tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        val tv_content1: TextView = view.findViewById(R.id.tv_content1)
        val tv_content2: TextView = view.findViewById(R.id.tv_content2)
    }
    class ViewHolder32(view: View) : RecyclerView.ViewHolder(view) {
        val tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        val tv_content1: TextView = view.findViewById(R.id.tv_content1)
        val tv_content2: TextView = view.findViewById(R.id.tv_content2)
    }
    class ViewHolder40(view: View) : RecyclerView.ViewHolder(view) {
        val tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        val tv_content1: TextView = view.findViewById(R.id.tv_content1)
        val tv_content2: TextView = view.findViewById(R.id.tv_content2)
        val tv_content3: TextView = view.findViewById(R.id.tv_content3)
    }
    class ViewHolder70(view: View) : RecyclerView.ViewHolder(view) {
        val tv_content_title: TextView = view.findViewById(R.id.tv_content_title)
        val tv_content1: TextView = view.findViewById(R.id.tv_content1)
        val tv_content2: TextView = view.findViewById(R.id.tv_content2)
        val tv_content3: TextView = view.findViewById(R.id.tv_content3)
        val tv_content4: TextView = view.findViewById(R.id.tv_content4)
        val tv_content5: TextView = view.findViewById(R.id.tv_content5)
        val tv_content6: TextView = view.findViewById(R.id.tv_content6)
    }
}
