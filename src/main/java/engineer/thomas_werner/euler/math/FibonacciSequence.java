package engineer.thomas_werner.euler.math;

public class FibonacciSequence {

    private long num1 = 0;
    private long num2 = 0;

    public long nextValue() {
        if(0 == num1) {
            num1 = 1;
            return num1;
        }

        if(0 == num2) {
            num2 = 1;
            return num2;
        }

        final long result = num1 + num2;
        num1 = num2;
        num2 = result;

        return result;
    }

}
