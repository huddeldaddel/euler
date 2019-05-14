package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem8Test {

    private val problem8 = Problem8()

    @Test
    fun testPrepareInput() {
        val data = problem8.prepareInput()
        Assertions.assertEquals(1000, data.size)
        Assertions.assertEquals(7, data[0])
        Assertions.assertEquals(3, data[1])
        Assertions.assertEquals(5, data[998])
        Assertions.assertEquals(0, data[999])
    }

    @Test
    fun testFindGreatestProductOfAdjacentDigits() {
        Assertions.assertEquals(5832, problem8.findGreatestProductOfAdjacentDigits(4))
    }
}
