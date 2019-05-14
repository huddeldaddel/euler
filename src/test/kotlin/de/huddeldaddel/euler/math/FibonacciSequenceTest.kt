package de.huddeldaddel.euler.math

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FibonacciSequenceTest {

    private val fibonacciSequence = FibonacciSequence()

    @Test
    fun testCheckFirst5Values() {
        Assertions.assertEquals(1, fibonacciSequence.nextValue().toInt())
        Assertions.assertEquals(1, fibonacciSequence.nextValue().toInt())
        Assertions.assertEquals(2, fibonacciSequence.nextValue().toInt())
        Assertions.assertEquals(3, fibonacciSequence.nextValue().toInt())
        Assertions.assertEquals(5, fibonacciSequence.nextValue().toInt())
    }

}
