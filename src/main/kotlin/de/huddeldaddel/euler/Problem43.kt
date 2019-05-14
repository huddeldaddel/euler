package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.Permutator

/**
 * Solution for https://projecteuler.net/problem=43
 */
fun main() {
    val result = Permutator()
            .getPermutations("0123456789")
            .filter { s -> isSpecial(s) }
            .map { s -> s.toLong() }
            .sum()
    println(result)
}

fun isSpecial(number: String): Boolean {
    val r1 = number.substring(1..3).toInt() % 2
    val r2 = number.substring(2..4).toInt() % 3
    val r3 = number.substring(3..5).toInt() % 5
    val r4 = number.substring(4..6).toInt() % 7
    val r5 = number.substring(5..7).toInt() % 11
    val r6 = number.substring(6..8).toInt() % 13
    val r7 = number.substring(7..9).toInt() % 17
    return (0 == r1) && (0 == r2) && (0 == r3) && (0 == r4) && (0 == r5) && (0 == r6) && (0 == r7)
}