package com.example.vamosaprobartodo.Repositorio




object FavoritosRepoLocal {


    private var listaFavorito : MutableList<String> = mutableListOf()
    init {


    listaFavorito.add("APRENDe")
        listaFavorito.add("dALE")


    }

    fun agregarFavorito(texto: String): Boolean {
        return (listaFavorito.add(texto))
    }

    fun devolverFavoritos():List<String>{
        return listaFavorito
    }


}