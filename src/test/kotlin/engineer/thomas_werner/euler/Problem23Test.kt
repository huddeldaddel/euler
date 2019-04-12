package engineer.thomas_werner.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem23Test {

    @Test
    fun testIsAbundant() {
        Assertions.assertEquals(false, Problem23.isAbundant(1))
        Assertions.assertEquals(false, Problem23.isAbundant(2))
        Assertions.assertEquals(false, Problem23.isAbundant(7))
        Assertions.assertEquals(true, Problem23.isAbundant(12))
        Assertions.assertEquals(false, Problem23.isAbundant(15))
        Assertions.assertEquals(true, Problem23.isAbundant(18))
        Assertions.assertEquals(true, Problem23.isAbundant(24))
    }

    @Test
    fun testBuildAbundantNumberMap() {
        val map = Problem23.buildAbundantNumberMap()
        Assertions.assertEquals(false, map[1])
        Assertions.assertEquals(false, map[2])
        Assertions.assertEquals(false, map[7])
        Assertions.assertEquals(true, map[12])
        Assertions.assertEquals(false, map[15])
        Assertions.assertEquals(true, map[18])
        Assertions.assertEquals(true, map[24])
    }

    @Test
    fun testIsAbundantNumberSum() {
        val problem23 = Problem23()
        Assertions.assertEquals(false, problem23.isAbundantNumberSum(18))
        Assertions.assertEquals(true, problem23.isAbundantNumberSum(24))
        Assertions.assertEquals(true, problem23.isAbundantNumberSum(36))
    }

}