package com.duckgo.medtools.mine

import com.duckgo.medtools.databinding.FragmentSoftwareUsageBinding
import com.duckgo.medtools.medicaltools.BaseFragmentDataBinding

class SoftwareUsageFragment : BaseFragmentDataBinding<FragmentSoftwareUsageBinding>() {

    override fun getFragmentViewBinding(): FragmentSoftwareUsageBinding {
        return FragmentSoftwareUsageBinding.inflate(layoutInflater)
    }

    override fun initView() {
        binding.toolbar.setNavigationOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}
