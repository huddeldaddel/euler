package engineer.thomas_werner.euler;

/**
 * Solution for https://projecteuler.net/problem=2
 */
public class Problem2 {

    int num1 = 1;
    int num2 = 1;

    private int calculateNextFibonacci() {
        final int result = num1 + num2;
        num1 = num2;
        num2 = result;
        return result;
    }

    private long sumEvenFibonacciValues(int upperLimit) {
        long result = 0;

        int f = calculateNextFibonacci();
        while(f < upperLimit) {
            if(0 == f % 2)
                result += f;
            f = calculateNextFibonacci();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Problem2().sumEvenFibonacciValues(4_000_000));
    }

}
