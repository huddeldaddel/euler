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
        List<Long> factors = new ArrayList<>();
        factorizer.getPrimeFactors(13195, factors);
        Collections.sort(factors);

        Assertions.assertEquals(4, factors.size());
        Assertions.assertEquals(5, factors.get(0));
        Assertions.assertEquals(7, factors.get(1));
        Assertions.assertEquals(13, factors.get(2));
        Assertions.assertEquals(29, factors.get(3));
    }

}
