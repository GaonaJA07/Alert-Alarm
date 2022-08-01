package com.ingenieriajhr.createlibbluetooth.Interfaces

import UsuarioModelo
import com.ingenieriajhr.createlibbluetooth.Modelos.RespuestaModelo
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

    /*
        *siempre que queramos hacer llamadas en segundo plano
        *usando corrutinas tendremos que añadir "suspend" para que funcione nuestro código.
    */
interface UsuarioInterface {
    @GET("api/RegistroMostrarUsuario")
     suspend fun ObtenerUsuarioInterface() :Response<RespuestaModelo>
}