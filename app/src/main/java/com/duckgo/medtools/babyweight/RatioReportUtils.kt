package com.duckgo.medtools.babyweight

import kotlin.math.abs
import java.util.Locale

/**
 * 以 ratio-to-median (%) 为主的输出格式与工具函数
 *
 * 说明：
 * - 以 PercentileRepository.getForWeek(week, measure) 获取原始 PValues
 * - 计算 ratio = value / p50 * 100 （以百分比形式返回）
 * - 返回 List<MeasureRatioReport>，便于在 UI（表格/RecyclerView）中逐行显示对比
 *
 * 建议的 interpretationThresholds：
 * - lowThresholdPercent (例如 90.0 表示小于 90% 标记为偏小)
 * - highThresholdPercent (例如 110.0 表示大于 110% 标记为偏大)
 */

data class RatioPercent(val p5Percent: Double, val p50Percent: Double, val p95Percent: Double)

/**
 * 每一项的报告：包含原始值（mm）与 ratio-to-median（%）
 */
data class MeasureRatioReport(
    val measure: String,
    val original: PValues,        // 原始 p5/p50/p95（mm）
    val ratioPercent: RatioPercent
)

/**
 * 生成给定孕周 week 的所有量项（按固定顺序）的 ratio 报告
 * measuresOrder: 你要求的顺序 -> BPI, HC, AC, FL, HL, Ulna, Tibia
 */
fun generateRatioReportForWeek(
    week: Double,
    repository: PercentileRepository,
    measuresOrder: List<String> = listOf("BPI", "HC", "AC", "FL", "HL", "Ulna", "Tibia")
): List<MeasureRatioReport> {
    val reports = mutableListOf<MeasureRatioReport>()

    for (measure in measuresOrder) {
        val pvals = repository.getForWeek(week, measure)
        if (pvals != null) {
            // ratio = value / p50 * 100
            val p50 = pvals.p50
            // 避免除以 0
            if (p50 == 0.0) {
                // skip or mark as invalid; 这里跳过
                continue
            }
            val ratio = RatioPercent(
                p5Percent = (pvals.p5 / p50) * 100.0,
                p50Percent = (pvals.p50 / p50) * 100.0, // 必然等于 100.0
                p95Percent = (pvals.p95 / p50) * 100.0
            )
            reports.add(MeasureRatioReport(measure = measure, original = pvals, ratioPercent = ratio))
        } else {
            // 如果该 measure 在该周没有数据，则不加入（UI 可显示“无数据”）
        }
    }

    return reports
}

/**
 * 把单个 MeasureRatioReport 格式化成可读字符串（便于 log 或放入 TextView）
 * interpretation thresholds 可自定义，默认 90% / 110%
 */
fun formatMeasureRatioReport(
    report: MeasureRatioReport,
    lowThresholdPercent: Double = 90.0,
    highThresholdPercent: Double = 110.0
): String {
    val orig = report.original
    val r = report.ratioPercent
    // 简单解读：以 p50 的比例来判断（更直观）
    val interpretation = when {
        r.p50Percent < lowThresholdPercent -> "偏小"
        r.p50Percent > highThresholdPercent -> "偏大"
        else -> "正常"
    }

    // 格式化，保留 1 位小数（如需要可改）
    fun fmt(v: Double) = String.format(Locale.US, "%.1f", v)

    return buildString {
        append("测项: ${report.measure}\n")
        append("  原始(mm): p5=${fmt(orig.p5)}, p50=${fmt(orig.p50)}, p95=${fmt(orig.p95)}\n")
        append("  相对中位数(%) : p5=${fmt(r.p5Percent)}%, p50=${fmt(r.p50Percent)}%, p95=${fmt(r.p95Percent)}%\n")
        append("  结论: $interpretation\n")
    }
}

/**
 * 把整个周的报告格式化成字符串（便于 debug / 日志 / 简单 UI）
 */
fun formatFullWeekRatioReport(
    week: Double,
    reports: List<MeasureRatioReport>,
    lowThresholdPercent: Double = 90.0,
    highThresholdPercent: Double = 110.0
): String {
    val sb = StringBuilder()
    sb.append("Week $week ratio-to-median report:\n")
    for (r in reports) {
        sb.append(formatMeasureRatioReport(r, lowThresholdPercent, highThresholdPercent))
        sb.append("\n")
    }
    return sb.toString()
}