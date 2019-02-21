package engineer.thomas_werner.euler.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeSequenceTest {

    @Test
    public void isPrime2() {
        Assertions.assertTrue(PrimeSequence.isPrime(2));
    }

    @Test
    public void isPrime3() {
        Assertions.assertTrue(PrimeSequence.isPrime(3));
    }

    @Test
    public void isPrime4() {
        Assertions.assertFalse(PrimeSequence.isPrime(4));
    }

    @Test
    public void testSequence() {
        final PrimeSequence primeSequence = new PrimeSequence();
        Assertions.assertEquals(2, primeSequence.nextValue());
        Assertions.assertEquals(3, primeSequence.nextValue());
        Assertions.assertEquals(5, primeSequence.nextValue());
        Assertions.assertEquals(7, primeSequence.nextValue());
        Assertions.assertEquals(11, primeSequence.nextValue());
        Assertions.assertEquals(13, primeSequence.nextValue());
    }

}
