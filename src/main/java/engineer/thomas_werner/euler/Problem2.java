package engineer.thomas_werner.euler;

import engineer.thomas_werner.euler.math.FibonacciSequence;

/**
 * Solution for https://projecteuler.net/problem=2
 */
public class Problem2 {

    public static void main(String[] args) {
        final FibonacciSequence fibonacciSequence = new FibonacciSequence();

        long f;
        long result = 0;
        while((f = fibonacciSequence.nextValue()) < 4_000_000) {
            if(0 == f % 2)
                result += f;
        }

        System.out.println(result);
    }

}
