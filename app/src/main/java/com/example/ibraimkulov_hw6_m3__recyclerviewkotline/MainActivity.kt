package com.example.ibraimkulov_hw6_m3__recyclerviewkotline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ibraimkulov_hw6_m3__recyclerviewkotline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter=PlantAdapter()
    private val imageIdList= listOf(
        R.drawable.ic_plant1,
        R.drawable.ic_plant2,
        R.drawable.ic_plant3,
        R.drawable.ic_plant4,
        R.drawable.ic_plant5,
    )
    private var index=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
   private fun init(){
       binding.apply {
         rcView.layoutManager=GridLayoutManager(this@MainActivity,3)
           rcView.adapter=adapter
           btnAdd.setOnClickListener{
               if(index>4)index=0
               var index2=index+1
             val plant=Plant(imageIdList[index],"Plant $index2")
               adapter.addPlant(plant)
               index++

           }
       }
   }
}