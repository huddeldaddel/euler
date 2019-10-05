package de.huddeldaddel.euler.extensions

import de.huddeldaddel.euler.extensions.isPalindrome
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigInteger

class NumberExtensionsTest {

    @Test
    fun testIsPalindrome() {
        Assertions.assertFalse(10L.isPalindrome())
        Assertions.assertTrue(101L.isPalindrome())
    }

    @Test
    fun testSumOfDigits() {
        Assertions.assertEquals(3L, 201.sumOfDigits())
        Assertions.assertEquals(35L, BigInteger("56789").sumOfDigits())
    }

}
