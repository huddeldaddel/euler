package de.huddeldaddel.euler

import kotlin.math.absoluteValue
import kotlin.system.measureTimeMillis

/**
 * Solution for https://projecteuler.net/problem=69
 */
fun main() {
    println("Finished in ${measureTimeMillis { calculateResult() }} milliseconds")
}

fun calculateResult() {
    var result = 1L
    var maxRatio = 1.0
    for(n in 2L..1_000_000L) {
        val ratio = n.toDouble() / phi(n, maxRatio)
        if(ratio > maxRatio) {
            result = n
            maxRatio = ratio
        }
    }
    println("The result is: $result")
}

fun greatestCommonDivisor(a: Long, b: Long): Long {
    return if(0L == b) a.absoluteValue
    else greatestCommonDivisor(b, a % b)
}

fun phi(input: Long, maxRatio: Double): Long {
    val inputAsDouble = input.toDouble()
    var result = 0L
    for(l in 1L..input) {
        val gcd = greatestCommonDivisor(l, input)
        if(gcd == 1L) {
            result++
        }
        if(inputAsDouble / result < maxRatio) {
            return -1L
        }
    }
    return result
}
