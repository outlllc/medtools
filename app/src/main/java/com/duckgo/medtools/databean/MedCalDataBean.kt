package com.duckgo.medtools.databean

class MedCalDataBean(vararg val items: String) {
    val title: String get() = items.getOrNull(0) ?: ""
    val content1: String get() = items.getOrNull(1) ?: ""
    val content2: String get() = items.getOrNull(2) ?: ""
    val content3: String get() = items.getOrNull(3) ?: ""
    val content4: String get() = items.getOrNull(4) ?: ""
    val content5: String get() = items.getOrNull(5) ?: ""
    val content6: String get() = items.getOrNull(6) ?: ""
    val content7: String get() = items.getOrNull(7) ?: ""

    override fun toString(): String = "MedCalDataBean(items=${items.contentToString()})"
}
