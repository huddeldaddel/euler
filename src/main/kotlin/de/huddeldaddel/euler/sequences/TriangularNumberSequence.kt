package de.huddeldaddel.euler.sequences

import java.util.function.Supplier

class TriangularNumberSequence : Supplier<Long> {

    private var index = 0
    private var last = 0L

    fun nextValue(): Long {
        index++
        last += index
        return last
    }

    override fun get(): Long {
        return nextValue()
    }

}
