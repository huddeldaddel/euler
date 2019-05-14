package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.isTruncatable

/**
 * Solution for https://projecteuler.net/problem=37
 */
fun main() {
    var count = 0
    var sum = 0L
    var primeSequence = de.huddeldaddel.euler.math.PrimeSequence(10)
    while(count < 11) {
        val prime = primeSequence.nextValue()
        if(prime.isTruncatable()) {
            println("$prime is truncatable")
            count++
            sum += prime
        }
    }
    println("The result is $sum")
}
