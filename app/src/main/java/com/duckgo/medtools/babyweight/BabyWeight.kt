package com.duckgo.medtools.babyweight

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.BaseFragmentDataBinding
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentBabyWeightBinding
import com.duckgo.medtools.databinding.FragmentDateCalculator3Binding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.roundToInt


class BabyWeight : BaseFragmentDataBinding<FragmentBabyWeightBinding>(), View.OnClickListener {

    var dbHelper: DataBaseHelper? =null
    private lateinit var repo: PercentileRepository
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: UserCompareAdapter


    override fun getFragmentViewBinding(): FragmentBabyWeightBinding {
        return FragmentBabyWeightBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dbHelper = DataBaseHelper(context)
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = UserCompareAdapter(emptyList())
        recyclerView.adapter = adapter

        binding.btnCompare.setOnClickListener { onClick(it) }

        repo = PercentileRepository(requireContext())

        // 建议异步加载，避免阻塞主线程
        CoroutineScope(Dispatchers.IO).launch {
            repo.loadFromAssets("growproperty.json")
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnCompare -> {
                QueryConpre()
                onCompareClicked()
            }
        }
    }
    private fun parseDoubleOrNull(et: EditText): Double? {
        val s = et.text.toString().trim()
        return s.toDoubleOrNull()
    }

    private fun onCompareClicked() {
        val week = parseDoubleOrNull(binding.etPregnancyWeek)
        if (week == null) {
            binding.etPregnancyWeek.error = "请输入有效孕周（例如 20 或 20.5）"
            return
        }

        // 收集用户输入 map
        val inputs = mapOf(
            "BPD" to parseDoubleOrNull(binding.etBPD),
            "HC" to parseDoubleOrNull(binding.etHC),
            "AC" to parseDoubleOrNull(binding.etAC),
            "FL" to parseDoubleOrNull(binding.etFL),
            "HL" to parseDoubleOrNull(binding.etHL),
            "Ulna" to parseDoubleOrNull(binding.etUlna),
            "Tibia" to parseDoubleOrNull(binding.etTibia)
        )

        // 生成报告并更新 UI（在主线程）
        lifecycleScope.launch {
            val reports = withContext(Dispatchers.Default) {
                generateUserCompareReports(week, repo, inputs)
            }
            adapter.updateData(reports)
            // 可在这里滚动到顶部
            recyclerView.scrollToPosition(0)
        }
    }

    fun queryFlAc(x:String,y:String):String{
        if (x.isNotBlank() and y.isNotBlank()) {
            if ((x.toDouble() >= 200.0) and (x.toDouble() <= 400.0) and (y.toDouble() >= 40.0) and (y.toDouble() <= 83.0)) {
//                dbHelper = DataBaseHelper(this)
                var y1: String = ""
                if ("%.1f".format(y.toDouble() % 1).toDouble() >= 0.9) {
                    y1 = y.toDouble().roundToInt().toString()
                } else {
                    y1 = y.toDouble().toInt().toString()
                }
                if (x.toDouble().toInt() % 5 != 0) {
                    var left = x.toDouble().toInt() % 5
                    var newX = x.toDouble().toInt() - left
                    var newx2 = newX + 5
                    var list1: MutableList<String> = mutableListOf("tw${newX}", y1)
                    var result1 = dbHelper!!.queryAcFl(list1)
                    var res1: String = ""
                    var res2: String = ""
                    result1.forEach { res1 += it }
                    var list2: MutableList<String> = mutableListOf("tw${newx2}", y1)
                    var result2 = dbHelper!!.queryAcFl(list2)
                    result2.forEach { res2 += it }
                    var result = (res1.toInt() + res2.toInt()) / 2
                    return "${result}"
                } else if (x.toDouble().toInt() % 5 == 0) {
                    var x1 = x.toDouble().toInt().toString()
                    var list = mutableListOf("tw${x1}", y1)
                    var result_ = dbHelper!!.queryAcFl(list)
                    var result = ""
                    result_.forEach { result += it }
                    return result
                }else{
                    return "-6"
                }
            }else{
                return "-5"
            }
        }else {
            return "-4"
        }
    }

    fun queryBpdAc(x:String, y:String):String{
        if (x.isNotBlank() and y.isNotBlank()) {
            if ((x.toDouble() >= 155.0) and (x.toDouble() <= 400.0) and (y.toDouble() >= 31.0) and (y.toDouble() <= 100.0)) {
//                dbHelper = DataBaseHelper(this)
                var y1: String = ""
                if ("%.1f".format(y.toDouble() % 1).toDouble() >= 0.9) {
                    y1 = y.toDouble().roundToInt().toString()
                } else {
                    y1 = y.toDouble().toInt().toString()
                }
                if (x.toDouble().toInt() % 5 != 0) {
                    var left = x.toDouble().toInt() % 5
                    var newX = x.toDouble().toInt() - left
                    var newx2 = newX + 5
                    var list1: MutableList<String> = mutableListOf("ac${newX}", y1)
                    var result1 = dbHelper!!.queryAcBpd(list1)
                    var list2: MutableList<String> = mutableListOf("ac${newx2}", y1)
                    var result2 = dbHelper!!.queryAcBpd(list2)
                    var result = (result1.toInt() + result2.toInt()) / 2
                    return "${result}"
                } else if (x.toDouble().toInt() % 5 == 0) {
                    var x1 = x.toDouble().toInt().toString()
                    var list = mutableListOf("ac${x1}", y1)
                    var result = dbHelper!!.queryAcBpd(list)
                    return result
                }else{
                    return "-3"
                }
            }else{
                return "-2"
            }
        } else {
            return "-1"
        }
    }

    fun QueryConpre() {
//        val editText1 = requireActivity().findViewById<EditText>(R.id.QueryAc)
       val editText1 = binding.etAC
        val editText2 = binding.etFL
        val editText3 = binding.etBPD
        val queryResult: TextView = binding.tvPredictedWeight
//        val editText2 = requireActivity().findViewById<EditText>(R.id.QueryFl)
//        val editText3 = requireActivity().findViewById<EditText>(R.id.QueryYBpd)
//        val queryResult: TextView = requireActivity().findViewById<TextView>(R.id.QueryResultConpre)
        var x = editText1.text.toString().trim()
        var y = editText2.text.toString().trim()
        val z= editText3.text.toString().trim()
        if(x.isBlank() and  y.isBlank() and z.isBlank()){
            queryResult.setText("正确的股骨数值（40-83mm）\n双顶径（31-100mm）\n腹围（200-400mm）")
        }else if (x.isBlank()) {
            queryResult.setText("必须输入腹围值和（或）双顶径、股骨长度")
        }else if(x.isNotBlank() and y.isNotBlank() and z.isBlank()){
            if((x.toDouble() >= 200.0) and (x.toDouble() <= 400.0) and (y.toDouble() >= 40.0) and (y.toDouble() <= 83.0)){
                queryResult.setText("股骨腹围预测:${queryFlAc(x, y)}")
            }else{
                queryResult.setText("请正确输入股骨和腹围值")
            }
        } else if (x.isNotBlank() and z.isNotBlank() and y.isBlank()){
            if ((x.toDouble() >= 155.0) and (x.toDouble() <= 400.0) and (z.toDouble() >= 31.0) and (z.toDouble() <= 100.0)){
                queryResult.setText("双顶径腹围预测:${queryBpdAc(x, z)}")
            }else{
                queryResult.setText("请正确输入双顶径和腹围值")
            }
        } else if (x.isNotBlank() and y.isBlank() and z.isBlank()){
            queryResult.setText("请再输入双顶径值和（或）股骨长度")
        } else{
            if ((x.toDouble() >= 200.0) and (x.toDouble() <= 400.0) and (y.toDouble() >= 40.0) and (y.toDouble() <= 83.0)
                and (z.toDouble() >= 31.0) and (z.toDouble() <= 100.0)) {
                var result1 = queryFlAc(x, y)
                var result2 = queryBpdAc(x, z)
                var avgResult = ((result1.toDouble() + result2.toDouble()) / 2.0).toString()
                queryResult.setText("股骨腹围预测：${result1}\n双顶径腹围预测：${result2}\n平均体重：${avgResult}")
            } else if ((x.toDouble() < 200.0) and (x.toDouble() >= 155.0) and (z.toDouble() >= 31.0) and (z.toDouble() <= 100.0)) {
                var result = queryBpdAc(x, z)
                queryResult.setText("双顶径腹围预测：${result}\n腹围过小，不支持股骨预测体重")
            } else {
                queryResult.setText("正确的股骨数值（40-83mm）\n双顶径（31-100mm）\n腹围（200-400mm）")
            }
        }
    }


}