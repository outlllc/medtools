package com.duckgo.medtools.babyweight

/**
 * 把用户输入的单项比较结果封装成对象，便于 adapter 使用
 */
data class UserCompareReport(
    val measure: String,
    val original: PValues,       // 来自表格的 p5/p50/p95（必须存在）
    val userValue: Double?,      // 用户输入的值，null 表示未输入
    val userPercentOfP50: Double?, // userValue / p50 * 100
    val interpretation: String   // 偏小/正常/偏大/无数据
)

/**
 * 生成比较报告（按 measuresOrder 顺序）
 * - week: 孕周（可为小数）
 * - repository: 已 loadFromAssets 的 PercentileRepository
 * - userInputs: Map<measureName, userValueDouble?> (若某项没输入则值为 null 或不包含 key)
 */
fun generateUserCompareReports(
    week: Double,
    repository: PercentileRepository,
    userInputs: Map<String, Double?>,
    measuresOrder: List<String> = listOf("BPD", "HC", "AC", "FL", "HL", "Ulna", "Tibia"),
    lowThresholdPercent: Double = 90.0,
    highThresholdPercent: Double = 110.0
): List<UserCompareReport> {
    val list = mutableListOf<UserCompareReport>()
    for (measure in measuresOrder) {
        val pvals = repository.getForWeek(week, measure)
        if (pvals == null) {
            // 若没有参考数据，全部标注为无数据
            list.add(UserCompareReport(measure, PValues(0.0,0.0,0.0), userInputs[measure], null, "参考数据缺失"))
            continue
        }
        val userVal = userInputs[measure]
        val userPct = if (userVal != null && pvals.p50 != 0.0) (userVal / pvals.p50) * 100.0 else null
        val interp = when {
            userPct == null -> "未输入"
            userPct < lowThresholdPercent -> "偏小"
            userPct > highThresholdPercent -> "偏大"
            else -> "正常"
        }
        list.add(UserCompareReport(measure, pvals, userVal, userPct, interp))
    }
    return list
}