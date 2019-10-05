package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=30
 */
fun main() {
    val digitPowers = Array(10) { l -> Math.pow(l.toDouble(), 5.0).toInt() }
    var result = 0
    for(i in 2..354294) {
        val sum = i.toString().map { digitPowers[it.toString().toInt()] }.sum()
        if(sum == i)
            result += sum
    }
    println(result)
}