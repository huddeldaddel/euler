package de.huddeldaddel.euler

import de.huddeldaddel.euler.sequences.PentagonalNumberSequence
import kotlin.math.absoluteValue
import kotlin.system.exitProcess

/**
 * Solution for https://projecteuler.net/problem=44
 */
fun main() {
    val sequence = PentagonalNumberSequence()
    val pentagonals = (1..10_000).map{ sequence.getNext() }
    for(i in 0 until 10_000) {
        for (j in 0 until 10_000) {
            if(isResult(i, j, pentagonals)) {
                exitProcess(0)
            }
        }
    }
}

fun isResult(i: Int, j: Int, list: List<Long>): Boolean {
    return if (i == j) {
        false
    } else {
        val sum = list[i] + list[j]
        val dif = list[j] - list[i]
        if (list.contains(sum) && list.contains(dif)) {
            println(dif.absoluteValue)
            true
        } else {
            false
        }
    }
}