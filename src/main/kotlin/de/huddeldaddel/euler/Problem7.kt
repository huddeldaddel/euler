package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.PrimeSequence

/**
 * Solution for https://projecteuler.net/problem=7
 */
fun main() {
    println(Problem7().getPrimeNumber(10001))
}

class Problem7 {

    fun getPrimeNumber(num: Int): Long {
        val primeSequence = PrimeSequence()
        for (i in 1 until num)
            primeSequence.nextValue()
        return primeSequence.nextValue()
    }

}
