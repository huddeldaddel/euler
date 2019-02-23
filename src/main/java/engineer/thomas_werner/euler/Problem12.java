package engineer.thomas_werner.euler;

import engineer.thomas_werner.euler.math.TriangularNumberSequence;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Problem12 {

    public static void main(String[] args) {
        new Problem12().printResult();
    }

    void printResult() {
        Stream.generate(new TriangularNumberSequence())
                .filter(l -> 500 < getDivisorCount(l))
                .findAny()
                .ifPresent(l -> System.out.println("The result is: " + l.toString() + "(" + getDivisorCount(l) + ")"));
    }

    static int getDivisorCount(final BigInteger number) {
        int result = 0;
        for(BigInteger l=BigInteger.ONE; 1 > l.compareTo(number); l = l.add(BigInteger.ONE))
            if(BigInteger.ZERO.equals(number.remainder(l)))
                result++;
        return result;
    }

}
