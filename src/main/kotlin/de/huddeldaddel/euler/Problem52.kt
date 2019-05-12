package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.isPermutationOf
import kotlin.system.exitProcess

fun main() {
    var base = 1L
    var num = base
    while(true) {
        while(num.toString().startsWith("1")) {
            if(num.isPermutationOf(num * 2) &&
                    num.isPermutationOf(num * 3) &&
                    num.isPermutationOf(num * 4) &&
                    num.isPermutationOf(num * 5) &&
                    num.isPermutationOf(num * 6)) {
                println(num)
                exitProcess(0)
            }
            num ++
        }
        base *= 10
        num = base
    }

}