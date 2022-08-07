package com.ingenieriajhr.createlibbluetooth.Servicios

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class UsuarioServicio {

    fun okHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30,TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build()
    }

    fun obtenerUsuario(): Retrofit {
            val x = Retrofit.Builder()
                .baseUrl("http://192.168.0.16:9095/")
                .client(okHttpClient())
                .addConverterFactory(GsonConverterFactory.create()) //hará el trabajo de recuperar el JSON y pasarlo a  tipo RespuestaModelo
                .build()

        if (x == null) {
            println("jajaj es nulo")
            return x
        }
        return x
    }
}