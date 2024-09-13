package com.example.myapplication

fun main() {




    data class Vegetable(val name: String, val age: Int, val originCountry: String) {


    }
    val w1 = Vegetable("Tomato", 10, "Spain")
    val w2 = Vegetable("Cabbage", 3, "Japan")
    val w3 = Vegetable("Cucumber", 11, "Great Britain")
    val warzywa = mutableListOf(w1, w2, w3)
    for (Vegetable in warzywa) {
        println(Vegetable.name)

    }
    val najstarsze = warzywa.maxBy { it.age }
    println(najstarsze)
    for (Vegetable in warzywa){
        println("${Vegetable.name} pochodzi z ${Vegetable.originCountry} i ma ${Vegetable.age} lat ")

    }
}