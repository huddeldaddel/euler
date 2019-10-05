package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem022Test {

    @Test
    fun testGetNames() {
        Assertions.assertEquals("COLIN", Problem22().getNames()[937])
    }

    @Test
    fun testGetNameValue() {
        Assertions.assertEquals(53, Problem22().getNameValue("COLIN"))
    }

}