package com.duckgo.medtools.babyweight

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.duckgo.medtools.R
import java.util.Locale

class UserCompareAdapter(private var items: List<UserCompareReport>) :
    RecyclerView.Adapter<UserCompareAdapter.VH>() {

    private val lowThreshold = 90.0
    private val highThreshold = 110.0

    fun updateData(newItems: List<UserCompareReport>) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.fragment_babyweight_user_item_recycleview, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvMeasureName: TextView = itemView.findViewById(R.id.tvMeasureName)
        private val tvOriginal: TextView = itemView.findViewById(R.id.tvOriginal)
        private val tvP50: TextView = itemView.findViewById(R.id.tvP50)
        private val tvUserValue: TextView = itemView.findViewById(R.id.tvUserValue)
        private val tvUserPercent: TextView = itemView.findViewById(R.id.tvUserPercent)
        private val tvInterpretation: TextView = itemView.findViewById(R.id.tvInterpretation)

        fun bind(r: UserCompareReport) {
            tvMeasureName.text = r.measure
            fun fmt(v: Double) = String.format(Locale.getDefault(), "%.1f", v)

            tvOriginal.text = "P5=${fmt(r.original.p5)}  P50=${fmt(r.original.p50)}  P95=${fmt(r.original.p95)}"
            tvP50.text = "中位数(P50): ${fmt(r.original.p50)}"

            if (r.userValue == null) {
                tvUserValue.text = "用户值: —"
                tvUserPercent.text = "占中位数: —"
            } else {
                tvUserValue.text = "用户值(mm): ${fmt(r.userValue)}"
                val pctText = if (r.userPercentOfP50 != null) String.format(Locale.getDefault(), "%.1f%%", r.userPercentOfP50) else "—"
                tvUserPercent.text = "占P50的比例: $pctText"
            }

            tvInterpretation.text = "结论: ${r.interpretation}"

            // 背景色：未输入灰；正常绿；偏小/偏大橙到红
            val bgColor = when (r.interpretation) {
                "未输入" -> Color.parseColor("#FAFAFA")
                "参考数据缺失" -> Color.parseColor("#F5F5F5")
                "正常" -> Color.parseColor("#E8F5E9")
                "偏小" -> {
                    val pct = r.userPercentOfP50 ?: 100.0
                    if (pct < 80.0) Color.parseColor("#FFCDD2") else Color.parseColor("#FFE0B2")
                }
                "偏大" -> {
                    val pct = r.userPercentOfP50 ?: 100.0
                    if (pct > 120.0) Color.parseColor("#FFCDD2") else Color.parseColor("#FFE0B2")
                }
                else -> Color.parseColor("#FFFFFF")
            }
            itemView.setBackgroundColor(bgColor)
        }
    }
}