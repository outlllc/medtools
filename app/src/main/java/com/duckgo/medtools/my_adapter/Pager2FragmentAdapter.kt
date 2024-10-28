package com.duckgo.medtools.my_adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class Pager2FragmentAdapter(
    val childFragmentManager: FragmentManager, val lifecycle: Lifecycle, var list: List<Fragment>
) : FragmentStateAdapter(
    childFragmentManager, lifecycle
) {
    override fun createFragment(position: Int): Fragment {
        return list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}