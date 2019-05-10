package de.huddeldaddel.euler.math;

import java.math.BigInteger;

public class FibonacciSequence {

    private BigInteger num1 = BigInteger.ZERO;
    private BigInteger num2 = BigInteger.ZERO;

    public BigInteger nextValue() {
        if(BigInteger.ZERO.equals(num1))
            return num1 = BigInteger.ONE;

        if(BigInteger.ZERO.equals(num2))
            return num2 = BigInteger.ONE;

        final BigInteger result = num1.add(num2);
        num1 = num2;
        return num2 = result;
    }

}
