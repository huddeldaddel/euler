package de.huddeldaddel.euler.extensions

import de.huddeldaddel.euler.extensions.isPalindrome
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberExtensionsTest {

    @Test
    fun testIsPalindrome() {
        Assertions.assertFalse(10L.isPalindrome())
        Assertions.assertTrue(101L.isPalindrome())
    }

}
