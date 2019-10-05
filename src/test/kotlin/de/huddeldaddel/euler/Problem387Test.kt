package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem387Test {

    @Test
    fun isHarshad() {
        Assertions.assertEquals(true, 20.toBigInteger().isHarshad())
        Assertions.assertEquals(true, 201.toBigInteger().isHarshad())
        Assertions.assertEquals(false, 202.toBigInteger().isHarshad())
    }

    @Test
    fun isStrong() {
        Assertions.assertEquals(true, 201.toBigInteger().isStrong())
        Assertions.assertEquals(false, 202.toBigInteger().isStrong())
    }

    @Test
    fun compute() {
        Assertions.assertEquals(90_619.toBigInteger(), Problem387(10_000.toBigInteger()).compute())
    }

}
