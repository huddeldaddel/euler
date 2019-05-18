package de.huddeldaddel.euler.extensions

import de.huddeldaddel.euler.math.Fraction
import java.math.BigInteger

operator fun BigInteger.plus(other: Fraction): Fraction {
    return Fraction(this, BigInteger.ONE) + other
}