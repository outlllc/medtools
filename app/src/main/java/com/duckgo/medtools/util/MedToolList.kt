package com.duckgo.medtools.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.duckgo.medtools.R

fun add_hide_fragment(fm: FragmentManager, newFragment: Fragment, containerId: Int = R.id.fragment_) {
    val transaction = fm.beginTransaction()
    // 获取当前在该容器中的 fragment 并隐藏它
    val currentFragment = fm.findFragmentById(containerId)
    if (currentFragment != null) {
        transaction.hide(currentFragment)
    }

    // 添加新 fragment
    transaction.add(containerId, newFragment)
    transaction.show(newFragment)
    transaction.addToBackStack(null)
    transaction.commit()
}