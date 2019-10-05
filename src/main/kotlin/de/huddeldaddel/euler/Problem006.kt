package de.huddeldaddel.euler

import kotlin.math.abs

/**
 * Solution for https://projecteuler.net/problem=6
 */
fun main() {
    val problem6 = Problem6()
    val result = abs(problem6.getSumOfSquares(100) - problem6.getSquareOfSums(100))
    println(result)
}

class Problem6 {

    fun getSumOfSquares(limit: Int): Long {
        var result: Long = 0
        for (i in 1..limit)
            result += (i * i).toLong()
        return result
    }

    fun getSquareOfSums(limit: Int): Long {
        var sum: Long = 0
        for (i in 1..limit)
            sum += i.toLong()
        return sum * sum
    }

}
