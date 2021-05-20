package com.prueba.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        var stringOperacion = ""

        if (bundle != null) {
            val texto = bundle.getString("valor")
            txtTexto.text = texto

            val valor2 = bundle.getString("valor2")
            Toast.makeText(this, valor2, Toast.LENGTH_SHORT).show()

            /*val valor3 = bundle.getString("valor3")

            if (valor3 != null){
                Toast.makeText(this, valor3, Toast.LENGTH_SHORT).show()
            }*/

            /*val valor3 = bundle.getString("valor3","No hay valor")
            Toast.makeText(this, valor3, Toast.LENGTH_SHORT).show()*/

            stringOperacion = valor2.toString()
        }

        btnRegresar.setOnClickListener {
            val intent: Intent = Intent()
            val primervalor = valorA.text.toString().toInt()
            val segundovalor = valorB.text.toString().toInt()
            var resultado = 0

            if (stringOperacion.equals("Suma")) {
                resultado = primervalor + segundovalor

            } else if (stringOperacion.equals("Resta")) {
                resultado = primervalor - segundovalor

            } else if (stringOperacion.equals("Multiplicacion")) {
                resultado = primervalor * segundovalor

            } else if(stringOperacion.equals("Division")) {
                resultado = primervalor / segundovalor

            } else {
                resultado = 0
            }

            val resultadoString = resultado.toString()

            intent.putExtra("resultado1", resultadoString)
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}