package engineer.thomas_werner.euler;

public class Problem6 {

    public static void main(String[] args) {
        final Problem6 problem6 = new Problem6();
        final long result = Math.abs(problem6.getSumOfSquares(100) - problem6.getSquareOfSums(100));
        System.out.println(result);
    }

    public long getSumOfSquares(final int limit) {
        long result = 0;
        for(int i=1; i<= limit; i++)
            result += i*i;
        return result;
    }

    public long getSquareOfSums(final int limit) {
        long sum = 0;
        for(int i=1; i<= limit; i++)
            sum += i;
        return sum * sum;
    }

}
