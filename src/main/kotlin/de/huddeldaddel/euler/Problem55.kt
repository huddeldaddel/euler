package de.huddeldaddel.euler

import java.math.BigInteger

fun main() {
    val result = (1..10_000).map { l -> l.toBigInteger().isLychrelNumber() }.filter { b -> b } .count()
    println(result)
}

fun BigInteger.isPalindrome(): Boolean {
    return this.toString() == this.toString().reversed()
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