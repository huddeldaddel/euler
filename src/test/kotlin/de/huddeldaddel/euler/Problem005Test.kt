package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem005Test {

    @Test
    fun testGetSmallestMultiple() {
        val problem5 = Problem5()
        Assertions.assertEquals(2520, problem5.getSmallestMultiple(10))
    }

}
