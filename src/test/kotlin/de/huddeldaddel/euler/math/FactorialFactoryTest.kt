package de.huddeldaddel.euler.math

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FactorialFactoryTest {

    @Test
    fun testBuild10() {
        val result = FactorialFactory().build(10)
        Assertions.assertEquals("3628800", result.toString())
    }

}