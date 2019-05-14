package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.isPalindrome

/**
 * Solution for https://projecteuler.net/problem=4
 */
fun main() {
    println(findLargestPalindromeProductIn(1000))
}

fun findLargestPalindromeProductIn(upperBound: Long): Long? {
    var result: Long? = null

    for (i in 0 until upperBound) {
        for (j in 0 until upperBound) {
            val product = (i * j)
            if (product.isPalindrome() && (null == result || result < product))
                result = product
        }
    }

    return result
}
