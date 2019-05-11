package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.isPandigital
import de.huddeldaddel.euler.math.isPrime

fun main() {
    for(i in 9_999_999 downTo 1 step 2) {
        val l = i.toLong()
        if(l.isPrime() && l.isPandigital()) {
            println(l)
            return
        }
    }
}
