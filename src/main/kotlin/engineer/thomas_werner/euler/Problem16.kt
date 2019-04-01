package engineer.thomas_werner.euler

import java.math.BigInteger

fun main(args: Array<String>) {
    val problem16 = Problem16()
    println(problem16.getPowerSum(1000))
}

class Problem16 {

    fun getPowerSum(exponent: Int): Int {
        val numberString = BigInteger("2").pow(exponent).toString();
        var result = 0
        for (i in numberString.map { it.toString().toInt() }) {
            result += i
        }
        return result
    }

}