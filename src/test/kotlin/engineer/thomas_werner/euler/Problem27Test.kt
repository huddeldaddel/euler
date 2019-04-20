package engineer.thomas_werner.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem27Test {

    @Test
    fun testIsPrime() {
        Assertions.assertEquals(true, Problem27.isPrime(0, -79, 1601))
    }

    @Test
    fun testGetConsecutivePrimes() {
        Assertions.assertEquals(40, Problem27.getConsecutivePrimes(1, 41))
        Assertions.assertEquals(80, Problem27.getConsecutivePrimes(-79, 1601))
    }

}