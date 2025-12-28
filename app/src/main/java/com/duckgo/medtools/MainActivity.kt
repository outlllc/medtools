package com.duckgo.medtools

import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.children
import androidx.fragment.app.commit
import com.duckgo.medtools.babyweight.BabyWeight
import com.duckgo.medtools.databinding.ActivityMainBinding
import com.duckgo.medtools.datecalculator.DateCalculator
import com.duckgo.medtools.medicaltools.MenuFragment
import com.duckgo.medtools.mine.MinePage
import com.google.android.material.button.MaterialButton
import com.google.android.material.dialog.MaterialAlertDialogBuilder
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
        // 强制设为日间模式
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        
        saveDatabaseFile()
        initNavigation()

        if (savedInstanceState == null) showFragment(R.id.calculation_button)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                MaterialAlertDialogBuilder(this@MainActivity)
                    .setTitle("退出确认")
                    .setMessage("确定要退出应用吗？")
                    .setPositiveButton("确定") { _, _ -> finish() }
                    .setNegativeButton("取消", null)
                    .show()
            }
        })
    }

    private fun initNavigation() = binding.tgFirstPage.addOnButtonCheckedListener { _, checkedId, isChecked ->
        if (isChecked) {
            updateButtonStyles(checkedId)
            showFragment(checkedId)
        }
    }

    private fun updateButtonStyles(checkedId: Int) {
        binding.tgFirstPage.children.filterIsInstance<MaterialButton>().forEach { button ->
            val isChecked = button.id == checkedId
            button.setTextColor(ContextCompat.getColor(this, if (isChecked) R.color.white else R.color.black))
            button.setBackgroundColor(ContextCompat.getColor(this, if (isChecked) R.color.green_kuan else R.color.lightcyan))
        }
    }

    private fun showFragment(checkedId: Int) {
        fragments[checkedId]?.let { fragment ->
            supportFragmentManager.commit(allowStateLoss = true) {
                replace(R.id.fragment_, fragment)
            }
        }
    }

    private fun saveDatabaseFile() {
        val dbFile = getDatabasePath("weight.db")
        if (dbFile.exists()) return

        dbFile.parentFile?.mkdirs()
        runCatching {
            assets.open("weight.db").use { input ->
                FileOutputStream(dbFile).use { input.copyTo(it) }
            }
        }.onFailure {
            it.printStackTrace()
            Toast.makeText(this, "数据库加载失败", Toast.LENGTH_SHORT).show()
        }
    }
}
