package com.example.mydiceroller

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


/*
*This activity allows the user to a roll a dice and view the result
* on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val message = Toast.makeText(this, "Dice Rolled !!", Toast.LENGTH_SHORT)
            message.show()
            rollDice()
        }
        rollDice()
    }

    /*
    *Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        //create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()
        val dice3 = Dice(6)
        val diceRoll3 = dice3.roll()

        //val diceRoll = dice.roll()  find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView2)
        val diceImage2: ImageView = findViewById(R.id.imageView3)
        val diceImage3: ImageView = findViewById(R.id.imageView4)

        /* when (diceRoll) {//인자 : 인자의 값에 따라서 조건을 판별
             //diceRoll:주사위 굘과값, 1~6사이의 정수로 나옴
             1 -> diceImage.setImageResource(R.drawable.dice_1)
             2 -> diceImage.setImageResource(R.drawable.dice_2)
             3 -> diceImage.setImageResource(R.drawable.dice_3)
             4 -> diceImage.setImageResource(R.drawable.dice_4)
             5 -> diceImage.setImageResource(R.drawable.dice_5)
             6 -> diceImage.setImageResource(R.drawable.dice_6)
         }*/
        //Determine which drawable resource Id to use based on the dice roll
        val drawableResource = when(diceRoll){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        val drawableResource2 = when(diceRoll2){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        val drawableResource3 = when(diceRoll3){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        //Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)
        diceImage3.setImageResource(drawableResource3)
    }


    class Dice(val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}























































