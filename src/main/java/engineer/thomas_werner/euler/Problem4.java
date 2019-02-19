package engineer.thomas_werner.euler;

public class Problem4 {

    public static Long findLargestPalindromeProductIn(long upperBound) {
        Long result = null;

        for(long i=0; i<upperBound; i++) {
            for(long j=0; j<upperBound; j++) {
                final long product = i * j;
                if(isPalindromeProduct(product) && (null == result || result < product))
                    result = product;
            }
        }

        return result;
    }

    public static boolean isPalindromeProduct(final Long number) {
        final String numberString = number.toString();
        final String reversed = new StringBuilder(numberString).reverse().toString();
        return numberString.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(findLargestPalindromeProductIn(1_000));
    }

}
