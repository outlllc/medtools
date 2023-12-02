package com.example.recycle

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import androidx.core.content.contentValuesOf

class DataBaseHelper(context:Context) :SQLiteOpenHelper(context, "weight.db", null, 1) {
    val TABLE_NAME="weight"
    val TABLE_NAMEBPD="bpdac"
    val sqlCreat="create table ${TABLE_NAME} (id integer primary key autoincrement,tw200 TEXT,tw205 TEXT,tw210 TEXT,tw215 TEXT,tw220 TEXT,tw225 TEXT,tw230 TEXT,tw235 TEXT,tw240 TEXT,tw245 TEXT,tw250 TEXT,tw255 TEXT,tw260 TEXT,tw265 TEXT,tw270 TEXT,tw275 TEXT,tw280 TEXT,tw285 TEXT,tw290 TEXT,tw295 TEXT,tw300 TEXT,tw305 TEXT,tw310 TEXT,tw315 TEXT,tw320 TEXT,tw325 TEXT,tw330 TEXT,tw335 TEXT,tw340 TEXT,tw345 TEXT,tw350 TEXT,tw355 TEXT,tw360 TEXT,tw365 TEXT,tw370 TEXT,tw375 TEXT,tw380 TEXT,tw385 TEXT,tw390 TEXT,tw395 TEXT,tw400 TEXT)"
    val sqlCreate2="create table ${TABLE_NAMEBPD} (id integer primary key autoincrement,ac155 TEXT,ac160 TEXT,ac165 TEXT,ac170 TEXT,ac175 TEXT,ac180 TEXT,ac185 TEXT,ac190 TEXT,ac195 TEXT,ac200 TEXT,ac205 TEXT,ac210 TEXT,ac215 TEXT,ac220 TEXT,ac225 TEXT,ac230 TEXT,ac235 TEXT,ac240 TEXT,ac245 TEXT,ac250 TEXT,ac255 TEXT,ac260 TEXT,ac265 TEXT,ac270 TEXT,ac275 TEXT,ac280 TEXT,ac285 TEXT,ac290 TEXT,ac295 TEXT,ac300 TEXT,ac305 TEXT,ac310 TEXT,ac315 TEXT,ac320 TEXT,ac325 TEXT,ac330 TEXT,ac335 TEXT,ac340 TEXT,ac345 TEXT,ac350 TEXT,ac355 TEXT,ac360 TEXT,ac365 TEXT,ac370 TEXT,ac375 TEXT,ac380 TEXT,ac385 TEXT,ac390 TEXT,ac395 TEXT,ac400 TEXT)"
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(sqlCreat)
        db?.execSQL(sqlCreate2)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        Log.e("tag", "onUpgrade")
        db?.execSQL("drop table if exists ${TABLE_NAME}")
        onCreate(db)

    }

    fun addValue(arr:MutableList<String>){
//        var arr:MutableList<String>=mutableListOf(T100,T101,"T102")
        var values= contentValuesOf()
        values.put("T100",arr[0])
        values.put("T101",arr[1])
        values.put("T102",arr[2])
        val db=this.writableDatabase
        db.insert(TABLE_NAME,null,values)
        db.close()
    }
    @SuppressLint("Range")
    fun queryAcFl(list:MutableList<String>) :MutableList<String>{
        var result=mutableListOf<String>()
        val db= this.readableDatabase
        var sqlQuery="select * from $TABLE_NAME where ${list[0]} and id=${list[1].toInt()}"
        var query=db.rawQuery(sqlQuery,null)
//        var query = db.query(TABLE_NAME, arrayOf(list[0]), list[1], null, null, null, null)
        while (query.moveToNext()) {
            result.add(query.getString(query.getColumnIndex(list[0])))
        }
        query.close()
        db.close()
        return result
    }
    @SuppressLint("Range")
    fun queryAcBpd(list:MutableList<String>):String{
        val db= this.readableDatabase
        var result=""
        var sqlQuery="select * from $TABLE_NAMEBPD where ${list[0]} and id=${list[1].toInt()}"
        var query=db.rawQuery(sqlQuery,null)
        while (query.moveToNext()) {
            result=query.getString(query.getColumnIndex(list[0]))
        }
        return result
    }
}