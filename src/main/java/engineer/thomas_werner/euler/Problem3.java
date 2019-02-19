package engineer.thomas_werner.euler;

import engineer.thomas_werner.euler.math.Factorizer;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * Solution for https://projecteuler.net/problem=3
 */
public class Problem3 {

    public static void main(String[] args) {
        final List<Long> result = new ArrayList<>();
        new Factorizer().getPrimeFactors(600_851_475_143L, result);
        System.out.println(result.get(result.size() -1));
    }

}
