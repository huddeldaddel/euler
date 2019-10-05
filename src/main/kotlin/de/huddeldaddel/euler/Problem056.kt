package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=56
 */
fun main() {
    var result = 0L
    for(num in 1..99) {
        for (exp in 1..99) {
            val powerSum = calculatePowerSum(num.toLong(), exp)
            if(powerSum > result) {
                result = powerSum
            }
        }
    }
    println(result)
}

fun calculatePowerSum(number: Long, exponent: Int): Long {
    return number.toBigInteger().pow(exponent).toString().map { c -> c.toString().toLong() }.sum()
}