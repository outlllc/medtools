package com.duckgo.medtools

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.duckgo.medtools.babyweight.BabyWeight
import com.duckgo.medtools.datecalculator.DateCalculator
import com.duckgo.medtools.datecalculator.DateCalculator_3
import com.duckgo.medtools.medicaltools.MenuFragment
import com.duckgo.medtools.mine.MinePage
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup
import java.io.File
import java.io.FileOutputStream
import kotlin.text.replace

class MainActivity : AppCompatActivity() {

//    var dateCaculatorFragment: DateCalculator? = null
    var dateCaculatorFragment: DateCalculator_3? = null
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
            showFragment = DateCalculator_3()
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
                0 -> dateCaculatorFragment ?: DateCalculator_3()
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
//        val PATH = this.filesDir.absolutePath
//        // 创建src和dst文件夹
//        // 【注】需要有PATH目录的权限才能创建子目录
//        // 若PATH文件夹权限为root权限，则使用adb shell chown命令修改权限
//        val src = File(PATH + "/" + "database")
//        // 判断文件夹是否存在，不存在就进行创建

        val dst = File("data/data/com.duckgo.medtools/databases")
        if (!dst.exists()) {
            if (!dst.mkdirs()) {
                Toast.makeText(this, "数据创建失败", Toast.LENGTH_SHORT).show()
            }
        }
        val newFile = File("data/data/com.duckgo.medtools/databases/weight.db")
        if (!newFile.exists()) {
            val is1 = assets.open("weight.db")
            val fos = FileOutputStream(newFile)
            var len = -1
            val buffer = ByteArray(1024)
            while ((is1.read(buffer).also { len = it }) != -1) {
                fos.write(buffer, 0, len)
            }
            fos.close()
            is1.close()
        }
    }
}

