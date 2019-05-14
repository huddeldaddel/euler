package de.huddeldaddel.euler

import de.huddeldaddel.euler.extensions.isTruncatable
import de.huddeldaddel.euler.sequences.PrimeSequence

/**
 * Solution for https://projecteuler.net/problem=37
 */
fun main() {
    var count = 0
    var sum = 0L
    var primeSequence = PrimeSequence(10)
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
