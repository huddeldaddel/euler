package de.huddeldaddel.euler.sequences

import de.huddeldaddel.euler.sequences.OddCompositeNumberSequence
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OddCompositeNumberSequenceTest {

    @Test
    fun testGetNext() {
        val sequence = OddCompositeNumberSequence()
        Assertions.assertEquals(9L, sequence.getNext())
        Assertions.assertEquals(15L, sequence.getNext())
        Assertions.assertEquals(21L, sequence.getNext())
        Assertions.assertEquals(25L, sequence.getNext())
        Assertions.assertEquals(27L, sequence.getNext())
        Assertions.assertEquals(33L, sequence.getNext())
    }

}