package com.duckgo.medtools.medicaltools.basefragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.medicaltools.A_Menu_Select.adapter.MenuSelectAdapter
import com.duckgo.medtools.util.add_hide_fragment

abstract class Med_Tool_Menu_BaseFragment<T: ViewBinding>: Fragment(), MenuSelectAdapter.OnItemClickListener {
    protected lateinit var binding: T
    var dataSet: MutableList<String> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = getFragmentViewBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        // 假设所有菜单布局中 RecyclerView 的 ID 都是 rv_medical_calculator
        // 通过反射或约定获取，由于使用了 ViewBinding，我们可以在子类中重写或在基类尝试查找
        val recyclerView = binding.root.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.rv_medical_calculator)
        recyclerView?.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MenuSelectAdapter(requireContext(), dataSet, this@Med_Tool_Menu_BaseFragment)
        }
    }

    abstract fun initData()
    abstract fun getFragmentViewBinding(): T

    open fun inflateFragment(fragment: Fragment){
        add_hide_fragment(parentFragmentManager, fragment, R.id.fm_med_cal_firstpage)
    }

    // 子类实现具体点击逻辑
    override fun onItemClick(position: Int) {}
}