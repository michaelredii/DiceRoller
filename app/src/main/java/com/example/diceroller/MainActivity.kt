package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var diceImage : ImageView? = null
    var diceImage2 : ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice()}


        this.diceImage = findViewById(R.id.imageView)
        this.diceImage2 = findViewById(R.id.imageView2)

    }

    private fun rollDice(){
        val randomInt = Random(). nextInt(6)+1
        val toast=Toast.makeText(this,"Dice: $randomInt", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP,0,0)
        toast.show()
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else ->R.drawable.dice6
        }
        diceImage?.setImageResource(drawableResource)
        getRandomDiceImage()
    }
    private fun getRandomDiceImage(){
        var imageIndex :Int
        var dice = arrayOf(R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6)
        var randomInt = Random().nextInt(6)
        diceImage2?.setImageResource(dice[randomInt])

        imageIndex = randomInt + 1
        val toast = Toast.makeText(this, "Dice: $imageIndex", Toast.LENGTH_SHORT)
        toast.show()


    }



}
