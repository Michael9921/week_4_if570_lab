package id.ac.umn.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
//            val toast = Toast.makeText(this, "Dice Rolled!",
//                Toast.LENGTH_SHORT)
//            toast.show()
//            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"

    }
    /**
     * Roll the dice and update the screen with the result.
     */
//    private fun rollDice() {
//        // Create new Dice object with 6 sides and roll it
//        val dice = Dice(6)
//        val diceRoll = dice.roll()
//
//        // Update the screen with the dice roll
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()
//        val diceImage: ImageView = findViewById(R.id.imageView)
//
//        when (diceRoll) {
//            1 -> diceImage.setImageResource(R.drawable.dice_1)
//            2 -> diceImage.setImageResource(R.drawable.dice_2)
//            3 -> diceImage.setImageResource(R.drawable.dice_3)
//            4 -> diceImage.setImageResource(R.drawable.dice_4)
//            5 -> diceImage.setImageResource(R.drawable.dice_5)
//            6 -> diceImage.setImageResource(R.drawable.dice_6)
//        }
//        diceImage.setImageResource(R.drawable.dice_2)
//
//        TODO("Not yet implemented")
//    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)
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
        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }

}