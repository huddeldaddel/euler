package engineer.thomas_werner.euler.math;

import java.util.Collection;

public class Factorizer {

    public void getPrimeFactors(long number, Collection<Long> factors) {
        if (0 == number % 2) {
            factors.add(2L);
            getPrimeFactors(number / 2L, factors);
        }

        boolean found = false;
        for(long l=3; l*l <= number; l+=2) {
            if(0 == number % l) {
                getPrimeFactors(l, factors);
                getPrimeFactors(number / l, factors);
                found = true;
                break;
            }
        }

        if(!found)
            factors.add(number);
    }

}
