package com.duckgo.medtools.test

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R
import com.duckgo.medtools.view.ChildView
import com.duckgo.medtools.view.ExpandTabView

class MenuTest : AppCompatActivity() {

    lateinit var expandTabView: ExpandTabView
    var mViewArray: ArrayList<View> = ArrayList()
    lateinit var viewLeft: ChildView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_test)
        initView()
        initVaule()
        initListener()
    }

    private fun initListener() {
//        viewLeft.setOnSelectListener {
//            @Override fun getValue(showText: String) {
//                onRefresh(viewLeft,showText)
//            }
//        }
        viewLeft.setOnSelectListener(object : ChildView.OnSelectListener {
            override fun getValue(showText: String?) {
                onRefresh(viewLeft, showText!!)
            }
        })
    }
    fun onRefresh(view: View, showText: String) {
        expandTabView.onPressBack()
        var position = getPositon(view)
        if (position >= 0 && !expandTabView.getTitle(position).equals(showText)) {
            expandTabView.setTitle(showText, position)
        }
        Toast.makeText(this, showText, Toast.LENGTH_SHORT).show()
        var positionTitle = expandTabView.getTitle(position)
        when(positionTitle){
            "妇产科综合" -> {

            }
        }
    }

    fun getPositon(tView: View): Int {
        for (i in 0 until mViewArray.size){
            if (mViewArray[i] == tView){
                return i
            }
        }
        return -1
    }

    private fun initVaule() {
        mViewArray.add(viewLeft)
        var mTextArray: ArrayList<String> = ArrayList()
        mTextArray.add("全部")
        expandTabView.setValue(mTextArray, mViewArray)
        expandTabView.setTitle(viewLeft.showText, 0)
    }

    private fun initView() {
        viewLeft = ChildView(this)
        expandTabView = findViewById(R.id.expandtab_view)
    }

    override fun onBackPressed() {
        if (!expandTabView.onPressBack()) {
            finish()
        }
        super.onBackPressed()
    }
}