package com.raditacitra.intentandactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val NAMAKU=intent.getStringExtra("NAMAKU")
        val ALAMATKU=intent.getStringExtra("ALAMATKU")
        val HOBIKU=intent.getStringExtra("HOBIKU")
        val CITACITAKU=intent.getStringExtra("CITACITAKU")
        val FOTO=intent.getStringExtra("FOTO")
        val EMAILKU=intent.getStringExtra("EMAILKU")

        tvNamaku.text = NAMAKU
        tvAlamatku.text = ALAMATKU
        tvHobiku.text = HOBIKU
        tvCitaCitaku.text = CITACITAKU
        tvEmailku.text = EMAILKU

    }
}
