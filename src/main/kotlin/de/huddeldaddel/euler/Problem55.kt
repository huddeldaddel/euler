package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.isPalindrome
import java.math.BigInteger

/**
 * Solution for https://projecteuler.net/problem=55
 */
fun main() {
    val result = (1..10_000).map { l -> l.toBigInteger().isLychrelNumber() }.filter { b -> b } .count()
    println(result)
}

fun BigInteger.isLychrelNumber(): Boolean {
    fun addToReversed(number: BigInteger): BigInteger {
        return number + number.toString().reversed().toBigInteger()
    }

    fun isLychrelNumber(number: BigInteger, iteration: Int): Boolean {
        if(50 == iteration) {
            return true
        }
        if(number.isPalindrome()) {
            return false
        }
        return isLychrelNumber(addToReversed(number), iteration +1)
    }
    return isLychrelNumber(addToReversed(this), 1)
}