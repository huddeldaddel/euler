package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import java.math.BigInteger

class Problem13Test {

    @Test
    fun testPrepareInput() {
        val problem13 = Problem13()
        val numbers = problem13.prepareInput()
        Assertions.assertEquals(100, numbers.size)
        Assertions.assertEquals(BigInteger("37107287533902102798797998220837590246510135740250"), numbers[0])
        Assertions.assertEquals(BigInteger("53503534226472524250874054075591789781264330331690"), numbers[99])

    }

}
