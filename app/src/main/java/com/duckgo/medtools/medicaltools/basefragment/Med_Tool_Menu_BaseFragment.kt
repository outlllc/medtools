package com.duckgo.medtools.medicaltools.basefragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter

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
        mfragmentManager = requireActivity().supportFragmentManager
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
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
    }
}