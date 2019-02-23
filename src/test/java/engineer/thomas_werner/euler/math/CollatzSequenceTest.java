package engineer.thomas_werner.euler.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzSequenceTest {

    @Test
    public void nextValue() {
        final CollatzSequence sequence = new CollatzSequence(13);
        Assertions.assertEquals(40, sequence.nextValue());
        Assertions.assertEquals(20, sequence.nextValue());
        Assertions.assertEquals(10, sequence.nextValue());
        Assertions.assertEquals(5, sequence.nextValue());
        Assertions.assertEquals(16, sequence.nextValue());
        Assertions.assertEquals(8, sequence.nextValue());
        Assertions.assertEquals(4, sequence.nextValue());
        Assertions.assertEquals(2, sequence.nextValue());
        Assertions.assertEquals(1, sequence.nextValue());
    }

    @Test
    public void testGetLength13() {
        Assertions.assertEquals(10, CollatzSequence.getLength(13));
    }

    @Test
    public void testGetLength1() {
        Assertions.assertEquals(1, CollatzSequence.getLength(1));
    }

}