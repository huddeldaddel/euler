package de.huddeldaddel.euler

import de.huddeldaddel.euler.sequences.PrimeSequence

/**
 * Solution for https://projecteuler.net/problem=35
 */
fun main() {
    var result = 0
    val primes = PrimeSequence()
    var prime = primes.nextValue()
    while(prime < 1_000_000) {
        if(prime.isCircularPrime())
            result++
        prime = primes.nextValue()
    }
    println(result)
}

fun Long.isCircularPrime(): Boolean {
    var input = this.toString()
    for(i in 0 until input.length) {
        if(!PrimeSequence.isPrime(input.toLong()))
            return false
        input = input.substring(1) + input[0]
    }
    return true
}

