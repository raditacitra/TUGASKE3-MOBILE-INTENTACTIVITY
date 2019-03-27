package com.raditacitra.intentandactivity

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindahActivityExplisit.setOnClickListener{
            startActivity(Intent(this, ExplisitIntentActivity::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener{
            startActivity(Intent(this, ImplisitIntentActivity::class.java))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
           val intent:Intent = Intent(this, IntentBundleActivity::class.java)
            intent.putExtra("NAMAKU", "Radita Citra")
            intent.putExtra("ALAMATKU", "Semarang")
            intent.putExtra("HOBIKU", "Eat,Sleep")
            intent.putExtra("CITACITAKU", "PROGRAMMER")
            intent.putExtra("FOTO", R.drawable.pi1)
            intent.putExtra("EMAILKU", "citraraditha@gmail.com")
            startActivity(intent)
        }

    }
}
