package com.kotlin.farmacia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("DEPRECATION")
class ColicasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colicas)
        //?------------------------------ Descrição dos medicamentos para Febre ------------------//
        //? PRIMEIRO TEXTO DE DESCRIÇÃO

        val descricaoMedicamentoColicaOne = findViewById<TextView>(R.id.textDescritivoColica)

        val multilineTextOneColica = """
        As cólicas menstruais acompanham a vida de muitas mulheres e podem ter seus sintomas reduzidos.

        Mas fique atenta: cólicas frequentes e uma menstruação desregulada podem ser sintomas de doenças como miomas ou fibromas — que, se identificadas logo, podem ser resolvidas de formas simples.
    Nestes casos você deve procurar um médico.

        Para cólicas menstruais esporádicas, na sua farmacinha jamais pode faltar um destes itens:

          
    """
        descricaoMedicamentoColicaOne.text = multilineTextOneColica

        //? ------------------------------   Navigation Bar   ------------------------------------//
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                //? --------------------------------   HOME   ------------------------------------//
                R.id.nav_home -> { Toast.makeText(this@ColicasActivity, "HOME selecionado", Toast.LENGTH_SHORT)
                        .show()

                    //?==> Abrir a HomeActivity
                    val intentHome = Intent(this@ColicasActivity, HomeActivity::class.java)
                    startActivity(intentHome)

                    true
                }

                //? --------------------------------   FEBRE   -----------------------------------//
                R.id.nav_febre -> { Toast.makeText(this@ColicasActivity, "FEBRE selecionado", Toast.LENGTH_SHORT)
                        .show()

                    //?==> Abrir a FebreActivity
                    val intentFebre = Intent(this@ColicasActivity, FebreActivity::class.java)
                    startActivity(intentFebre)

                    true
                }

                //? --------------------------------   ALERGIAS   --------------------------------//
                R.id.nav_alergias -> { Toast.makeText(this@ColicasActivity, "ALERGIAS, GRIPES e RESFRIADOS selecionado", Toast.LENGTH_SHORT)
                        .show()

                    //?==> Abrir a AlergiasResfriadosActivity
                    val intentAlergias = Intent(this@ColicasActivity, AlergiaResfriadosActivity::class.java)
                    startActivity(intentAlergias)

                    true
                }

                //? --------------------------------   SISTEMA IMUNOLÓGICO   ---------------------//
                R.id.nav_imunologico -> { Toast.makeText(
                        this@ColicasActivity,
                        "SISTEMA IMUNOLÓGICO selecionado",
                        Toast.LENGTH_SHORT).show()

                    //?==> Abrir a FebreActivity
                    val intentImunologico =
                        Intent(this@ColicasActivity, ImunologicoActivity::class.java)
                    startActivity(intentImunologico)

                    true
                }
                //? --------------------------------   CÓLICAS MENSTRUAIS   ----------------------//
                R.id.nav_colicas -> { Toast.makeText(
                        this@ColicasActivity,
                        "CÓLICAS MENSTRUAIS selecionado",
                        Toast.LENGTH_SHORT
                    ).show()

                    //?==> Abrir a ColicasActivity
                    val intentColicas = Intent(this@ColicasActivity, ColicasActivity::class.java)
                    startActivity(intentColicas)

                    true
                }

                else -> false
            }
        }
    }
}