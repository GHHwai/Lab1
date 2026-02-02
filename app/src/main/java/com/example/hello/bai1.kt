package com.example.hello

//class Dice {
//    var sides = 6
//
//    fun roll() {
//        val randomNumber = (1..6).random()
//        println(randomNumber)
//    }
//}
class Dice (val numSides: Int) {
    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}
val myFirstDice = Dice(6)
fun main() {
    println("Hello, world!")
    println("This is the text to print!")
    // This is a comment line.
    // This is another comment.
    // Assign once, cannot change.
    val age = "5"
    val name = "Rover"

    // Assign and change as needed.
    var roll = 6
    var rolledValue: Int = 4
    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}!")
//    Int       // Whole positive and negative numbers and zero
//    String    // Piece of text between quotes
//    IntRange  // Setting a range such as 1..6
//    Boolean   // Can only be true or false
    // Define the function.
    fun printHello () {
        println ("Hello Kotlin")
    }

    // Call the function.
    printHello()
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }
//    *     // multiplication
//    /     // division
//    +     // addition
//    -     // subtraction
//    =     // assignment
//    >    // greater than
//    <    // less than
//    ==   // equal
//    >=   // greater or equal
//    <=   // less or equal
//    !=   // not equal
    val diceRange = 1..6
    val randomNumber = diceRange.random()

    fun rollRand() {
        val anotherRandomNumber = (1..6).random()
        println(randomNumber)
    }
    fun printBorder() {
        repeat(23) {
            print("=")
        }
    }
    fun printCakeBottom(age: Int, layers: Int) {
        repeat(layers) {
            repeat(age + 2) {
                print("@")
            }
            println()
        }
    }
    fun main() {
        val num = 4
        if (num > 4) {
            println("The variable is greater than 4")
        } else if (num == 4) {
            println("The variable is equal to 4")
        } else {
            println("The variable is less than 4")
        }
    }
    val rollResult=roll()
    val luckyNumber=4
    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }
    // Determine which drawable resource ID to use based on the dice roll.
//    val drawableResource = when (diceRoll) {
//        1 -> R.drawable.dice_1
//        2 -> R.drawable.dice_2
//        3 -> R.drawable.dice_3
//        4 -> R.drawable.dice_4
//        5 -> R.drawable.dice_5
//        else -> R.drawable.dice_6
//    }
}
