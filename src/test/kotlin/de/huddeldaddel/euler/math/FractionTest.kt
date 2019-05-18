package de.huddeldaddel.euler.math

import de.huddeldaddel.euler.math.Fraction.Companion.computeGreatestCommonDivisor
import de.huddeldaddel.euler.math.Fraction.Companion.computeLeastCommonMultiple
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigInteger
import java.math.BigInteger.valueOf

class FractionTest {

    @Test
    fun testComputeGreatestCommonDivisor() {
        assertEquals(valueOf(4L), computeGreatestCommonDivisor(valueOf(12L), valueOf(44L)))
        assertEquals(valueOf(4L), computeGreatestCommonDivisor(valueOf(-12), valueOf(44)))
        assertEquals(valueOf(4L), computeGreatestCommonDivisor(valueOf(12), valueOf(-44)))
        assertEquals(valueOf(4L), computeGreatestCommonDivisor(valueOf(-12), valueOf(-44)))
    }

    @Test
    fun testComputeLeastCommonMultiple() {
        assertEquals(valueOf(52920L), computeLeastCommonMultiple(valueOf(3528L), valueOf(3780L)))
    }

    @Test
    fun testExtend() {
        assertEquals(Fraction(valueOf(2L), valueOf(4L)), Fraction(valueOf(1L), valueOf(2L)).extend(valueOf(4L)))
        assertEquals(Fraction(valueOf(4L), valueOf(8L)), Fraction(valueOf(1L), valueOf(2L)).extend(valueOf(8L)))
    }

    @Test
    fun testPlus() {
        val half = Fraction(valueOf(1L), valueOf(2L))
        val quarter = Fraction(valueOf(1L), valueOf(4L))
        assertEquals(Fraction(valueOf(3L), valueOf(4L)), (half + quarter))
        assertEquals(Fraction(valueOf(3L), valueOf(4L)), (quarter + half))
    }

    @Test
    fun testTimes() {
        assertEquals(Fraction(valueOf(3L), valueOf(7L)), Fraction(valueOf(2L), valueOf(3L)) * Fraction(valueOf(9L), valueOf(14L)))
    }

}