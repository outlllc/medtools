package com.example.recycle

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.recycle.R.color.skywhite
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup
import java.io.File
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    var dateCaculatorFragment:Datecalculator? = null
    var babyWeightFragment:BabyWeight? = null
    var fragment: Fragment?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saveIntoFile()
        if (dateCaculatorFragment == null){
            fragment= Datecalculator()
        }
//        if(babyWeightFragment == null){
//            babyWeightFragment= BabyWeight()
//        }
        supportFragmentManager.beginTransaction().add(R.id.fragment_, fragment!!).commit()

        val calculation = findViewById<MaterialButtonToggleGroup>(R.id.study_button_toggle_group)
        calculation.addOnButtonCheckedListener{ group: MaterialButtonToggleGroup?, checkedId, isChecked ->
            val childCount = group?.childCount
            var selectIndex = 0
            for (index in 0 until childCount!!) {
                val child = group.getChildAt(index) as MaterialButton
                if (child.id == checkedId) {
                    selectIndex = index
                    child.setTextColor(Color.parseColor("#F0FFFF"))
                    child.setBackgroundColor(Color.parseColor("#3D9140"))
                } else {
                    child.setTextColor(Color.parseColor("#FF000000"))
                    child.setBackgroundColor(Color.parseColor("#00C957"))
                }
            }
//            calculation.check(R.id.calculation_button)
            selectFragment(selectIndex)
        }


        val buffersize=1024
        val databasename="weight"
        val packagename="com.example.test"
        val DB_PATH=("/data${Environment.getDataDirectory().absolutePath}/$packagename/databases")




        var db=File(DB_PATH)
        if (!db.exists()){
            db.mkdir()
        }
        val dbpath = "$DB_PATH/${databasename}.db"
        var dbpath_=File(dbpath)
        if (!dbpath_.exists()){
            try {

//            var db1=this.Activity.assets.open("weight.db")
                val db = resources.assets.open("weight.db")
                val myFile = File(dbpath)

                var fos = FileOutputStream(dbpath)

                val bufferbyte = ByteArray(buffersize)
                var count = 0
                var data = ""

                while ((db.read(bufferbyte).also { count = it }) > 0) {
                    fos.write(bufferbyte, 0, count)
                }

                fos.flush()
                fos.close()
                db.close()
            } catch (e: Exception) {
                Log.e("error", e.message.toString())

            }
        }

    }




    private fun selectFragment(selectIndex:Int) {
        var fragment1=fragment
        when (selectIndex) {
            0 -> {
                if (dateCaculatorFragment==null){
                    fragment1=Datecalculator()
                }else {
                    fragment1 = dateCaculatorFragment
                }
            }

            1 -> {
                if(babyWeightFragment==null){
                    fragment1=BabyWeight()
                } else {
                    fragment1=babyWeightFragment
                }
//                Intent(this, QueryValue::class.java).run { startActivity(this) }
            }
            2 -> Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
            3 -> Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
            else ->
                Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
        }?:return
        val ft=supportFragmentManager.beginTransaction()
        if (!fragment1!!.isAdded){
            ft.add(R.id.fragment_, fragment1!!)
        }
        if (fragment!=null){
            ft.hide(fragment!!)
        }
        fragment=fragment1
        ft.show(fragment1!!)
        ft.commit()
    }

    fun Activity.saveIntoFile() {
//        val PATH = this.filesDir.absolutePath
//        // 创建src和dst文件夹
//        // 【注】需要有PATH目录的权限才能创建子目录
//        // 若PATH文件夹权限为root权限，则使用adb shell chown命令修改权限
//        val src = File(PATH + "/" + "database")
//        // 判断文件夹是否存在，不存在就进行创建
//        if (!src.exists()) {
//            if (!src.mkdirs()){
//                Log.e("err", "create directory failed.")
//            }
//        }

        val dst = File("data/data/com.example.recycle/databases")
        if (!dst.exists()) {
            if (!dst.mkdirs()) {
                Log.e("err", "create directory failed.")
            }
        }
        val newFile = File("data/data/com.example.recycle/databases/weight.db")
        if (!newFile.exists()) {
            val is1 = assets.open("weight.db")
            val fos = FileOutputStream(newFile)
            var len = -1
            val buffer = ByteArray(1024)
            while ((is1.read(buffer).also { len = it }) != -1) {
                fos.write(buffer, 0, len)
            }
            fos.close()
            is1.close()
        }
    }






//    private fun inRecycler(list:List<String>) {
//        var rvView=findViewById<RecyclerView>(R.id.recyclerviewlayout)
//        rvView.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
//        rvView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        rvView.layoutManager=GridLayoutManager(this,2)
//        rvView.adapter=SecrecyAdaptor(list)
//    }

}

