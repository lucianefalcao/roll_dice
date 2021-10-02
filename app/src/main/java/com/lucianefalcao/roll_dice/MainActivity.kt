package com.lucianefalcao.roll_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rollDice(view: View) {
        val diceNumber = findViewById<TextView>(R.id.dice)
        diceNumber.text = (1..6).random().toString()
    }
}