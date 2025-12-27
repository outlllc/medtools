package com.duckgo.medtools

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.duckgo.medtools.babyweight.BabyWeight
import com.duckgo.medtools.datecalculator.DateCalculator
import com.duckgo.medtools.medicaltools.MenuFragment
import com.duckgo.medtools.mine.MinePage
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup
import java.io.File
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

//    var dateCaculatorFragment: DateCalculator? = null
    var dateCaculatorFragment: DateCalculator? = null
    var babyWeightFragment: BabyWeight? = null
    var showFragment: Fragment? = null
    var medicalCalculatorFragment: MedicalCalculator? = null
    var menuFragment: MenuFragment? = null
    var minePage: MinePage ? = null
    lateinit var tg_first_page: MaterialButtonToggleGroup
    var selectIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saveIntoFile()
        if (dateCaculatorFragment == null) {
            showFragment = DateCalculator()
        }
        supportFragmentManager.beginTransaction().add(R.id.fragment_, showFragment!!).commit()
        initView()
        changePage()
    }

    private fun initView() {
        tg_first_page = findViewById<MaterialButtonToggleGroup>(R.id.tg_first_page)
    }

    private fun changePage() {
        tg_first_page.addOnButtonCheckedListener { group: MaterialButtonToggleGroup, checkedId, isChecked ->
            if (!isChecked) return@addOnButtonCheckedListener

            val childCount = group.childCount
            var selectIndex = 0
            for (index in 0 until childCount) {
                val child = group.getChildAt(index) as MaterialButton
                if (child.id == checkedId) {
                    selectIndex = index
                    child.setTextColor(getColor(R.color.white))
                    child.setBackgroundColor(getColor(R.color.green_kuan))
                } else {
                    child.setTextColor(getColor(R.color.black))
                    child.setBackgroundColor(getColor(R.color.lightcyan))
                }
            }

            val fragment = when (selectIndex) {
                0 -> dateCaculatorFragment ?: DateCalculator()
                1 -> babyWeightFragment ?: BabyWeight()
                2 -> menuFragment ?: MenuFragment()
                3 -> minePage ?: MinePage()
                else -> {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
                    return@addOnButtonCheckedListener
                }
            } ?: return@addOnButtonCheckedListener

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_, fragment as Fragment)
                .addToBackStack(null)
                .commitAllowingStateLoss()
        }
    }

    fun Activity.saveIntoFile() {
        val dbFile = getDatabasePath("weight.db")
        val dbDir = dbFile.parentFile
        if (dbDir != null && !dbDir.exists()) {
            if (!dbDir.mkdirs()) {
                Toast.makeText(this, "数据目录创建失败", Toast.LENGTH_SHORT).show()
            }
        }

        if (!dbFile.exists()) {
            try {
                assets.open("weight.db").use { input ->
                    FileOutputStream(dbFile).use { output ->
                        val buffer = ByteArray(1024)
                        var length: Int
                        while (input.read(buffer).also { length = it } > 0) {
                            output.write(buffer, 0, length)
                        }
                        output.flush()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "数据库复制失败: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
