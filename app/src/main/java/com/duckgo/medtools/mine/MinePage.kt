package com.duckgo.medtools.mine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentMinePageBinding
import com.duckgo.medtools.my_adapter.Pager2FragmentAdapter
import com.duckgo.medtools.my_adapter.ViewPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MinePage : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var _binding: FragmentMinePageBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMinePageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupViewPager1()
        setupViewPager2()
    }

    private fun setupViewPager1() {
        val dataSet2 = mutableListOf<View>(
            LayoutInflater.from(requireContext()).inflate(R.layout.activity_drug_to_fetus, null, false),
            LayoutInflater.from(requireContext()).inflate(R.layout.activity_amount_of_hydration, null, false),
            LayoutInflater.from(requireContext()).inflate(R.layout.activity_bishop, null, false),
            LayoutInflater.from(requireContext()).inflate(R.layout.activity_classification_of_hypertension_during_pregnancy, null, false)
        )
        binding.viewPager.adapter = ViewPageAdapter(requireContext(), dataSet2)
        binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout1))
        binding.viewPager.addOnPageChangeListener(PageChangeListener())
        binding.tabLayout1.setupWithViewPager(binding.viewPager)
    }

    private fun setupViewPager2() {
        // Disable save enabled to prevent IllegalStateException: Fragment no longer exists for key f#0
        // which occurs during state restoration when ViewPager2 tries to restore fragments that are no longer in FragmentManager.
        binding.viewPager2.isSaveEnabled = false
        binding.viewPager2.adapter = Pager2FragmentAdapter(childFragmentManager, viewLifecycleOwner.lifecycle)
        
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = "S标签 ${position + 1}"
        }.attach()
    }

    class PageChangeListener : ViewPager.OnPageChangeListener {
        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
        override fun onPageSelected(position: Int) {}
        override fun onPageScrollStateChanged(state: Int) {}
    }

    override fun onDestroyView() {
        _binding?.viewPager2?.adapter = null
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MinePage().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}