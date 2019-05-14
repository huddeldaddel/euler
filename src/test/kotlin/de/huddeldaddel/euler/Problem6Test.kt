package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem6Test {

    @Test
    fun testGetSumOfSquares() {
        val problem6 = Problem6()
        Assertions.assertEquals(385, problem6.getSumOfSquares(10))
    }

    @Test
    fun testGetSquareOfSum() {
        val problem6 = Problem6()
        Assertions.assertEquals(3025, problem6.getSquareOfSums(10))
    }

}
