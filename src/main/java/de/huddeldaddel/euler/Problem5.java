package de.huddeldaddel.euler;

public class Problem5 {

    public static void main(String[] args) {
        System.out.println(new Problem5().getSmallestMultiple(20));
    }

    public long getSmallestMultiple(final int d) {
        long result = 0;
        boolean failed = true;

        while(failed) {
            result += d;
            failed = false;
            for (int i = 1; i <= d; i++) {
                if(0 != result % i) {
                    failed = true;
                    break;
                }
            }
        }

        return result;
    }

}
