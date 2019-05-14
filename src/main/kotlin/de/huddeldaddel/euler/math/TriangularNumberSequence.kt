package de.huddeldaddel.euler.math

import java.math.BigInteger
import java.util.function.Supplier

class TriangularNumberSequence : Supplier<BigInteger> {

    private var index = 0
    private var last = BigInteger.ZERO

    fun nextValue(): BigInteger {
        index++
        last = last.add(BigInteger.valueOf(index.toLong()))
        return last
    }

    override fun get(): BigInteger {
        return nextValue()
    }

}
