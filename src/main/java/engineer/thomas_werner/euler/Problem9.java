package engineer.thomas_werner.euler;

public class Problem9 {

    public static void main(String[] args) {
        System.out.println(new Problem9().findPythagoreanTriplet());
    }

    long findPythagoreanTriplet() {
        for(int c=1; c<1_000; c++)
            for(int b=1; b<c; b++)
                for(int a=1; a<b; a++)
                    if(isPythagoreanTriplet(a,b,c) && isTargetTriplet(a,b,c))
                        return getResult(a,b,c);
        return 0;
    }

    boolean isPythagoreanTriplet(final int a, final int b, final int c) {
        return (a < b) && (b < c) && (a * a + b * b == c * c);
    }

    boolean isTargetTriplet(final int a, final int b, final int c) {
        return 1_000 == a + b + c;
    }

    long getResult(final int a, final int b, final int c) {
        System.out.println("a: " + a +", b: " + b +", c: " +c);
        return a * b * c;
    }

}
