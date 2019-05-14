package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.Factorizer

/**
 * Solution for https://projecteuler.net/problem=3
 */
fun main() {
    val result = mutableListOf<Long>()
    Factorizer().getPrimeFactors(600_851_475_143L, result)
    println(result[result.size - 1])
}
