package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.PrimeSequence

/**
 * Solution for https://projecteuler.net/problem=10
 */
fun main() {
    println(Problem10().result)
}

class Problem10 {

    val result: Long
        get() {
            var result: Long = 0
            var prime: Long
            val primeSequence = PrimeSequence()
            prime = primeSequence.nextValue()
            while (prime < 2000000) {
                result += prime
                prime = primeSequence.nextValue()
            }
            return result
        }

}
