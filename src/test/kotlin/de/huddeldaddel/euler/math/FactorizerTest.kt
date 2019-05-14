package de.huddeldaddel.euler.math

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import java.util.ArrayList
import java.util.Collections

class FactorizerTest {

    private val factorizer = Factorizer()

    @Test
    fun test13195() {
        val factors = ArrayList<Long>()
        factorizer.getPrimeFactors(13195, factors)
        Collections.sort(factors)
        Assertions.assertArrayEquals(arrayOf(5L, 7L, 13L, 29L), factors.toTypedArray())
    }

}
