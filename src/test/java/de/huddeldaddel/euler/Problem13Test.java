package de.huddeldaddel.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

public class Problem13Test {

    @Test
    public void testPrepareInput() {
        final Problem13 problem13 = new Problem13();
        final List<BigInteger> numbers = problem13.prepareInput();
        Assertions.assertEquals(100, numbers.size());
        Assertions.assertEquals(new BigInteger("37107287533902102798797998220837590246510135740250"), numbers.get(0));
        Assertions.assertEquals(new BigInteger("53503534226472524250874054075591789781264330331690"), numbers.get(99));

    }

}
