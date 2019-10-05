package de.huddeldaddel.euler.extensions

import de.huddeldaddel.euler.math.Fraction
import java.math.BigInteger

operator fun BigInteger.plus(other: Fraction): Fraction {
    return Fraction(this, BigInteger.ONE) + other
}

fun BigInteger.isPrime(): Boolean {
    if (this < BigInteger.TWO)
        return false

    if (BigInteger.ZERO == this.mod(BigInteger.TWO))
        return this == BigInteger.TWO

    var l = 3.toBigInteger()
    while (l * l <= this) {
        if (BigInteger.ZERO == this.mod(l))
            return false
        l += BigInteger.TWO
    }

    return true
}
