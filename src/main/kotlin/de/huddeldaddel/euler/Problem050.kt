package de.huddeldaddel.euler

import de.huddeldaddel.euler.sequences.PrimeSequence
import de.huddeldaddel.euler.extensions.isPrime

/**
 * Solution for https://projecteuler.net/problem=50
 */
fun main() {
    val upperLimit = 1_000_000L
    val primes = getPrimes(upperLimit)

    var result = listOf<Long>()
    for(i in 0 until primes.size) {
        val longestSequence = getLongestSequence(i, primes)
        if(longestSequence.size > result.size)
            result = longestSequence
    }

    println(result.sum())
}

fun getLongestSequence(startIndex: Int, primes: List<Long>): List<Long> {
    var highestHit = startIndex
    for(i in startIndex until primes.size) {
        val sum = primes.subList(startIndex, i).sum()
        if(sum >= 1_000_000) {
            break
        }
        if(sum.isPrime()) {
            highestHit = i
        }
    }
    return primes.subList(startIndex, highestHit)
}

fun getPrimes(upperLimit: Long): List<Long> {
    val result = mutableListOf<Long>()
    val primeSequence = PrimeSequence()
    var prime = primeSequence.nextValue()
    while(prime < upperLimit) {
        result.add(prime)
        prime = primeSequence.nextValue()
    }
    return result
}