package engineer.thomas_werner.euler;

/**
 * Solution for https://projecteuler.net/problem=1
 */
public class Problem1 {

    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 1_000; i++)
            if((0 == i % 3) || (0 == i % 5))
                result += i;

        System.out.println(result);
    }

}
