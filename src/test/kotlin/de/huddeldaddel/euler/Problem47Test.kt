package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem47Test {

    @Test
    fun testFindSequence() {
        val problem47 = Problem47(3)
        Assertions.assertEquals(644L, problem47.findSequence())
    }

}