package com.duckgo.medtools.medicaltools.basefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewbinding.ViewBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.util.add_hide_fragment

abstract class Med_Tool_Menu_BaseFragment<T: ViewBinding>: Fragment() {
    protected lateinit var binding: T
    lateinit var mfragmentManager: FragmentManager
    var dataSet: MutableList<String> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getFragmentViewBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mfragmentManager = childFragmentManager
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }

    open fun initAdaptor(){
    }

    open fun initData_appendix(): MutableList<Array<String>>{
        var result_data_appendix: MutableList<Array<String>> = mutableListOf()
        return result_data_appendix
    }

    open fun initData(): MutableList<String>{
        return dataSet
    }

    open fun initView(){}

    abstract fun getFragmentViewBinding(): T

    open fun inflateFragment(fragment: Fragment){
        // 修改点：使用 parentFragmentManager 确保 Fragment 被添加到父级（MenuFragment）的容器中
        // 从而保持 ExpandTabView 始终在顶部
        add_hide_fragment(parentFragmentManager, fragment, R.id.fm_med_cal_firstpage)
    }
}