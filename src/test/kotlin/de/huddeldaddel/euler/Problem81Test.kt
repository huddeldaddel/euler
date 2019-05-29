package de.huddeldaddel.euler

import de.huddeldaddel.euler.util.ResourceLoader
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem81Test {

    @Test
    fun testFindMinimalPathSum() {
        val matrix = ResourceLoader().loadMatrix("81.tst")
        Assertions.assertEquals(2427L, Problem81(matrix).findMinimalPathSum())
    }

}