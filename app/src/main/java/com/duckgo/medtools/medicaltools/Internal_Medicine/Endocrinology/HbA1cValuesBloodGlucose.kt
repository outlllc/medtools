package com.duckgo.medtools.medicaltools.Internal_Medicine.Endocrinology

import android.os.Bundle
import android.view.View
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.ActivityHbA1cValuesBloodGlucoseBinding

class HbA1cValuesBloodGlucose : AppCompatActivity() {
    private lateinit var binding: ActivityHbA1cValuesBloodGlucoseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHbA1cValuesBloodGlucoseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupListeners()
        showList()
    }

    private fun setupListeners() {
        binding.btnCal.setOnClickListener {
            val hba1c = binding.etHba1c.text.toString().toDoubleOrNull()
            if (hba1c != null) {
                val result = (28.7 * hba1c - 46.7) / 18
                binding.tvResult.text = "平均血糖水平 = ${"%.2f".format(result)} mmol/L"
            } else {
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }

    private fun showList() {
        val titles = arrayOf("计算公式", "结果正常值范围", "说明", "来源")
        val contents = arrayOf(
            "平均血糖=(28.7*HbA1c-46.7)/18",
            "空腹血糖正常值为3.9~6.1mmol/L",
            "糖化血红蛋白被视为血糖控制的金标准，与糖尿病的微血管及大血管病变相关，它反应了过去2~3个月的平均血糖水平。",
            "http://professional.diabetes.org/glucosecalculator.aspx"
        )

        val listItem = titles.mapIndexed { i, title ->
            mapOf("header" to title, "second" to contents[i])
        }

        binding.listView.apply {
            adapter = SimpleAdapter(
                this@HbA1cValuesBloodGlucose,
                listItem,
                R.layout.cal_list,
                arrayOf("header", "second"),
                intArrayOf(R.id.tvF, R.id.tvS)
            )
            // 禁用过度滚动动画
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }
}
