package com.the43h1.diceroller

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startApp: Button = findViewById(R.id.startB)

        startApp.setOnClickListener {
            this.intent = Intent(this, page2Activity::class.java)
            startActivity(this.intent)
        }

        val gitB: Button = findViewById(R.id.github)

        gitB.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/43H1-BOI"))
//            intent.setPackage("com.android.chrome") // Or another browser package
            startActivity(intent)
        }

//        rollB.text = "Rollin' ! Changing Test of Roll Button


    }
}