package com.the43h1.diceroller

import android.os.Bundle
import android.widget.Button
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
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rollB: Button = findViewById(R.id.roll_dice)

//        rollB.text = "Rollin' !


        rollB.setOnClickListener {
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
            rollDice()

        }


    }

    private fun rollDice() {
        val result: TextView = findViewById(R.id.result_text)

        val answer = Random.nextInt(6) + 1

        result.text = answer.toString()
    }
}