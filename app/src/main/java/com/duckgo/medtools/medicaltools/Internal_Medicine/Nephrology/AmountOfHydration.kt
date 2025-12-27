package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.View
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.ActivityAmountOfHydrationBinding

class AmountOfHydration : AppCompatActivity() {

    private lateinit var binding: ActivityAmountOfHydrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAmountOfHydrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupListeners()
        showList()
    }

    private fun setupListeners() {
        binding.btnCal.setOnClickListener {
            val sodium = binding.etSodium.text.toString().toDoubleOrNull()
            val weight = binding.etBodyWeight.text.toString().toDoubleOrNull()

            if (sodium != null && weight != null) {
                val result = (sodium - 142) * weight * 4
                binding.tvResult.text = "补液量 = ${"%.2f".format(result)} ml"
            } else {
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }

    private fun showList() {
        val titles = arrayOf("公式英文名称", "计算公式", "说明", "参考文献")
        val contents = arrayOf(
            "BWater Deficit",
            "补水量 = (血清钠浓度 - 142) × 体重 × 4\n注：补液时还应加上每日正常需要量 2000ml",
            "为避免输入过量导致血容量过分扩张及水中毒，计算所得的补水量不宜一次性输入，一般分 2 天补给。",
            "陈孝平主编. 外科学（八年制）（第 2 版）. 人民卫生出版社. 2010 年"
        )

        val listItem = titles.mapIndexed { i, title ->
            mapOf("header" to title, "second" to contents[i])
        }

        binding.listView.apply {
            adapter = SimpleAdapter(
                this@AmountOfHydration,
                listItem,
                R.layout.cal_list,
                arrayOf("header", "second"),
                intArrayOf(R.id.tvF, R.id.tvS)
            )
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }
}
