package com.duckgo.medtools.my_adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class ViewPageAdapter( var mContext: Context, var dataSet: MutableList<String>): PagerAdapter() {
    override fun getCount(): Int {
        return dataSet.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        container.addView(View(mContext))
        return super.instantiateItem(container, position)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
//        container.removeView(view)
    }
    //addonpagechangelistener
}