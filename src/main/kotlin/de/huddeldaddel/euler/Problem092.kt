package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=92
 */
fun main() {
    val result = (1L until 10_000_000L)
            .map { it.getSquareDigitChain() }
            .filter { it.contains(89L) }
            .count()
    println(result)
}

fun Long.getSquareDigit(): Long {
    var result = 0L
    this.toString().forEach { c -> run {
        val digit = c.toString().toInt()
        result += digit * digit
    } }
    return result
}

fun Long.getSquareDigitChain(): List<Long> {
    val result = mutableListOf(this)
    var squareDigit = this.getSquareDigit()
    while(!result.contains(squareDigit)) {
        result.add(squareDigit)
        squareDigit = squareDigit.getSquareDigit()
    }
    result.add(squareDigit)
    return result
}