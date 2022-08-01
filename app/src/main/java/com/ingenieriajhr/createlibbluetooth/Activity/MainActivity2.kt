package com.ingenieriajhr.createlibbluetooth.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ingenieriajhr.createlibbluetooth.Interfaces.UsuarioInterface
import com.ingenieriajhr.createlibbluetooth.Modelos.RespuestaModelo
import com.ingenieriajhr.createlibbluetooth.R
import com.ingenieriajhr.createlibbluetooth.Servicios.UsuarioServicio
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.create

class MainActivity2 : AppCompatActivity() {

//Definicion de las variables
var txtEtii: TextView? = null
var switchE: Switch? = null

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main2)

    //Declaracion de la variable
    txtEtii = findViewById<View>(R.id.etiSeleccion) as TextView?
    switchE = findViewById<View>(R.id.idSwitch) as Switch?

    x(1)
}

    fun onclick(view: View) {
        if (view.id == R.id.idSwitch) {

            //cejemplovmdkvmdd


            //Es checar si esta activo la Opcion.
                if (switchE!!.isChecked) {
                    txtEtii!!.text = "Fue activado"
                    //Enviar a otro activity , al momento que se encuentre activo el bluetooth.
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    ////Aqui va ir el proceso si se llegara activar el bluetooth
                } else {
                    txtEtii!!.text = "Fue desactivado"
                    //Aqui va ir el proceso si se llegara activar el bluetooth
                }
        }
    }

    private fun x(idUsuario:Int) {
        // CoroutineScope(Dispatchers.IO).launch{} hará que lo que esté dentro de esas llaves de genere en un hilo asíncrono.
        CoroutineScope(Dispatchers.IO).launch {
            val usuario = UsuarioServicio()

            val servicio = usuario.obtenerUsuario() //se hace la petición
                .create(UsuarioInterface::class.java)
                .ObtenerUsuarioInterface()

            if(servicio == null){
                println("error jaja .....................")
            }

            if (servicio.isSuccessful) {
                var datos = servicio.body()
                println("$datos" + "jjjjjjjjjjjjjjjjjjjjjjjjjjjjj")
                println("jajaja")
            }else{
                println("jijiji")
            }
        }
    }

}
