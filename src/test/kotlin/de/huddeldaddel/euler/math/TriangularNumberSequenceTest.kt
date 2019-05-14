package de.huddeldaddel.euler.math

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TriangularNumberSequenceTest {

    @Test
    fun testSequence() {
        val sequence = TriangularNumberSequence()
        Assertions.assertEquals(1, sequence.nextValue().toInt())
        Assertions.assertEquals(3, sequence.nextValue().toInt())
        Assertions.assertEquals(6, sequence.nextValue().toInt())
        Assertions.assertEquals(10, sequence.nextValue().toInt())
        Assertions.assertEquals(15, sequence.nextValue().toInt())
        Assertions.assertEquals(21, sequence.nextValue().toInt())
    }

}
