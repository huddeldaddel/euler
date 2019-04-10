package engineer.thomas_werner.euler;

import engineer.thomas_werner.euler.math.FibonacciSequence;

import java.math.BigInteger;
import java.util.function.Predicate;

public class Problem25 {

    public static void main(String[] args) {
        final Problem25 problem25 = new Problem25();
        System.out.println(problem25.findFibonacciIndex(bi -> bi.toString().length() >= 1_000));
    }

    public int findFibonacciIndex(final Predicate<BigInteger> predicate) {
        int index = 1;
        final FibonacciSequence sequence = new FibonacciSequence();
        while(!predicate.test(sequence.nextValue()))
            index++;
        return index;
    }

}
