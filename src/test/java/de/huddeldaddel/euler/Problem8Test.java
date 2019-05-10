package de.huddeldaddel.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem8Test {

    private final Problem8 problem8 = new Problem8();

    @Test
    public void testPrepareInput() {
        final int[] data = problem8.prepareInput();
        Assertions.assertEquals(1000, data.length);
        Assertions.assertEquals(7, data[0]);
        Assertions.assertEquals(3, data[1]);
        Assertions.assertEquals(5, data[998]);
        Assertions.assertEquals(0, data[999]);
    }

    @Test
    public void testFindGreatestProductOfAdjacentDigits() {
        Assertions.assertEquals(5832, problem8.findGreatestProductOfAdjacentDigits(4));
    }
}
