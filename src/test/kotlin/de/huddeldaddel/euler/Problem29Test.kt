package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem29Test {

    @Test
    fun testIsPrime() {
        Assertions.assertEquals(15, Problem29().getResult(5))
    }

}