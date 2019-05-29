package de.huddeldaddel.euler.util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberMatrixResourceLoaderTest {

    @Test
    fun testLoadMatrix() {
        val matrix = NumberMatrixResourceLoader().loadMatrix("81.tst")
        Assertions.assertEquals(131L, matrix[0][0])
        Assertions.assertEquals(805L, matrix[4][0])
        Assertions.assertEquals(331L, matrix[4][4])
    }

}