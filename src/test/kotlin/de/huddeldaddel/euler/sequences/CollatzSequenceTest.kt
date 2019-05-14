package de.huddeldaddel.euler.sequences

import de.huddeldaddel.euler.sequences.CollatzSequence
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CollatzSequenceTest {

    @Test
    fun nextValue() {
        val sequence = CollatzSequence(13)
        assertEquals(40, sequence.nextValue())
        assertEquals(20, sequence.nextValue())
        assertEquals(10, sequence.nextValue())
        assertEquals(5, sequence.nextValue())
        assertEquals(16, sequence.nextValue())
        assertEquals(8, sequence.nextValue())
        assertEquals(4, sequence.nextValue())
        assertEquals(2, sequence.nextValue())
        assertEquals(1, sequence.nextValue())
    }

    @Test
    fun testGetLength13() {
        assertEquals(10, CollatzSequence.getLength(13))
    }

    @Test
    fun testGetLength1() {
        assertEquals(1, CollatzSequence.getLength(1))
    }

}