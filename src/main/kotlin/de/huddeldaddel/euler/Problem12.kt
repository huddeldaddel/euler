package de.huddeldaddel.euler

import de.huddeldaddel.euler.sequences.TriangularNumberSequence

/**
 * Solution for https://projecteuler.net/problem=12
 */
fun main() {
    Problem12().printResult()
}

class Problem12 {

    fun printResult() {
        val triangularNumberSequence = TriangularNumberSequence()
        var triangularNumber = triangularNumberSequence.nextValue()
        while(500 >= getDivisorCount(triangularNumber)) {
            triangularNumber = triangularNumberSequence.nextValue()
        }
        println(triangularNumber)
    }

    companion object {

        fun getDivisorCount(number: Long): Int {
            var result = 0
            for(i in 1..number) {
                if(0L == number % i) {
                    result++
                }
            }
            return result
        }
    }

}
