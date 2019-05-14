package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=34
 */
fun main() {
    val factorials = getFactorials()
    var sum = 0L
    for(i in 3..5_000_000) {
        var digitFactorialSum = i.toString().map { factorials[it.toString().toInt()] }.sum()
        if(i == digitFactorialSum) {
            println(i)
            sum += i
        }
    }
    println(sum)
}

fun getFactorials(): List<Int> {
    return listOf(1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880)
}
