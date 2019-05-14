package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.FibonacciSequence

import java.math.BigInteger
import java.util.function.Predicate

/**
 * Solution for https://projecteuler.net/problem=25
 */
fun main() {
    val problem25 = Problem25()
    println(problem25.findFibonacciIndex(Predicate { bi -> bi.toString().length >= 1000 }))
}

class Problem25 {

    fun findFibonacciIndex(predicate: Predicate<BigInteger>): Int {
        var index = 1
        val sequence = FibonacciSequence()
        while (!predicate.test(sequence.nextValue()))
            index++
        return index
    }

}
