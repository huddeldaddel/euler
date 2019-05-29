package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem81Test {

    @Test
    fun testFindMinimalPathSum() {
        val matrix = Problem81.loadMatrix("81.tst")
        Assertions.assertEquals(2427L, Problem81(matrix).findMinimalPathSum())
    }

    @Test
    fun testLoadMatrix() {
        val matrix = Problem81.loadMatrix("81.tst")
        Assertions.assertEquals(131L, matrix[0][0])
        Assertions.assertEquals(805L, matrix[4][0])
        Assertions.assertEquals(331L, matrix[4][4])
    }

}