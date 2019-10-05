package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import java.math.BigInteger

class Problem012Test {

    @Test
    fun testGetDivisorCount() {
        Assertions.assertEquals(1, Problem12.getDivisorCount(1))
        Assertions.assertEquals(2, Problem12.getDivisorCount(3))
        Assertions.assertEquals(4, Problem12.getDivisorCount(6))
        Assertions.assertEquals(4, Problem12.getDivisorCount(10))
        Assertions.assertEquals(4, Problem12.getDivisorCount(15))
        Assertions.assertEquals(4, Problem12.getDivisorCount(21))
        Assertions.assertEquals(6, Problem12.getDivisorCount(28))
    }

}
