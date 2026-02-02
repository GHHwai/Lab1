package com.example.hello
//package com.example.affirmations.model
//import kotlin.math.PI
//kotlin.math.PI * radius * radius
//
//abstract class Dwelling() {
//}
//abstract class Dwelling() {
//    abstract val buildingMaterial: String
//}
//abstract class Dwelling() {
//    abstract fun floorArea(): Double
//}
//open class RoundHut(residents: Int) {
//}
//class SquareCabin : Dwelling()
//override fun floorArea(): Double {
//}
//override fun floorArea(): Double {
//    return super.floorArea() * floors
//}
fun main (){
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.size)
    println(numbers[0])
    println(listOf("red", "blue", "green").reversed())
    val entrees = mutableListOf<String>()
    entrees.add("spaghetti")
    entrees[0] = "lasagna"
    entrees.remove("lasagna")
    val myList=entrees
    for (element in myList) {
        // Perform an operation with each item
        println(element)
    }
    var index = 0
    while (index < myList.size) {
        println(myList[index])
        index++
    }
    val name = "Android"
    println(name.length)
    val number = 10
    println("$number people")
    val groups = 5
    println("${number * groups} people")
//    a += b   // a = a + b
//    a -= b   // a = a - b
//    a *= b   // a = a * b
//    a /= b   // a = a / b
//    with(squareCabin) {
//        println("Capacity: ${capacity}")
//        println("Material: ${buildingMaterial}")
//        println("Has room? ${hasRoom()}")
//    }
//    val stringInTextField = binding.costOfService.text.toString()
//    fun addToppings(vararg val toppings: String)
}


