package com.duckgo.medtools.babyweight

import android.content.Context
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.InputStreamReader
import kotlin.math.ceil
import kotlin.math.floor

@Serializable
data class PValues(val p5: Double, val p50: Double, val p95: Double)

/**
 * PercentileRepository
 *
 * - 读取 assets/percentiles.json（结构与我此前给你的 JSON 文件一致，外层键为字符串周数 "12","13",...）
 * - data 类型为 Map<String, Map<String, PValues>>（周 -> (measure -> PValues)）
 * - getForWeek 会对非整数周做线性插值
 *
 * 注意：我没有使用任何 typealias，也没有使用实验性编译选项。
 */
class PercentileRepository(private val context: Context) {

    // 数据结构："12" -> ("BPI" -> PValues(...), "HC" -> PValues(...), ...)
    private var data: Map<String, Map<String, PValues>> = emptyMap()

    /**
     * 从 assets 中加载 JSON，调用一次即可（建议异步或在应用启动时调用）
     * filename 默认为 "percentiles.json"
     */
    fun loadFromAssets(filename: String = "percentiles.json") {
        val stream = context.assets.open(filename)
        val text = InputStreamReader(stream).readText()
        val json = Json { ignoreUnknownKeys = true }
        // decodeInto a Map<String, Map<String, PValues>>
        data = json.decodeFromString(text)
    }

    /**
     * 查询给定孕周和测量项的 p5/p50/p95。
     * - week 可以是小数（如 20.5），对小数部分进行线性插值
     * - measure 示例："BPI", "HC", "AC", "FL", "HL", "Ulna", "Tibia"
     * 返回 PValues 或 null（当数据缺失或超出范围）
     */
    fun getForWeek(week: Double, measure: String): PValues? {
        if (data.isEmpty()) return null

        // 找出已有周数的最小最大（keys 是字符串，需要转换）
        val weekInts = data.keys.mapNotNull { it.toIntOrNull() }.sorted()
        if (weekInts.isEmpty()) return null
        val minWeek = weekInts.first()
        val maxWeek = weekInts.last()

        // 限制在边界内
        val w = week.coerceIn(minWeek.toDouble(), maxWeek.toDouble())

        val wFloor = floor(w).toInt()
        val wCeil = ceil(w).toInt()

        val keyFloor = wFloor.toString()
        val keyCeil = wCeil.toString()

        val weekFloorMap = data[keyFloor] ?: return null
        val weekCeilMap = data[keyCeil] ?: return null

        val vFloor = weekFloorMap[measure] ?: return null
        val vCeil = weekCeilMap[measure] ?: return null

        // 整数周，直接返回
        if (wFloor == wCeil) return vFloor

        // 线性插值
        val t = (w - wFloor) / (wCeil - wFloor)
        fun lerp(a: Double, b: Double) = a + (b - a) * t

        return PValues(
            p5 = lerp(vFloor.p5, vCeil.p5),
            p50 = lerp(vFloor.p50, vCeil.p50),
            p95 = lerp(vFloor.p95, vCeil.p95)
        )
    }
}