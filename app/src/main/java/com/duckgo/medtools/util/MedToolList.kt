package com.duckgo.medtools.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.duckgo.medtools.R

fun add_hide_fragment(fm: FragmentManager,newFragment: Fragment){
    var transaction = fm.beginTransaction()
    transaction?.add(R.id.fragment_, newFragment)
    transaction?.show(newFragment)
    transaction?.addToBackStack(null)
    if (fm.findFragmentById(R.id.fragment_) != null) {
        transaction?.hide(fm.findFragmentById(R.id.fragment_)!!)
    }
    transaction?.commit()
}