package engineer.thomas_werner.euler.math;

import java.util.function.Supplier;

public class CollatzSequence implements Supplier<Long> {

    private long value;

    public CollatzSequence(final long startValue) {
        value = startValue;
    }

    public long nextValue() {
        return value = (0 == value % 2) ? value / 2 : 3 * value +1;
    }

    @Override
    public Long get() {
        return nextValue();
    }

    public static int getLength(final long startValue) {
        if(1 == startValue)
            return 1;

        int result = 2;
        final CollatzSequence sequence = new CollatzSequence(startValue);
        while(1 != sequence.nextValue())
            result++;

        System.out.println(startValue + " (" + result + ")");
        return result;
    }

}
