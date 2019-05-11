package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.PrimeSequence
import de.huddeldaddel.euler.math.isPermutationOf
import kotlin.system.exitProcess

fun main() {
    val primes = get4DigitPrimes()
    for(i in 0 until primes.size -1) {
        for(j in (i + 1) until primes.size) {
            val first = primes[i]
            val second = primes[j]
            val third = second + second - first
            if(primes.contains(third) && third.isPermutationOf(second) && third.isPermutationOf(first)) {
                println("$first$second$third")
            }
        }
    }
}

fun get4DigitPrimes(): List<Long> {
    val result = mutableListOf<Long>()
    val primeSequence = PrimeSequence(999)
    var prime = primeSequence.nextValue()
    while(prime < 10_000) {
        result.add(prime)
        prime = primeSequence.nextValue()
    }
    return result
}
