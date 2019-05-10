package de.huddeldaddel.euler.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzSequenceTest {

    @Test
    public void nextValue() {
        final CollatzSequence sequence = new CollatzSequence(13);
        assertEquals(40, sequence.nextValue());
        assertEquals(20, sequence.nextValue());
        assertEquals(10, sequence.nextValue());
        assertEquals(5, sequence.nextValue());
        assertEquals(16, sequence.nextValue());
        assertEquals(8, sequence.nextValue());
        assertEquals(4, sequence.nextValue());
        assertEquals(2, sequence.nextValue());
        assertEquals(1, sequence.nextValue());
    }

    @Test
    public void testGetLength13() {
        assertEquals(10, CollatzSequence.getLength(13));
    }

    @Test
    public void testGetLength1() {
        assertEquals(1, CollatzSequence.getLength(1));
    }

}