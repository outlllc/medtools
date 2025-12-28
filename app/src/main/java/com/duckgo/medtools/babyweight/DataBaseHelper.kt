package com.duckgo.medtools.babyweight

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHelper(context: Context?) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        private const val DB_NAME = "weight.db"
        private const val DB_VERSION = 1
        private const val TABLE_WEIGHT = "weight"
        private const val TABLE_BPDAC = "bpdac"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE IF NOT EXISTS $TABLE_WEIGHT (id INTEGER PRIMARY KEY AUTOINCREMENT, tw200 TEXT, tw205 TEXT)")
        db?.execSQL("CREATE TABLE IF NOT EXISTS $TABLE_BPDAC (id INTEGER PRIMARY KEY AUTOINCREMENT, ac155 TEXT, ac160 TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_WEIGHT")
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_BPDAC")
        onCreate(db)
    }

    /**
     * 查询 weight 表中的指定列
     * @param columnName 列名
     * @param id 行ID
     */
    fun queryAcFl(columnName: String, id: String): List<String> {
        val result = mutableListOf<String>()
        readableDatabase.query(TABLE_WEIGHT, arrayOf(columnName), "id = ?", arrayOf(id), null, null, null).use { cursor ->
            if (cursor.moveToFirst()) {
                result.add(cursor.getString(0))
            }
        }
        return result
    }

    /**
     * 查询 bpdac 表中的指定列
     * @param columnName 列名
     * @param id 行ID
     */
    fun queryAcBpd(columnName: String, id: String): String {
        var result = ""
        readableDatabase.query(TABLE_BPDAC, arrayOf(columnName), "id = ?", arrayOf(id), null, null, null).use { cursor ->
            if (cursor.moveToFirst()) {
                result = cursor.getString(0)
            }
        }
        return result
    }

    // 保持对旧代码参数格式的兼容（如果其他地方还在用 MutableList 传参）
    fun queryAcFl(params: MutableList<String>): List<String> = queryAcFl(params[0], params[1])
    fun queryAcBpd(params: MutableList<String>): String = queryAcBpd(params[0], params[1])
}
