package de.huddeldaddel.euler

import de.huddeldaddel.euler.extensions.isPermutationOf
import kotlin.system.exitProcess

/**
 * Solution for https://projecteuler.net/problem=52
 */
fun main() {
    var base = 1L
    var num = base
    while(true) {
        while(num.toString().startsWith("1")) {
            if(isMatch(num)) {
                println(num)
                exitProcess(0)
            }
            num ++
        }
        base *= 10
        num = base
    }
}

fun isMatch(num: Long): Boolean {
    return num.isPermutationOf(num * 2) &&
           num.isPermutationOf(num * 3) &&
           num.isPermutationOf(num * 4) &&
           num.isPermutationOf(num * 5) &&
           num.isPermutationOf(num * 6)
}