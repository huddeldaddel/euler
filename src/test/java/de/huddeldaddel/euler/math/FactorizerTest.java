package de.huddeldaddel.euler.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorizerTest {

    private final Factorizer factorizer = new Factorizer();

    @Test
    public void test13195() {
        final List<Long> factors = new ArrayList<>();
        factorizer.getPrimeFactors(13195, factors);
        Collections.sort(factors);
        Assertions.assertArrayEquals(new Long[]{5L, 7L, 13L, 29L}, factors.toArray());
    }

}
