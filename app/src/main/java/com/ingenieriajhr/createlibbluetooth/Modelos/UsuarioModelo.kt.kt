import com.google.gson.annotations.SerializedName

data class UsuarioModelo(
    //@Seriziable ayuda a que deba ser el mismo nombre que obtendremos como respuesta del JSON
    @SerializedName("nombre") var nombre: String,
    @SerializedName("correo") var correo: String,
    @SerializedName("edad") var edad:Int
    )