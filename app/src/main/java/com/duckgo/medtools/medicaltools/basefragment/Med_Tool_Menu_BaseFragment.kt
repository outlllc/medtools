package com.duckgo.medtools.medicaltools.basefragment

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

abstract class Med_Tool_Menu_BaseFragment<T : ViewBinding> : Fragment(), MenuSelectAdapter.OnItemClickListener {
    private var _binding: T? = null
    protected val binding get() = _binding!!
    var dataSet: MutableList<String> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = getFragmentViewBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.root.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.rv_medical_calculator)
        recyclerView?.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MenuSelectAdapter(dataSet, this@Med_Tool_Menu_BaseFragment)
        }
    }

    abstract fun initData()
    abstract fun getFragmentViewBinding(): T

    open fun inflateFragment(fragment: Fragment) {
        add_hide_fragment(parentFragmentManager, fragment, R.id.fm_med_cal_firstpage)
    }

    override fun onItemClick(position: Int) {}

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
