package com.example.recycle

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.recycle.R.color.skywhite
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup

class MainActivity : AppCompatActivity() {

    var dateCaculatorFragment:Datecalculator? = null
    var babyWeightFragment:BabyWeight? = null
    var fragment: Fragment?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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






//    private fun inRecycler(list:List<String>) {
//        var rvView=findViewById<RecyclerView>(R.id.recyclerviewlayout)
//        rvView.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
//        rvView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        rvView.layoutManager=GridLayoutManager(this,2)
//        rvView.adapter=SecrecyAdaptor(list)
//    }

}

