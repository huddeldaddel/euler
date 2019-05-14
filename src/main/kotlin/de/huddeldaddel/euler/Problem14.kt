package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.CollatzSequence

/**
 * Solution for https://projecteuler.net/problem=14
 */
fun main() {
    println(Problem14().result)
}

class Problem14 {

    val result: Long
        get() {
            var startNumber = 0
            var maxSequenceLength: Long = 0
            for (i in 1..999999) {
                val sequenceLength = CollatzSequence.getLength(i.toLong()).toLong()
                if (sequenceLength > maxSequenceLength) {
                    maxSequenceLength = sequenceLength
                    startNumber = i
                }
            }

            return startNumber.toLong()
        }

}
