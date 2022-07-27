package com.ingenieriajhr.createlibbluetooth

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

//Definicion de las variables
var txtEtii: TextView? = null
var switchE: Switch? = null

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main2)

    //Declaracion de la variable
    //Se cambio txtEti > txtEtii.
    txtEtii = findViewById<View>(R.id.etiSeleccion) as TextView?
    switchE = findViewById<View>(R.id.idSwitch) as Switch?
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
}
