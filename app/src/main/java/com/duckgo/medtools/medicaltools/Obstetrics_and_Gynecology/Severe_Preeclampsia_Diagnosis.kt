package com.duckgo.medtools.medicaltools.Obstetrics_and_Gynecology

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class Severe_Preeclampsia_Diagnosis : AppCompatActivity() {
    lateinit var rv_content: RecyclerView
    lateinit var dataSet: MutableList<Array<String>>
    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>
    lateinit var dateArray: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_severe_preeclampsia_diagnosis)
        initView()
        initData()
        initData_appendix()
        initAdaptor()
    }
    private fun initAdaptor() {
        rv_content.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content.adapter = MedCalListAdapter(dataSet, "10")
        rv_content_appendix.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "20")
    }

    private fun initData_appendix() {
        var subDataSet1 = arrayOf("结果解读", "高血压加重，尿蛋白增加，或者肾、肝、血液系统的实验室指标异常，或者子痫发作前的症状，如头痛、眼花、上腹部疼痛等任何一方面的出现均表明病情加重，使子痫前期的诊断更加明确。\n" +
                "右上腹疼痛往往是肝细胞缺血、坏死、水肿的结果，这种特征性改变常常伴随着肝酶的升高，预示着肝脏梗死或出血，或者肝包膜下血肿破裂。肝包膜下血肿破裂临床上十分罕见，一旦出现则危及母儿生命。严重的血管收缩可导致微血管性溶血、血小板活化、凝聚的结果。因此，血小板减少和溶血症（如血红蛋白血症、血红蛋白尿、高胆红素血症等）亦是病情加重的标记。")
        var subDataSet2 = arrayOf("参考来源", "丰有吉沈铿主编.《妇产科学》（八年制）[M]. 人民卫生出版社.2010年")
        dataSet_appendix= ArrayList()
        dataSet_appendix.add(subDataSet1)
        dataSet_appendix.add(subDataSet2)
    }

    private fun initData() {
        dateArray = arrayOf("1.中枢神经系统异常表现：视力模糊、头痛、头晕；严重者神志不清、昏迷等", "2.肝包膜下血肿或肝破裂的症状：包括上腹部不适或右上腹持续性疼痛等",
            "3.肝细胞损伤表现：血清转氨酶升高", "4.血压改变：收缩压≥160mmHg，或舒张压≥110mmHg", "5.血小板减少：＜100×109/L", "6.蛋白尿：≥5g/24h，或间隔4小时两次尿蛋白（+++）",
            "7.少尿：24小时尿量＜500ml", "8.肺水肿", "9.脑血管意外", "10.血管内溶血：贫血、黄疸、或乳酸脱氢酶升高", "11.凝血功能障碍", "12.胎儿生长受限或羊水过少")
        var subDataSet1 = arrayOf("1.中枢神经系统异常表现：视力模糊、头痛、头晕；严重者神志不清、昏迷等")
        var subDataSet2 = arrayOf("2.肝包膜下血肿或肝破裂的症状：包括上腹部不适或右上腹持续性疼痛等")
        var subDataSet3 = arrayOf("3.肝细胞损伤表现：血清转氨酶升高")
        var subDataSet4 = arrayOf("4.血压改变：收缩压≥160mmHg，或舒张压≥110mmHg")
        var subDataSet5 = arrayOf("5.血小板减少：＜100×109/L")
        var subDataSet6 = arrayOf("6.蛋白尿：≥5g/24h，或间隔4小时两次尿蛋白（+++）")
        var subDateSet7 = arrayOf("7.少尿：24小时尿量＜500ml")
        var subDateSet8 = arrayOf("8.肺水肿")
        var subDateSet9 = arrayOf("9.脑血管意外")
        var subDateSet10 = arrayOf("10.血管内溶血：贫血、黄疸、或乳酸脱氢酶升高")
        var subDateSet11 = arrayOf("11.凝血功能障碍")
        var subDateSet12 = arrayOf("12.胎儿生长受限或羊水过少")
        dataSet= ArrayList()
        dataSet.add(subDataSet1)
        dataSet.add(subDataSet2)
        dataSet.add(subDataSet3)
        dataSet.add(subDataSet4)
        dataSet.add(subDataSet5)
        dataSet.add(subDataSet6)
        dataSet.add(subDateSet7)
        dataSet.add(subDateSet8)
        dataSet.add(subDateSet9)
        dataSet.add(subDateSet10)
        dataSet.add(subDateSet11)
        dataSet.add(subDateSet12)
    }

    private fun initView() {
        rv_content = findViewById(R.id.rv_content)
        rv_content_appendix = findViewById(R.id.rv_content_appendix)
    }
}