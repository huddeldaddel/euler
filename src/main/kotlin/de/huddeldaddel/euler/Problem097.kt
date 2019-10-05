package de.huddeldaddel.euler

import java.math.BigInteger

/**
 * Solution for https://projecteuler.net/problem=97
 */
fun main() {
    val prime = BigInteger
            .TWO
            .pow(7830457)
            .times(BigInteger.valueOf(28433))
            .plus(BigInteger.ONE).toString()
    println(prime.substring(prime.length -10))
}