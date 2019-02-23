package engineer.thomas_werner.euler;

import engineer.thomas_werner.euler.math.PrimeSequence;

public class Problem10 {

    public static void main(String[] args) {
        System.out.println(new Problem10().getResult());
    }

    long getResult() {
        long result = 0;
        long prime;
        final PrimeSequence primeSequence = new PrimeSequence();
        while((prime = primeSequence.nextValue()) < 2_000_000)
            result += prime;
        return result;
    }

}
