package com.kotlin.farmacia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("DEPRECATION")
class AlergiaResfriadosActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alergia_resfriados)

        val descricaoMedicamentoGripe = findViewById<TextView>(R.id.multiTextoGripe)

        val multilineTextGripe = """
        Para quem sofre com resfriados, gripes e alergias, comuns sobretudo nas épocas mais frias do ano, alguns remédios podem minimizar os sintomas:
    
                
                
    """
        descricaoMedicamentoGripe.text = multilineTextGripe
        //? ------------------------------   Navigation Bar   ------------------------------------//

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {

                //? --------------------------------   HOME   ------------------------------------//
                R.id.nav_home -> {
                    Toast.makeText(this@AlergiaResfriadosActivity, "HOME selecionado", Toast.LENGTH_SHORT)
                        .show()

                    //? ==> Abrir a HomeActivity
                    val intentHome = Intent(this@AlergiaResfriadosActivity, HomeActivity::class.java)
                    startActivity(intentHome)

                    true
                }

                //? --------------------------------   FEBRE   -----------------------------------//
                R.id.nav_febre -> {
                    Toast.makeText(this@AlergiaResfriadosActivity, "FEBRE selecionado", Toast.LENGTH_SHORT)
                        .show()

                    //? ==> Abrir a FebreActivity
                    val intentFebre = Intent(this@AlergiaResfriadosActivity, FebreActivity::class.java)
                    startActivity(intentFebre)

                    true
                }

                //? --------------------------------   ALERGIAS   --------------------------------//
                R.id.nav_alergias -> {
                    Toast.makeText(
                        this@AlergiaResfriadosActivity, "ALERGIAS, GRIPES e RESFRIADOS selecionado", Toast.LENGTH_SHORT
                    )
                        .show()

                    //? ==> Abrir a AlergiasResfriadosActivity
                    val intentAlergias =
                        Intent(this@AlergiaResfriadosActivity, AlergiaResfriadosActivity::class.java)
                    startActivity(intentAlergias)

                    true
                }

                //? --------------------------------   SISTEMA IMUNOLÓGICO   ---------------------//
                R.id.nav_imunologico -> {
                    Toast.makeText(
                        this@AlergiaResfriadosActivity,
                        "SISTEMA IMUNOLÓGICO selecionado",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    //? ==> Abrir a ImunológicoActivity
                    val intentImunologico =
                        Intent(this@AlergiaResfriadosActivity, ImunologicoActivity::class.java)
                    startActivity(intentImunologico)

                    true
                }

                //? --------------------------------   CÓLICAS MENSTRUAIS   ----------------------//
                R.id.nav_colicas -> {
                    Toast.makeText(
                        this@AlergiaResfriadosActivity,
                        "CÓLICAS MENSTRUAIS selecionado",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    //?==> Abrir a CólicasActivity
                    val intentColicas = Intent(this@AlergiaResfriadosActivity, ColicasActivity::class.java)
                    startActivity(intentColicas)

                    true
                }

                else -> false
            }
        }
    }
}