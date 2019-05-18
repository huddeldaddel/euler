package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.Fraction
import de.huddeldaddel.euler.extensions.plus
import java.math.BigInteger

fun main() {
    val fractionBuilder = FractionBuilder()
    val result = (1..1000)
            .map { Fraction(BigInteger.ONE, BigInteger.ONE) + fractionBuilder.buildFractions() }
            .filter { f -> f.numerator.toString().length > f.denominator.toString().length }
            .count()
    println(result)
}

private class FractionBuilder(private var lastFraction: Fraction = Fraction(BigInteger.ZERO, BigInteger.ONE)) {

    fun buildFractions(): Fraction {
        lastFraction = Fraction(BigInteger.ONE, BigInteger.ONE) / (BigInteger.TWO + lastFraction)
        return lastFraction
    }

}

