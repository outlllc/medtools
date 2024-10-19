package com.duckgo.medtools.medicaltools.comprehensive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

class BodySurfaceArea_fm: Fragment() {

    lateinit var et_height : EditText
    lateinit var et_weight : EditText
    lateinit var btn_cal : Button
    lateinit var rb_man : RadioButton
    lateinit var rb_woman : RadioButton
    lateinit var tv_result : TextView

    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_body_surface_area, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
        initData_appendix()
        initAdaptor()
        calculate()
    }

    private fun initView(view: View) {
        et_height = view.findViewById(R.id.et_height)
        et_weight = view.findViewById(R.id.et_body_weight)
        btn_cal = view.findViewById(R.id.btn_cal)
        rb_man = view.findViewById(R.id.rb_man)
        rb_woman = view.findViewById(R.id.rb_woman)
        tv_result = view.findViewById(R.id.tv_result)
        rv_content_appendix = view.findViewById(R.id.rv_content_appendix)
    }
    fun getInput() :Double{
        val height = et_height.text.toString().toDoubleOrNull()
        val weight = et_weight.text.toString().toDoubleOrNull()
        val gender = if (rb_man.isChecked) "man" else "woman"
        var result = if( (gender == "man") and (weight != null) and (height != null)){
            0.00607 * height!! + 0.0127 * weight!! - 0.0698
        }else if ((gender == "woman") and (weight != null) and (height != null)){
            0.00586 * height!! + 0.0126 * weight!! - 0.0461
        } else{
            0.0
        }
        return result
    }
    fun calculate() {
        btn_cal.setOnClickListener {
            var result = getInput()
            if (result != 0.0) {
                tv_result.text= "体表面积BSA = ${ String.format("%.2f",result) } m2)"
            }else{
                tv_result.text = "请输入正确数据"
            }
        }
    }
    private fun initAdaptor() {
        rv_content_appendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "10")
    }

    private fun initData_appendix() {
        var subDataSet_appendix1 = arrayOf("公式英文名称")
        var subDataSet_appendix2 = arrayOf("Body Surface Area, BSA")
        var subDataSet_appendix3 = arrayOf("计算公式")
        var subDataSet_appendix4 = arrayOf("男性：BSA=0.00607*身高+0.0127*体重-0.0698\n女性：0.00586*身高+0.0126*体重-0.0461")
        var subDataSet_appendix5 = arrayOf("说明")
        var subDataSet_appendix6 = arrayOf("通过身高、体重估算体表面积，进而调整化疗药的给药剂量。也常用于评价心脏指数和基础代谢率等临床指标")
        var subDataSet_appendix7 = arrayOf("参考文献")
        var subDataSet_appendix8 = arrayOf("1.赵松山，刘友梅，姚家邦等.中国成年男子体表面积的测量.营养学报.1984;02:3-11.\n2.赵松山，刘友梅，姚家邦等.中国成年女子体表面积的测量.营养学报.1987;03:10-17.")
        dataSet_appendix = ArrayList()
        dataSet_appendix.add(subDataSet_appendix1)
        dataSet_appendix.add(subDataSet_appendix2)
        dataSet_appendix.add(subDataSet_appendix3)
        dataSet_appendix.add(subDataSet_appendix4)
        dataSet_appendix.add(subDataSet_appendix5)
        dataSet_appendix.add(subDataSet_appendix6)
        dataSet_appendix.add(subDataSet_appendix7)
        dataSet_appendix.add(subDataSet_appendix8)
    }
}