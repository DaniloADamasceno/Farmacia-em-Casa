package com.kotlin.farmacia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("DEPRECATION")
class FebreActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_febre)


        //? ------------------------------ Descrição dos medicamentos para Febre -----------------//
        //? PRIMEIRO TEXTO DE DESCRIÇÃO

        val descricaoMedicamentoFebreOne = findViewById<TextView>(R.id.TextFebre)

        val multilineTextOneFebre = """
        Normalmente, a febre indica que seu corpo está lutando contra alguma anomalia.
        Então, é muito importante, depois de medir a temperatura e constatar este sintoma, procurar ajuda médica para obter um diagnóstico preciso.

        A temperatura normal varia entre 35,4ºC e 37,2ºC. Há medicamentos antitérmicos e analgésicos que podem aliviar os sintomas. Por exemplo:

          
    """
        descricaoMedicamentoFebreOne.text = multilineTextOneFebre


        //? ------------------------------   Navigation Bar   ------------------------------------//

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {

                //? --------------------------------   HOME   ------------------------------------//
                R.id.nav_home -> {
                    Toast.makeText(this@FebreActivity, "HOME selecionado", Toast.LENGTH_SHORT)
                        .show()

                    //? ==> Abrir a HomeActivity
                    val intentHome = Intent(this@FebreActivity, HomeActivity::class.java)
                    startActivity(intentHome)

                    true
                }

                //? --------------------------------   FEBRE   -----------------------------------//
                R.id.nav_febre -> {
                    Toast.makeText(this@FebreActivity, "FEBRE selecionado", Toast.LENGTH_SHORT)
                        .show()

                    //? ==> Abrir a FebreActivity
                    val intentFebre = Intent(this@FebreActivity, FebreActivity::class.java)
                    startActivity(intentFebre)

                    true
                }

                //? --------------------------------   ALERGIAS   --------------------------------//
                R.id.nav_alergias -> {
                    Toast.makeText(
                        this@FebreActivity, "ALERGIAS, GRIPES e RESFRIADOS selecionado", Toast.LENGTH_SHORT
                    )
                        .show()

                    //? ==> Abrir a AlergiasResfriadosActivity
                    val intentAlergias =
                        Intent(this@FebreActivity, AlergiaResfriadosActivity::class.java)
                    startActivity(intentAlergias)

                    true
                }

                //? --------------------------------   SISTEMA IMUNOLÓGICO   ---------------------//
                R.id.nav_imunologico -> {
                    Toast.makeText(
                        this@FebreActivity,
                        "SISTEMA IMUNOLÓGICO selecionado",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    //? ==> Abrir a ImunológicoActivity
                    val intentImunologico =
                        Intent(this@FebreActivity, ImunologicoActivity::class.java)
                    startActivity(intentImunologico)

                    true
                }

                //? --------------------------------   CÓLICAS MENSTRUAIS   ----------------------//
                R.id.nav_colicas -> {
                    Toast.makeText(
                        this@FebreActivity,
                        "CÓLICAS MENSTRUAIS selecionado",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    //?==> Abrir a CólicasActivity
                    val intentColicas = Intent(this@FebreActivity, ColicasActivity::class.java)
                    startActivity(intentColicas)

                    true
                }

                else -> false
            }
        }
    }
}