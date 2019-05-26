package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.FactorialFactory
import java.math.BigInteger

/**
 * Solution for https://projecteuler.net/problem=53
 */
fun main() {
    var result = 0
    for(n in 1..100) {
        for(r in 1..n) {
            val numberOfPossibleSelections = computePossibleSelections(n, r)
            if(BigInteger.valueOf(1_000_000L) < numberOfPossibleSelections) {
                result++
            }
        }
    }
    println(result)
}

fun computePossibleSelections(n: Int, r: Int): BigInteger {
    val factory = FactorialFactory()
    val nFactorial = factory.build(n)
    val rFactorial = factory.build(r)
    val nMinusRFactorial = factory.build(n - r)
    return nFactorial / (rFactorial * nMinusRFactorial)
}
