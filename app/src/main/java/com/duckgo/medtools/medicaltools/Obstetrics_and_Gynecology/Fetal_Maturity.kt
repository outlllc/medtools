package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Fetal_Maturity : AppCompatActivity() {
    lateinit var rv_content: RecyclerView
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fetal_maturity)
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initAdaptor() {
        rv_content.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content.adapter = MedCalListAdapter(dataSet, "21")
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        var subDataSet1 = arrayOf("羊膜腔穿刺抽取羊水检测项目", "结果")
        var subDataSet2 = arrayOf("卵磷脂/鞘磷脂比值(L/S)", "若该值>2，表示胎儿肺已成熟")
        var subDataSet3 = arrayOf("磷脂酰甘油（PG）", "羊水中测出PG表示胎肺成熟")
        var subDataSet4 = arrayOf("泡沫试验或震荡试验", "如两管均有完整的泡沫环，提示胎肺已成熟")
        var subDataSet5 = arrayOf("肌酐", "≥176.8μmol/L，表示胎儿肾已成熟")
        var subDataSet6 = arrayOf("胆红素类物质", "△OD450测值＜0.02，表示胎儿肝已成熟")
        var subDataSet7 = arrayOf("淀粉酶值", "碘显色法测值≥450U/L，表示胎儿唾液腺已成熟")
        var subDataSet8 = arrayOf("含脂肪细胞出现率", "达20%表示胎儿皮肤已成熟")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDataSet7)
        dataSet.add(subDataSet8)
    }

    private fun initView() {
        rv_content = findViewById(R.id.rv_content)
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
    }
}