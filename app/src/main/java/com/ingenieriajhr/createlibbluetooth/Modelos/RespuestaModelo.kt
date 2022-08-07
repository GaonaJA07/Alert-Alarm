package com.ingenieriajhr.createlibbluetooth.Modelos

import UsuarioModelo
import com.google.gson.annotations.SerializedName
import java.util.*

data class RespuestaModelo(
    @SerializedName("contenido") var Contenido: List<UsuarioModelo>,
    @SerializedName("estado") var Estado: String,
    @SerializedName("error") var Error: String
)
