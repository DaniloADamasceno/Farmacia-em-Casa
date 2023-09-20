package com.kotlin.farmacia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("DEPRECATION")
class ImunologicoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imunologico)
        //?------------------------------ Descrição dos medicamentos para Febre ------------------//
        //? PRIMEIRO TEXTO DE DESCRIÇÃO

        val descricaoMedicamentoImnologicoOne =
            findViewById<TextView>(R.id.multilineTextOneImunologico)

        val multilineTextOneImunologico = """
            Neste período tão crítico, nada melhor do que manter o sistema imunológico forte, com uma alimentação saudável, prática regular de exercícios físicos, sol na medida certa e uma vida sem estresse.

            Para complementar, o uso de complexos vitamínicos traz mais energia e aparência de pele mais saudável. 
            Dois exemplos de produtos dessa categoria:
    
    """
        descricaoMedicamentoImnologicoOne.text = multilineTextOneImunologico


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)



        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {

                    Toast.makeText(this@ImunologicoActivity, "HOME selecionado", Toast.LENGTH_SHORT)
                        .show()

                    //?==> Abrir a HomeActivity
                    val intentHome = Intent(this@ImunologicoActivity, HomeActivity::class.java)
                    startActivity(intentHome)

                    true
                }

                //? ---------------------------   FEBRE   ----------------------------------------//
                R.id.nav_febre -> {
                    Toast.makeText(
                        this@ImunologicoActivity,
                        "FEBRE selecionado",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    //?==> Abrir a FebreActivity
                    val intentFebre = Intent(this@ImunologicoActivity, FebreActivity::class.java)
                    startActivity(intentFebre)

                    true
                }

                //? ---------------------------   ALERGIAS   -------------------------------------//
                R.id.nav_alergias -> {
                    Toast.makeText(
                        this@ImunologicoActivity,
                        "ALERGIAS e RESFRIADOS selecionado",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    //?==> Abrir a AlergiasResfriadosActivity
                    val intentAlergias =
                        Intent(this@ImunologicoActivity, AlergiaResfriadosActivity::class.java)
                    startActivity(intentAlergias)

                    true
                }

                //? ---------------------------   SISTEMA IMUNOLÓGICO   ---------------------------//
                R.id.nav_imunologico -> {
                    Toast.makeText(
                        this@ImunologicoActivity,
                        "SISTEMA IMUNOLÓGICO selecionado",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    //?==> Abrir a FebreActivity
                    val intentImunologico =
                        Intent(this@ImunologicoActivity, ImunologicoActivity::class.java)
                    startActivity(intentImunologico)

                    true
                }

                //? ---------------------------   CÓLICAS MENSTRUAIS   ---------------------------//
                R.id.nav_colicas -> {
                    Toast.makeText(
                        this@ImunologicoActivity,
                        "CÓLICAS MENSTRUAIS selecionado",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    //?==> Abrir a CólicasActivity
                    val intentColicas =
                        Intent(this@ImunologicoActivity, ColicasActivity::class.java)
                    startActivity(intentColicas)

                    true
                }

                else -> false
            }
        }
    }
}