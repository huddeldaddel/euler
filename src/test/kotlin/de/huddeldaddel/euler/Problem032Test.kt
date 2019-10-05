package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem032Test {

    @Test
    fun testIsPandigital() {
        Assertions.assertEquals(false, listOf(12340L).isPandigital(9))
        Assertions.assertEquals(true, listOf(123456987L).isPandigital(9))
        Assertions.assertEquals(true, listOf(39L, 186L, 7254L).isPandigital(9))
    }

}