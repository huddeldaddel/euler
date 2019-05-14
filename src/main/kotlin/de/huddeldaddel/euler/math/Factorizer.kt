package de.huddeldaddel.euler.math

import java.util.LinkedList

class Factorizer {

    fun getPrimeFactors(number: Long, factors: MutableCollection<Long>) {
        if (0L == number % 2) {
            factors.add(2L)
            getPrimeFactors(number / 2L, factors)
        }

        var found = false
        var l: Long = 3
        while (l * l <= number) {
            if (0L == number % l) {
                getPrimeFactors(l, factors)
                getPrimeFactors(number / l, factors)
                found = true
                break
            }
            l += 2
        }

        if (!found)
            factors.add(number)
    }

    fun getDivisors(number: Long): List<Long> {
        val factors = LinkedList<Long>()
        for (l in 1 until number)
            if (0L == number % l)
                factors.add(l)
        return factors
    }

}
