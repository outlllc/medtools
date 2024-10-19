package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Uterine_Height_Gestational_Age : AppCompatActivity() {

    lateinit var rv_content: RecyclerView
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_uterine_height_gestational_age)
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initAdaptor() {
        rv_content.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content.adapter = MedCalListAdapter(dataSet, "30")
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "子宫随妊娠进展逐渐增大，根据手测宫底高度及尺测耻上子宫长度可判断妊娠周数。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("妊娠周数", "手测宫底高度", "尺测耻上子宫长度（cm）")
        var subDataSet2 = arrayOf("12周末", "耻骨联合上2-3横指 ", "")
        var subDataSet3 = arrayOf("16周末", "脐耻之间 ", "")
        var subDataSet4 = arrayOf("20周末", " 脐下1横指 ", "18（15.3~21.4）")
        var subDataSet5 = arrayOf("24周末", "脐上1横指", "24（22.0~25.1）")
        var subDataSet6 = arrayOf("28周末", "脐上3横指", "26（22.4~29.0）")
        var subDataSet7 = arrayOf("32周末", "脐与剑突之间", "29（25.3~32.0）")
        var subDataSet8 = arrayOf("36周末", "剑突下2横指", "32（29.8~34.5）")
        var subDataSet9 = arrayOf("40周末", "脐与剑突之间或略高", "33（30.0~35.3）")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
        dataSet.add(subDataSet8)
        dataSet.add(subDataSet9)
    }

    private fun initView() {
        rv_content = findViewById(R.id.rv_content)
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
    }
}