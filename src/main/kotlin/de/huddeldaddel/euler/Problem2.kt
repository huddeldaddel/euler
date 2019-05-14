package de.huddeldaddel.euler

import de.huddeldaddel.euler.sequences.FibonacciSequence

/**
 * Solution for https://projecteuler.net/problem=2
 */
fun main() {
    val fibonacciSequence = FibonacciSequence()
    var f = fibonacciSequence.nextValue().toLong()
    var result: Long = 0
    while (f < 4_000_000) {
        if (0L == f % 2) {
            result += f
        }
        f = fibonacciSequence.nextValue().toLong()
    }

    println(result)
}
