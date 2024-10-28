package com.duckgo.medtools.my_adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class ViewPageAdapter( var mContext: Context, var dataSet: MutableList<View>): PagerAdapter() {
    override fun getCount(): Int {
        return dataSet.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view = dataSet[position]
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(dataSet[position])
    }
    //addonpagechangelistener
    override fun getPageTitle(position: Int): CharSequence? {
        return super.getPageTitle(position)
    }
}