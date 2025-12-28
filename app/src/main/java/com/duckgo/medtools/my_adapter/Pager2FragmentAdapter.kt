package com.duckgo.medtools.my_adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.Bishop_fm
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.Fetal_Maturity_fm
import com.duckgo.medtools.medicaltools.functions.Obstetrics_and_Gynecology.Obstetrics.Normal_Lochia_fm

class Pager2FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Bishop_fm()
            1 -> Fetal_Maturity_fm()
            2 -> Normal_Lochia_fm()
            else -> throw IllegalArgumentException("Invalid position $position")
        }
    }
}