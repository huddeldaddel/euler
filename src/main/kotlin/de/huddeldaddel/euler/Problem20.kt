package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.FactorialFactory

fun main(args: Array<String>) {
    var problem20 = Problem20()
    println(problem20.getFactorialDigitSum(100))
}

class Problem20 {

    fun getFactorialDigitSum(fac: Int): Int {
        var result = 0
        for (i in FactorialFactory().build(fac).toString().map { it.toString().toInt() }) {
            result += i
        }
        return result
    }

}