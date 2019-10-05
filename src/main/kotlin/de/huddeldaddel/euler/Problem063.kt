package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=63
 */
fun main() {
    println((1..9).map { countPowerDigits(it) }.sum())
}

fun countPowerDigits(base: Int): Int {
    var result = 0
    var exp = 1
    while(exp == base.toBigInteger().pow(exp).toString().length) {
        result++
        exp++
    }
    return result
}