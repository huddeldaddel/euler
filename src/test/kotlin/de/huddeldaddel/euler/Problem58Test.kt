package de.huddeldaddel.euler;

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test;

class Problem58Test {

    @Test
    fun testExample() {
        var numberSpiral = NumberSpiral()
        numberSpiral.increaseSize()
        numberSpiral.increaseSize()
        numberSpiral.increaseSize()

        Assertions.assertEquals(7, numberSpiral.getWidth())
        Assertions.assertEquals(0.62f, numberSpiral.getRatioOfDiagonalPrimes(), 0.01f)
    }

}
