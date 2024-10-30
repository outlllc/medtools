package com.duckgo.medtools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.duckgo.medtools.databean.MedCalDataBean
import com.duckgo.medtools.databinding.ActivityAmountOfHydrationBinding.inflate
import com.duckgo.medtools.my_adapter.MedCalListAdapter

abstract class BaseFragmentDataBinding<T: ViewBinding>: Fragment() {
    protected lateinit var binding: T
    var data: List<MedCalDataBean> = listOf()
    var data_appendix: List<MedCalDataBean> = listOf()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
//        var view = inflater.inflate(getLayoutId(), container, false)
        binding = getFragmentViewBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }

    open fun initAdaptor(){    }

    open fun initData(): List<MedCalDataBean>{
        var result_data: List<MedCalDataBean> = listOf()
        return result_data
    }

    open fun initData_appendix(): List<MedCalDataBean>{
        var result_data_appendix: List<MedCalDataBean> = listOf()
        return result_data_appendix
    }

    open fun initView(){}

    abstract fun getFragmentViewBinding(): T
//    abstract fun getLayoutId(): Int
}


