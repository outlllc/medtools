package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import android.widget.ListView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SimpleAdapter
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.duckgo.medtools.R

class Bishop : AppCompatActivity() {

    lateinit var rb_cer_0 :RadioButton
    lateinit var rb_cer_12 :RadioButton
    lateinit var rb_cer_34 :RadioButton
    lateinit var rb_cer_5 :RadioButton
    lateinit var rb_cer_30 :RadioButton
    lateinit var rb_cer_50 :RadioButton
    lateinit var rb_cer_70 :RadioButton
    lateinit var rb_cer_80 :RadioButton
    lateinit var rb_cer_s3 :RadioButton
    lateinit var rb_cer_s2 :RadioButton
    lateinit var rb_cer_s1 :RadioButton
    lateinit var rb_cer_s_12 :RadioButton
    lateinit var rb_cer_hard :RadioButton
    lateinit var rb_cer_soft :RadioButton
    lateinit var rb_cer_medium :RadioButton
    lateinit var rb_cer_back :RadioButton
    lateinit var rb_cer_front :RadioButton
    lateinit var rb_cer_mid :RadioButton
    lateinit var rg_cer1 :RadioGroup
    lateinit var rg_cer2 :RadioGroup
    lateinit var rg_cer3 :RadioGroup
    lateinit var rg_cer4 :RadioGroup
    lateinit var rg_cer5 :RadioGroup
    lateinit var tv_total_score : TextView
    lateinit var list_view : ListView
    var uncheckedItem :Int = 5
    var totalScore :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bishop)
        rb_cer_0 = findViewById(R.id.rb_cer_0)
        rb_cer_12 = findViewById(R.id.rb_cer_12)
        rb_cer_34 = findViewById(R.id.rb_cer_34)
        rb_cer_5 = findViewById(R.id.rb_cer_5)
        rb_cer_30 = findViewById(R.id.rb_cer_30)
        rb_cer_50 = findViewById(R.id.rb_cer_50)
        rb_cer_70 = findViewById(R.id.rb_cer_70)
        rb_cer_80 = findViewById(R.id.rb_cer_80)
        rb_cer_s3 = findViewById(R.id.rb_cer_s3)
        rb_cer_s2 = findViewById(R.id.rb_cer_s2)
        rb_cer_s1 = findViewById(R.id.rb_cer_s1)
        rb_cer_s_12 = findViewById(R.id.rb_cer_s_12)
        rb_cer_hard = findViewById(R.id.rb_cer_hard)
        rb_cer_soft = findViewById(R.id.rb_cer_soft)
        rb_cer_medium = findViewById(R.id.rb_cer_medium)
        rb_cer_back = findViewById(R.id.rb_cer_back)
        rb_cer_front = findViewById(R.id.rb_cer_front)
        rb_cer_mid = findViewById(R.id.rb_cer_mid)
        tv_total_score = findViewById(R.id.tv_total_score)
        list_view = findViewById(R.id.list_view)
        rg_cer1 = findViewById(R.id.rg_cer1)
        rg_cer2 = findViewById(R.id.rg_cer2)
        rg_cer3 = findViewById(R.id.rg_cer3)
        rg_cer4 = findViewById(R.id.rg_cer4)
        rg_cer5 = findViewById(R.id.rg_cer5)
        rg_cer1.setOnCheckedChangeListener { _, _ -> calculate() }
        rg_cer2.setOnCheckedChangeListener { _, _ -> calculate() }
        rg_cer3.setOnCheckedChangeListener { _, _ -> calculate() }
        rg_cer4.setOnCheckedChangeListener { _, _ -> calculate() }
        rg_cer5.setOnCheckedChangeListener { _, _ -> calculate() }
        showList()
    }
    fun calculate() {
        if (rb_cer_0.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (rb_cer_12.isChecked) {
            totalScore += 1
            uncheckedItem -=1
        } else if (rb_cer_34.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if (rb_cer_5.isChecked) {
            totalScore += 3
            uncheckedItem -=1
        }
        if (rb_cer_30.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (rb_cer_50.isChecked) {
            totalScore += 1
            uncheckedItem -=1
        } else if (rb_cer_70.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if (rb_cer_80.isChecked) {
            totalScore += 3
            uncheckedItem -=1
        }
        if (rb_cer_s3.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (rb_cer_s2.isChecked) {
            totalScore += 1
            uncheckedItem -=1
        } else if (rb_cer_s1.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        } else if (rb_cer_s_12.isChecked) {
            totalScore += 3
            uncheckedItem -=1
        }
        if (rb_cer_hard.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (rb_cer_medium.isChecked){
            totalScore += 1
            uncheckedItem -=1
        }else if (rb_cer_soft.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        }
        if (rb_cer_back.isChecked) {
            totalScore += 0
            uncheckedItem -=1
        } else if (rb_cer_mid.isChecked) {
            totalScore += 1
            uncheckedItem -=1
        } else if (rb_cer_front.isChecked) {
            totalScore += 2
            uncheckedItem -=1
        }
        tv_total_score.text = "${totalScore}分 , （您已选择${5-uncheckedItem}个必选项，还有${uncheckedItem}个必选项未选） "
        totalScore = 0
        uncheckedItem = 5
    }
    var title_ = arrayOf("结果解读","相关解释","参考文献")
    var content_ = arrayOf("评分≤4分提示官颈不成熟，需促宫颈成熟。评分≥7分提示宫颈成熟。",
        "国际上采用Bishop评分判断宫颈成熟度，以估计引产的成功率。评分越高，宫颈越成熟，引产成功率越高。0~3分引产不易成功，4~6分成功率仅50%，7~8分成功率80%，评分≥8分者，引产成功率与阴道分娩自然临产结果相似。",
        "丰有吉，沈铿主编.妇产科学（八年制）[M].人民卫生出版社.2005.")
    fun showList(title : Array<String> = title_, content : Array<String> = content_) {
        var listItem = arrayListOf<Map<String,Any>>()
        for (i in 0 until title_.size) {
            var map = HashMap<String,Any>()
            map["header"] = title_[i]
            map["second"] = content_[i]
            listItem.add(map)

            var adapter = SimpleAdapter(this,listItem,R.layout.cal_list, arrayOf("header","second"),intArrayOf(R.id.tvF,R.id.tvS))
            list_view.adapter = adapter
        }
    }
}