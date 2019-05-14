package de.huddeldaddel.euler.math

import java.util.function.Supplier

class CollatzSequence(private var value: Long) : Supplier<Long> {

    fun nextValue(): Long {
        value = if (0L == value % 2) value / 2 else 3 * value + 1
        return value
    }

    override fun get(): Long {
        return nextValue()
    }

    companion object {

        fun getLength(startValue: Long): Int {
            if (1L == startValue)
                return 1

            var result = 2
            val sequence = CollatzSequence(startValue)
            while (1L != sequence.nextValue())
                result++

            println("$startValue ($result)")
            return result
        }
    }

}
