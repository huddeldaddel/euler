package engineer.thomas_werner.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem4Test {

    @Test
    public void testIsPalindromeProduct() {
        Assertions.assertFalse(Problem4.isPalindromeProduct(10L));
        Assertions.assertTrue(Problem4.isPalindromeProduct(101L));
    }

    @Test
    public void test2Digit() {
        Assertions.assertEquals(9_009, Problem4.findLargestPalindromeProductIn(100));
    }

}
