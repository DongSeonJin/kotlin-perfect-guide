package org.example.chapter3

import kotlin.math.PI

class ExpressionBodyFunction {
    fun circleArea(radius: Double): Double {
        return PI * radius * radius
    }
    /* 식이 본문인 함수 */
    fun circleArea2(radius: Double) = PI * radius * radius
}