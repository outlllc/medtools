package com.duckgo.medtools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.duckgo.medtools.databean.MedCalDataBean

abstract class BaseFragmentDataBinding<T : ViewBinding> : Fragment() {
    private var _binding: T? = null
    protected val binding get() = _binding!!

    var data: List<MedCalDataBean> = listOf()
    var data_appendix: List<MedCalDataBean> = listOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = getFragmentViewBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }

    open fun initAdaptor() {}
    open fun initData(): List<MedCalDataBean> = listOf()
    open fun initData_appendix(): List<MedCalDataBean> = listOf()
    open fun initView() {}

    abstract fun getFragmentViewBinding(): T

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
