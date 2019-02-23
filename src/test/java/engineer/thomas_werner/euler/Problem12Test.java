package engineer.thomas_werner.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Problem12Test {

    @Test
    public void testGetDivisorCount() {
        final Problem12 problem12 = new Problem12();
        Assertions.assertEquals(1, problem12.getDivisorCount(BigInteger.ONE));
        Assertions.assertEquals(2, problem12.getDivisorCount(BigInteger.valueOf(3)));
        Assertions.assertEquals(4, problem12.getDivisorCount(BigInteger.valueOf(6)));
        Assertions.assertEquals(4, problem12.getDivisorCount(BigInteger.valueOf(10)));
        Assertions.assertEquals(4, problem12.getDivisorCount(BigInteger.valueOf(15)));
        Assertions.assertEquals(4, problem12.getDivisorCount(BigInteger.valueOf(21)));
        Assertions.assertEquals(6, problem12.getDivisorCount(BigInteger.valueOf(28)));
    }

}
