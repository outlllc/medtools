package com.duckgo.medtools.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.duckgo.medtools.R

/**
 * FragmentManager 的扩展函数，用于添加并隐藏当前 Fragment
 */
fun FragmentManager.addHideFragment(
    newFragment: Fragment,
    containerId: Int = R.id.fragment_,
    tag: String? = newFragment::class.java.simpleName,
    addToBackStack: Boolean = true,
    backStackName: String? = null,
    animate: Boolean = true
) {
    val transaction = beginTransaction()

    // 1. 添加默认动画（如果需要）
    if (animate) {
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        // 或者使用自定义动画资源（需确保 res/anim 下有对应文件）
        // transaction.setCustomAnimations(
        //     R.anim.slide_in_right, R.anim.slide_out_left,
        //     R.anim.slide_in_left, R.anim.slide_out_right
        // )
    }

    // 2. 隐藏当前正在显示的 Fragment
    val currentFragment = findFragmentById(containerId)
    if (currentFragment != null) {
        transaction.hide(currentFragment)
    }

    // 3. 检查是否已经添加过该 Tag 的 Fragment（防止重复创建实例，可选逻辑）
    // 注意：这里由于传入的是对象实例，我们直接执行 add
    transaction.add(containerId, newFragment, tag)
    transaction.show(newFragment)

    // 4. 回退栈处理
    if (addToBackStack) {
        transaction.addToBackStack(backStackName)
    }

    transaction.commit()
}

/**
 * 保留原方法以兼容旧代码，内部调用扩展函数
 */
fun add_hide_fragment(fm: FragmentManager, newFragment: Fragment, containerId: Int = R.id.fragment_) {
    fm.addHideFragment(newFragment, containerId)
}
