package engineer.thomas_werner.euler;

import engineer.thomas_werner.euler.math.CollatzSequence;

public class Problem14 {

    public static void main(String[] args) {
        System.out.println(new Problem14().getResult());
    }

    public long getResult() {
        int startNumber = 0;
        long maxSequenceLength = 0;
        for(int i=1; i<1_000_000; i++) {
            final long sequenceLength = CollatzSequence.getLength(i);
            if(sequenceLength > maxSequenceLength) {
                maxSequenceLength = sequenceLength;
                startNumber = i;
            }
        }

        return startNumber;
    }

}
