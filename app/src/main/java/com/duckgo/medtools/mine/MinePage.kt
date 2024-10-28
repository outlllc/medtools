package com.duckgo.medtools.mine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentMinePageBinding
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Bishop_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Fetal_Maturity_fm
import com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology.Normal_Lochia_fm
import com.duckgo.medtools.my_adapter.Pager2Adapter
import com.duckgo.medtools.my_adapter.Pager2FragmentAdapter
import com.duckgo.medtools.my_adapter.ViewPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MinePage : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding: FragmentMinePageBinding

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
    ): View? {
        binding = FragmentMinePageBinding.inflate(inflater, container, false)
        return binding.root
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Tab 1"))
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                // Do something when tab is selected
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
        var dataSet =mutableListOf<String>("1", "2", "3")
        var dataSet2 =mutableListOf<View>(LayoutInflater.from(requireContext()).inflate(R.layout.aa,null,false), LayoutInflater.from(requireContext()).inflate(R.layout.activity_amount_of_hydration,null,false), LayoutInflater.from(requireContext()).inflate(R.layout.activity_bishop,null,false), LayoutInflater.from(requireContext()).inflate(R.layout.activity_classification_of_hypertension_during_pregnancy,null,false))
        binding.viewPager.adapter = ViewPageAdapter(requireContext(), dataSet2)
        binding.viewPager.addOnPageChangeListener( TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))
        binding.viewPager.addOnPageChangeListener(PageChangeListener())

        binding.viewPager2.registerOnPageChangeCallback(PageChangeCallBack())
//        binding.viewPager2.setPageTransformer()   设置动画效果，同样需要实现相应的class
        binding.viewPager2.adapter = Pager2Adapter(requireContext(), dataSet)
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = "Tab $position"
        }.attach()

        //pager2+fragment
        var fragments = listOf<Fragment>(Bishop_fm(), Fetal_Maturity_fm(), Normal_Lochia_fm())
        binding.viewPager2.adapter = Pager2FragmentAdapter(childFragmentManager = childFragmentManager, lifecycle = lifecycle, fragments)
        binding.viewPager2.adapter?.notifyDataSetChanged()
    }

    //viewpager的方法
    class PageChangeListener: ViewPager.OnPageChangeListener{
        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {

        }

        override fun onPageSelected(position: Int) {
            // Do something when page is selected
        }

        override fun onPageScrollStateChanged(state: Int) {

        }

    }

    //viewpager2的方法
    class PageChangeCallBack: ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
        }

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels)
        }

        override fun onPageScrollStateChanged(state: Int) {
            super.onPageScrollStateChanged(state)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.viewPager2.unregisterOnPageChangeCallback(PageChangeCallBack())
    }
}