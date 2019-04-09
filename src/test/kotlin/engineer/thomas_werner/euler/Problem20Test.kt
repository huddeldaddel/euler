package engineer.thomas_werner.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem20Test {

    @Test
    fun testGetFactorialDigitSum10() {
        val result = Problem20().getFactorialDigitSum(10)
        Assertions.assertEquals(27, result)
    }

}