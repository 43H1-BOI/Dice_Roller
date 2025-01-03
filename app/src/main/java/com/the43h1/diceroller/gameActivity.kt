package com.the43h1.diceroller

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.the43h1.diceroller.*
import kotlin.random.Random

class gameActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game)



        val rollB: Button = findViewById(R.id.roll_dice)

//        rollB.text = "Rollin' ! Changing Test of Roll Button


        rollB.setOnClickListener {
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
            rollDice()

        }

        diceImage = findViewById(R.id.dice_image)


        // Functionality for Github Button
        val gitB: Button = findViewById(R.id.github)

        gitB.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/43H1-BOI"))
//            intent.setPackage("com.android.chrome") // Or another browser package
            startActivity(intent)
        }
    }

    private fun rollDice() {
        // Code for Random Number
//        val result: TextView = findViewById(R.id.result_text)
//        val answer = Random.nextInt(6) + 1
//        result.text = answer.toString()

        val answer = Random.nextInt(6) + 1

        val drawableRes = when (answer) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

//        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableRes)

    }
    }
}