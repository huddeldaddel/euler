package engineer.thomas_werner.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem6Test {

    @Test
    public void testGetSumOfSquares() {
        final Problem6 problem6 = new Problem6();
        Assertions.assertEquals(385, problem6.getSumOfSquares(10));
    }

    @Test
    public void testGetSquareOfSum() {
        final Problem6 problem6 = new Problem6();
        Assertions.assertEquals(3025, problem6.getSquareOfSums(10));
    }

}
