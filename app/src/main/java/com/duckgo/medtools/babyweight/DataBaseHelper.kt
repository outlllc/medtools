package com.duckgo.medtools.babyweight

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import androidx.core.content.contentValuesOf

class DataBaseHelper(context: Context?) :SQLiteOpenHelper(context, "weight.db", null, 1) {
    val TABLE_NAME="weight"
    val TABLE_NAMEBPD="bpdac"
    val sqlCreat="create table if not exists ${TABLE_NAME} (id integer primary key autoincrement,tw200 TEXT,tw205 TEXT)"
    val sqlCreate2="create table if not exists ${TABLE_NAMEBPD} (id integer primary key autoincrement,ac155 TEXT,ac160 TEXT)"
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
    //databasename = getFilesDir() + "/weight.db";
    //openOrCreateDatabase(databasename, MODE_PRIVATE, null);

    fun queryAcFl(list:MutableList<String>) :MutableList<String>{
        var result=mutableListOf<String>()
        val db= this.readableDatabase
//        var sqlQuery="select * from $TABLE_NAME where ${list[0]} and id=${list[1].toInt()}"
//        var query=db.rawQuery(sqlQuery,null)


//        var query = db.query(TABLE_NAME, null, "${list[0]} and id=${list[1].toInt()}", null, null, null, null)

        var query = db.query(TABLE_NAME, arrayOf(list[0]), "id = ?", arrayOf(list[1]), null, null, null)
        while (query.moveToNext()) {
            result.add(query.getString(query.getColumnIndex(list[0])))
        }
        query.close()
        db.close()
        return result
    }

    fun queryAcBpd(list:MutableList<String>):String{
        val db= this.readableDatabase
        var result=""
//        var sqlQuery="select * from $TABLE_NAMEBPD where ${list[0]} and id=${list[1].toInt()}"
//        var query=db.rawQuery(sqlQuery,null)
        var query = db.query(TABLE_NAMEBPD, arrayOf(list[0]), "id = ?", arrayOf(list[1]), null, null, null)
        while (query.moveToNext()) {
            result=query.getString(query.getColumnIndex(list[0]))
        }
        return result
    }
}