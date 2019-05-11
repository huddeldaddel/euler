package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.getPrimeFactors
import de.huddeldaddel.euler.math.isPrime

fun main() {
    val problem47 = Problem47(4)
    println(problem47.findSequence())
}

class Problem47(private val sequenceLength: Int) {

    fun findSequence(): Long {
        var start = 2L
        var longRange = buildLongRange(start)
        while(containsPrimes(longRange) || !isNonPrimeSequenceWithDistinctFactors(longRange)) {
            longRange = buildLongRange(++start)
        }
        return start
    }

    private fun buildLongRange(start: Long): LongRange {
        return start until start + sequenceLength
    }

    private fun containsPrimes(longRange: LongRange): Boolean {
        return longRange.any { l->l.isPrime() }
    }

    private fun isNonPrimeSequenceWithDistinctFactors(longRange: LongRange): Boolean {
        return sequenceLength * sequenceLength == longRange.map { l -> l.getPrimeFactors().size }.sum()
    }

}