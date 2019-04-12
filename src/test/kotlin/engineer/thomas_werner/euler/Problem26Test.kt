package engineer.thomas_werner.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem26Test {

    @Test
    fun testGetNthUnitFraction() {
        Assertions.assertEquals("0.5", Problem26.getNthUnitFraction(2))

        val thirdUnitFraction = Problem26.getNthUnitFraction(3)
        Assertions.assertTrue(thirdUnitFraction.startsWith("0.3333333333333333"))
        Assertions.assertEquals(10_002, thirdUnitFraction.length)
    }

}