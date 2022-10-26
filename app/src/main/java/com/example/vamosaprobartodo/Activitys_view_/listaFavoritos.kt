package com.example.vamosaprobartodo.Activitys_view_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vamosaprobartodo.Adapters.AdapterFavorito
import com.example.vamosaprobartodo.Repositorio.FavoritosRepoLocal

import com.example.vamosaprobartodo.databinding.ActivityListaFavoritosBinding

class listaFavoritos : AppCompatActivity() {

    lateinit var binding: ActivityListaFavoritosBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityListaFavoritosBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setUpRecyclerView()

        binding.volver.setOnClickListener {
            val volver = Intent(this,MainActivity::class.java)
            startActivity(volver)
        }
    }



    private fun setUpRecyclerView() {
        binding.Recycler.adapter = AdapterFavorito(FavoritosRepoLocal.devolverFavoritos())
        binding.Recycler.layoutManager = LinearLayoutManager(this)
    }

}