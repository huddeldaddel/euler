package de.huddeldaddel.euler;

import de.huddeldaddel.euler.math.PrimeSequence;
import de.huddeldaddel.euler.math.PrimeSequence;

public class Problem7 {

    public static void main(String[] args) {
        System.out.println(new Problem7().getPrimeNumber(10_001));
    }

    public long getPrimeNumber(final int num) {
        final PrimeSequence primeSequence = new PrimeSequence();
        for(int i=1; i<num; i++)
            primeSequence.nextValue();
        return primeSequence.nextValue();
    }

}
