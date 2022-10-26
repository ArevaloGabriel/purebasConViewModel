package com.example.vamosaprobartodo.Repositorio

import com.example.vamosaprobartodo.Entidades_Model_.Texto


object TextoRepoLocal {

    var textos : MutableList<String> = mutableListOf()

    init {


        textos.add("APRENDe")
        textos.add("dALE")
        textos.add ("MANdaLe PIPerNa")
        textos.add("No SEAs GOMA")
        textos.add("ChUPala")
        textos.add("QuIEn SIgUe???")
        textos.add("CoN POWEr")
        textos.add("EN MEDiA HOrA EsTa")
        textos.add("POnElo Que Va IgUAl")

 }

    fun agregarTexto(texto :String) :Boolean{
        return textos.add(texto)
    }

        fun aleatorio(): String {
            val position: Int = (0..8).random()
            return textos[position]
        }

    }



