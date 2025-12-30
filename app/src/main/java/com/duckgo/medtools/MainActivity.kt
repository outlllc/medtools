package com.duckgo.medtools

import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.children
import androidx.fragment.app.FragmentManager
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
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        
        saveDatabaseFile()
        initNavigation()

        if (savedInstanceState == null) {
            binding.tgFirstPage.check(R.id.calculation_button)
        } else {
            updateButtonStyles(binding.tgFirstPage.checkedButtonId)
        }

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // 如果当前有回退栈（即在子页面中），则执行回退操作
                if (supportFragmentManager.backStackEntryCount > 0) {
                    supportFragmentManager.popBackStack()
                } else {
                    // 否则弹出退出确认框
                    MaterialAlertDialogBuilder(this@MainActivity)
                        .setTitle("退出确认")
                        .setMessage("确定要退出应用吗？")
                        .setPositiveButton("确定") { _, _ -> finish() }
                        .setNegativeButton("取消", null)
                        .show()
                }
            }
        })
    }

    private fun initNavigation() {
        binding.tgFirstPage.addOnButtonCheckedListener { _, checkedId, isChecked ->
            if (isChecked) {
                updateButtonStyles(checkedId)
                showFragment(checkedId)
            }
        }
        
        // 修复：针对 MaterialButtonToggleGroup 已经选中某个按钮时再次点击不触发 isChecked=true 的情况
        // 显式为每个按钮添加点击事件，如果是重复点击已选中的按钮且存在回退栈，则强制清空回退栈
        binding.tgFirstPage.children.filterIsInstance<MaterialButton>().forEach { button ->
            button.setOnClickListener {
                if (binding.tgFirstPage.checkedButtonId == it.id) {
                    if (supportFragmentManager.backStackEntryCount > 0) {
                        supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
                    }
                }
            }
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
        // 切换主 Tab 时，清空回退栈，避免子页面干扰
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }

        val tag = checkedId.toString()
        val target = supportFragmentManager.findFragmentByTag(tag) ?: fragments[checkedId] ?: return
        
        supportFragmentManager.commit(allowStateLoss = true) {
            // 隐藏所有当前已添加的 Fragment
            supportFragmentManager.fragments.forEach { hide(it) }
            
            if (!target.isAdded) {
                add(R.id.fragment_, target, tag)
            } else {
                show(target)
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
