package de.huddeldaddel.euler.math;

import java.math.BigInteger;
import java.util.function.Supplier;

public class TriangularNumberSequence implements Supplier<BigInteger> {

    private int index = 0;
    private BigInteger last = BigInteger.ZERO;

    public BigInteger nextValue() {
        index++;
        return last = last.add(BigInteger.valueOf(index));
    }

    @Override
    public BigInteger get() {
        return nextValue();
    }

}
