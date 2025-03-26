package org.example.chapter3

import kotlin.math.PI

class ExpressionBodyFunction {
    fun circleArea(radius: Double): Double {
        return PI * radius * radius
    }
    /* 식이 본문인 함수 */
    fun circleArea2(radius: Double) = PI * radius * radius

}

fun restrictToRange(
    from: Int = Int.MIN_VALUE,
    to: Int = Int.MAX_VALUE,
    value: Int
): Int = Math.max(from, Math.min(to, value))

fun main() {
    println(restrictToRange(12, value = 1))
}