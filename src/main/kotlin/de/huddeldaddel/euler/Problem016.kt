package de.huddeldaddel.euler

import java.math.BigInteger

/**
 * Solution for https://projecteuler.net/problem=16
 */
fun main() {
    val problem16 = Problem16()
    println(problem16.getPowerSum(1000))
}

class Problem16 {

    fun getPowerSum(exponent: Int): Int {
        val numberString = BigInteger("2").pow(exponent).toString();
        var result = 0
        for (i in numberString.map { it.toString().toInt() }) {
            result += i
        }
        return result
    }

}