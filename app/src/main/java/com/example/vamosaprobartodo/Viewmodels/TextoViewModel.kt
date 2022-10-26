package com.example.vamosaprobartodo.Viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.vamosaprobartodo.Repositorio.TextoRepoLocal
import kotlinx.coroutines.delay



class TextoViewModel : ViewModel() {


    var textoData = MutableLiveData<String>()


    fun aleatorio():String{
        val textoActual = TextoRepoLocal.aleatorio()
        return textoData.postValue(textoActual).toString()
    }

    /*Uso uNa Suspend Fuction para hacer tardar un poco el cambio*/
    suspend fun retardo() {
       delay(1000L)
    }
    fun mayuscula(): String {

        return textoData.postValue(textoData.value.toString().uppercase()).toString()
        }

    fun minuscula():String{
        return textoData.postValue(textoData.value.toString().lowercase()).toString()
    }


}
