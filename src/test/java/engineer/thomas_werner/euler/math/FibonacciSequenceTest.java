package engineer.thomas_werner.euler.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {

    private final FibonacciSequence fibonacciSequence = new FibonacciSequence();

    @Test
    public void testCheckFirst5Values() {
        Assertions.assertEquals(1, fibonacciSequence.nextValue().intValue());
        Assertions.assertEquals(1, fibonacciSequence.nextValue().intValue());
        Assertions.assertEquals(2, fibonacciSequence.nextValue().intValue());
        Assertions.assertEquals(3, fibonacciSequence.nextValue().intValue());
        Assertions.assertEquals(5, fibonacciSequence.nextValue().intValue());
    }

}
