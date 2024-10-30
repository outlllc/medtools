package com.duckgo.medtools.my_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.AaBinding
import com.duckgo.medtools.databinding.ListModle1DatabindingBinding
import com.duckgo.medtools.databinding.ListModle21DatabindingBinding
import com.duckgo.medtools.databinding.ListModle22DatabindingBinding
import com.duckgo.medtools.databinding.ListModle2DatabingBinding
import com.duckgo.medtools.databinding.ListModle31DatabindingBinding
import com.duckgo.medtools.databinding.ListModle32DatabindingBinding
import com.duckgo.medtools.databinding.ListModle33DatabindingBinding
import com.duckgo.medtools.databinding.ListModle3DatabindingBinding
import com.duckgo.medtools.databinding.ListModle4DatabindingBinding
import com.duckgo.medtools.databinding.ListModle6DatabindingBinding
import com.duckgo.medtools.databinding.ListModle7DatabindingBinding

class MedCalAdapterDatabean(var data:List<MedCalDataBean>, var subType:Int):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var binding10: ListModle1DatabindingBinding
    lateinit var binding20: ListModle2DatabingBinding
    lateinit var binding21: ListModle21DatabindingBinding
    lateinit var binding22: ListModle22DatabindingBinding
    lateinit var binding30: ListModle3DatabindingBinding
    lateinit var binding31: ListModle31DatabindingBinding
    lateinit var binding32: ListModle32DatabindingBinding
    lateinit var binding33: ListModle33DatabindingBinding
    lateinit var binding40: ListModle4DatabindingBinding
    lateinit var binding60: ListModle6DatabindingBinding
    lateinit var binding70: ListModle7DatabindingBinding
    var mViewType = 0

    class ViewHolder10(var binding: ListModle1DatabindingBinding): RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder20(var binding:ListModle2DatabingBinding):RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder21(var binding:ListModle21DatabindingBinding): RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder22(var binding:ListModle22DatabindingBinding): RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder30(val binding:ListModle3DatabindingBinding) : RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder31(val binding:ListModle31DatabindingBinding) : RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder32(val binding:ListModle32DatabindingBinding) : RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder33(val binding: ListModle33DatabindingBinding) : RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder40(val binding:ListModle4DatabindingBinding) : RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder60(val binding:ListModle6DatabindingBinding) : RecyclerView.ViewHolder(binding.root){

    }
    class ViewHolder70(val binding:ListModle7DatabindingBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        mViewType = viewType
        when(viewType){
            10 -> {
                binding10 = ListModle1DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder10(binding10)
            }
            20 -> {
                binding20 = ListModle2DatabingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder20(binding20)
            }
            21 -> {
                binding21 = ListModle21DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder21(binding21)
            }
            22 -> {
                binding22 = ListModle22DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder22(binding22)
            }
            30 -> {
                binding30 = ListModle3DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder30(binding30)
            }
            31 -> {
                binding31 = ListModle31DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder31(binding31)
            }
            32 -> {
                binding32 = ListModle32DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder32(binding32)
            }
            33 -> {
                binding33 = ListModle33DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder33(binding33)
            }
            40 -> {
                binding40 = ListModle4DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder40(binding40)
            }
            60 -> {
                binding60 = ListModle6DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder60(binding60)
            }
            70 -> {
                binding70 = ListModle7DatabindingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder70(binding70)
            }
            else -> {
                binding20 = ListModle2DatabingBinding.inflate((LayoutInflater.from(parent.context)),parent,false)
                return ViewHolder20(binding20)
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (mViewType) {
            10 -> {
                (holder as ViewHolder10).binding.tvContentTitle.text = data[position].title
            }
            20 -> {
                (holder as ViewHolder20).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent.text = data[position].content1
            }
            21 -> {
                (holder as ViewHolder21).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent.text = data[position].content1
            }
            22 -> {
                (holder as ViewHolder22).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent.text = data[position].content1
            }
            30 -> {
                (holder as ViewHolder30).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent1.text = data[position].content1
                holder.binding.tvContent2.text = data[position].content2
            }
            31 -> {
                (holder as ViewHolder31).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent1.text = data[position].content1
                holder.binding.tvContent2.text = data[position].content2
            }
            32 -> {
                (holder as ViewHolder32).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent1.text = data[position].content1
                holder.binding.tvContent2.text = data[position].content2
            }
            33 -> {
                (holder as ViewHolder33).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent1.text = data[position].content1
                holder.binding.tvContent2.text = data[position].content2
            }
            40 -> {
                (holder as ViewHolder40).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent1.text = data[position].content1
                holder.binding.tvContent2.text = data[position].content2
                holder.binding.tvContent3.text = data[position].content3
            }
            60 -> {
                (holder as ViewHolder60).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent1.text = data[position].content1
                holder.binding.tvContent2.text = data[position].content2
                holder.binding.tvContent3.text = data[position].content3
                holder.binding.tvContent4.text = data[position].content4
                holder.binding.tvContent5.text = data[position].content5
            }
            70 -> {
                (holder as ViewHolder70).binding.tvContentTitle.text = data[position].title
                holder.binding.tvContent1.text = data[position].content1
                holder.binding.tvContent2.text = data[position].content2
                holder.binding.tvContent3.text = data[position].content3
                holder.binding.tvContent4.text = data[position].content4
                holder.binding.tvContent5.text = data[position].content5
                holder.binding.tvContent6.text = data[position].content6
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        if(data[0].content1 == ""){
            return 10
        }else if (data[0].content2 == ""){
            if(subType == 20){
                return 20
            }else if(subType == 21){
                return 21
            }else if(subType == 22){
                return 22
            }else {
                return 0
            }
        }else if (data[0].content3 == ""){
            if(subType == 30){
                return 30
            }else if(subType == 31){
                return 31
            }else if(subType == 32){
                return 32
            }else if (subType == 33){
                return 33
            } else {
                return 0
            }
        }else if (data[0].content4 == ""){
            if (subType == 40) {
                return 40
            }else {
                return 0
            }
        }else if (data[0].content5 == ""){
            return 5
        }else if (data[0].content6 == ""){
            if (subType == 60) {
                return 60
            }else {
                return 0
            }
        }else if(data[0].content7 == ""){
            if (subType == 70) {
                return 70
            }else {
                return 0
            }
        }else{
            return 0
        }
    }
}