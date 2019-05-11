package de.huddeldaddel.euler

import java.math.BigInteger

fun main() {
    var result = BigInteger.ZERO
    for(i in 1..1000) {
        val iAsBigInteger = BigInteger.valueOf(i.toLong())
        result = result.add(iAsBigInteger.pow(i))
    }
    val resultString = result.toString()
    println(resultString.substring(resultString.length -10))
}