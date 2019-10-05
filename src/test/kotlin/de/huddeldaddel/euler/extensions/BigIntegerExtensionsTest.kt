package de.huddeldaddel.euler.extensions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BigIntegerExtensionsTest {

    @Test
    fun testIsPrime0To1000() {
        (0L..1000L).forEach { l -> Assertions.assertEquals(l.isPrime(), l.toBigInteger().isPrime()) }
    }

}
