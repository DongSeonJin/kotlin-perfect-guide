package org.example.chapter3

class DefaultParameter {
}

fun readInt(radix: Int = 2) = readln().toInt(radix)

fun main() {
    println("Enter a number in binary format: ")
    val binary = readInt()
    println("Your number is $binary")
}