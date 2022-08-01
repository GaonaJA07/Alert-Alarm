package com.ingenieriajhr.createlibbluetooth.Modelos

import com.google.gson.annotations.SerializedName
import java.util.*

data class RespuestaModelo(
    @SerializedName("Contenido") var Contenido: List<Objects>,
    @SerializedName("Estado") var Estado: String,
    @SerializedName("Error") var Error: String
)
