package engineer.thomas_werner.euler.math

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TriangleNumberSequenceTest {

    @Test
    fun testGetNext() {
        val sequence = TriangleNumberSequence()
        Assertions.assertEquals(1L, sequence.getNext())
        Assertions.assertEquals(3L, sequence.getNext())
        Assertions.assertEquals(6L, sequence.getNext())
        Assertions.assertEquals(10L, sequence.getNext())
        Assertions.assertEquals(15L, sequence.getNext())
        Assertions.assertEquals(21L, sequence.getNext())
    }

    @Test
    fun testLongIsTriangleNumber() {
        Assertions.assertEquals(true, 1L.isTriangleNumber())
        Assertions.assertEquals(false, 2L.isTriangleNumber())
        Assertions.assertEquals(true, 3L.isTriangleNumber())
        Assertions.assertEquals(false, 4L.isTriangleNumber())
    }

}