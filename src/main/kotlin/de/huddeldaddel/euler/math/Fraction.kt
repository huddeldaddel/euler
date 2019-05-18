package de.huddeldaddel.euler.math

import java.math.BigInteger

class Fraction(val numerator: BigInteger, val denominator: BigInteger) {

    operator fun div(other: Fraction): Fraction {
        return this * Fraction(other.denominator, other.numerator)
    }

    override operator fun equals(other: Any?): Boolean {
        val o = other as Fraction
        return (numerator == o.numerator) && (denominator == o.denominator)
    }

    fun extend(targetDenominator: BigInteger): Fraction {
        val factor = targetDenominator / denominator
        return Fraction(numerator * factor, denominator * factor)
    }

    operator fun plus(other: Fraction): Fraction {
        val lcm = computeLeastCommonMultiple(this.denominator, other.denominator)
        val thisExtended = extend(lcm)
        val otherExtended = other.extend(lcm)
        return Fraction(thisExtended.numerator + otherExtended.numerator, thisExtended.denominator)
    }

    fun reduce(): Fraction {
        var resultNumerator = numerator
        var resultDenominator = denominator
        var divisor = computeGreatestCommonDivisor(resultNumerator, resultDenominator)
        while(BigInteger.ONE != divisor) {
            resultNumerator /= divisor
            resultDenominator /= divisor
            divisor = computeGreatestCommonDivisor(resultNumerator, resultDenominator)
        }
        return Fraction(resultNumerator, resultDenominator)
    }

    operator fun times(other: Fraction): Fraction {
        return Fraction(numerator * other.numerator, denominator * other.denominator).reduce()
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    companion object {

        fun computeGreatestCommonDivisor(a: BigInteger, b: BigInteger): BigInteger {
            return if(BigInteger.ZERO == b) a.abs()
            else computeGreatestCommonDivisor(b, a % b)
        }

        fun computeLeastCommonMultiple(a: BigInteger, b: BigInteger): BigInteger {
            val gcd = computeGreatestCommonDivisor(a, b)
            return a / gcd * b
        }

    }

}