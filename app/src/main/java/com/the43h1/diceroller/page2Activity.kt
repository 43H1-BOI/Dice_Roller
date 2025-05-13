package com.the43h1.diceroller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)


        val d6 : Button = findViewById<Button>(R.id.d6Button)

        d6.setOnClickListener {
            this.intent = Intent(this, D6Activity::class.java)
            startActivity(this.intent)
        }

    }
}