package engineer.thomas_werner.euler;

/**
 * Solution for https://projecteuler.net/problem=1
 */
public class Problem1 {

    public static void main(String[] args) {
        System.out.println(getSumOfFizzBuzzNumbersBetween(0, 1000));
    }

    private static int getSumOfFizzBuzzNumbersBetween(final int lowerBorder, final int upperBorder) {
        int result = 0;
        for (int i = 0; i < upperBorder; i++)
            if((0 == i % 3) || (0 == i % 5))
                result += i;
        return result;
    }

}
