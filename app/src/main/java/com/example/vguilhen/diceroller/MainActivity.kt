package com.example.vguilhen.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vguilhen.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnPlayActivity.setOnClickListener { rollDice() }
    }

    //ROLL THE DICE AND UPDATE THE SCREEN WITH THE RESULT.
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Find the ImageView in the layout
        val diceImage = binding.imageViewActivity
        val updateTextView = binding.result
        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)
        // Update the content description *PARA LEITORES DE TELA!
        diceImage.contentDescription = diceRoll.toString()
        // Update textView
        updateTextView.text = diceRoll.toString()
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }


}