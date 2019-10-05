package de.huddeldaddel.euler

import de.huddeldaddel.euler.util.ResourceLoader
import java.math.BigInteger
import kotlin.system.measureTimeMillis

/**
 * Solution for https://projecteuler.net/problem=99
 */
fun main() {
    fun computeResult(): Int {
        return ResourceLoader().loadNumbersWithExponentsAndIndex("99.txt")
                .stream().parallel()
                .map { triple -> Pair(triple.first, BigInteger.valueOf(triple.second).pow(triple.third)) }
                .max { o1, o2 -> o1.second.compareTo(o2.second) }
                .get().first
    }
    println("Finished in ${measureTimeMillis { println(computeResult()) }} milliseconds")
}


