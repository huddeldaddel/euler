package de.huddeldaddel.euler.sequences

import de.huddeldaddel.euler.sequences.PrimeSequence
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PrimeSequenceTest {

    @Test
    fun isPrime2() {
        Assertions.assertTrue(PrimeSequence.isPrime(2))
    }

    @Test
    fun isPrime3() {
        Assertions.assertTrue(PrimeSequence.isPrime(3))
    }

    @Test
    fun isPrime4() {
        Assertions.assertFalse(PrimeSequence.isPrime(4))
    }

    @Test
    fun testSequence() {
        val primeSequence = PrimeSequence()
        Assertions.assertEquals(2, primeSequence.nextValue())
        Assertions.assertEquals(3, primeSequence.nextValue())
        Assertions.assertEquals(5, primeSequence.nextValue())
        Assertions.assertEquals(7, primeSequence.nextValue())
        Assertions.assertEquals(11, primeSequence.nextValue())
        Assertions.assertEquals(13, primeSequence.nextValue())
    }

}
