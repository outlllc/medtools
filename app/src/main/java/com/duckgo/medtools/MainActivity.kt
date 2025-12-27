package com.duckgo.medtools

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.duckgo.medtools.babyweight.BabyWeight
import com.duckgo.medtools.databinding.ActivityMainBinding
import com.duckgo.medtools.datecalculator.DateCalculator
import com.duckgo.medtools.medicaltools.MenuFragment
import com.duckgo.medtools.mine.MinePage
import com.google.android.material.button.MaterialButton
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragments by lazy {
        mapOf(
            R.id.calculation_button to DateCalculator(),
            R.id.weightC_button to BabyWeight(),
            R.id.yuxi to MenuFragment(),
            R.id.myM to MinePage()
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        saveDatabaseFile()
        initNavigation()

        // 默认显示第一个页面
        if (savedInstanceState == null) {
            showFragment(R.id.calculation_button)
        }
    }

    private fun initNavigation() {
        binding.tgFirstPage.addOnButtonCheckedListener { _, checkedId, isChecked ->
            if (isChecked) {
                updateButtonStyles(checkedId)
                showFragment(checkedId)
            }
        }
    }

    private fun updateButtonStyles(checkedId: Int) {
        val group = binding.tgFirstPage
        for (i in 0 until group.childCount) {
            (group.getChildAt(i) as? MaterialButton)?.apply {
                if (id == checkedId) {
                    setTextColor(getColor(R.color.white))
                    setBackgroundColor(getColor(R.color.green_kuan))
                } else {
                    setTextColor(getColor(R.color.black))
                    setBackgroundColor(getColor(R.color.lightcyan))
                }
            }
        }
    }

    private fun showFragment(checkedId: Int) {
        fragments[checkedId]?.let { fragment ->
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_, fragment)
                .commitAllowingStateLoss()
        }
    }

    private fun saveDatabaseFile() {
        val dbFile = getDatabasePath("weight.db")
        if (dbFile.exists()) return

        dbFile.parentFile?.let { if (!it.exists()) it.mkdirs() }

        try {
            assets.open("weight.db").use { input ->
                FileOutputStream(dbFile).use { output ->
                    input.copyTo(output)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "数据库加载失败", Toast.LENGTH_SHORT).show()
        }
    }
}
