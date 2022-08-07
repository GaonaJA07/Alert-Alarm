import com.google.gson.annotations.SerializedName
import java.util.*

data class UsuarioModelo(
    //@Seriziable ayuda a que deba ser el mismo nombre que obtendremos como respuesta del JSON
    @SerializedName("idUsuario") var idUsuario: Int,
    @SerializedName("nombre") var nombre: String,
    @SerializedName("edad") var edad:Int,
    @SerializedName("correo") var correo: String,
    @SerializedName("sensors") var sensors: List<Objects>,
    )