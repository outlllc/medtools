package com.duckgo.medtools.medicaltools.basefragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.util.addHideFragment

/**
 * 医疗工具菜单基类
 * 优化：自动处理列表数据同步与点击跳转，子类仅需注册项目
 */
abstract class Med_Tool_Menu_BaseFragment<T : ViewBinding> : Fragment(), MenuSelectAdapter.OnItemClickListener {
    private var _binding: T? = null
    protected val binding get() = _binding!!
    
    private val menuItems = mutableListOf<Pair<String, () -> Fragment>>()
    private lateinit var menuAdapter: MenuSelectAdapter

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
        menuAdapter = MenuSelectAdapter(this)
        recyclerView?.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = menuAdapter
        }
        // 提交数据给 ListAdapter
        menuAdapter.submitList(menuItems.map { it.first })
    }

    abstract fun initData()
    abstract fun getFragmentViewBinding(): T

    protected fun addMenuItem(title: String, creator: () -> Fragment) {
        menuItems.add(title to creator)
    }

    override fun onItemClick(position: Int) {
        if (position in menuItems.indices) {
            val fragment = menuItems[position].second()
            inflateFragment(fragment)
        }
    }

    open fun inflateFragment(fragment: Fragment) {
        hideKeyboard()
        parentFragmentManager.addHideFragment(fragment, R.id.fm_med_cal_firstpage)
    }

    private fun hideKeyboard() {
        val imm = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        imm?.hideSoftInputFromWindow(view?.windowToken, 0)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
