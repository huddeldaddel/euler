package de.huddeldaddel.euler.util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ResourceLoaderTest {

    @Test
    fun testLoadMatrix() {
        val matrix = ResourceLoader().loadMatrix("81.tst")
        Assertions.assertEquals(131L, matrix[0][0])
        Assertions.assertEquals(805L, matrix[4][0])
        Assertions.assertEquals(331L, matrix[4][4])
    }

    @Test
    fun testLoadNumbersWithExponentsAndIndex() {
        val result = ResourceLoader().loadNumbersWithExponentsAndIndex("99.tst")
        Assertions.assertEquals(1, result[0].first)
        Assertions.assertEquals(519432L, result[0].second)
        Assertions.assertEquals(525806, result[0].third)
    }

}