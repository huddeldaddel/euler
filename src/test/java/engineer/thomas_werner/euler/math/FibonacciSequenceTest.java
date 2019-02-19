package engineer.thomas_werner.euler.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {

    private FibonacciSequence fibonacciSequence;

    @BeforeEach
    public void setUp() {
        fibonacciSequence = new FibonacciSequence();
    }

    @Test
    public void testCheckFirst5Values() {
        Assertions.assertEquals(1, fibonacciSequence.nextValue());
        Assertions.assertEquals(1, fibonacciSequence.nextValue());
        Assertions.assertEquals(2, fibonacciSequence.nextValue());
        Assertions.assertEquals(3, fibonacciSequence.nextValue());
        Assertions.assertEquals(5, fibonacciSequence.nextValue());
    }

}
