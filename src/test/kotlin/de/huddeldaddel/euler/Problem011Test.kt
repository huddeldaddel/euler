package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem011Test {

    @Test
    fun testGrid() {
        val grid = Problem11.Grid()
        Assertions.assertEquals(8, grid.get(0, 0))
        Assertions.assertEquals(15, grid.get(0, 5))
        Assertions.assertEquals(48, grid.get(19, 19))
    }

}
