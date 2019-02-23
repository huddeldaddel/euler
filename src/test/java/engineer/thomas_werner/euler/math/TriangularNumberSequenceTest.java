package engineer.thomas_werner.euler.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangularNumberSequenceTest {

    @Test
    public void testSequence() {
        final TriangularNumberSequence sequence = new TriangularNumberSequence();
        Assertions.assertEquals(1, sequence.nextValue().intValue());
        Assertions.assertEquals(3, sequence.nextValue().intValue());
        Assertions.assertEquals(6, sequence.nextValue().intValue());
        Assertions.assertEquals(10, sequence.nextValue().intValue());
        Assertions.assertEquals(15, sequence.nextValue().intValue());
        Assertions.assertEquals(21, sequence.nextValue().intValue());
    }

}
