package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import java.math.BigInteger

class Problem12Test {

    @Test
    fun testGetDivisorCount() {
        Assertions.assertEquals(1, Problem12.getDivisorCount(BigInteger.ONE))
        Assertions.assertEquals(2, Problem12.getDivisorCount(BigInteger.valueOf(3)))
        Assertions.assertEquals(4, Problem12.getDivisorCount(BigInteger.valueOf(6)))
        Assertions.assertEquals(4, Problem12.getDivisorCount(BigInteger.valueOf(10)))
        Assertions.assertEquals(4, Problem12.getDivisorCount(BigInteger.valueOf(15)))
        Assertions.assertEquals(4, Problem12.getDivisorCount(BigInteger.valueOf(21)))
        Assertions.assertEquals(6, Problem12.getDivisorCount(BigInteger.valueOf(28)))
    }

}
