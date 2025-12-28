package com.duckgo.medtools.babyweight

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.roundToInt

class BabyWeightViewModel(application: Application) : AndroidViewModel(application) {

    private val dbHelper = DataBaseHelper(application)
    private val repo = PercentileRepository(application)

    private val _predictedWeight = MutableLiveData<String>()
    val predictedWeight: LiveData<String> = _predictedWeight

    private val _percentileReports = MutableLiveData<List<UserCompareReport>>()
    val percentileReports: LiveData<List<UserCompareReport>> = _percentileReports

    private val _pregnancyWeekError = MutableLiveData<String?>()
    val pregnancyWeekError: LiveData<String?> = _pregnancyWeekError

    private val _clearTrigger = MutableLiveData<Unit>()
    val clearTrigger: LiveData<Unit> = _clearTrigger

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repo.loadFromAssets("growproperty.json")
        }
    }

    fun performCalculations(
        acStr: String,
        flStr: String,
        bpdStr: String,
        hcStr: String,
        hlStr: String,
        ulnaStr: String,
        tibiaStr: String,
        weekStr: String,
        lmpStr: String,
        inspectStr: String
    ) {
        viewModelScope.launch {
            // 1. 确定孕周逻辑：手动输入优先，否则日期计算
            var week = weekStr.toDoubleOrNull()
            if (week == null) {
                week = calculateWeekFromDates(lmpStr, inspectStr)
            }

            // 2. 执行计算
            val ac = acStr.toDoubleOrNull()
            val fl = flStr.toDoubleOrNull()
            val bpd = bpdStr.toDoubleOrNull()
            val hc = hcStr.toDoubleOrNull()
            val hl = hlStr.toDoubleOrNull()
            val ulna = ulnaStr.toDoubleOrNull()
            val tibia = tibiaStr.toDoubleOrNull()

            // 3. 预测体重
            _predictedWeight.value = withContext(Dispatchers.Default) {
                calculatePredictionResult(ac, fl, bpd)
            }

            // 4. 生成报告
            if (week == null) {
                _pregnancyWeekError.value = "请提供有效孕周或日期"
            } else {
                _pregnancyWeekError.value = null
                val inputs = mapOf(
                    "BPD" to bpd, "HC" to hc, "AC" to ac,
                    "FL" to fl, "HL" to hl, "Ulna" to ulna, "Tibia" to tibia
                )
                _percentileReports.value = withContext(Dispatchers.Default) {
                    generateUserCompareReports(week, repo, inputs)
                }
            }
        }
    }

    /**
     * 根据日期字符串计算孕周 (YYYYMMDD)
     */
    private fun calculateWeekFromDates(lmp: String, inspect: String): Double? {
        if (lmp.length != 8 || inspect.length != 8) return null
        return try {
            val sdf = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
            val d1 = sdf.parse(lmp)
            val d2 = sdf.parse(inspect)
            if (d1 != null && d2 != null) {
                val diff = d2.time - d1.time
                val days = diff / (1000 * 60 * 60 * 24)
                if (days < 0) null else days / 7.0
            } else null
        } catch (e: Exception) {
            null
        }
    }

    fun clearAll() {
        _predictedWeight.value = ""
        _percentileReports.value = emptyList()
        _pregnancyWeekError.value = null
        _clearTrigger.value = Unit
    }

    private suspend fun calculatePredictionResult(ac: Double?, fl: Double?, bpd: Double?): String {
        if (ac == null && fl == null && bpd == null) {
            return "请输入有效数值"
        }
        if (ac == null) {
            return "必须输入腹围值"
        }

        val resFlAc = if (fl != null && fl in 40.0..83.0 && ac in 200.0..400.0) queryFlAc(ac, fl) else null
        val resBpdAc = if (bpd != null && bpd in 31.0..100.0 && ac in 155.0..400.0) queryBpdAc(ac, bpd) else null

        return when {
            resFlAc != null && resBpdAc != null -> {
                val avg = (resFlAc.toDouble() + resBpdAc.toDouble()) / 2.0
                "股骨腹围预测：$resFlAc\n双顶径腹围预测：$resBpdAc\n平均体重：${"%.1f".format(avg)}"
            }
            resFlAc != null -> "股骨腹围预测：$resFlAc"
            resBpdAc != null -> "双顶径腹围预测：$resBpdAc"
            else -> "请输入正确范围内的数值"
        }
    }

    private suspend fun queryFlAc(ac: Double, fl: Double): String = withContext(Dispatchers.IO) {
        val y1 = if ((fl % 1) >= 0.9) fl.roundToInt().toString() else fl.toInt().toString()
        val acInt = ac.toInt()
        if (acInt % 5 != 0) {
            val lowX = (acInt / 5) * 5
            val highX = lowX + 5
            val res1 = dbHelper.queryAcFl("tw$lowX", y1).firstOrNull()?.toIntOrNull() ?: 0
            val res2 = dbHelper.queryAcFl("tw$highX", y1).firstOrNull()?.toIntOrNull() ?: 0
            ((res1 + res2) / 2).toString()
        } else {
            dbHelper.queryAcFl("tw$acInt", y1).firstOrNull() ?: ""
        }
    }

    private suspend fun queryBpdAc(ac: Double, bpd: Double): String = withContext(Dispatchers.IO) {
        val y1 = if ((bpd % 1) >= 0.9) bpd.roundToInt().toString() else bpd.toInt().toString()
        val acInt = ac.toInt()
        if (acInt % 5 != 0) {
            val lowX = (acInt / 5) * 5
            val highX = lowX + 5
            val res1 = dbHelper.queryAcBpd("ac$lowX", y1).toIntOrNull() ?: 0
            val res2 = dbHelper.queryAcBpd("ac$highX", y1).toIntOrNull() ?: 0
            ((res1 + res2) / 2).toString()
        } else {
            dbHelper.queryAcBpd("ac$acInt", y1)
        }
    }

    override fun onCleared() {
        super.onCleared()
        dbHelper.close()
    }
}
