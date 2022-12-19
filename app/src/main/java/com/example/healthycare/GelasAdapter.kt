package com.example.healthycare

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.healthycare.databinding.ItemGelasBinding

class GelasAdapter(private val listGelas: List<Gelas>): RecyclerView.Adapter<GelasAdapter.ViewHolder>() {

    class ViewHolder(var binding : ItemGelasBinding) : RecyclerView.ViewHolder(binding.root)
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    interface OnItemClickCallback{
        fun onItemClicked(data: Gelas, position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemGelasBinding.inflate(LayoutInflater.from(parent.context), parent ,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = listGelas[position]
        if(listItem.status){
            Glide.with(holder.itemView).load(R.drawable.minuman).into(holder.binding.imgItemPhoto)
        }else{
            Glide.with(holder.itemView).load(R.drawable.gelas).into(holder.binding.imgItemPhoto)
        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listGelas[holder.adapterPosition], position)}
    }

    override fun getItemCount(): Int = listGelas.size

}