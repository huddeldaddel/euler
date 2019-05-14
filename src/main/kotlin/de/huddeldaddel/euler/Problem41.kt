package de.huddeldaddel.euler

import de.huddeldaddel.euler.extensions.isPandigital
import de.huddeldaddel.euler.extensions.isPrime

/**
 * Solution for https://projecteuler.net/problem=41
 */
fun main() {
    for(i in 9_999_999 downTo 1 step 2) {
        val l = i.toLong()
        if(l.isPrime() && l.isPandigital()) {
            println(l)
            return
        }
    }
}
