package com.example.vamosaprobartodo.Activitys_view_

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.vamosaprobartodo.Repositorio.FavoritosRepoLocal
import com.example.vamosaprobartodo.Viewmodels.TextoViewModel
import com.example.vamosaprobartodo.databinding.ActivityMainBinding

import kotlinx.coroutines.*
import java.util.*

//

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val texto : TextoViewModel by viewModels()


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


/*Utilizo el Patron Observer. texto.textoData se suscribe al Observador para ver cuando cambia*/

        texto.textoData.observe(this,
        { textoActual -> binding.resultado.text = textoActual })


        binding.cambiarTexto.setOnClickListener {
            /*lanzo una corutina con el GlobalScope
            * y dentro puedo poner Suspen Fuction o funciones comunes para que se realicen*/
            GlobalScope.launch(Dispatchers.IO) {
              /* texto.retardo()*/
                texto.aleatorio()

            }
        }

        binding.MinusculaButton.setOnClickListener {

          binding.resultado.text = texto.minuscula()

        }

       binding.mayusculaButon.setOnClickListener {

            binding.resultado.text = texto.mayuscula()
        }

        binding.favoritos.setOnClickListener {

           if(FavoritosRepoLocal.agregarFavorito(binding.resultado.text.toString()))
               Toast.makeText(this, "agregado Coreectamente", Toast.LENGTH_SHORT).show()
        }

        binding.mostrarFavoritos.setOnClickListener {
            val fav = Intent(this, listaFavoritos ::class.java)
            startActivity(fav)


        }
    }
}