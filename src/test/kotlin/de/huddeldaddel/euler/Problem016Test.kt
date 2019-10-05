package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem016Test {

    @Test
    fun testGetSize() {
        val problem16 = Problem16()
        Assertions.assertEquals(26, problem16.getPowerSum(15))
    }

}