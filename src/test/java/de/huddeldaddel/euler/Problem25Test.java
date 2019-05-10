package de.huddeldaddel.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Problem25Test {

    @Test
    public void testFindFibonacciIndex7() {
        final int index = new Problem25().findFibonacciIndex(bi -> bi.equals(BigInteger.valueOf(13)));
        Assertions.assertEquals(7, index);
    }

    @Test
    public void testFindFibonacciIndex12() {
        final int index = new Problem25().findFibonacciIndex(bi -> bi.equals(BigInteger.valueOf(144)));
        Assertions.assertEquals(12, index);
    }

}
