package com.example.hello

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
    
}
