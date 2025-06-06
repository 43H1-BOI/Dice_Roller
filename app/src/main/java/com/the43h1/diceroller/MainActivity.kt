package com.the43h1.diceroller

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startApp: Button = findViewById(R.id.startB)

        startApp.setOnClickListener {
            Intent(this, Page2Activity::class.java).also {
                startActivity(it)
            }
        }

        val gitB: Button = findViewById(R.id.github)

        gitB.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, "https://github.com/43H1-BOI".toUri()).also {
//            intent.setPackage("com.android.chrome") // Or another browser package
                startActivity(it)
            }
        }

//        rollB.text = "Rollin' ! Changing Test of Roll Button


    }

    // Created All below Function for Learning Activity Lifecycle of Android
    override fun onRestart() {
        super.onRestart()
        println("onRestart()")
    }

    override fun onResume() {
        super.onResume()
        println("onResume()")
    }

    override fun onPause() {
        super.onPause()
        println("onPause()")
    }

    override fun onStop() {
        super.onStop()
        println("onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy()")
    }

    override fun onStart() {
        super.onStart()
        println("onStart()")
    }
}