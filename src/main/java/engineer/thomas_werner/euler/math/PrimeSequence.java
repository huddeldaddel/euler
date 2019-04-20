package engineer.thomas_werner.euler.math;

public class PrimeSequence {

    private long lastNum = 1;

    public long nextValue() {
        while(!isPrime(++lastNum));
        return lastNum;
    }

    public static boolean isPrime(final long number) {
        if(number < 2)
            return false;

        if (0 == number % 2)
            return number == 2;

        for(long l=3; l*l <= number; l+=2)
            if(0 == number % l)
                return false;

        return true;
    }

}
