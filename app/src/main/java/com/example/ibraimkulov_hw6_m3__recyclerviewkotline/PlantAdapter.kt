package com.example.ibraimkulov_hw6_m3__recyclerviewkotline

import android.telephony.ims.RcsUceAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
import com.example.ibraimkulov_hw6_m3__recyclerviewkotline.databinding.ItemPlantBinding

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>(){
    val plantList=ArrayList<Plant>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_plant,parent,false)
        return PlantHolder(view)
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        holder.bind(plantList[position])
    }

    override fun getItemCount(): Int {
        return plantList.size
    }
    fun addPlant(plant: Plant){
      plantList.add(plant)
        notifyDataSetChanged()
    }





    //ViewHolder
    class PlantHolder(item: View):RecyclerView.ViewHolder(item){
        val binding=ItemPlantBinding.bind(item)

        fun bind(plant: Plant)=with(binding){
            imgRomashka.setImageResource(plant.imageId)
            tvTitle.text=plant.title
        }
    }
}