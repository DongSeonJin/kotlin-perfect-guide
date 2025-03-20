package org.example.chapter2

class Basic{
}

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println(a + b)

    val n: Int = 100
    val test: String = "Hello"

    /* 식별자 */
    val import = "소프트 키워드인 import 를 식별자로 사용"

    //fun 은 하드 키워드 이지만 작은역따옴표 사이에는 아무 문자열이나 올 수 있다.
    val `fun` = 1

    var c = 1
    println("C는?" + c++)
    println("C는?" + ++c)

}
