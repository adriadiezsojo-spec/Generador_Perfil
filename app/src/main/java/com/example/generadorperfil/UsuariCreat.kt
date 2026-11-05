package com.example.generadorperfil

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton

class UsuariCreat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_usuari_creat)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val textNom = findViewById<TextView>(R.id.NombreUC)
//        val nom = intent.getStringExtra("NOM_USUARI") ?: "Desconegut"
//        textNom.text = "Nom usuari: $nom"
        val imageView = findViewById<ImageView>(R.id.imageView)
        val nom = findViewById<TextView>(R.id.NombreUC)
        val correu = findViewById<TextView>(R.id.CorreuUC)

        intent.getStringExtra("NOM_USUARI").apply { nom.text= "$this" }
        intent.getStringExtra("CORREU_USUARI").apply { correu.text= "$this" }
//        intent.getStringExtra("BIO_USUARI".apply { bio.text= "$this" })

        Glide.with(imageView)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/132.png")
            .into(imageView)
    }
}