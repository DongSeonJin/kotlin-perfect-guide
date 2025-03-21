package org.example.chapter3

import kotlin.math.PI

class Function {
}

fun circleArea(radius: Double): Double {
    return PI * radius * radius
}

fun main() {
    println("Enter radius: ")
    val radius = readln().toDouble()
    println("Circle area: ${circleArea(radius)}")
}