package de.huddeldaddel.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem5Test {

    @Test
    public void testGetSmallestMultiple() {
        final Problem5 problem5 = new Problem5();
        Assertions.assertEquals(2520, problem5.getSmallestMultiple(10));
    }

}
