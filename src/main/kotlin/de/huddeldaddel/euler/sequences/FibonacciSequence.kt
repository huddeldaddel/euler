package de.huddeldaddel.euler.sequences

import java.math.BigInteger

class FibonacciSequence {

    private var num1 = BigInteger.ZERO
    private var num2 = BigInteger.ZERO

    fun nextValue(): BigInteger {
        if (BigInteger.ZERO == num1) {
            num1 = BigInteger.ONE
            return num1
        }

        if (BigInteger.ZERO == num2) {
            num2 = BigInteger.ONE
            return num2
        }


        val result = num1.add(num2)
        num1 = num2
        num2 = result
        return num2
    }

}
