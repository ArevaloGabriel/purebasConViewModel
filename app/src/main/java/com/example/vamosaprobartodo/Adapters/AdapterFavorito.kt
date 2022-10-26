package com.example.vamosaprobartodo.Adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


import com.example.vamosaprobartodo.R
import com.example.vamosaprobartodo.databinding.ItemFavoritoBinding

class AdapterFavorito(private val favoritos: List<String>) :
    RecyclerView.Adapter<AdapterFavorito.ViewHolder>(){

    class ViewHolder(v: View):RecyclerView.ViewHolder(v) {
      val binding = ItemFavoritoBinding.bind(v)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_favorito, parent, false)
        return ViewHolder(v)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val favo = favoritos[position]
        holder.binding.textoItem.text=favo.toString()

    }
    override fun getItemCount(): Int {
      return favoritos.size
    }


    }



