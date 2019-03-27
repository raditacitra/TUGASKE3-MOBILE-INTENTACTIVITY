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
            val phoneNumber = "081327783279"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

    }
}
