package com.example.generadorperfil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        lateinit var textView: TextView

        val botonCrear = findViewById<Button>(R.id.Crear)
        val nomUsuari = findViewById<EditText>(R.id.NomUsuari)
        val correuUsuari = findViewById<EditText>(R.id.CorreuElectronic)
        val bioUsuari = findViewById<EditText>(R.id.Biografia)
        val imegenUsuari = findViewById<EditText>(R.id.URL)

        fun text() = "Nom usuari: $nomUsuari"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        botonCrear.setOnClickListener {
            val intent = Intent(this, UsuariCreat::class.java).apply {
                putExtra("NOM_USUARI", nomUsuari.text.toString())
                putExtra("CORREU_USUARI", correuUsuari.text.toString())
                putExtra("BIO_USUARI", bioUsuari.text.toString())
                putExtra("URL_USUARI", imegenUsuari.text.toString())

            }
            startActivity(intent)
        }
    }
}