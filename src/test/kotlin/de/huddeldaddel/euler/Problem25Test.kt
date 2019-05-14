package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import java.math.BigInteger

class Problem25Test {

    @Test
    fun testFindFibonacciIndex7() {
        val index = Problem25().findFibonacciIndex { bi -> bi == BigInteger.valueOf(13) }
        Assertions.assertEquals(7, index)
    }

    @Test
    fun testFindFibonacciIndex12() {
        val index = Problem25().findFibonacciIndex { bi -> bi == BigInteger.valueOf(144) }
        Assertions.assertEquals(12, index)
    }

}
