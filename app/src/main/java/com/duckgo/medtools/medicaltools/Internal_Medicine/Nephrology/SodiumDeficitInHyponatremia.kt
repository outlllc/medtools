package com.duckgo.medtools.medicaltools.Internal_Medicine.Nephrology

import android.os.Bundle
import android.view.View
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.ActivitySodiumDeficitInHyponatremiaBinding

class SodiumDeficitInHyponatremia : AppCompatActivity() {
    private lateinit var binding: ActivitySodiumDeficitInHyponatremiaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySodiumDeficitInHyponatremiaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupListeners()
        showList()
    }

    private fun setupListeners() {
        binding.btnCal.setOnClickListener {
            val sodium = binding.etSodium.text.toString().toDoubleOrNull()
            val weight = binding.etBodyWeight.text.toString().toDoubleOrNull()
            
            if (sodium != null && weight != null) {
                val factor = if (binding.rbMan.isChecked) 0.035 else 0.03
                val result = (142 - sodium) * weight * factor
                binding.tvResult.text = "补氯化钠值 = ${"%.2f".format(result)} g"
            } else {
                binding.tvResult.text = "请输入正确数据"
            }
        }
    }

    private fun showList() {
        val titles = arrayOf("公式英文名称", "计算公式", "说明", "参考文献")
        val contents = arrayOf(
            "Sodium Deficit in Hyponatremia",
            "男性：补氯化钠值=(142-血清钠浓度)×体重×0.035\n女性：补氯化钠值=(142-血清钠浓度)×体重×0.03",
            "公式以17mmolNa+相当于1g钠盐计算，当天先补1/2量，还需要加每日需要量4.5g，此为第一日补充量；其余一半钠可以在第2天补给。\n临床上应该注意，绝对依靠任何公式决定补钠量是不可取的，公式仅作为补钠安全剂量的估计。一般总是先补充缺钠量的一部分以解除急性症状，使血容量有所纠正。并且补液过程中要提防血容量过高，对心功能不全者将非常危险。\n纠正低钠血症的最大纠正速度：8-10mmol/L/d；如果有症状，按照1-2mmol/L/h纠正直到症状消失，24小时纠正速度不超过12mmol/L。1升3%NaCl含513mmol Na+，1升0.9%NaCl（NS）含154mmol Na+。",
            "陈孝平主编. 外科学（八年制）（第2版）. 人民卫生出版社. 2010年. p40."
        )

        val listItem = titles.mapIndexed { i, title ->
            mapOf("header" to title, "second" to contents[i])
        }

        binding.listView.apply {
            adapter = SimpleAdapter(
                this@SodiumDeficitInHyponatremia,
                listItem,
                R.layout.cal_list,
                arrayOf("header", "second"),
                intArrayOf(R.id.tvF, R.id.tvS)
            )
            overScrollMode = View.OVER_SCROLL_NEVER
        }
    }
}
