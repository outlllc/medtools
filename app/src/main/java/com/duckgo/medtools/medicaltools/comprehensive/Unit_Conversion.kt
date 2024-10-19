package com.duckgo.medtools.medicaltools.comprehensive

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import com.duckgo.medtools.my_adapter.MedCalListAdapter

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Unit_Conversion : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    lateinit var rg_1: RadioGroup
    lateinit var rg_2: RadioGroup
    lateinit var rb_bp: RadioButton
    lateinit var rb_bg: RadioButton
    lateinit var rb_bb: RadioButton
    lateinit var rb_bc: RadioButton
    lateinit var rb_bu: RadioButton
    lateinit var rb_bgl: RadioButton
    lateinit var rb_bch: RadioButton
    lateinit var rb_bHL: RadioButton
    lateinit var rb_uc: RadioButton
    lateinit var rb_bCa: RadioButton
    lateinit var et_old: EditText
    lateinit var et_SI: EditText
    lateinit var tv_old_unit: TextView
    lateinit var tv_SI_unit: TextView
    lateinit var tv_result: TextView
    lateinit var tv_old_result: TextView
    lateinit var tv_si_result: TextView

    lateinit var rv_content_appendix: RecyclerView
    lateinit var dataSet_appendix: MutableList<Array<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_unit__conversion, container, false)
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Unit_Conversion().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
        initData_appendix()
        initAdaptor()
        display()
        setUnit()
        calculate_old()
        calculate_SI()
//        if(et_old.isFocused){
//            tv_old_result.visibility = View.INVISIBLE
//            tv_si_result.visibility = View.VISIBLE
//            et_SI.text.clear()
//            calculate_old()
//        }
//        if (et_SI.isFocused){
//            tv_old_result.visibility = View.VISIBLE
//            tv_si_result.visibility = View.INVISIBLE
//            et_old.setText("")
//            calculate_SI()
//        }
    }

    private fun setUnit() {
        rb_bp.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "kPa"
                tv_SI_unit.text = "mmHg"
            }
        }
        rb_bg.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "mmol/L"
            }
        }
        rb_bb.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "μmol/L"
            }
        }
        rb_bc.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "μmol/L"
            }
        }
        rb_bu.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "mmol/L"

            }
        }
        rb_bgl.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "mmol/L"
            }
        }
        rb_bch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "mmol/L"
            }
        }
        rb_bHL.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "mmol/L"
            }
        }
        rb_uc.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "μmol/L"
            }
        }
        rb_bCa.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv_old_unit.text = "mg/dL"
                tv_SI_unit.text = "mmol/L"
            }
        }
    }

    private fun display() {
        var isFirstRowChecked =true
        rg_1.setOnCheckedChangeListener { group, checkedId ->
            if (isFirstRowChecked == false) {
                rb_bgl.isChecked = false
                rb_bch.isChecked = false
                rb_bHL.isChecked = false
                rb_uc.isChecked = false
                rb_bCa.isChecked = false
                when (checkedId) {
                    R.id.rb_bp -> {
                        rb_bp.isChecked = true
                        clear_input()
                    }

                    R.id.rb_bg -> {
                        rb_bg.isChecked = true
                        clear_input()
                    }

                    R.id.rb_bb -> {
                        rb_bb.isChecked = true
                        clear_input()
                    }

                    R.id.rb_bc -> {
                        rb_bc.isChecked = true
                        clear_input()
                    }

                    R.id.rb_bu -> {
                        rb_bu.isChecked = true
                        clear_input()
                    }
                }
                isFirstRowChecked = true
            } else {
                    clear_input()
                }
        }
        rg_2.setOnCheckedChangeListener { group, checkedId ->
            if (isFirstRowChecked == true) {
                rb_bp.isChecked = false
                rb_bg.isChecked = false
                rb_bb.isChecked = false
                rb_bc.isChecked = false
                rb_bu.isChecked = false
                when (checkedId) {
                    R.id.rb_bgl -> {
                        rb_bgl.isChecked = true
                        clear_input()
                    }

                    R.id.rb_bch -> {
                        rb_bch.isChecked = true
                        clear_input()
                    }

                    R.id.rb_bHL -> {
                        rb_bHL.isChecked = true
                        clear_input()
                    }

                    R.id.rb_uc -> {
                        rb_uc.isChecked = true
                        clear_input()
                    }

                    R.id.rb_bCa -> {
                        rb_bCa.isChecked = true
                        clear_input()
                    }
                }
                isFirstRowChecked = false
            }else{
                clear_input()
            }
        }
    }

    private fun calculate_old() {
        et_old.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (rb_bp.isChecked) {
                    calculate_blood_presure(et_old)
                }
                if (rb_bg.isChecked) {
                    calculate_blood_glucose(et_old)
                }
                if (rb_bb.isChecked) {
                    calculate_blood_bilirubin(et_old)
                }
                if (rb_bc.isChecked) {
                    calculate_blood_creatinine(et_old)
                }
                if (rb_bu.isChecked) {
                    calculate_blood_urea(et_old)
                }
                if (rb_bgl.isChecked) {
                    calculate_blood_triglycerides(et_old)
                }
                if (rb_bch.isChecked) {
                    calculate_blood_chol(et_old)
                }
                if (rb_bHL.isChecked) {
                    calculate_blood_HDL_LDL(et_old)
                }
                if (rb_uc.isChecked) {
                    calculate_blood_uric_acid(et_old)
                }
                if (rb_bCa.isChecked) {
                    calculate_blood_calcium(et_old)
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })
    }
    fun calculate_SI(){
        et_SI.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (rb_bp.isChecked) {
                    calculate_blood_presure(et_SI)
                }
                if (rb_bg.isChecked) {
                    calculate_blood_glucose(et_SI)
                }
                if (rb_bb.isChecked) {
                    calculate_blood_bilirubin(et_SI)
                }
                if (rb_bc.isChecked) {
                    calculate_blood_creatinine(et_SI)
                }
                if (rb_bu.isChecked) {
                    calculate_blood_urea(et_SI)
                }
                if (rb_bgl.isChecked) {
                    calculate_blood_triglycerides(et_SI)
                }
                if (rb_bch.isChecked) {
                    calculate_blood_chol(et_SI)
                }
                if (rb_bHL.isChecked) {
                    calculate_blood_HDL_LDL(et_SI)
                }
                if (rb_uc.isChecked) {
                    calculate_blood_uric_acid(et_SI)
                }
                if (rb_bCa.isChecked) {
                    calculate_blood_calcium(et_SI)
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun clear_input(){
            et_old.setText("")
            et_SI.setText("")
            tv_old_result.setText("")
            tv_si_result.setText("")
    }
    fun calculate_blood_presure(view: View){
        when(view.id){
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 7.5
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI.id -> {
                if(et_SI.text.toString().isNotEmpty()){
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 0.133
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_glucose(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 0.0555
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI.id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 18.02
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_bilirubin(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 17.1
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI.id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 0.0585
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_creatinine(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 88.4
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
                    et_SI . id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 0.0113
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_urea(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 0.357
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI.id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 2.8
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_triglycerides(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 0.01129
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI.id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 88.6
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_chol(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 0.0259
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI . id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 38.67
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_HDL_LDL(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 0.0259
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI.id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 38.67
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_uric_acid(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 59.48
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI.id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 0.01681
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }
    fun calculate_blood_calcium(view: View){
        when(view.id) {
            et_old.id -> {
                if (et_old.text.toString().isNotEmpty()) {
                    var old = et_old.text.toString().toDouble()
                    var SI = old * 0.25
                    tv_si_result.setText(String.format("%.2f",SI))
                }
            }
            et_SI.id -> {
                if (et_SI.text.toString().isNotEmpty()) {
                    var SI = et_SI.text.toString().toDouble()
                    var old = SI * 4
                    tv_old_result.setText(String.format("%.2f",old))
                }
            }
        }
    }

    private fun initView(view: View) {
        rv_content_appendix = view.findViewById(R.id.rv_content_appendix)
        rg_1 = view.findViewById(R.id.rg_1)
        rg_2 = view.findViewById(R.id.rg_2)
        rb_bp = view.findViewById(R.id.rb_bp)
        rb_bg = view.findViewById(R.id.rb_bg)
        rb_bb = view.findViewById(R.id.rb_bb)
        rb_bc = view.findViewById(R.id.rb_bc)
        rb_bu = view.findViewById(R.id.rb_bu)
        rb_bgl = view.findViewById(R.id.rb_bgl)
        rb_bch = view.findViewById(R.id.rb_bch)
        rb_bHL = view.findViewById(R.id.rb_bHL)
        rb_uc = view.findViewById(R.id.rb_uc)
        rb_bCa = view.findViewById(R.id.rb_bCa)
        et_old = view.findViewById(R.id.et_old)
        et_SI = view.findViewById(R.id.et_SI)
        tv_old_unit = view.findViewById(R.id.tv_old_unit)
        tv_SI_unit = view.findViewById(R.id.tv_SI_unit)
        tv_result = view.findViewById(R.id.tv_result)
        tv_old_result = view.findViewById(R.id.tv_old_result)
        tv_si_result = view.findViewById(R.id.tv_si_result)
    }

    private fun initAdaptor() {
        rv_content_appendix.layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
        rv_content_appendix.adapter = MedCalListAdapter(dataSet_appendix, "10")
    }

    private fun initData_appendix() {
        var subDataSet_appendix1 = arrayOf("计算公式")
        var subDataSet_appendix2 = arrayOf("血压 1mmHg=0.133kpa\n" +
                "血压 1kPa=7.5mmHg\n" +
                "血糖 1mmol/L=18.02mg/dL\n" +
                "血糖 1mg/dl= 0.0555mmol/L\n" +
                "胆红素 1μmol/L=0.05848mg/dl\n" +
                "胆红素 1mg/dl=17.1μmol/L\n" +
                "血肌酐 1μmol/L=0.01131mg/dl\n" +
                "血肌酐 1mg/dl=88.402μmol/L\n" +
                "血尿素氮 1mmol/L=2.8mg/dl\n" +
                "血尿素氮 1mg/dl=0.357mmol/L\n" +
                "甘油三酯 1mmol/L=88.6mg/dl\n" +
                "甘油三酯 1mg/dl=0.01129mmol/L\n" +
                "胆固醇 1mmol/L=38.67mg/dl\n" +
                "胆固醇 1mg/dl=0.02586mmol/L\n" +
                "高密度/低密度脂蛋白 1mmol/L=38.67mg/dl\n" +
                "高密度/低密度脂蛋白 1mg/dl=0.02586mmol/L\n" +
                "血尿酸 1μmol/L=0.01681mg/dl\n" +
                "血尿酸 1mg/dl=59.48μmol/L\n" +
                "血钙 1mmol/L=4mg/dl\n" +
                "血钙 1mg/dl=0.25mmol/L")
        dataSet_appendix = ArrayList()
        dataSet_appendix.add(subDataSet_appendix1)
        dataSet_appendix.add(subDataSet_appendix2)
    }
}