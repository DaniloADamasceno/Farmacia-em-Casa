package com.kotlin.farmacia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.core.content.ContextCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //?------------------------   Buttons and their invocations --------------------------------

        val buttonFebre = findViewById<ImageButton>(R.id.imageFebreButton)
        val buttonAlergias = findViewById<ImageButton>(R.id.imageResfriadoButton)
        val buttonSistemaImunologico = findViewById<ImageButton>(R.id.imageSistemaImunologicoButton)
        val buttonColica = findViewById<ImageButton>(R.id.imageColicaButton)

        //? ==> FEBRE
        buttonFebre.setOnClickListener {
            goFebrePage()
        }

        //? ==> ALERGIAS E GRIPE
        buttonAlergias.setOnClickListener {
            goAlergiasGripesPage()
        }

        //? ==> SISTEMA IMUNOLÓGICO
        buttonSistemaImunologico.setOnClickListener {
            goSistemaImunologicoPage()
        }

        //? ==> CÓLICA MENSTRUAL
        buttonColica.setOnClickListener {
            goColicaPage()
        }
    }



    //? --------------------------------   Functions   -------------------------------------------//

    //? CÓLICA MENSTRUAL
    private fun goColicaPage() {
        val colicasPage = Intent(this, ColicasActivity::class.java)
        ContextCompat.startActivity(this, colicasPage, null)
    }

    //? SISTEMA IMUNOLÓGICO
    private fun goSistemaImunologicoPage() {
        val sistemaImunologicoPage = Intent(this, ImunologicoActivity::class.java)
        ContextCompat.startActivity(this, sistemaImunologicoPage, null)
    }

    //? ALERGIAS E GRIPE
    private fun goAlergiasGripesPage() {
        val alergiasResfriadosPage = Intent(this, AlergiaResfriadosActivity::class.java)
        ContextCompat.startActivity(this, alergiasResfriadosPage, null)
    }

    //? FEBRE
    private fun goFebrePage() {
        val febrePage = Intent(this, FebreActivity::class.java)
        ContextCompat.startActivity(this, febrePage, null)
    }
}
